import pkg.*;
import java.util.ArrayList;
import java.util.Random;

public class starter implements InputControl, InputKeyControl {

	public static void printar(int[] ai){
		for(int n = 0; n<ai.length; n++){
			System.out.print(ai[n]+" ");
		}
		System.out.println();
	}
	public static void fill(int[] ar){
		for(int n=0;n<ar.length;n++){
			ar[n] = Canvas.rand(10);
		}
	}
	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());

		int[] datar = new int[7];
		fill(datar);
		printar(datar);
		
		int[] talar = new int[10];
		for(int a=0;a<talar.length;a++){
			for(int b=0;b<datar.length;b++){
				if(a == datar[b]){
					talar[a]++;
				}
			}
		}
		printar(talar);
		
		/* 
		- example
		- a traverses the tally array
		- a = 2
		- while a is on 2, b traverses data array 
		- while going through the data array, if the number 2 appears 
		the value of the index 2 of the tally array goes up by one
		- if 2 appears 3 times, 3 is added to the 0 value of the index(3) of the tally array
		*/
	}

	public void onMouseClick(double x, double y) {
		// enter code here

	}

	public void keyPress(String s) {
		// enter code here

	}
}
