package htwberlin.de.Projekt_Webtech.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonRestController {

    private List<Person> persons;

    public PersonRestController() {
        persons = new ArrayList<>();

        persons.add(new Person(1, "GG", "TT", "Reise in der Mongolei"));
        persons.add(new Person(2, "max", "Muster", "Reise in Italien"));
    }

    @GetMapping(path = "/api/v1/persons")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Person> fetchPersons() {
        return persons;
    }
}
