import java.io.*;

class wordpattern {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string\t");
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.substring(0, s.length() - i));
        }
    }// main
}// class