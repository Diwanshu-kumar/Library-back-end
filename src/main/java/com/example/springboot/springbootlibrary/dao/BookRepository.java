package com.example.springboot.springbootlibrary.dao;

import com.example.springboot.springbootlibrary.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface BookRepository extends JpaRepository<Book, Long> {
    Page<Book> findByTitleContaining(@RequestParam("title") String  title, Pageable pageable);

    Page<Book> findByCategoryContaining(@RequestParam("category") String category, Pageable pageable);
}
