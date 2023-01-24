import java.util.Scanner;

class numtoword {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String[] words = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
        "s", "t", "u", "v", "w", "x", "y", "z" };

    // a=0 // b=1// c=2// d=3// e=4// f=5// g=6// h=7// i=8// j=9// k=10// l=11//
    // m=12// n=13// o=14// p=15// q=16
    // r=17// s=18// t=19// u=20// v=21// w=22// x=23// y=24// z=25
    System.out.print("Enter the numbers you want to decode: ");
    String input = in.nextLine();
    String[] numbers = input.split(" "); // split the input by space
    String output;

    for (int i = 0; i < numbers.length; i++) {
      int num = Integer.parseInt(numbers[i]); // parse the number string to an integer
      output = words[num] + ""; // System.out.print(words[num] + "");
      System.out.print(output);
    }
    System.out.println();

  }
}