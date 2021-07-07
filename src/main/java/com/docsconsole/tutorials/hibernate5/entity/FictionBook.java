package com.docsconsole.tutorials.hibernate5.entity;


import javax.persistence.*;

@Entity
@DiscriminatorValue("FictionBook")
public class FictionBook extends Book{

    @Column(name = "BOOK_PRICE")
    private Double bookPrice;

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }



}