package ZhouCe3;

import java.util.Scanner;
public class dafuweng {

    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        yonghu []a=new yonghu[20];
        System.out.println("欢迎来到大富翁！！！");
        System.out.println("您是否拥有大富翁账号？");
        System.out.println("1.有   2.没有");
        int qd1=sr.nextInt();
        zc:if (qd1==2){
             zcdl:for (int i=0;i<a.length;i++){
                    a[i]=new yonghu("空","空",1,0);
                    System.out.println("请输入您要注册的用户名");
                    a[i].setYonghuming(sr.next());
                    System.out.println("请输入您要注册密码");
                    a[i].setMima(sr.next());
                    System.out.println("这是您的会员号："+i);
                    a[i].setHuiyuanhao(i);
                System.out.println("您是否还要继续注册");
                System.out.println("1.是     2.不是");
                int qd2=sr.nextInt();
                if (qd2==2){
                    break zc;
                }
            }
        }
        csjm:for (int i=0;i<=10000;i++){
            int jg=dafuweng.cs();
            xzjm:switch (jg){
                case 1:{
                    System.out.println("欢迎来到登录界面");
                    System.out.println("请输入您的用户名");
                    String yhm=sr.next();
                    for (int szi1=0;szi1<a.length;szi1++){
                        if (yhm.equals(a[szi1].getYonghuming())){
                            System.out.println("请输入您的密码");
                            String mm1=sr.next();
                            if (mm1.equals(a[szi1].getMima())){
                                System.out.println("登陆成功");
                                break xzjm;
                            }
                        }
                    }
                }
                case 2:{
                    //个人信息
                    System.out.println("请输入您的会员号");
                    int hyh=sr.nextInt();
                    for (int szi2=0;szi2<a.length;szi2++){
                        if (hyh==a[szi2].getHuiyuanhao()){
                            System.out.println("您的用户名为："+a[szi2].getYonghuming());
                            System.out.println("您的密码为："+a[szi2].getMima());
                            System.out.println("您的积分为："+a[szi2].getJifen());
                            break xzjm;
                        }
                    }
                }
                case 3:{
                    //修改密码
                    System.out.println("您进入的是修改密码界面");
                    System.out.println("请输入您的用户名");
                    String yhm2=sr.next();
                    for (int szi3=0;szi3<a.length;szi3++){
                        if (yhm2.equals(a[szi3].getYonghuming())){
                            System.out.println("您当前的密码为："+a[szi3].getMima());
                            System.out.println("请您输入您要修改的密码");
                            a[szi3].setMima(sr.next());
                            break xzjm;
                        }
                    }
                }
                case 4:{
                    int sz1=(int) (Math.random() * 6 + 1);
                    System.out.println("您当前回合投出的点数为："+sz1);
                    System.out.println("请输入您的用户名");
                    String yhm3=sr.next();
                    for (int szi4=0;szi4<a.length;szi4++){
                        if (a[szi4]!=null){
                            if (yhm3.equals(a[szi4].getYonghuming())){
                                a[szi4].setJifen(a[szi4].getJifen()+sz1);
                                System.out.println("您当前的积分为:"+a[szi4].getJifen());
                            }
                        }


                    }
                    break xzjm;
                }
                case 5:{
                    int cjsz1=(int) (Math.random() * 6 + 1);
                    System.out.println("请输入您的用户名");
                    String yhm4=sr.next();
                    for (int szi5=0;szi5<a.length;szi5++) {
                        if (a[szi5] != null) {
                        if (yhm4.equals(a[szi5].getYonghuming())) {
                            switch (cjsz1) {
                                case 1: {
                                    System.out.println("前进2步");
                                    a[szi5].setJifen(a[szi5].getJifen() + 2);
                                    System.out.println("您当前积分为：" + a[szi5].getJifen());
                                    break;
                                }
                                case 2: {
                                    System.out.println("后退2步");
                                    a[szi5].setJifen(a[szi5].getJifen() - 2);
                                    System.out.println("您当前积分为：" + a[szi5].getJifen());
                                    break;
                                }
                                case 3: {
                                    System.out.println("前进3步");
                                    a[szi5].setJifen(a[szi5].getJifen() + 3);
                                    System.out.println("您当前积分为：" + a[szi5].getJifen());
                                    break;
                                }
                                case 4: {
                                    System.out.println("后退3步");
                                    a[szi5].setJifen(a[szi5].getJifen() - 3);
                                    System.out.println("您当前积分为：" + a[szi5].getJifen());
                                    break;
                                }
                                case 5: {
                                    System.out.println("前进6步");
                                    a[szi5].setJifen(a[szi5].getJifen() + 6);
                                    System.out.println("您当前积分为：" + a[szi5].getJifen());
                                    break;
                                }
                                case 6: {
                                    System.out.println("后退6步");
                                    a[szi5].setJifen(a[szi5].getJifen() - 6);
                                    System.out.println("您当前积分为：" + a[szi5].getJifen());
                                    break;
                                }
                            }
                        }
                    }
                    }break xzjm;

                }
                case 6:{
                    System.out.println("您确定要删除账号吗？");
                    System.out.println("1.确定     2.不确定");
                    int qqq=sr.nextInt();
                    if(qqq==1){
                        System.out.println("请输入您的用户名");
                        String qqq1=sr.next();
                        for (int szi5=0;szi5<a.length;szi5++){
                            if (qqq1.equals(a[szi5].getYonghuming())){
                                a[szi5].setJifen(0);
                                a[szi5].setMima("空");
                                a[szi5].setHuiyuanhao(0);
                                a[szi5].setYonghuming("空");
                                System.out.println("您的账号已删除");
                            }
                        }
                    }else break xzjm;
                }
            }
            }

    }

    //初始界面

    public  static int cs(){
        Scanner sr=new Scanner(System.in);
        System.out.println("请您选择你要执行的选项");
        System.out.println("1.登录");
        System.out.println("2.个人信息");
        System.out.println("3.修改密码");
        System.out.println("4.掷骰子");
        System.out.println("5.抽奖");
        System.out.println("6.删除账号");
        int x=sr.nextInt();
        return x;

    }
    Scanner sr=new Scanner(System.in);
}
