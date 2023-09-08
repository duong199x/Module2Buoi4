public class Rectangle {
    public int chieuDai;
    public int chieuRong;

    public Rectangle(int ChieuDai, int ChieuRong) {
        this.chieuDai = ChieuDai;
        this.chieuRong = ChieuRong;
    }

    public int chuVi() {
        int chuvi = (this.chieuDai + this.chieuRong) * 2;
        return chuvi;
    }

    public int dienTich() {
        int dienTich = (this.chieuDai * this.chieuRong);
        return dienTich;
    }
}

class Main1 {
    public static void main(String[] args) {
        Rectangle hcn = new Rectangle(30,15);
        hcn.chieuDai = 45;
        hcn.chieuRong=20;
        System.out.println(hcn.chuVi());
        System.out.println(hcn.dienTich());
    }
}
