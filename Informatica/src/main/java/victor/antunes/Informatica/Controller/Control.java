package victor.antunes.Informatica.Controller;

import org.apache.catalina.Store;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Control {
    @GetMapping("/controller")
    public String getMessage() {
        return "Hello, getting started";
    }
}