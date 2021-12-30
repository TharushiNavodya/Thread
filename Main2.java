public class Main2 implements Runnable
{
	public static void main(String []args)
	{
		System.out.println("Strat the main thread..");
		Thread T = new Thread(new Main());
		T.start();
		for(int i =0; i<10; i++)
		{
			System.out.println("Thread :"+Thread.currentThread().getName());
		}
	}
	public void run()
	{
		System.out.println("Start the New Thread..");
		for(int i =0; i<10; i++)
		{
			System.out.println("Thread :"+Thread.currentThread().getName());
		}
	}
}