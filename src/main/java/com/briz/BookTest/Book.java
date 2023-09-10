package com.briz.BookTest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="book")
public class Book 
{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
int id;
String bookname;
String bookauthor;
String booksubject;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getBookauthor() {
	return bookauthor;
}
public void setBookauthor(String bookauthor) {
	this.bookauthor = bookauthor;
}
public String getBooksubject() {
	return booksubject;
}
public void setBooksubject(String booksubject) {
	this.booksubject = booksubject;
}

}
