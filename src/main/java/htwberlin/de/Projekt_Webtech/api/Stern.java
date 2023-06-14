package htwberlin.de.Projekt_Webtech.api;

public enum Stern {
    verybad(1), bad(2), ok(3), good(4), verygood(5);
    private int voit;

    private Stern(int voit) { this.voit = voit; }

    public int getVoit() { return voit; }

}
