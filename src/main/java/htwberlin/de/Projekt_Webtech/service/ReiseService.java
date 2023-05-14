package htwberlin.de.Projekt_Webtech.service;

import htwberlin.de.Projekt_Webtech.api.ReiseRequest;
import htwberlin.de.Projekt_Webtech.persistence.ReiseEntity;
import htwberlin.de.Projekt_Webtech.persistence.ReiseRepository;
import htwberlin.de.Projekt_Webtech.api.Reise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReiseService {

    @Autowired
    ReiseRepository reiseRepository;

    @Autowired
    ReisePush reisePush;

    public ReiseService(ReiseRepository reiseRepository) {
        this.reiseRepository = reiseRepository;
    }
    public List<Reise> findAll() {
        List<ReiseEntity> reisen = (List<ReiseEntity>) reiseRepository.findAll();
        return reisen.stream().map(reisePush::pushEntity).collect(Collectors.toList());
    }

    public Reise findById(Long id) {
        var ereise = reiseRepository.findById(id);
        return ereise.map(reisePush::pushEntity).orElse(null);
    }

    public Reise create(ReiseRequest request) {
        var ereisen = new ReiseEntity(request.getId(), request.getLandname(), request.getReisename(), request.getDescription());
        ereisen = reiseRepository.save(ereisen);
        return reisePush.pushEntity(ereisen);
    }

    public Reise update(Long id, ReiseRequest request) {
        var reiseOptional = reiseRepository.findById(id);
        var ereisen = reiseOptional.get();
        if(reiseOptional.isEmpty()) { return null; }
        ereisen.setLandname(request.getLandname());
        ereisen.setReisename(request.getReisename());
        ereisen.setDescription(request.getDescription());
        reiseRepository.save(ereisen);
        return reisePush.pushEntity(ereisen);
    }

    public boolean deleteById(Long id) {
        if(!reiseRepository.existsById(id)) { return false; }
        reiseRepository.deleteById(id);
        return true;
    }

//
//    @Autowired
//    ReiseRepository repo;
//
//    public ReiseEntity save(ReiseEntity reise) {
//        ReiseEntity result = reiseRepository.save(reise);
//        return result;
//    }
//
//    public ReiseEntity get(Long id) {
//        return reiseRepository.findById(id).orElseThrow(() -> new RuntimeException());
//    }
}
