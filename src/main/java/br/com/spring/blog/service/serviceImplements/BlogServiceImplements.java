package br.com.spring.blog.service.serviceImplements;

import br.com.spring.blog.model.Post;
import br.com.spring.blog.repository.BlogRepository;
import br.com.spring.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Mostra para os spring que esta classe será um bin gerenciado por ele.
public class BlogServiceImplements implements BlogService {

    @Autowired
    BlogRepository blogRepository;

    @Override
    public List<Post> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return blogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return blogRepository.save(post);
    }
}
