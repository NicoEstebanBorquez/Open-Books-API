package com.nicoesteban.booksapi.book;

import com.nicoesteban.booksapi.author.Author;
import com.nicoesteban.booksapi.enums.Genre;
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
public class Book {

    //@Id
    //@GeneratedValue
    private Long id;
    private int isbn;
    private String title;
    private Genre genre;
    //private List<Author> authors;
    //private List<Collection> collections;

}

