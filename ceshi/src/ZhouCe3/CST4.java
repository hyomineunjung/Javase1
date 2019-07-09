package ZhouCe3;

public class CST4 {
    public static void main(String[] args) {
        CST4 hello=new CST4();
        hello.print();
        hello.print("你好");
        hello.print(11);
    }
    public void print(){
        System.out.println("无参的print方法");
    }
    public void print(String name){
        System.out.println("带有一个字符串参数的print方法，参数值为："+name);
    }
    public void print(int age){
        System.out.println("带有一个整型参数的print方法，参数值为："+age);
    }
}
