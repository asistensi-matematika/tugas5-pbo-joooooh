import java.io.*;

public class printer {

    public static void main(String[] args) {
        header("judul.txt");
    }
    public static void header(String nama_file_txt){
        File file = new File(nama_file_txt);
        String encoding = "utf-8";
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(file), encoding)) {
            int data = isr.read();
            while (data != -1) {
                System.out.print((char) data);
                data = isr.read();
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
