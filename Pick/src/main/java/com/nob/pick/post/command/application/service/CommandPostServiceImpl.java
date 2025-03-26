package com.nob.pick.post.command.application.service;

import org.springframework.stereotype.Service;

import com.nob.pick.post.command.application.dto.PostDTO;
import com.nob.pick.post.command.application.dto.PostStatus;
import com.nob.pick.post.command.domain.aggregate.entity.Post;
import com.nob.pick.post.command.domain.repository.PostRepository;
import com.nob.pick.post.query.service.PostService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class CommandPostServiceImpl implements CommandPostService {
	
	private final PostRepository postRepository;
	private final PostService postService;
	
	@Override
	@Transactional
	public void registerPost(PostDTO newPost) {
		Post post = postDTOToPost(newPost);
		postRepository.save(post);
		newPost.setId(post.getId());
		newPost.setUploadAt(post.getUploadAt());
		newPost.setMember(postService.getPostById(post.getId()).getMember());
	}
	
	@Override
	@Transactional
	public String deletePost(int postId) {
		Post targetPost;
		try {
			targetPost = postRepository.findById(postId).get();
		} catch (Exception e) {
			targetPost = null;
		}
		log.info("targetPost: {}", targetPost);
		if (targetPost == null) {
			return "Post Not Found";
		}
		if (targetPost.getStatus() == PostStatus.DELETED.getValue()) {
			return "Post Is Already Deleted";
		} else if (targetPost.getStatus() == PostStatus.BLINDED.getValue()) {
			return "Blinded Post Cannot Be Deleted";
		}
		
		targetPost.setStatus(PostStatus.DELETED.getValue());
		postRepository.save(targetPost);
		log.info("targetPost status: {}", targetPost.getStatus());
		
		if (targetPost.getStatus() == PostStatus.DELETED.getValue()) {
			return "Post Delete Success";
		} else {
			return "Post Delete Failed";
		}
	}
	
	private Post postDTOToPost(PostDTO postDTO) {
		Post post = new Post();
		post.setTitle(postDTO.getTitle());
		post.setContent(postDTO.getContent());
		post.setCategory(postDTO.getCategory().getValue());
		post.setMemberId(postDTO.getMember().getMemberId());
		return post;
	}
}
