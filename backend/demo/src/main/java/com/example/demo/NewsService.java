package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsService {
    @Autowired
    private NewsRepository newsRepository;

    public List<News> getAllNews() {
        return newsRepository.findAll();
    }

    public News getNewsById(Long id) {
        return newsRepository.findById(id).orElse(null);
    }

    public News getRecommendedNews(Long id) {
        //Validate  by genre
        return newsRepository.findById(id).orElse(null);
    }

    public NewsRepository getNewsRepository() {
        return newsRepository;
    }

    public void setNewsRepository(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

}
