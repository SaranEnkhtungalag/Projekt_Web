package htwberlin.de.Projekt_Webtech.persistence;
import htwberlin.de.Projekt_Webtech.api.BewertungEntity;
import jakarta.persistence.*;


import java.util.ArrayList;
import java.util.List;

@Entity(name = "reisen")
public class ReiseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "land_name")
    private String landname;
    @Column(name = "reise_name")
    private String reisename;
    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "reiseId", fetch = FetchType.EAGER)
    private List<BewertungEntity> bewertungen = new ArrayList<>();

    public ReiseEntity(String landname, String reisename, String description) {
        this.landname = landname;
        this.reisename = reisename;
        this.description = description;
    }
    protected ReiseEntity() {}

    public Long getId() {
        return id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<BewertungEntity> getBewertungen() {
        return bewertungen;
    }

    public void setBewertungen(List<BewertungEntity> bewertungen) {
        this.bewertungen = bewertungen;
    }
}
