package htwberlin.de.Projekt_Webtech.api;

import htwberlin.de.Projekt_Webtech.service.BewertungService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class BewertungController {

    private final BewertungService bewertungService;

    public BewertungController(BewertungService bewertungService) { this.bewertungService = bewertungService; }

    @GetMapping(path = "/api/v1/bewertung")
    public ResponseEntity<List<Bewertung>> fetchBewertung() {
        var bewerten = bewertungService.findAll();
        return ResponseEntity.ok(bewerten);
    }
    @GetMapping(path = "/api/v1/bewertung/reise/{reiseId}")
    public ResponseEntity<List<Bewertung>> fetchBewertung(@PathVariable Long reiseId) {
        var bewerten = bewertungService.findAllByReiseId(reiseId);
        return ResponseEntity.ok(bewerten);
    }
    @GetMapping(path = "/api/v1/bewertung/{id}")
    public ResponseEntity<Bewertung> fetchBewertungById(@PathVariable Long id) {
        var bewerten = bewertungService.findById(id);
        return bewerten != null ? ResponseEntity.ok(bewerten) : ResponseEntity.notFound().build();
    }
    @PostMapping(path = "/api/v1/bewertung")
    public ResponseEntity<Void> createBewertung(@RequestBody BewertungRequest request) throws URISyntaxException {
        var bewertung = bewertungService.create(request);
        URI uri = new URI("/api/v1/bewertung" + bewertung.getId());
        return ResponseEntity.created(uri).build();
    }
    @DeleteMapping(path= "/api/v1/bewertung/{id}")
    public ResponseEntity<Void> deleteBewertung(@PathVariable Long id) {
        boolean deletet = bewertungService.deleteById(id);
        return deletet ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }
}
