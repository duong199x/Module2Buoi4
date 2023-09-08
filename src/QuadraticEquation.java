import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double A, double B, double C) {
        this.a = A;
        this.b = B;
        this.c = C;
    }

    public double GetterA() {
        return this.a;
    }

    public double GetterB() {
        return this.b;
    }

    public double GetterC() {
        return this.c;
    }

    public double getDiscriminant() {
        double delta = b * b - 4 * a * c;
        return delta;
    }

    public double twoEqual() {
        double result = -b / (2 * a);
        return result;
    }

    public double getRoot1() {
        double result1 = (-b + Math.pow(this.getDiscriminant(), 0.5)) / (2 * a);
        return result1;
    }

    public double getRoot2() {
        double result1 = (-b - Math.pow(this.getDiscriminant(), 0.5)) / (2 * a);
        return result1;
    }

}

class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap gia tri 1");
        double gt1 = input.nextDouble();
        System.out.println("nhap gia tri 2");
        double gt2 = input.nextDouble();
        System.out.println("nhap gia tri 3");
        double gt3 = input.nextDouble();
        QuadraticEquation ptb2 = new QuadraticEquation(gt1, gt2, gt3);
        if (ptb2.getDiscriminant() < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (ptb2.getDiscriminant() == 0) {
            System.out.println("Phuong trinh co nghiem kep =" + ptb2.twoEqual());
        } else {
            System.out.println("phuong trinh cos 2 nghiem/" + "Nghiem1:" + ptb2.getRoot1() + "Nghiem2:" + ptb2.getRoot2());
        }
    }
}
