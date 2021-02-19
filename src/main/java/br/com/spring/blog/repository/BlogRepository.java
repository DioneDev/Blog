package br.com.spring.blog.repository;

import br.com.spring.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Post, Long> {
}

/*
 Estendendo o JpaRepository a aplicação tem acesso a metodos do spring data já prontos.

 findAll()
 findById()
 save()
 delete()
 */
