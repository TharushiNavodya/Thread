
public class DeadLock2 {
	public static Object lock1 = new Object();
	
	public static Object lock2 = new Object();

	public static void main(String[] args) 
	{
		Thread01 thread1 = new Thread01(lock1,lock2);
		Thread02 thread2 = new Thread02(lock1,lock2);
		
		thread1.start();
		thread2.start();

	}

}
class Thread01 extends Thread
{
	private Object lock1;
	private Object lock2;
	
	public Thread01(Object lock1,Object lock2)
	{
		this.lock1 = lock1;
		this.lock2 = lock2;
	}
	public void run()
	{
		System.out.println("Thread 1 waiting for lock");
		synchronized(lock1)
		{
			System.out.println("Thread 1 get lock 1 ");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException IE)
			{
				IE.printStackTrace();
			}
		}
		System.out.println("Thread 1 waiting lock 2");
		synchronized(lock2)
		{
			System.out.println("Thread 1 get lock 2");
		}
		System.out.println("End of the processsing of thread 1");
	}
}
class Thread02 extends Thread
{
	private Object lock1;
	private Object lock2;
	
	public Thread02(Object lock1,Object lock2)
	{
		this.lock1 = lock1;
		this.lock2 = lock2;
	}
	public void run()
	{
		System.out.println("Thread 02 waiting lock");
		synchronized(lock2)
		{
			System.out.println("Thread 02 get lock 2");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException IE)
			{
				IE.printStackTrace();
			}
			System.out.println("Thread 02 waiting lock 2");
		}
	}
}