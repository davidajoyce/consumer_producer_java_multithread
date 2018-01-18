
import java.util.LinkedList;

	// This class has a list, producer (adds items to list
    // and the consumer (removes items).
    public class ConsumerProducer
    {
        // Create a list shared by producer and consumer
        // Size of list is 2
        LinkedList<Integer> list = new LinkedList<Integer>();
        int capacity = 2;
 
        // Function called by the producer thread in 
        //cons_prod_multhread class
        public void produce() throws InterruptedException
        {
        	int value = 0;
            while (true)
            {
            	//no more than one thread can access the code 
            	//inside this block (synchonized)
                synchronized (this)
                {
                    // the producer thread waits while list
                    // is full
                    while (list.size()==capacity)
                   
                        wait();
                        
 
                    System.out.println("The Producer produced-"
                                                  + value);
 
                    // insert the jobs in the list
                    
                    list.add(value++);
 
                    // notifies the consumer thread that
                    // now it can start consuming
                    notify();
 
                    // so you can see what the program is doing
                    // and not printed everything at once
                    Thread.sleep(1000);
                }
            }
            
            
        }
 
        // Function called by the consumer thread
        public void consume() throws InterruptedException
        {
        	while (true)
            {
                synchronized (this)
                {
                    // consumer thread waits while list
                    // is empty
                    while (list.size()==0)
                    	
                        wait();
                        
 
                    //to consume the first job in the list
                    int val = list.removeFirst();
 
                    System.out.println("The Consumer consumed-"
                                                    + val);
 
                    // Wake up the producer thread
                    notify();
 
                    // and sleep like in the produce() function
                    Thread.sleep(1000);
                }
            }
            
        }
    }