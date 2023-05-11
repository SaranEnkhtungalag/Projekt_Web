package htwberlin.de.Projekt_Webtech;

import org.springframework.stereotype.Controller;

@Controller
public class GreetingService {
    public String getGreeting(final String name) {
        return "Hello, " + name;
    }

}
