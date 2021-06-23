import java.sql.SQLOutput;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.println("3*" + i + "=" + 3 * i);
        }

        System.out.println();

//        System.out.println("Введите любое положительное число");
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int sum = 0;
//        for (int i=1;i<=n;i++){
//            sum = sum+i;
//            System.out.println(sum);
//        }


//        int a = 7;
//        while (a <=98){
//            System.out.println(a+ " ");
//            a+=7;
//        }


//        for(int i =1;i<=100;i++) {
//            if((i % 5==0) && (i % 7==0)){
//                System.out.println("fuubaz");
//            } else if(i % 5==0){
//                System.out.println("fuu");
//            } else if (i % 7==0){
//                System.out.println("baz");
//            } else {
//                System.out.println(i);
//            }
//        }

        for (int i = 1; i < 10; i++) {
            if (i > 6) break;
            System.out.println(i);
        }

        System.out.println();

        int h = 1;
        while (h <= 512) {
            System.out.println(h + " ");
            h *= 3;
        }

        // сумирование чисел. И запись итоговой суммы в переменную sum
        int i = 1;
        int sum = 0;

        while (i < 10) {
            sum += i;
            i++;
        }
        System.out.print("Sum equals " + sum);


//перемножити саме на себе от 4. 4*8*12*16*20
        int prod = 1;

        for(int u = 4; u <= 20; u+=4){
            prod *= u;
        }

    }
}
