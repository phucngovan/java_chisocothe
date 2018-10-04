import java.util.Scanner;

public class body {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width,height,bmi;
        System.out.println("nhập cân nặng của bạn(Kg)");
        width=Double.parseDouble(sc.nextLine());
        System.out.println("nhập chiều cao của bạn(met)");
        height=Double.parseDouble(sc.nextLine());
        bmi=width/Math.pow(height,2);
        System.out.println("bmi:" + bmi);
    }
}
