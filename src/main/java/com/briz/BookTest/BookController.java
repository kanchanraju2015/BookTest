package com.briz.BookTest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/addbook")
public void addbook(Book book)
{
	bserv.addBook(book);
	System.out.println("book added succesfully");
}
@RequestMapping("/allbooks")
public List<Book> book()
{
	return bserv.allBooks();
}
@RequestMapping("/update")
public Book update(Book book,int id)
{
	bserv.updateBook(book, id);
	return book;
}
@RequestMapping("/delete")
public void dele(int id)
{
	bserv.deleteBook(id);
	System.out.println("book deleted ");
}
@RequestMapping("/by/{id}")
public Book byid(@PathVariable int id)
{
	return bserv.findById(id);
	
}
}
