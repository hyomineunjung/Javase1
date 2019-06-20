package diertian;
import java.util.Scanner;
public class BQNR1Jun20th {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int score=sr.nextInt();
        if (score>60){
            System.out.println("考试成绩如何:及格");
        }else System.out.println("考试成绩如何:不及格");
    }
}
