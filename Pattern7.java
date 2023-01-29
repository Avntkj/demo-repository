
package pattern_printing;

public class Pattern7 {
    public static void main(String args[])
    {
        int alphabet=65;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)(alphabet)+ " ");
                System.out.print(alphabet++);
            }
            System.out.println("");
        }
    }
    
}
