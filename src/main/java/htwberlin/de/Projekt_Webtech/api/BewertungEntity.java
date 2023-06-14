package htwberlin.de.Projekt_Webtech.api;

import htwberlin.de.Projekt_Webtech.persistence.ReiseEntity;
import jakarta.persistence.*;

@Entity(name = "bewertung")
public class BewertungEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;
  @Column(name = "authorname")
  private String authorName;
  @Column(name = "stern")
  private int stern;
  @Column(name = "reisename")
  private ReiseEntity reisename;

  public BewertungEntity(String authorName, int stern, ReiseEntity reisename) {
    this.authorName = authorName;
    this.stern = stern;
    this.reisename = reisename;
  }

  public BewertungEntity() {  }

  public Long getId() { return id;  }

  public String getAuthorName() { return authorName; }

  public void setAuthorName(String authorName) { this.authorName = authorName;}

  public int getStern() { return stern;}

  public void setStern(int stern) { this.stern = stern;}

  public ReiseEntity getReisename() {
    return reisename;
  }

  public void setReisename(ReiseEntity reisename) {
    this.reisename = reisename;
  }
}
