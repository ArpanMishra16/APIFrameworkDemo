package resources;

import org.junit.Assert;

public class JavaNumericalQuestion {

	public static void main(String[] args) {
		//finonacco(20);
		//factorial(5);
		//revNumber(123456789);
		//sumOfDigit(1111111111);
		//pallindrome(56465);
		//prime(17);
		//primeList(5,20);
		//swap3(45,23);
		findLargest();

	}
	
	public static void finonacco(int upto) {
		
		int n1=0, n2=1, n3=0;
		System.out.print(+n1+ " "+n2);
		for(int i=2;i<upto;i++) {
			n3 = n1+n2;
			n1= n2;
			n2=n3;
			System.out.print(" "+n3);
		}
	}
	public static void factorial(int n) {
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}
	public static void revNumber(int n) {
		int rev = 0;
		while (n!=0) {
			rev = rev*10 + (n%10);
			n =n/10;
			
			}
		System.out.println(rev);
	}
	public static void sumOfDigit(long number) {
		long sum= 0;
		while(number!=0) {
			sum = sum + number%10;
			number=number/10;
		}
		System.out.println(sum);
	}
	public static void pallindrome(int n)
	{
		int originaNum =n;
		int temp =0;
		while(n!=0)
		{
			temp = temp*10 + n%10;
			n= n/10;
		}
		if(originaNum==temp)
			System.out.println(+originaNum+ " is pallindrome");
		else
			System.out.println(+originaNum+" is not pallindrome");
	
		}
	
	public static void prime(int n) {
		int count = 0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
			}
		if(count==2) {
			System.out.println(n+ " is prime");
		}
		else
			System.out.println(n +" is not prime");
		
	}
	public static void primeList(int n1, int n2) {
		
		int i,j;
		boolean isPrime = true;
		for(i=n1;i<=n2;i++) {
			 isPrime = true;
		
		for(j=2;j<i;j++) {
			if(i%j==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(i);
		}}}
	
	public static void swap1(int a, int b) {
		int temp = 0;
		System.out.println("before swapping "+a+"-"+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping "+a+ "-"+b);
	}
	public static void swap2(int a, int b) {
		System.out.println("before swapping "+a+"-"+b);
		a= a+b;
		b = a-b;
		a=a-b;
		System.out.println("After swapping "+a+"-"+b);
	}
	
	public static void swap3(int a, int b) {
		System.out.println("before swapping "+a+"-"+b);
		a = a^b;
		b =a^b;
		a=a^b;
		System.out.println("After swapping "+a+"-"+b);
	}
	public static void findLargest() {
		int[] a = {23,54,85,69,89,4589,47,45226};
		int largest = a[0];
		System.out.println(a.length);
		for(int i=1;i<=a.length-1;i++) {
			if(a[i]>largest) {
				largest = a[i];
			}}
		System.out.println(largest);
	
	}

}
