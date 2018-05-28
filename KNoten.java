import java.util.Random;

public class KNoten
{
    int[][] noten;
    Random wuerfel;
    
    public KNoten()
    {
       noten = new int[30][10];
       wuerfel = new Random();
    }
    
    public void erzeugen()
    {
       for (int s=0; s<30; s++)
          for (int i=0; i<10; i++) 
             noten[s][i] = wuerfel.nextInt(6)+1;
    }
    
    public void ausgeben()
    {
       for (int s=0; s<30; s++)
       {
          System.out.print("Noten fuer Schueler "+(s+1)+":\t");
          for (int i=0; i<9; i++) 
             System.out.print(noten[s][i] + " / "); 
          System.out.println(noten[s][9] + " / D = " + DurchschnittS(s));
       }
       System.out.println("Klassendurchschnitt = " + DurchschnittK());
    }
    
    public double DurchschnittS(int pos)
    {
        double ds = 0;
        
        for(int a=0; a<10; a++)
            {
                ds = ds + ((double) noten[pos][a]);
            }
        return ds / 10;
    }
    
        public double DurchschnittK()
    {
        double dk = 0;
        
        for(int i = 0; i<30; i++)
            {
                dk = dk+ DurchschnittS(i);
            }    
        return dk / 30;
    }
    
    
}
