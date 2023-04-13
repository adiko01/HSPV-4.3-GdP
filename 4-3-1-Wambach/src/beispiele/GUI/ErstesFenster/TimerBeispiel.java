package beispiele.GUI.ErstesFenster;

import java.util.Timer;
import java.util.TimerTask;

public class TimerBeispiel {

	public static void main(String[] args)
	{
		
		Timer t = new Timer();
		
		TimerTask tt = new TimerTask() {
			
			public void run() {
				System.out.println("Hallo");
			}
			
		};
		
		System.out.println("Programmstart");
		t.schedule(tt, 0, 500);
		
	}
}
