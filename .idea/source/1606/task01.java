import java.util.Scanner;

public class task1 {
    //printGreeting(String name) adli void method yazin. Bu method parametr kimi ad qebul etsin ve
    //ekrana "Salam, [ad]! Xos gelmisiniz!" cap etsin. main-den bu methodu en az 3 fərqli ad ile
    //cagirin.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String name1 = scanner.nextLine();
        printGreeting(name1);

        System.out.print("Enter second name: ");
        String name2 = scanner.nextLine();
        printGreeting(name2);

        System.out.print("Enter third name: ");
        String name3 = scanner.nextLine();
        printGreeting(name3);

    }

    public static void printGreeting(String name) {
        System.out.println("Salam, " + name + "Xos gelmisiniz");
    }
}
