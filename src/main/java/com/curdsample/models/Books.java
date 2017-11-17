package com.curdsample.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Books implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	@Column
	private String bookName;

	@Column
	private String bookAuthor;

	public Books() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	@Override
	public String toString() {
		return "Books [id=" + id + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + "]";
	}

}
