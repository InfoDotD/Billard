
import sum.kern.*;
public class Kugel5
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    Buntstift hB;
    
    public Kugel5(int pH, int pV, int pWinkel, int pFarbe)
    {
        hB = new Buntstift();
        hB.bewegeBis(pH,pV);
        hB.dreheBis(0.0); 
        hB.dreheBis(pWinkel);
        hB.setzeFarbe(pFarbe);
        this.zeichne(); 
        
    }

    public void zeichne()
    {
        hB.zeichneKreis(15); 
    }
    
    public void loesche()
    
   {
       hB.radiere();
       this.zeichne();
       hB.normal(); 
    }
    
    public void bewege()
    {
        this.loesche();
        hB.bewegeUm(10);
        this.zeichne(); 
        this.pralleAb(); 
    }
    
    public void pralleAb()
    {
        if(hB.hPosition() >= 780 || hB.hPosition() <= 20 || hB.vPosition() <= 20 || hB.vPosition() >= 580)
        {
            hB.dreheUm(180);
        }       
    }
}
