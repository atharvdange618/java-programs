import java.util.Scanner;

/*
1. Define class Rectangle.

2. Define attributes width, length, area and color. 

3. Define parameterized constructor in class rectangle.

4. Define methods to read width, length and color. 

5. Define method rectArea to compute area of rectangle.

6. Define method colorCompare to compare colors of rectangle

7. Define main() method 

8. Initialize variables using parameterized constructor

9. Find area of rectangle & compare colors

10. Display results

11. Initialize variables using methods

12. Find area of rectangle & compare colors

13. Display results
*/
class Rectangle {
	double width, length, area;
	String color;

	Scanner sc = new Scanner(System.in);

	Rectangle() {
		System.out.print("Enter the length: ");
		length = sc.nextDouble();

		System.out.print("Enter the width: ");
		width = sc.nextDouble();

		System.out.print("Enter the color: ");
		color = sc.next();
		area = length * width;

		System.out.println("Area of Rectangle: " + area);
	}
}

public class matchrect {
	public static void main(String[] args) {
		System.out.println("First Rectangle: ");
		Rectangle r1 = new Rectangle();

		System.out.println("Second Rectangle: ");
		Rectangle r2 = new Rectangle();

		if (r1.area == r2.area && r1.color.equals(r2.color)) {
			System.out.println("Matching Rectangle ");
		} else {
			System.out.println("Non Matching Rectangle ");
		}
	}// main
}// class