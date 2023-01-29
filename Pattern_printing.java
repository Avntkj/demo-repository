package pattern_printing;

public class Pattern_printing {
    
//right-angled tiangle
 
    public static void main(String[] args) {
        for(int row=0;row<5;row++)
        {
            for(int col=0;col<=row;col++)
            {
            // when row=0 then star is 1
            // when row=1 then stars are 2
            // so col<=row, to make col (star) to jump to the value next to row
                System.out.print("*");
            }
            System.out.println();
        }
       
    }
    
}
