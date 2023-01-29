
package pattern_printing2;

public class Pattern11 {
    public static void main(String args[])
            {
                int alphabet=65;
              for(int i=0;i<5;i++)
              {
                  for(int j=0; j<=i; j++)
                  {
                      System.out.print((char)(alphabet+i)+ " ");
                  }
                  System.out.println();
              }
            }
    
}
