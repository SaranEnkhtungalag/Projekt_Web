package htwberlin.de.Projekt_Webtech.api;

public class ReiseRequest {
    private long id;
    private String landname;
    private String reisename;
    private String description;

    public ReiseRequest(long id, String landname, String reisename, String description) {
        this.id = id;
        this.landname = landname;
        this.reisename = reisename;
        this.description = description;
    }

    public ReiseRequest() { }

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
