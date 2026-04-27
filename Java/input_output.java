import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class input_output {
    public void printNumber() throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the limit of the number :");
        int num = Integer.parseInt(scan.readLine());
        if (num>0) {
            for (int i = 0; i < num; i++) {
                System.out.print(" " + i);
            }
        }else {
            for (int i = num; i <= 0; i++) System.out.print(" " + i);
        }
    }
    public static void main(String[] args) throws IOException{
        input_output io = new input_output();
        io.printNumber();
    }
}
