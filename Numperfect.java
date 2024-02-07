import java.util.Scanner;//java.util is package
//what is package? ->a set of classes,interface and sub-packages that are similar
public class Numperfect{//public is accessmodifier
	public static void main(String[]args){
		Scanner jk=new Scanner(System.in);//jk is created object
		//what is object ?-> instans of class means object...
		System.out.println("Enter the number");//system is class
		int num=jk.nextInt();//nextInt is one type method
		int sum=0;//sum defult value 0...
		for(int i=1;i<=num/2;i++){
			if(num%i==0)
				sum=sum+i;
		}
		if(sum==sum)
			System.out.println("the number is perfect");
		else
			System.out.println("the number not is perfect");
	}
}
//imp questions...
//1.what is prime number?
->prime number is a number that is greater than 1 and divided by 1 or itself only........
//2.which are prime number?
->prime number that have only 2 fectors: 1 and themselves...
//3.is 12 is a prime number?
->No,12 is not a prime number
//4.what us a package a collection of?
->package is a collection of related classes and interface providing access protection and namespace management.........
