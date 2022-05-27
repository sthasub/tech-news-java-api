package com.technews.repository;

import com.technews.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * A repository in Java is any class that fulfills
 * the role of a data access object (DAO)—in other words,
 * it contains data retrieval, storage, and search functionality.
 */

/**
 * he term autowiring refers to scanning a project and instantiating only the objects required for a class or method to run.
 */
@Repository //class-level annotation
public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByEmail(String email) throws Exception;
}
