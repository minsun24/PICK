package com.nob.pick.post;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nob.pick.post.command.application.controller.CommandPostController;
import com.nob.pick.post.command.application.dto.PostDTO;
import com.nob.pick.post.command.application.dto.PostStatus;
import com.nob.pick.post.command.domain.aggregate.entity.Post;
import com.nob.pick.post.command.domain.repository.PostRepository;
import com.nob.pick.post.query.service.PostService;

@SpringBootTest
public class DeletePostTest {
	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private CommandPostController commandPostController;
	
	@Autowired
	private PostService postService;
	
	@AfterEach
	public void clean() {
		initPosts();
	}
	
	private void initPosts() {
		Post defaultPost = postRepository.findById(1).get();
		defaultPost.setStatus(PostStatus.DEFAULT.getValue());
		postRepository.save(defaultPost);
		
		Post deletedPost = postRepository.findById(2).get();
		deletedPost.setStatus(PostStatus.DELETED.getValue());
		postRepository.save(deletedPost);
		
		Post blindedPost = postRepository.findById(3).get();
		blindedPost.setStatus(PostStatus.BLINDED.getValue());
		postRepository.save(blindedPost);
	}
	
	@ParameterizedTest
	@DisplayName("게시글 id로 삭제")
	@ValueSource(ints={1, 2, 3, 100})
	public void deletePostTest(int postId) {
		PostDTO targetPost = postService.getPostById(postId);
		String postStatus = (
			targetPost != null ?
			targetPost.getStatus().toString() : "NULL"
		);
		Assertions.assertDoesNotThrow(
			() -> {
				System.out.println("Post " + postId + " Origin Status: " + postStatus);
				commandPostController.deletePost(postId);
			}
		);
	}
}
