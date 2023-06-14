package htwberlin.de.Projekt_Webtech.persistence;

import htwberlin.de.Projekt_Webtech.api.BewertungEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BewertungRepository extends JpaRepository<BewertungEntity, Long> {
    List<BewertungEntity> findAllByReiseId(ReiseEntity reiseId);
}
