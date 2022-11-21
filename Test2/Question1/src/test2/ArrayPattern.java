package test2;

public class ArrayPattern {

	public static void main(String[] args) {
		int i = 1,j,k;
		int rows = 5;
		int num = 9;

		while (i <= rows) {
			j = 1;
			while (j < i) {
				System.out.print(" ");
				j++;
			}

			k = 1;
			while (k <= rows - i + 1) {
				System.out.print(num + " ");
				k++;
			}
			num=num-2;
			System.out.println();
			i++;
		}


	}

}
