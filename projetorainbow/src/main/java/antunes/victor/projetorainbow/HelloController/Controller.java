package antunes.victor.projetorainbow.HelloController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class Controller {
    @RestController
    public class HelloControle{
        @GetMapping("/")
        public String getMessage (){
            return "Hello";
        }
    }
}

