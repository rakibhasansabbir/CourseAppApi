package io.javabrains.springbootstarter.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topic")
    public List<Topic> getAllTopic(){
        return Arrays.asList(
                new Topic("cse1011","Programming Language 1","Based on c"),
                new Topic("cse1012","Programming Language 1 Lab","Based on c"),
                new Topic("cse2011","Programming Language 2","Based on Java"),
                new Topic("cse3035","Computer interfacing","Based on assembly language")
        );
    }
}
