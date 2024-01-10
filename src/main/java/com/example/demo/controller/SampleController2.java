package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/method")
public class SampleController2 {
	
	@GetMapping("/ex")  //get방식 + /method/ex 연결
	public ResponseEntity ex1() {
		
		System.out.println("get메소드 요청..");
		
		return new ResponseEntity(HttpStatus.OK);
	}
	@PostMapping("/ex")  //post방식 + /method/ex 연결
	public ResponseEntity ex2() {
		
		System.out.println("post메소드 요청..");
		
		return new ResponseEntity(HttpStatus.OK);
	}
	@PutMapping("/ex")  //put방식 + /method/ex 연결
	public ResponseEntity ex3() {
		
		System.out.println("put메소드 요청..");
		
		return new ResponseEntity(HttpStatus.OK);
	}
	@DeleteMapping("/ex")  //delete방식 + /method/ex 연결
	public ResponseEntity ex4() {
		
		System.out.println("delete메소드 요청..");
		
		return new ResponseEntity(HttpStatus.OK);
	}
}
