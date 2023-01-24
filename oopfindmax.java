import java.io.*;

class number {
    private int m1, m2, m3, max;
    static BufferedReader br;

    void read() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 3 numbers ");
        m1 = Integer.parseInt(br.readLine());
        m2 = Integer.parseInt(br.readLine());
        m3 = Integer.parseInt(br.readLine());
    }

    void findmax() {
        if (m1 > m2 && m1 > m3) {
            max = m1;
        } else if (m2 > m3) {
            max = m2;
        } else {
            max = m3;
        }
        System.out.println("Maximum is " + max);
    }// findmax
}// number

class oopfindmax {
    public static void main(String[] args) throws IOException {
        number n = new number();
        n.read();
        n.findmax();
    }
}