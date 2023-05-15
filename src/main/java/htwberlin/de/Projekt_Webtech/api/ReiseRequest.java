package htwberlin.de.Projekt_Webtech.api;

public class ReiseRequest {
    private String landname;
    private String reisename;
    private String description;

    public ReiseRequest(String landname, String reisename, String description) {
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
