package com.nongnongdev.portfolio.repository;

import com.nongnongdev.portfolio.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
