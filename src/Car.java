public class Car {
    public int khoiLuong;
    public String mau;
    public int soBanh;

    public Car(int khoiLuong, String mau, int soBanh) {
        this.khoiLuong = khoiLuong;
        this.mau = mau;
        this.soBanh = soBanh;
    }

    public String run() {
        return " xe mau:" + this.mau + ",co khoi luong:" + this.khoiLuong + ",so banh:" + this.soBanh;
    }

}

class Main {
    public static void main(String[] args) {
        Car newcar = new Car(24, "xanh", 7);
        Car newcar2 = new Car(44, "do", 65);
        System.out.println(newcar2.run());
    }
}