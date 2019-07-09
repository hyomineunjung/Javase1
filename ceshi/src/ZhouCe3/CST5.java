package ZhouCe3;

public class CST5 {
    static int score1=86;
    static int score2=92;
    public int sum(){
        int a=score1+score2;
        return a;
    }

    public static void main(String[] args) {
        CST5 a=new CST5();
        int allScore=a.sum();
        System.out.println("总分："+allScore);
    }
}
