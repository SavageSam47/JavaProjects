
public class recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(50));

	}

	public static int mult(int num1, int num2) {
		if(num2==1) {
			return num1;
		}
		else {
			return num1+ mult(num1,num2-1);
		}

	}
	public static long exponent(long base, long power) {
		if (power==1){
			return base;
		}
		else {
			return base* exponent(base, power-1);
		}
	}
	public static long factorial(long base) {
		if(base == 1) {
			return base;
		}
		else {
			return base* factorial(base-1);
		}
	}
	public static long fibonacci(long n)  {
	    if(n <=1)
	        return n;
	   else
	      return fibonacci(n - 1) + fibonacci(n - 2);
	}
	




}