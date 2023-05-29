
import sum.kern.*;
public class Kugel3
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    Buntstift hB;
    
    public Kugel3(int pH, int pV)
    {
        hB = new Buntstift();
        hB.bewegeBis(pH,pV);
        hB.dreheBis(0.0); 
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
        hB.bewegeUm(1);
        this.zeichne(); 
        this.pralleAb(); 
    }
    
    public void pralleAb()
    {
        if(hB.hPosition() == 780 || hB.hPosition() == 20)
        {
            hB.dreheUm(180);
        }       
    }
}
