package io.javabrains.springbootstarter.topic;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

  private List<Topic> topics = new ArrayList<>( Arrays.asList(
          new Topic("cse1011","Programming Language 1","Based on c"),
          new Topic("cse1012","Programming Language 1 Lab","Based on c"),
          new Topic("cse2011","Programming Language 2","Based on Java"),
          new Topic("cse3035","Computer interfacing","Based on assembly language")
  ));

  public List<Topic> getAllTopic(){
      return topics;
  }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for (int i=0;i< topics.size();i++){
            Topic t =  topics.get(i);
            if (t.getId().equals(id)){
                topics.set(i,topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(t ->t.getId().equals(id));
    }
}
