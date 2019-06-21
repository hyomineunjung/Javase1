package dayJun21th;
import java.util.Scanner;
public class BQDM1Jun21th {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        String today=sr.next();
        switch (today){
            case "一":System.out.println("吃包子");
            break;
            case "二":System.out.println("吃油条");
                break;
            case "三":System.out.println("吃包子");
                break;
            case "四":System.out.println("吃油条");
                break;
            case "五":System.out.println("吃包子");
                break;
            case "六":System.out.println("吃油条");
                break;
            case "日":System.out.println("吃主席套餐");
                break;
                default:System.out.println("输入错误");
        }

    }
}
