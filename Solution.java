import java.util.Scanner;

public class QB_02 {
	static Scanner sc = new Scanner(System.in);

	public static int[][] getElements() {
		int[][] a1 = new int[3][3];
		// int[][] b1 = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a1[i][j] = sc.nextInt();
			}
		}
		return a1;

	}

	private static void display(int[][] a, String string) {
		System.out.println(string + " Array:- ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void matrixAdd(int[][] a, int[][] b) {
		int[][] c = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		display(c, "Added");
	}

	private static void matrixMul(int[][] a, int[][] b) {
		int[][] c = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++)
					c[i][j] += a[i][k] * b[k][j];
			}
		}
		display(c, "Multiplied ");

	}

	public static void main(String[] args) {
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		System.out.println("Enter 1st array: = ");
		a = getElements();
		System.out.println("Enter 2snd array: = ");
		b = getElements();
		while (true) {
			System.out.println("1. Add");
			System.out.println("2. Multiply");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			System.out.print("Enter Choice:- ");
			int ch = sc.nextInt();
			switch (ch) {
			case (1):
				matrixAdd(a, b);
				break;
			case (2):
				matrixMul(a, b);
				break;
			case (3):
				display(a, "First");
				display(b, "Second");
				break;
			case (4):
				System.out.println("exit...");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Input");
			}
		}

	}

}
