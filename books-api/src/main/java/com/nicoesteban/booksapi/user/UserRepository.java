package com.nicoesteban.booksapi.user;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    /**
     * @return A User identified by their email
     */
    Optional<User> findUserByEmail(String userAlias);

}
