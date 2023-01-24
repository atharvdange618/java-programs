import java.io.*;

// this is an alternate method to read and write files or to handle files

class filernw {
    public static void main(String[] args) {

        try {

            writetofile("quote.txt",
                    "The universe maybe bigger than the mankind and still somehow it fits right within your hands", 0);
            System.out.println(new String(readfromfile("quote.txt", 0, 70)));
        } catch (IOException e) {
            System.out.println("An unexpected error occured");
        }
    }

    static void writetofile(String path, String data, int posi) throws IOException {
        RandomAccessFile f1 = new RandomAccessFile(path, "rw");
        f1.seek(posi);
        f1.write(data.getBytes());
        f1.close();
    }

    static byte[] readfromfile(String path, int posi, int size) throws IOException {
        RandomAccessFile f1 = new RandomAccessFile(path, "rw");
        f1.seek(posi);
        byte[] b = new byte[size];
        f1.read(b);
        f1.close();
        return b;
    }
}