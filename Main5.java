class TestsyncronizedBlock
{
	TestsyncronizedBlock Object;
	
	public void Show(TestsyncronizedBlock Object)
	{
		synchronized(Object)
		{
			for(int i = 0; i < 10; i++ )
			{
				System.out.println(Thread.currentThread().getName());
			}
		}
		
	}
}
public class Main5 extends Thread {

	TestsyncronizedBlock Object;
	
	public Main5(TestsyncronizedBlock Object)
	{
		this.Object = Object;
	}
	public static void main(String[] args) {
		
		TestsyncronizedBlock Object = new TestsyncronizedBlock();
		Thread thread = new Thread(new Main5(Object));
		thread.setName("New Thread");
		thread.start();
		for(int i = 0; i < 10; i++ )
		{
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	public void run()
	{
		Object.Show(Object);
	}

}