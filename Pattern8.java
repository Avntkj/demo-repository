
package pattern_printing;

public class Pattern8 {
    public static void main(String args[]){
        
        int k=5;
        for(int i=0;i<5;i++)
        {
            for(int j=5;j>i;j--) 
//j>=i cus same number of numbers in row as column number
            {
             
             System.out.print(k-- + " ") ; 
            }
            System.out.println();
        }
    
    }
}
