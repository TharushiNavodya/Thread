
public class DeadLock1 {
	
	public static Object lock1 = new Object();
	
	public static Object lock2 = new Object();

	public static void main(String[] args) {
		
		ThreadOne thread1 = new ThreadOne();
		ThreadTwo thread2 = new ThreadTwo();
		thread1.start();
		thread2.start();
		

	}
	
	static class ThreadOne extends Thread
	{
		public void run()
		{
			System.out.println("Start Executing thread 01");
			synchronized(lock1)
			{
				try
				{
					System.out.println("Thread 01 reciving lock 1 ");
					Thread.sleep(1000);
				}
				catch(InterruptedException IE)
				{
					IE.printStackTrace();
				}
				System.out.println("Thread 1 wait to lock 2");
			}
			synchronized(lock2)
			{
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException IE)
				{
					IE.printStackTrace();
				}
				System.out.println("Thread get lock 2"); 
			}
			System.out.println("End of the executing thread 1");  
			
		}
	}
	static class ThreadTwo extends Thread
	{
		public void run()
		{
			System.out.println("Start Executing thread 01");
			synchronized(lock1)
			{
				try
				{
					System.out.println("Thread 01 reciving lock 1 ");
					Thread.sleep(1000);
				}
				catch(InterruptedException IE)
				{
					IE.printStackTrace();
				}
				System.out.println("Thread 1 wait to lock 2");
			}
			synchronized(lock2)
			{
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException IE)
				{
					IE.printStackTrace();
				}
				System.out.println("Thread get lock 2"); 
			}
			System.out.println("End of the executing thread 1");  
			
		}
	}
}
