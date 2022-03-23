package oop;

public class Launcher {

    public static void main(String[] args) {

	SystemZeit z = new SystemZeit();
	KonsolenAnzeige a = new KonsolenAnzeige();
	Steuerung s = new Uhr(z, a);

	s.aktivieren();
	s.beenden();
    }
}
