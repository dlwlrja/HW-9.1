import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            result();


    }
    public static int print(){
        System.out.println("Введите число");
        return new Scanner(System.in).nextInt();
    }
    public static  void result() {
        System.out.println(print()%2 == 0);
        }
    }

