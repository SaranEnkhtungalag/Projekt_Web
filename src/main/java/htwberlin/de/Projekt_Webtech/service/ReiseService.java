package htwberlin.de.Projekt_Webtech.service;

import htwberlin.de.Projekt_Webtech.Repositories.ReiseRepository;
import htwberlin.de.Projekt_Webtech.api.Reise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReiseService {

    @Autowired
    ReiseRepository repo;

    public Reise save(Reise reise) {
        return repo.save(reise);
    }

    public Reise get(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException());
    }
}
