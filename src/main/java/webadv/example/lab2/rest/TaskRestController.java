package webadv.example.lab2.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.*;
import webadv.example.lab2.model.Task;

@RestController
public class TaskRestController {
    private List<String> tasks =
            Arrays.asList("Git", "Maven", "Gradle", "Spring", "Bootstrap");
    @GetMapping("/task/{id}")
    public Task task(@PathVariable (value="id") int id) {
        return new Task(id,tasks.get(id-1));
    }
}