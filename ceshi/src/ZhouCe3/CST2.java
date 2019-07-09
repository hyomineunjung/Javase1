package ZhouCe3;
public class CST2 {
    public static void main(String[] args) {
        CST2 hello=new CST2();
        double qq=hello.calcavg();
        System.out.println("平均成绩为："+qq);

    }
    public double calcavg(){
        double java=92.5;
        double php=83.0;
        double avg=(java+php/2);
        return avg;
    }
}
