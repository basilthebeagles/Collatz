package collatzClass;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;


public class Collatz {

	public static void main(String[] args) {
		Boolean go = false;
		long input = 0;
		long trys = 0;
		long high = 0;
		long num = 0;
do{
		 input = Long.parseLong(JOptionPane.showInputDialog(null, "Please enter the number you would\nlike to reduce to zero."));
		num = input;
		//System.out.println(num);
		//System.out.println(input);
	if(input != 1){
		go = true;
	}if(input == 1 || input <= -1 ){
		JOptionPane.showMessageDialog(null, "Uha oh you entred an invalid number\nPlease enter a posative number that is not 0.");
	}
}while(go != true);
	System.out.println("a");
	System.out.println("a");
	while(num != 1 ){
		
		
		if(num % 2 == 0){
			//System.out.println("a");
			num = num / 2;
			
			
		}else if(num % 2 != 0){
			//System.out.println("a");
			num = num * 3 + 1;
		}
		
		trys++;
		
		if(num > high){
			high = num;
		}
		
		
	}
	DecimalFormat formatter = new DecimalFormat("#,###");
	String trys1 = formatter.format(trys);
	String high1 = formatter.format(high);
	String input1 = formatter.format(input);
	
	JOptionPane.showMessageDialog(null, "You have reached the number one!\nIt only took your computer " +trys1+ " attempts to get to the number one from "+ input1+".\nDuring your quest to reach"
			+ " number one your computer reached numbers as high as: "+high1+"!" );
	}

}
