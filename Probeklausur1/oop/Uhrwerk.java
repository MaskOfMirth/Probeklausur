package oop;

import java.util.Date;

public interface Uhrwerk {

    public Date getZeit();

    public void setZeit(Date z) throws UnsupportedOperationException;
}
