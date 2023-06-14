package htwberlin.de.Projekt_Webtech.service;

import htwberlin.de.Projekt_Webtech.api.Bewertung;
import htwberlin.de.Projekt_Webtech.api.BewertungEntity;
import htwberlin.de.Projekt_Webtech.api.BewertungRequest;
import htwberlin.de.Projekt_Webtech.api.Stern;
import htwberlin.de.Projekt_Webtech.persistence.BewertungRepository;
import htwberlin.de.Projekt_Webtech.persistence.ReiseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BewertungService {

    @Autowired
    BewertungRepository bewertungRepository;
    @Autowired
    ReiseRepository reiseRepository;
    @Autowired
    ReisePush reisePush;

    public BewertungService(BewertungRepository bewertungRepository) {
        this.bewertungRepository = bewertungRepository;
    }
    public Bewertung create(BewertungRequest request){
        var reise = reiseRepository.findById(request.getId()).orElseThrow();
        var stern = Stern.valueOf(request.getStern()).getVoit();
        var bewertungEntity = new BewertungEntity(request.getAuthorName(), stern, reise);
        bewertungEntity = bewertungRepository.save(bewertungEntity);
        return requestEntity(bewertungEntity);
    }

    private Bewertung requestEntity(BewertungEntity bewertungEntity) {
        return new Bewertung(bewertungEntity.getId(),bewertungEntity.getAuthorName(), bewertungEntity.getReisename(), bewertungEntity.getStern());
    }
    public List<Bewertung> findAll(){
        List<BewertungEntity> bewerben = bewertungRepository.findAll();
        return bewerben.stream().map(this::requestEntity).collect(Collectors.toList());
    }
    public Bewertung findById(Long id){
        var bewertungEntity = bewertungRepository.findById(id);
        return bewertungEntity.map(this::requestEntity).orElse(null);
    }
    public List<Bewertung> findAllByReiseId(Long reiseId) {
        var optionalReiseEntity = reiseRepository.findById(reiseId);
        var reiseEntity = optionalReiseEntity.get();
        List<BewertungEntity> bewerten = bewertungRepository.findAllByReiseId(reiseEntity);
        return bewerten.stream().map(this::requestEntity).collect(Collectors.toList());
    }
    public boolean deleteById(Long id) {
        if(!bewertungRepository.existsById(id)){ return false; }
        bewertungRepository.deleteById(id);
        return true;
    }

}
