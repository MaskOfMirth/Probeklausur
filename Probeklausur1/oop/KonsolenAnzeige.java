package oop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class KonsolenAnzeige implements Anzeige {

    private static SimpleDateFormat FORMAT = new SimpleDateFormat("'Es ist gerade' HH:mm 'Uhr und' ss 'Sekunden.'");

    private Uhrwerk uhrwerk;

    public void setUhrwerk(Uhrwerk u) {

	this.uhrwerk = u;
    }

    public void zeigeZeit() {

	Date z = this.uhrwerk.getZeit();
	System.out.println(FORMAT.format(z));
    }
}
