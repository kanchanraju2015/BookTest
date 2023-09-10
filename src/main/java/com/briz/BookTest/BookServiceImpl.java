package com.briz.BookTest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class BookServiceImpl implements BookService 
{
	@Autowired
	BookRepository brepo;

	@Override
	public void addBook(Book book)
	{
	brepo.save(book);
//	System.out.println("book saved into database");
		
	}

	@Override
	public List<Book> allBooks() {
		return brepo.findAll();
	}

	@Override
	public Book updateBook(Book book, int id)
	{
	Book b=brepo.findById(id).get();
	b.setBookauthor(book.getBookauthor());
	b.setBookname(book.getBookauthor());
	b.setBooksubject(book.getBooksubject());
	brepo.save(b);
	
	return b;
	}

	@Override
	public Book deleteBook(int id) {
		
		Book book=brepo.findById(id).get();
		brepo.deleteById(id);
		return book;
			}

	@Override
	public Book findById(int id) 
	{
		Book book=brepo.findById(id).get();
	
	     return book;
	}

	@Override
	public List<Book> findByBookname(String bookname)
	{
	return brepo.getByBookName(bookname);
	}
}
