/*
1. Create a class

2. Implement thread that prints values from 1 to 5 DE

3. Create another class 

4. Implement thread that prints values from A to E

5. Create main class

6. Execute both threads
*/
class mydata implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.print("\t" + i);
            }

            System.out.println();

            for (char ch = 'A'; ch <= 'E'; ch++) {
                System.out.print("\t" + ch);
            }
        } finally {
        }
    }
}

class exp12 {
    public static void main(String[] args) {
        mydata m1 = new mydata();
        Thread thread = new Thread(m1);
        thread.start();
    }
}