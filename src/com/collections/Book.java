package com.collections;

public class Book {
public int bookid;
public String bookName;
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
@Override
public String toString() {
	return "Book [bookid=" + bookid + ", bookName=" + bookName + "]";
}
public Book(int bookid, String bookName) {
	super();
	this.bookid = bookid;
	this.bookName = bookName;
}



}
