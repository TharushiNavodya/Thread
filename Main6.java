class BackGroundThread
{
	BackGroundThread Object;

	public void ShowBackgroundChange()
	{
			for(int i = 0; i < 10; i++ )
			{
				while(true)
				{
					System.out.println("Chage color :"+Math.random()+" to background");
				}	
		}
	}
	
	
}
public class Main6 extends Thread{
	
	BackGroundThread Object;
	
	public Main6(BackGroundThread Object)
	{
		this.Object = Object;
	}

	public static void main(String[] args) {
		
		BackGroundThread Background = new BackGroundThread();
		Thread thread = new Thread(new Main6(Background),"New Background change thread");
		thread.setDaemon(true);
		thread.start();
	
		for(int i = 0; i < 10 ; i++ )
		{
			System.out.println("Executing :"+Thread.currentThread().getName());
		}
		System.out.println("Leaving the executing main thread");
	
	}
	public void run()
	{
		Object.ShowBackgroundChange();
	}

}