package program;

public class Fibonacci {
public static void main(String[] args){
	System.out.println("Nth fabonacci number:"+fib(10));
}
private static int fib(int n){
	if(n==1)
		return 0;
	if(n==2)
		return 1;
	return fib(n-1)+fib(n-2);
}
}
