package com.briz.BookTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController 
{
@Autowired
BookService bserv;
@RequestMapping("/booktest")
public String test()
{
	return "this is book test";
}
}
