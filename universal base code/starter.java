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
	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		
		int[] da = new int[7];
		//int max = 0;
		for(int n=0; n<da.length; n++){
			da[n] = Canvas.rand(10);
			System.out.print(da[n]+" ");
		}
		System.out.println();
		
		int[] ta = new int[10];
		printar(ta);
		
		int count;
		for(int a=0;a<ta.length;a++){//constant on each number
			for(int b=0;b<da.length;b++){//scans array for same number //checks how many times that number appears
				if(a == da[b]){
					ta[a]++;
				}
			}
		}
		printar(ta);
		
		
		//what to do:
		//data array: 2 5 8 7 4 3 2
		//tally array: 002110110
		//first data value is 2, means that the index of tally array(ta) is where the number is going. 
		//then, in that index, the number of occurances the data value happens is the number of the tally array
		//ta[2] = 2, ta[2] bc 2 is the first data value
		// = 2 because 2 appears twice in data array
	}

	public void onMouseClick(double x, double y) {
		// enter code here

	}

	public void keyPress(String s) {
		// enter code here

	}
}
