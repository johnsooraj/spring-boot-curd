package com.curdsample.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Books implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String bookName;

	@Column
	private String bookAuthor;

	@OneToOne(mappedBy = "documentOwner", cascade = CascadeType.ALL)
	BookDocument bookDocument;

	public Books() {

	}

	public Books(String bookName, String bookAuthor, BookDocument bookDocument) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookDocument = bookDocument;
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

	public BookDocument getBookDocument() {
		return bookDocument;
	}

	public void setBookDocument(BookDocument bookDocument) {
		this.bookDocument = bookDocument;
	}

}
