class Testing
{
	//Synchronized is a process to protect the resources 
	//we can use two method to synchronized 
	//1. synchronized method 
	//2. synchronized block 
	//in this example use synchronized method 
	public synchronized  void Show(Testing T)
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class Main4 extends Thread {
	Testing T;
	
	public Main4(Testing T)
	{
		this.T = T;
	}

	public static void main(String[] args) {
		
		Testing T = new Testing();
		Thread thread = new Thread(new Main4(T),"New Thread in Testing class");
		thread.start();
		for(int i = 0; i < 10; i++)
		{
			System.out.println(Thread.currentThread().getName());
		}

	}
	public void run()
	{
		T.Show(T);
	}

}