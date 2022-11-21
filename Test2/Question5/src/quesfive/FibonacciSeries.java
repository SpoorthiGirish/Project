package quesfive;

public class FibonacciSeries {

	public static void main(String[] args) {
		
       int n1 = 0, n2 = 1, f;
		
		System.out.print(n1 + " " + n2);

		for (int i = 2; i < 8; ++i)
		{
			f = n1 + n2;
			System.out.print(" " + f);
			n1 = n2;
			n2 = f;
		}

	}

}
