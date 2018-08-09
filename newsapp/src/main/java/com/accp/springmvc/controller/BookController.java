package com.accp.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.springmvc.entity.Book;
import com.accp.springmvc.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {

	@Autowired
	public BookService bookService;
	
	@RequestMapping("/test")
	public String slect(HttpServletRequest request) {
		List<Book> book=this.bookService.select();
		request.setAttribute("book", book);
		return "book";
	}
}
