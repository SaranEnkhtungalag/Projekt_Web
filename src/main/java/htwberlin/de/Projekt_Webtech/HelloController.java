package htwberlin.de.Projekt_Webtech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Autowired
    GreetingService myService;

    @GetMapping("/greeting/")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name) {
     // myService = new GreetingService();
      return myService.getGreeting(name);
       // return "Hello, " + name;
    }

    @GetMapping("/path/param/{name}/{part2}")
    public String pathparam(@PathVariable(name = "name") String nam, @PathVariable(name = "part2") String par2) {
        return "hello, " + nam+par2;
    }

    @GetMapping("/path/param")
    public String pathparam(@RequestHeader(value="User-Agent") String par2) {
        return "hello, " + par2;
    }
}
