package htwberlin.de.Projekt_Webtech.persistence;


import htwberlin.de.Projekt_Webtech.api.Reise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReiseRepository extends JpaRepository<ReiseEntity, Long> {
    List<ReiseEntity> findAllByLandname(String landName);
}
