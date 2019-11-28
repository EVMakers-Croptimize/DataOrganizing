import java.util.*;

public class evmakers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.print("Enter Type: ");

            String type = input.nextLine();

            if (type.equals("temp")) {
                System.out.print("Enter ranges: ");

                int num1 = input.nextInt();
                int num2 = input.nextInt();

                int difference = num2 - num1;

                System.out.print(num1 + " ");
                for (int i = 0; i < difference; i++) {
                    num1 += 1;
                    System.out.print(num1 + " ");
                }
            } else if (type.equals("avg")) {
                System.out.print("Enter ranges: ");

                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (num2 == 0) {
                    num2 = 12;

                    int difference = num2 - num1;

                    System.out.print(num1 + ",");
                    for (int i = 0; i < difference - 1; i++) {
                        num1 += 1;
                        System.out.print(num1 + ",");
                    }
//
                    System.out.println(num2);
                } else {
                    System.out.print(num1 + ",");

                    int difference = num2 - num1;

                    for (int i = 0; i < difference - 1; i++) {
                        num1 += 1;
                        System.out.print(num1 + ",");
                    }
                    System.out.println(num2);

                }
            } else if (type.equals("ph")) {
                System.out.print("Enter ranges: ");

                double num1 = input.nextDouble();
                double num2 = input.nextDouble();

                double difference = num2 - num1;

                System.out.print(num1 + ", ");
                int i = 0;
                while (i < difference * 10 - 1) {
                    num1 += 0.1;
                    System.out.printf("%.1f, ", num1);
                    i++;

                    if (num1 == num2) {
                        return;
                    }
                }
                System.out.println(num2);

            }
        }
    }
}
