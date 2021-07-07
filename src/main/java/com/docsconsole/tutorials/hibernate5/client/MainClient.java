package com.docsconsole.tutorials.hibernate5.client;

import com.docsconsole.tutorials.hibernate5.entity.Book;
import com.docsconsole.tutorials.hibernate5.entity.NonFictionBook;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.docsconsole.tutorials.hibernate5.entity.FictionBook;
import com.docsconsole.tutorials.hibernate5.util.HibernateUtil;

public class MainClient {

	public static void main(String[] args) {

		System.out.println("Main method@MainClient");

		try {

			// Get Session
			Session session = HibernateUtil.getSessionFactory().openSession();
			System.out.println("Session is created");

			// start transaction
			Transaction tx = session.beginTransaction();
			Book book = new Book();
			book.setBookName("Book1");


			FictionBook fictionBook = new FictionBook();
            fictionBook.setBookName("Fiction-Book1");
            fictionBook.setBookPrice(500.00);

            NonFictionBook nonFictionBook = new NonFictionBook();
            nonFictionBook.setBookName("NonFiction-Book1");
            nonFictionBook.setBookPrice(600.00);

			// Save the Model objects
			session.save(book);
            session.save(fictionBook);
			session.save(nonFictionBook);
			session.getTransaction().commit();
			session.close();
			System.out.println("Session is closed");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}