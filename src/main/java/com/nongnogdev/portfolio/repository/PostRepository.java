package com.nongnogdev.portfolio.repository;

import com.nongnogdev.portfolio.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
