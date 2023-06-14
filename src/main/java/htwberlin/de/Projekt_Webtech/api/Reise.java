package htwberlin.de.Projekt_Webtech.api;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;


public class Reise {

    private long id;
    private String landname;
    private String reisename;
    private String description;
    private List<Long> bewertung;

    public Reise(long id, String landname, String reisename, String description, List<Long> bewertung) {
        this.id = id;
        this.landname = landname;
        this.reisename = reisename;
        this.description = description;
        this.bewertung = bewertung;
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

    public List<Long> getBewertung() {
        return bewertung;
    }

    public void setBewertung(List<Long> bewertung) {
        this.bewertung = bewertung;
    }
}
