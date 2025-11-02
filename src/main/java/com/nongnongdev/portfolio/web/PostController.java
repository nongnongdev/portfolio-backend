package com.nongnongdev.portfolio.web;

import com.nongnongdev.portfolio.domain.Post;
import com.nongnongdev.portfolio.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<Post> list() {
        return postService.findAll();
    }

    @GetMapping("/{id}")
    public Post detail(@PathVariable Long id) {
        return postService.findById(id);
    }
    @PostMapping
    public Post create(@RequestBody Post post) {
        return postService.save(post);
    }

    @PutMapping("/{id}")
    public Post update(@PathVariable Long id, @RequestBody Post post) {
        post.setId(id);
        return postService.save(post);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        postService.deleteById(id);
    }
}
