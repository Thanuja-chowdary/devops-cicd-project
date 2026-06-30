package devops_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "CI/CD Pipeline is Working!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is Healthy";
    }
}