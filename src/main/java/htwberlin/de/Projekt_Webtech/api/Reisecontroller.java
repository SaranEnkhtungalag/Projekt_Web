package htwberlin.de.Projekt_Webtech.api;

import htwberlin.de.Projekt_Webtech.persistence.ReiseEntity;
import htwberlin.de.Projekt_Webtech.persistence.ReiseRepository;
import htwberlin.de.Projekt_Webtech.service.ReiseService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;


@RestController
public class Reisecontroller {

    private final ReiseService reiseService;

    public Reisecontroller(ReiseService reiseService) {
        this.reiseService = reiseService;
    }

//    @PostMapping("/api/v1/reisen")
//    public Reise createReise(@RequestBody Reise reise) {
//        return ReiseService.save(reise);
//    }

    @GetMapping(path = ("/api/v1/reisen"))
    public ResponseEntity<List<Reise>> fetchReisen() {
        return ResponseEntity.ok(reiseService.findAll());
    }

    @GetMapping(path = ("/api/v1/reisen/{id}"))
    public ResponseEntity<Reise> fetchReiseById(@PathVariable Long id) {
        var reise = reiseService.findById(id);
        return reise != null ? ResponseEntity.ok(reise) : ResponseEntity.notFound().build();
    }

    @PostMapping(path = ("/api/v1/reisen"))
    public ResponseEntity<Void> createReise(@RequestBody ReiseRequest request) throws URISyntaxException {
        var reise = reiseService.create(request);
        URI uri = new URI("/api/v1/reisen" + reise.getId());
        return ResponseEntity.created(uri).build();
    }

//    @GetMapping(path = ("/api/v1/reisen/{id}"))
//    public ResponseEntity<Reise> fetchReiseById(@PathVariable Long id) {
//        var reise = reiseService.findById(id);
//        return reise != null? ResponseEntity.ok(reise) : ResponseEntity.notFound().build();
//    }
//


//    @Autowired
//    ReiseService service;
//
//    Logger logger = LoggerFactory.getLogger(Reisecontroller.class);
//
//    @PostMapping("/api/v1/reisen")
//    public Reise createReise(@RequestBody Reise reise) {
//        return ReiseService.save(reise);
//    }
//
//    @GetMapping("/api/v1/reisen/{id}")
//    public Reise getReise(@PathVariable String id) {
//        logger.info("Get ....", id);
//        Long reiseId = Long.parseLong(id);
//        return service.get(reiseId);
//    }

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
