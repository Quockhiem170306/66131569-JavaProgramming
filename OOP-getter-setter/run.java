public class run {
    public static void main(String[] args) {
        ChuNhat cn1 = new ChuNhat();
        double cn1_dai = cn1.getdai();
        double cn1_rong = cn1.getrong();
        cn1.setdai(50);
        cn1.setrong(25);
        System.out.println(cn1.toString());
    }
}
