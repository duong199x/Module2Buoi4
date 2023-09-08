import java.util.Arrays;

public class Student {
    public String name;
    public int age;
    public int[] diem;

    public Student(String Name, int Age, int[] Diem) {
        this.name = Name;
        this.age = Age;
        this.diem = Diem;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", diem=" + Arrays.toString(diem) +
                '}';
    }

    public int trungBinh() {
        int sum = 0;
        for (int i = 0; i < this.diem.length; i++) {
            sum += this.diem[i];
        }
        return sum / this.diem.length;
    }
}

class Main2 {
    public static void main(String[] args) {
        Student student1 = new Student("duong", 18, new int[]{3, 5, 7});
        Student student2 = new Student("son", 21, new int[]{7, 8, 9});
        if (student2.trungBinh() > student1.trungBinh()) {
            System.out.println(student2);
        } else {
            System.out.println(student1);
        }
    }
}
