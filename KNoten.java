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
       zeigeNotenspiegel();
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
    
    public void zeigeNotenspiegel()
    {
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;
        int a5 = 0;
        int a6 = 0;
        
        for(int b = 0; b < 30; b++)
        {
            for(int c = 0; c < 10; c++)
            {
                if(noten[b][c] == 1)
                {
                    a1++;
                }
                if(noten[b][c] == 2)
                {
                    a2++;
                }
                if(noten[b][c] == 3)
                {
                    a3++;
                }
                if(noten[b][c] == 4)
                {
                    a4++;
                }
                if(noten[b][c] == 5)
                {
                    a5++;
                }
                if(noten[b][c] == 6)
                {
                    a6++;
                }
            }
        }
        System.out.println("Notenspiegel:  Note 1 = " + a1 + " Note 2 = " + a2 + " Note 3 = " + a3 + " Note 4 = " + a4 + " Note 5 = " + a5 + " Note 6 = " + a6);
    }
}
