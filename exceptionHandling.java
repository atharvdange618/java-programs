/*
1. Define a class

2. Create a divide by zero exception

3. Create ArrayIndexOutofBound exception. 

4. Use try-catch block to handle exception

5. Print stack trace of both exceptions. 

6. Use finally block & display message "Finally Block Executed"
*/

public class exp09 {

    public static void main(String args[]) {
        int num1 = 15, num2 = 0;
        int result = 0;
        try {
            result = num1 / num2;
            System.out.println("The result is" + result);

            String[] arr = { "Atharv", "Kamlesh", "Suraj", "Ishwar" };
            for (int i = 0; i <= arr.length; i++) {

                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Error. Array is out of Bounds" + a);
        } catch (ArithmeticException d) {
            System.out.println("Can't be divided by Zero" + d);
        }

        finally {
            System.out.println("Finally Block Executed");
        }

        Thread.dumpStack();

    }
}