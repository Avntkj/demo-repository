package javaapplication1;

public class Multithreading2 extends Thread
{
    int ThreadNumber;
    //here is a parameterised const
    public Multithreading2(int ThreadNumber){
        //for variable reduction/ global, local variables
        this.ThreadNumber= ThreadNumber;
        
    }
    @Override
    public void run()
    {
        //code to be written
            for(int i=0;i<10;i++)
            {
                System.out.println(i + "THREAD NUMBER" + ThreadNumber);
                
               // ****** we put a constraint *******
               if(ThreadNumber==1)
               throw new RuntimeException();  
               //every thread will be printed
               //except the contents of thread number 1
               
            try{
            Thread.sleep(2000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
                //to print the problem by default
            }
            }
    }
            
            public static void main(String args[])
                    {
                       for(int i=0;i<5;i++)
                       {
                       //we passed i as parameter becaus we've created a
                       //parameterised const and it is supposed to run
                       //i number of times
                       Multithreading2 mt=new Multithreading2(i); 
                       mt.start();
                       }
                       //for more threads, we use for loop
                    }
    
}
