
import sum.kern.*;
public class Kugel1
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    Buntstift hB;
    
    public Kugel1()
    {
        hB = new Buntstift();
        hB.bewegeBis(100,50);
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
        hB.bewegeUm(0.1);
        this.zeichne(); 
    }
}
