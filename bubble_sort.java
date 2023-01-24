import java.io.*;
//this is a example of sorting method using string methods

public class sortmeth {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i;
        String temp;
        System.out.println("How many cities");

        int n = Integer.parseInt(br.readLine());
        String str[] = new String[n];
        System.out.println("Enter name of those cities");
        for (i = 0; i < n; i++) {
            System.out.println((i + 1) + " ");
            str[i] = br.readLine();
        }
        for (int pass = 0; pass < n - 1; pass++) {
            for (i = 0; i < n - 1 - pass; i++) {
                if (str[i].compareTo(str[i + 1]) > 0) {
                    temp = str[i];
                    str[i] = str[i + 1];
                    str[i + 1] = temp;
                } // if
            }
        } // outer for
        System.out.println("City names after sorting");
        for (i = 0; i < n; i++) {
            System.out.println(str[i]);
        }
    }// main
}// class