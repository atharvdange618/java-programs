import java.io.*;

class linearsearch {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many numbers");
		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];
		System.out.println("Enter those " + n + " numbers");
		int i;
		for (i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(br.readLine());
		} // for

		// linear search
		while (true) {
			System.out.println("Enter a number to be searched (-1 will end program)");
			int target = Integer.parseInt(br.readLine());
			if (target == -1) {
				break;
			}
			search(a, target);
		} // while

	}// main

	static void search(int a[], int target) {
		int i;
		boolean flag;
		for (i = 0, flag = false; i < a.length; i++) {
			if (a[i] == target) {
				System.out.println("Found at position " + (i + 1));
				flag = true;
				break;
			} // if

		} // for

		if (flag == false) {
			System.out.println("Not found");
		}
	}// search

}// class