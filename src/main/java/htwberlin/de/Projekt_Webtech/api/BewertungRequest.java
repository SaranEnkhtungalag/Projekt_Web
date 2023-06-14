package htwberlin.de.Projekt_Webtech.api;

public class BewertungRequest {
    private Long id;
    private String authorName;
    private String reiseName;
    private String stern;

    public BewertungRequest(Long id, String authorName, String reiseName, String stern) {
        this.id = id;
        this.authorName = authorName;
        this.stern = stern;
        this.reiseName = reiseName;
    }

    public BewertungRequest() {  }

    public Long getId() { return id;  }
    public void setId(Long id) { this.id = id; }

    public String getAuthorName() { return authorName; }

    public void setAuthorName(String authorName) { this.authorName = authorName;}

    public String getReiseName() {
        return reiseName;
    }

    public void setReiseName(String reiseName) {
        this.reiseName = reiseName;
    }

    public String getStern() { return stern;}

    public void setStern(String stern) { this.stern = stern;}
}
