package com.docsconsole.tutorials.hibernate5.entity;

import javax.persistence.*;


@Entity
@Table(name = "book_3")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="BOOK_TYPE",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="Book")
public class Book {

	@Id
	@GeneratedValue
	@Column(name = "BOOK_ID")
	private Long bookId;

	@Column(name = "BOOK_NAME")
	private String bookName;

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

}