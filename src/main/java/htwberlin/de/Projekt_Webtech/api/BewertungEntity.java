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
  @Column(name = "reisename")
  private String reisename;
  @Column(name = "stern")
  private int stern;
  @ManyToOne(cascade = CascadeType.MERGE)
  @JoinColumn(name= "reiseId", referencedColumnName = "id")
  private ReiseEntity reiseId;

  public BewertungEntity(String authorName, String reisename, int stern, ReiseEntity reiseId) {
    this.authorName = authorName;
    this.stern = stern;
    this.reisename = reisename;
    this.reiseId = reiseId;
  }

  public BewertungEntity() {  }

  public Long getId() { return id;  }

  public String getAuthorName() { return authorName; }

  public void setAuthorName(String authorName) { this.authorName = authorName;}

  public int getStern() { return stern;}

  public void setStern(int stern) { this.stern = stern;}

  public String getReisename() {
    return reisename;
  }

  public void setReisename(String reisename) {
    this.reisename = reisename;
  }

  public ReiseEntity getReiseId() {
    return reiseId;
  }

  public void setReiseId(ReiseEntity reiseId) {
    this.reiseId = reiseId;
  }
}
