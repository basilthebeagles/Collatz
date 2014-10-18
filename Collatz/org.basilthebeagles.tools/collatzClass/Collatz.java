package collatzClass;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Collatz {

	public static void main(String[] args) {
		Boolean go = false;
		long input = 0;
		long trys = 0;
		long high = 0;
		long num = 0;
		Scanner s = new Scanner(System.in);
do{
		System.out.println("Please enter the number you would like to reduce to zero.");
		input = s.nextLong();
		num = input;
		
		
	if(input != 1){
		go = true;
	}if(input == 1 || input <= -1 ){
		System.out.println("Uha oh you entred an invalid number Please enter a posative number that is not 0.");
	}
}while(go != true);
	
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
	
	System.out.println("You have reached the number one!\nIt only took your computer " +trys1+ 
			" attempts to get to the number one from "+ input1+".\nDuring your quest to reach"
			+ " number one your computer reached numbers as high as: "+high1+"!" );
	}

}
