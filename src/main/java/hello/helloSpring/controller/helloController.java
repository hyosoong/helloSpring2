package hello.helloSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class helloController {

    /*
        웹 어플리케이션에서 /hello 라고 들어오면 이 메소드를 호출해줘
        스프링이 이 일을 해준다
        Get
     */
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("name","eung-ae na agi hyunjoong");
        return "hello";
    }

}
