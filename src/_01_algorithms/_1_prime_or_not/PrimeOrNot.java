package _01_algorithms._1_prime_or_not;
import javax.*;
import javax.swing.JOptionPane;
public class PrimeOrNot {
public static void main(String[] args) {
	
	String input = JOptionPane.showInputDialog("Is a number prime or not? Let's see! What's your number?");
	int number = Integer.parseInt(input);
	for(int i=2;i<=number/2;i++) {
		System.out.println("Checking " + i);
		if(number%i==0) {
			JOptionPane.showMessageDialog(null,number + " is not prime, it is divisible by " + i + "!");
			System.exit(0);
		}
		
	}
	JOptionPane.showMessageDialog(null,number + " is prime! Eureka!");
	
}
}
