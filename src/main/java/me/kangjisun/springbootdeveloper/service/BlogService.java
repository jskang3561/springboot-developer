package me.kangjisun.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.kangjisun.springbootdeveloper.domain.Article;
import me.kangjisun.springbootdeveloper.dto.AddArticleRequest;
import me.kangjisun.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
