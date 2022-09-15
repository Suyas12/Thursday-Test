public class Concurrent_MultiThread { 
    public static void main(String args[]) 
    {
        //Creating two classes of cThread
        cThread th1 = new cThread("thread1: ");
        cThread th2 = new cThread("thread2: ");
        //Start method 
        th1.start();    
        th2.start();    
        Boolean th1_bool = true;   
        Boolean th2_bool = true;
        //Checking the condition using while loop
        while(th1_bool || th2_bool);{
           if (th1_bool && !th1.isAlive()) { 
               th1_bool = false;
            System.out.println("Thread 1 dies.");
           }
           if (th2_bool && !th2.isAlive()) {   
               th2_bool = false;
               System.out.println("Thread 2 dies.");
           }
        }  
    }
}
//Creating a class that extends thread
class cThread extends Thread  
{
//Creation of array
static String message[] ={ "Java", "is", "hot", "aromatic", "and", "invigorating."}; 
public cThread(String id)  
    {
        super(id);
    }
void randomWait()  
{
    //For Exception Handling
    try {
        // Sleeps for 1 second
       sleep(1000);    
    } catch (Exception e) {   
       System.out.println(e);
}
}
    public void run()  
    {
        String name = getName();   
        for (int i=0;i<message.length;++i) {  
           randomWait();
           System.out.println(name + message[i]);
        }
    }
}
