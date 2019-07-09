package ZhouCe3;

public class yonghu {
    private String yonghuming;
    private String mima;
    private int huiyuanhao;
    private int jifen;

    public int getJifen() {
        return jifen;
    }

    public void setJifen(int jifen) {
        this.jifen = jifen;
    }

    public String getYonghuming() {
        return yonghuming;
    }


    public void setYonghuming(String yonghuming) {
        this.yonghuming = yonghuming;
    }

    public String getMima() {
        return mima;
    }

    public void setMima(String mima) {
        this.mima = mima;
    }

    public int getHuiyuanhao() {
        return huiyuanhao;
    }

    public void setHuiyuanhao(int huiyuanhao) {
        this.huiyuanhao = huiyuanhao;
    }
    yonghu(){};
    public yonghu(String name,String password,int vip,int jifen){
        this.yonghuming=name;
        this.mima=password;
        this.huiyuanhao=vip;
        this.jifen=jifen;
    }
}
