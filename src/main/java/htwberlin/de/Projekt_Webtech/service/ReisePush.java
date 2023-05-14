package htwberlin.de.Projekt_Webtech.service;

import htwberlin.de.Projekt_Webtech.api.Reise;
import htwberlin.de.Projekt_Webtech.persistence.ReiseEntity;
import org.springframework.stereotype.Service;

@Service
public class ReisePush {

    public Reise pushEntity(ReiseEntity reiseEntity) {
        return new Reise(reiseEntity.getId(), reiseEntity.getLandname(), reiseEntity.getReisename(), reiseEntity.getDescription());
    }

}
