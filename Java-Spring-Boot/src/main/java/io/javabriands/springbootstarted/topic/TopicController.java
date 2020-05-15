package io.javabriands.springbootstarted.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
    public String getAllTopic(){
        return "All Topics";
    }
}
