public class ChuNhat {
    private double dai;
    private double rong;
    public ChuNhat(){
        dai = 10;
        rong = 5;
    }
    public ChuNhat(double dai, double rong){
        this.dai = dai;
        this .rong = rong;
    }
    double getdai(){
        return dai;
    }
    double getrong(){
        return rong;
    }
    void setdai(double dai){
        this.dai = dai;
    }
    void setrong(double rong){
        this.rong = rong;
    }
    public String toString(){
        String s = "Dai: " + dai + "\n" + "Rong: " + rong;
        return s;
    }
}
