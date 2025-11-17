import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        int A = Integer.parseInt(br.readLine());
        
        switch(A / 10){
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8: 
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6: 
                System.out.println("D");
                break;
            default: 
                System.out.println("F");
                break;
        }

    }
}