package htwberlin.de.Projekt_Webtech.persistence;


import jakarta.persistence.*;

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
}
