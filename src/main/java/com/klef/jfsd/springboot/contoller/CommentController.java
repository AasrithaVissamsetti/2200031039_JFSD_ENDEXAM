package com.klef.jfsd.springboot.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    @Autowired
    private com.klef.jfsd.springboot.service.CommentService commentService;

    @GetMapping
    public List<com.klef.jfsd.springboot.model.Comment> getAllComments() {
        return commentService.getAllComments();
    }
}
