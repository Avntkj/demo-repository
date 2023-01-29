public class Pattern2 {
    
    public static void main(String args[]) {
        for(int i=5;i>0;i--)
        {
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
            //i=0 s=5 j=4-0=5 j=0to4  *****
            //i=1 s=4 j=4-1=4 j=0to3  ****
            //i=2 s=3 j=4-2=3 j=0to2  ***
            //i=3 s=2 j=4-3=2 j=0to1  **
            //i=4 s=1 j=4-4=0 j=0     *

            //for(i=o;i<5;i++){
            //    for(j=0;j<5-i;j++){
            //         System.out.print("*");
            // }
            //System.out.println();
            //}
