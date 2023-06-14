package htwberlin.de.Projekt_Webtech.api;

import htwberlin.de.Projekt_Webtech.persistence.ReiseEntity;

public class Bewertung {

        private Long id;
        private String authorName;
        private String reisename;
        private int stern;

        public Bewertung(Long id, String authorName, String reisename, int stern) {
            this.id = id;
            this.authorName = authorName;
            this.reisename = reisename;
            this.stern = stern;
        }

        public Bewertung() {  }

        public Long getId() {
         return id;
        }

        public void setId(Long id) { this.id = id;}

        public String getReisename() { return reisename;}

        public void setReisename(String reisename) { this.reisename = reisename; }

        public String getAuthorName() { return authorName; }

        public void setAuthorName(String authorName) { this.authorName = authorName;}

        public int getStern() { return stern;}

        public void setStern(int stern) { this.stern = stern;}
}
