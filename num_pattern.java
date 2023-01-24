class num_pattern {
    public static void main(String[] args) {
        int n, line = 1;
        while (line <= 10) {
            n = 1;
            while (n <= line) {
                System.out.print(" " + n);
                n++;
            } // inner while
            line++;
            System.out.println();
        } // outer while
    }// main
}// class