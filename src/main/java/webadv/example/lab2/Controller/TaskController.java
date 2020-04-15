package webadv.example.lab2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TaskController {
    @RequestMapping("/")
    public String welcome() {
        return "index";
    }

}