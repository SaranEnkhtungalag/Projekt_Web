package htwberlin.de.Projekt_Webtech.api;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Reise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String landname;
    private String reisename;
    private String description;

    public Reise(long id, String landname, String reisename, String description) {
        this.id = id;
        this.landname = landname;
        this.reisename = reisename;
        this.description = description;
    }

    public Reise() { }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLandname() {
        return landname;
    }

    public void setLandname(String landname) {
        this.landname = landname;
    }

    public String getReisename() {
        return reisename;
    }

    public void setReisename(String reisename) {
        this.reisename = reisename;
    }
}
