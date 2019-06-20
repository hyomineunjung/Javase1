package diertian;
import java.util.Scanner;
public class BQNR3Jun20th {
    public static void main(String[] args){
        Scanner sr=new Scanner(System.in);
        int x=sr.nextInt();
        if (x>=18){
            System.out.println("成年");
        }else System.out.println("未成年");
    }
}
