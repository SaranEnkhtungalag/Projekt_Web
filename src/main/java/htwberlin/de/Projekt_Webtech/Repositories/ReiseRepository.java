package htwberlin.de.Projekt_Webtech.Repositories;


import htwberlin.de.Projekt_Webtech.api.Reise;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReiseRepository extends CrudRepository<Reise, Long> { }
