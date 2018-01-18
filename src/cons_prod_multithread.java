
public class cons_prod_multithread
{
    public static void main(String[] args)
                        throws InterruptedException
    {
        // Object of a class that has both produce()
        // and consume() methods
        final ConsumerProducer ConsProd = new ConsumerProducer();
 
        // Create the producer thread
        Thread thread1 = new Thread(new Runnable()
        {

			public void run() {
				 try
	                {
	                    ConsProd.produce();
	                }
	                // if a thread is interrupted before
	                // or during a job
	                catch(InterruptedException e)
	                {
	                	// prints the stack trace of the Exception
	                	// to system err
	                    e.printStackTrace();
	                }
				
			}
          
        });
 
        // Create the consumer thread
        Thread thread2 = new Thread(new Runnable()
        {

			public void run() {
				try
                {
                    ConsProd.consume();
                }
                // if a thread is interrupted before
                //or during a job
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
				
			}
           
        });
 
        // Start both threads
        thread1.start();
        thread2.start();
 
        // make sure thread1 finishes before thread2
        thread1.join();
        thread2.join();
    }
}
