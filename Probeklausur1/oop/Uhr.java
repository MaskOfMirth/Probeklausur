package oop;

public class Uhr implements Steuerung {

    private Anzeige anzeige;

    public Uhr(Uhrwerk u, Anzeige a) {

	this.anzeige = a;
	this.anzeige.setUhrwerk(u);
    }

    public void aktivieren() {

	this.anzeige.zeigeZeit();
    }

    public void beenden() {

	// Keine Aktionen notwendig
    }
}
