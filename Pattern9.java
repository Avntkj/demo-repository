
package pattern_printing;

public class Pattern9 {
    public static void main(String args[])
    {
        for(int i=0;i<5;i++)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
