package br.com.spring.blog.service;

import br.com.spring.blog.model.Post;

import java.util.List;

public interface BlogService {

    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}

