package me.minsu.blog.service;

import lombok.RequiredArgsConstructor;
import me.minsu.blog.domain.Article;
import me.minsu.blog.dto.AddArticleRequest;
import me.minsu.blog.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll() {
        return blogRepository.findAll();
    }
}
