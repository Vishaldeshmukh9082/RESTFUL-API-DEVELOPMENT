package com.restapi.restful_api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.restful_api.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
