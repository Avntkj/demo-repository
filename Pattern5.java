package pattern_printing;

public class Pattern5 {
    public static void main(String args[]) 
            {
                int k=1;
                for(int i=0;i<5;i++)
                {
                    for(int n=0;n<=i;n++)
                    {
                       System.out.print( k++ + " " );
                    }
                    System.out.println();
                }
            }
    
}
