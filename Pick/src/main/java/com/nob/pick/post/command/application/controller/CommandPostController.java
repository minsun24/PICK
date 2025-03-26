package com.nob.pick.post.command.application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nob.pick.post.command.application.dto.PostDTO;
import com.nob.pick.post.command.application.service.CommandPostService;
import com.nob.pick.post.command.domain.aggregate.vo.ResponseRegisterPostVO;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/post")
@Slf4j
@RequiredArgsConstructor
public class CommandPostController {
	
	private final CommandPostService commandPostService;
	
	@PostMapping("/register")
	public ResponseEntity<ResponseRegisterPostVO> registerPost(@RequestBody PostDTO newPost) {
		log.info("{}", newPost);
		commandPostService.registerPost(newPost);
		ResponseRegisterPostVO successRegisterPost = postDTOToResponseRegisterPostVO(newPost);
		
		return ResponseEntity.status(HttpStatus.CREATED)
							 .body(successRegisterPost);
	}
	
	@PostMapping("/delete")
	public ResponseEntity<String> deletePost(@RequestParam int postId) {
		log.info("Deleting post {}", postId);
		return ResponseEntity.ok(commandPostService.deletePost(postId));
	}
	
	
	private ResponseRegisterPostVO postDTOToResponseRegisterPostVO(PostDTO postDTO) {
		ResponseRegisterPostVO rrpVO = new ResponseRegisterPostVO();
		rrpVO.setId(postDTO.getId());
		rrpVO.setTitle(postDTO.getTitle());
		rrpVO.setContent(postDTO.getContent());
		rrpVO.setCategory(postDTO.getCategory().getValue());
		rrpVO.setUploadAt(postDTO.getUploadAt());
		rrpVO.setMemberNickname(postDTO.getMember().getMemberNickname());
		
		return rrpVO;
	}
}
