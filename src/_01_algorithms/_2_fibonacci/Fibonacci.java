package _01_algorithms._2_fibonacci;

public class Fibonacci {
public static void main(String[] args) {
	int num1 = 1;
	int num2 = 1;
	int sum = 1;
	System.out.println(num1);
	while(sum>0&&num1>0&&num2>0) {
		System.out.println(num2);
		sum = num1+num2;
		System.out.println(sum);
		num1 = num2+sum;
		System.out.println(num1);
		num2 = num1 + sum;
	}
}
}
