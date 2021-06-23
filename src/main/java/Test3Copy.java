import java.util.Scanner;

public class Test3Copy {
    public static void main(String[] args) {

//            int sum = 0;
//            int znak = 1;
//
//            for(int i = 1; i <= 6; i++){
//                sum += znak*i;
//                znak *= -1;
//
        //just for test
//
//            }

// питаю аж до поки не скаже правильно.
        System.out.println("Сколько будет 5*4");

        Scanner scanner = new Scanner(System.in);
        int answer = 0;

        do {
            answer = scanner.nextInt();
            if (answer == 20) {
                System.out.println("Good. Right!");
                break;
            }
            System.out.println("Wrong.Try again!");

        } while (true);


    }
}
