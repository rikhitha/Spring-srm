package com.crdjpa.model;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.DynamicInsert;



@Entity

@Table
public class Books implements Serializable
{

@Id
@Column
private int bookid;
@Column
private String bookname;
@Column(columnDefinition = "CLOB NOT NULL")
private String author;


@OneToMany(mappedBy = "book", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Page> pages;

@Column(name = "start_date")
@Temporal(TemporalType.DATE)
private Date bookStartDate;

@Column(name = "end_date")
@Temporal(TemporalType.TIMESTAMP)
private Date bookEndDate;

@Column
@Transient
private int price;



public int getBookid() 
{
return bookid;
}
public void setBookid(int bookid) 
{
this.bookid = bookid;
}
public String getBookname()
{
return bookname;
}
public void setBookname(String bookname) 
{
this.bookname = bookname;
}
public String getAuthor() 
{
return author;
}
public void setAuthor(String author) 
{
this.author = author;
}
public int getPrice() 
{
return price;
}
public void setPrice(int price) 
{
this.price = price;
}

public Date getBookStartDate() {
    return bookStartDate;
}
public void setBookStartDate(Date bookStartDate) {
    this.bookStartDate = bookStartDate;
}
public Date getBookEndDate() {
    return bookEndDate;
}
public void setBookEndDate(Date bookEndDate) {
    this.bookEndDate = bookEndDate;
}

}