import java.util.Scanner;

class stringtoint {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String user_input = scan.nextLine();
        String[] stringsArray = user_input.split(" ");

        int[] intArray = new int[stringsArray.length];
        for (int i = 0; i < stringsArray.length; i++) {
            intArray[i] = Integer.parseInt(stringsArray[i]);
            System.out.print(intArray[i] + " ");
        }

    }
}