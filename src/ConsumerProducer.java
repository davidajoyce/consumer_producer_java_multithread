
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
            
            
        }
 
        // Function called by the consumer thread
        public void consume() throws InterruptedException
        {
            
        }
    }