package javaapplication1;

public class Multithreading extends Thread
{
    @Override
    public void run()
    {
        //code to be written
            for(int i=0;i<10;i++)
            {
                System.out.println(i);
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
                       Multithreading mt=new Multithreading();
                       mt.start();
                       }
                       //for more threads, we use for loop
                    }
    
}

