package com.nicoesteban.booksapi.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String email;
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    /*
    @OneToMany(mappedBy = "user")
    private List<Collection> collections;

    public void addCollection(Collection collection) {
        collections.add(collection);
        collection.setUser(this);
    }

    public void removeCollection(Collection collection) {
        collections.remove(collection);
        collection.setUser(null);
    }*/
}
