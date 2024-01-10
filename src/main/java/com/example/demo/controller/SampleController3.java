package com.example.demo.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.BookDTO;

@Controller
@RequestMapping("/param")
public class SampleController3 {

	@GetMapping("/ex1")
	public ResponseEntity ex1(@RequestParam(name = "i") int i) {
		System.out.println("int형 파라미터 수집: " + i);

		return new ResponseEntity(HttpStatus.OK);

		// localhost:8080/param/ex1?i=100
	}

	@GetMapping("/ex2")
	public ResponseEntity ex2(@RequestParam(name = "i") int i, @RequestParam(name = "c") char c) {
		System.out.println("int형 파라미터 수집: " + i + ", char형 파라미터 수집: " + c);

		return new ResponseEntity(HttpStatus.OK);
	}

	@GetMapping("/ex3")
	// arr 라는 이름의 파라미터가 여러 개 전달되더라도 배열로 수집됨
	public ResponseEntity ex3(@RequestParam(name = "arr") int[] arr) {
		// 배열 -> 문자열로 변환
		System.out.println("int형 배열 수집: " + Arrays.toString(arr));
		return new ResponseEntity(HttpStatus.OK);
	}

	@GetMapping("/ex4")
	// list 라는 이름의 파라미터가 여러 개 전달되더라도 배열로 수집됨
	public ResponseEntity ex4(@RequestParam(name = "list") ArrayList<Integer> list) {

		System.out.println("int형 리스트 수집: " + list);
		return new ResponseEntity(HttpStatus.OK);
	}

	@GetMapping("/ex5")

	public ResponseEntity ex5(@RequestParam(name = "date") @DateTimeFormat(pattern = "yyyy/MM/dd") LocalDate date) {

		System.out.println("날짜 수집: " + date);
		return new ResponseEntity(HttpStatus.OK);
	}

	@GetMapping("/ex6/{i}")

	public ResponseEntity ex6(@PathVariable(name = "i") int i) {

		System.out.println("int형 파라미터 수집: " + i);
		return new ResponseEntity(HttpStatus.OK);

	}

	@GetMapping("/ex7")

	public ResponseEntity ex7(@RequestBody BookDTO dto) {

		System.out.println("객체 수집: " + dto);
		return new ResponseEntity(HttpStatus.OK);
	}

	@GetMapping("/ex8") // @requestbody 를 붙여줘야 외부에서 들어온 json을 클래스로 변환가능해짐
	public ResponseEntity ex8(@RequestBody ArrayList<BookDTO> list) {

		System.out.println("객체타입 리스트 수집: " + list);

		return new ResponseEntity(HttpStatus.OK);
	}
	
	
}
