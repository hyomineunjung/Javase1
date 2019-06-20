package diertian;
import java.util.Scanner;
public class BQNR5Jun20th {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int x=sr.nextInt();
        if(x>60){
            System.out.println("老年");
        }else if (x>40){
            System.out.println("中年");
        }else if(x>18){
            System.out.println("少年");
        }else System.out.println("童年");
    }
}
