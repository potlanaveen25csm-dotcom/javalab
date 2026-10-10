import java.io.*;

public class FileDemo {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(
                new FileWriter("sample.txt"));

        bw.write("Hello Naveen");
        bw.newLine();
        bw.write("Welcome to Java");
        bw.close();

        BufferedReader br = new BufferedReader(
                new FileReader("sample.txt"));

        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}