import lang.stride.*;
import sum.kern.*;

/**
 * 
 */
public class Steuerprogramm_Billard
{
    private Bildschirm hatBildschirm;
    private Maus hatMaus;
    private Kugel1 hK1;
    private Kugel2 hK2;
    private Kugel3 hK31;
    
    private Kugel4 hK4;
    private Kugel5 hK5;

    /**
     * Constructor for objects of class Steuerprogramm
     */
    public Steuerprogramm_Billard()
    {
        hatBildschirm =  new  Bildschirm(800, 600);
        hatMaus =  new  Maus();
        hK1 = new Kugel1();
        hK2 = new Kugel2();
        hK31 = new Kugel3(200, 300);
        
        hK4 = new Kugel4(400, 400, 80, 7);
        hK5 = new Kugel5(300, 300, 50, 9);
        this.spiele();
    }

    /**
     * 
     */
    public void spiele()
    {
        while ( ! hatMaus.doppelKlick()) {
            hK1.bewege(); 
            hK2.bewege();
            hK31.bewege();
            hK4.bewege(); 
            hK5.bewege(); 
        }
    }
}
