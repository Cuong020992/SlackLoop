import java.util.Scanner;

public class SlackLoop {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);


        int choice = 1;


        while (choice != 0) {
            System.out.println(" ");
            System.out.println("MENU");
            System.out.println("1. Kiểm tra số nguyên tố");
            System.out.println("2. Kiểm tra số chẵn lẻ");
            System.out.println("3. Kiểm tra số chính phương");
            System.out.println("4. Thoát chương trình");
            System.out.println("*****************");
            System.out.print("Sô cần kiểm tra: ");
            int number = sc.nextInt();
            System.out.print("Bạn lựa chọn chức năng: ");
            choice = sc.nextInt();
            System.out.println("*****************");


            switch (choice) {
                case 1:
                    boolean check = true;
                    for (int i = 2; i < number; i++) {
                        if (number % i == 0) {
                            check = false;
                            System.out.println("số: " + number + " không là số nguyên tố");
                            break;
                        }
                    }
                    if (check) {
                        System.out.println("số: " + number + " là số nguyên tố");
                    }
                    break;
                case 2:
                    if (number % 2 == 0) {
                        System.out.println("số: " + number + " là số chẵn");
                    } else {
                        System.out.println("số: " + number + " là số lẻ");
                    }
                    break;
                case 3:
                    boolean check1 = true;
                    for (int i = 1; i < number; i++) {
                        if (Math.pow(i, 2) == number) {
                            check1 = false;
                            System.out.println("số: " + number + " là số chính phương");
                            break;
                        }
                    }
                    if (check1) {
                        System.out.println("số: " + number + " không là số chính phương");
                    }
                    break;
                case 4:
                    System.exit(4);
                    break;
            }
        }
    }
}
