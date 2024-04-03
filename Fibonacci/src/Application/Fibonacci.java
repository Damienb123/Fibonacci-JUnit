package Application;

public class Fibonacci {
	
	public int recursiveCallCount = 0;
	
	public int recursiveFib(int n) {
		recursiveCallCount = recursiveCallCount + 1;
		if(n < 2) {
			return n;
		}
		else {
			return recursiveFib(n -1) + recursiveFib(n - 2);
		}
	}
	
	public static int fastFib(int n) throws Exception {
		if(n < 0) {
			throw new Exception("Argument is less than 0.");
		}
		if (n == 0) {
			return 0;
		}
		else {
			int f1 = 0;
			int f2 = 1;
			while (n > 1) {
				int temp = f1 + f2;
				f1 = f2;
				f2 = temp;
				n = n - 1;
			}
			return f2;
		}
	}
}
