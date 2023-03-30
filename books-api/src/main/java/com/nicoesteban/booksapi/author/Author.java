package com.nicoesteban.booksapi.author;

import com.nicoesteban.booksapi.book.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    //@Id
    //@GeneratedValue
    private Long id;
    private String name;
    private String lastname;
    //private List<Book> books;

}
