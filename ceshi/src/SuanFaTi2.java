import java.util.Scanner;

//import java.util.Scanner;
public class SuanFaTi2 {
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
        int score =sc.nextInt();
        int count=0;
        System.out.println(score);
        if (score<60){
            for(int i=0;score<60;i++){
                score=score+1;
                count++;
            }System.out.println(score);
            System.out.println(count);
        }else System.out.println(score+"0");
    }
}
