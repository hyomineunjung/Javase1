import java.util.Scanner;
public class SuanFaTi1 {

    public static void main(String[] args){
        Scanner sr= new Scanner(System.in);
        int num=sr.nextInt();
        int count=1;

        for (int i=1;num>=10;i++){
            num=num/10;
            count++;
        }System.out.println(count);
    }
}
