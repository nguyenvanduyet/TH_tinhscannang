import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập chiều cao:");
        double height=sc.nextDouble();
        System.out.println("nhập cân nặng:");
        double weight=sc.nextDouble();
        double bmi = weight/(height*height);
        if (bmi<18.5){
            System.out.println("UnderWeight");
        }else if (bmi>=18.5&& bmi<25){
            System.out.println("Normal");
        }else if (bmi>=25 && bmi<30){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }

    }
}
