package htwberlin.de.Projekt_Webtech.api;

import htwberlin.de.Projekt_Webtech.service.ReiseService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class Reisecontroller {

    @Autowired
    ReiseService service;

    Logger logger = LoggerFactory.getLogger(Reisecontroller.class);

    @PostMapping("/reise")
    public Reise createReise(@RequestBody Reise reise) {
        return service.save(reise);
    }

    @GetMapping("/reise/{id}")
    public Reise getReise(@PathVariable String id) {
        logger.info("Get ....", id);
        Long reiseId = Long.parseLong(id);
        return service.get(reiseId);
    }
//
//
//    public List<Reise> reise;
//
//    public Reisecontroller() {
//        reise = new ArrayList<>();
//
//        reise.add(new Reise(1, "Japan", "Sakura", "Sakura ist beliebste Blumen auf der Welt"));
//        reise.add(new Reise(2, "Deutschland", "Berliner Dom", "Berliner Dom ist eine schönste Kirche in Deutschland"));
//
//    }
//
//
//    @GetMapping(path = "/api/v1/reise")
//    @ResponseStatus(code = HttpStatus.OK)
//    public List<Reise> fetchReise() {
//        return reise;
//    }
}
