package com.klef.jfsd.springboot.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.klef.jfsd.springboot.model.Comment;

@Service
public class CommentService {
	private static final String COMMENTS_API_URL = "https://jsonplaceholder.typicode.com/comments";

    @Autowired
    private RestTemplate restTemplate;

    public List<Comment> getAllComments() {
        // Fetch data from external API
        Comment[] commentsArray = restTemplate.getForObject(COMMENTS_API_URL, Comment[].class);
        return Arrays.asList(commentsArray);
    }


}
