import java.util.Scanner;

public class homework {
    private static Object Scanner;

    public static void main(String[] args){
        java.util.Scanner scanner = new Scanner(System.in);

        int number = (int)(Math.random()*10);
        int a = 0;
        while(a<3){
            System.out.println("Угадайте число от 0 до 9");

            int input_number = scanner.nextInt();
            if(input_number==number){
                System.out.println("Вы угадали");
                break;
            } else if (input_number>number){
                System.out.println("Загаданное число меньше");
                a++;
            } else if(input_number<number) {
                System.out.println("Загаданное число больше");
                a++;
            }


        }
        System.out.println("Попытки кончились:(");
    }

}
