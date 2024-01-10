package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.CarDTO;
import com.example.demo.dto.StudentDTO;

@Controller
@RequestMapping("/param")
public class QuizController3 {

	@GetMapping("/q1")
	public ResponseEntity q1(@RequestParam(name = "str") String str) {

		System.out.println("String타입 파라미터 수집: " + str);
		return new ResponseEntity(HttpStatus.OK);
	}

	@GetMapping("/q2")
	public ResponseEntity q2(@RequestParam(name = "i") int i) {

		System.out.println("int타입 파라미터 수집: " + i);
		return new ResponseEntity(HttpStatus.OK);
	}

	@GetMapping("/q3")
	public ResponseEntity q3(@RequestParam(name = "arr") String[] arr) {

		System.out.println("arr타입 파라미터 수집: " + arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr.length);
		return new ResponseEntity(HttpStatus.OK);
	}

	@PostMapping("/q4")
	public ResponseEntity q4(@RequestBody StudentDTO studentDTO) {
		System.out.println("객체 수집: " + studentDTO);
		return new ResponseEntity(HttpStatus.OK);
	}

	@PostMapping("/q5")
	public ResponseEntity q5(@RequestBody ArrayList<StudentDTO> list) {
		System.out.println("객체타입 리스트 수집: " + list);
		System.out.println("리스트의 개수: " + list.size());
		return new ResponseEntity(HttpStatus.OK);
	}

	@PostMapping("/q6")
	public ResponseEntity q6(@RequestBody ArrayList<CarDTO> list) {
		System.out.println("객체타입 리스트 수집: " + list);
		System.out.println("리스트의 마지막 요소: " + list.get((list.size() - 1)));
		return new ResponseEntity(HttpStatus.OK);
	}
}
