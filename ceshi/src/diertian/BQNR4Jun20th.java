package diertian;
import java.util.Scanner;
public class BQNR4Jun20th {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int score=sr.nextInt();
        String sex=sr.next();
        if (score>80){
            if(sex.equals("女")){
                System.out.println("进入女子组决赛");
            }else System.out.println("进入男子组决赛");
        }else System.out.println("未进入决赛");
    }
}
