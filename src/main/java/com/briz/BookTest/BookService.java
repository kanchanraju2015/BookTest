package com.briz.BookTest;

import java.util.List;

public interface BookService
{
void addBook(Book book);
List<Book> allBooks();
Book updateBook(Book book,int id);
Book deleteBook(int id);
}
