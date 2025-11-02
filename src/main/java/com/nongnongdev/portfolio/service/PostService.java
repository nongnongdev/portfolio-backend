package com.nongnongdev.portfolio.service;

import com.nongnongdev.portfolio.domain.Post;
import com.nongnongdev.portfolio.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> findAll() {
        return postRepository.findAll();
    }

    public Post findById(Long id){
        return postRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Post with id " + id + " does not exist"));
    }

    public Post save(Post pos) {
        return postRepository.save(pos);
    }

    public void deleteById(Long id) {
        postRepository.deleteById(id);
    }
}
