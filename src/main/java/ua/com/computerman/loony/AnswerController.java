package ua.com.computerman.loony;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnswerController {
    @RequestMapping("/")
    public String answer() {
        return "It works! ";
    }
}
