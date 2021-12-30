//Thread is concurrent program
//In one process there have several threads 
//Thread can implement easy than process 
//and thread use less resources 
public class Main extends Thread
{
	//In thread we can not guarantee output
	
	public static void main(String []args)
	{
		Main M = new Main();
		M.start();
		for(int i = 0; i <10 ; i++)
		{
			System.out.println("Thread :"+Thread.currentThread().getName());
		}
	}
	
	public void run()
	{
		for(int i = 0; i <10 ; i++)
		{
			System.out.println("Thread :"+Thread.currentThread().getName());
		}
	}
}