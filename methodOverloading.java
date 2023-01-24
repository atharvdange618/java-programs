//algorithm
/*
1 Define a class Adder

2 Define 3 instance variables of type int

3 Define parameterized constructor with two arguments & initialize first two instance variables

4 Define another parameterized constructor with three arguments & initialize all three instance variables

5. Define method add with return type int and pass first two instance variables to this method Return the addition of two variables passed

6. Define overloaded method add with return type int and pass all three instance variables to this method. Return the addition of three variables passed. 

7. Define another class TestAdder.

8 Create first object of class Adder by passing two values 

9. Call required method add

10. Create second object of class Adder by passing three values

11. Call required method add

12. Display results of addition properly
*/

class TestOverloading1 {
	public static void main(String[] args) {
		System.out.println(Adder.add(11, 11));
		System.out.println(Adder.add(11, 11, 11));
	}

	class Adder {

		static int add(int a, int b) {
			return a + b;
		}

		static int add(int a, int b, int c) {
			return a + b + c;
		}
	}// adder

}