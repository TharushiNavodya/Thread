//use Test class for executing thread methods 

class Test 
{
	public void Show()
	{
		for(int i = 0; i < 10 ; i++)
		{
			System.out.println("Thread :"+Thread.currentThread().getName()+" "+i);
		}
	}
	
}
public class Main3 extends Thread{

	Test T;
	
	public Main3(Test T)
	{
		this.T = T;
	}
	public static void main(String[] args) {
		
		Test T = new Test();
		Thread thread = new Thread(new Main3(T),"New Test Thread");
		thread.start();
		for(int i = 0; i < 10 ; i++)
		{
			System.out.println("Thread :"+Thread.currentThread().getName()+" "+i);
		}
		
	}
	public void run()
	{
		T.Show();
	}

}
