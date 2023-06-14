package htwberlin.de.Projekt_Webtech.service;

import htwberlin.de.Projekt_Webtech.api.BewertungEntity;
import htwberlin.de.Projekt_Webtech.api.Reise;
import htwberlin.de.Projekt_Webtech.persistence.ReiseEntity;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class ReisePush {

    public Reise pushEntity(ReiseEntity reiseEntity) {
        var bewertungen = reiseEntity.getBewertungen().stream().map(BewertungEntity::getId).collect(Collectors.toList());
        return new Reise(reiseEntity.getId(), reiseEntity.getLandname(), reiseEntity.getReisename(), reiseEntity.getDescription(), bewertungen);
    }

}
