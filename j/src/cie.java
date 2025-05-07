import java.util.Scanner;

public class cie {
    public static void main(String[] args) {
        int i, min, max, sum = 0, average;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements:");
        for (i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int choice;
        do {
            System.out.println("Select the option:");
            System.out.println("1 - Sum of array");
            System.out.println("2 - Average of array");
            System.out.println("3 - Maximum of array");
            System.out.println("4 - Minimum of array");
            System.out.println("5 - Exit");
            System.out.println("6 - Calculated");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    sum = 0;
                    for (i = 0; i < size; i++) {
                        sum += numbers[i];
                    }
                    System.out.println("Sum of array: " + sum);
                    break;

                case 2:
                    sum = 0;
                    for (i = 0; i < size; i++) {
                        sum += numbers[i];
                    }
                    average = sum / size;
                    System.out.println("Average of array: " + average);
                    break;

                case 3:
                    max = numbers[0];
                    for (i = 1; i < size; i++) {
                        if (numbers[i] > max) {
                            max = numbers[i];
                        }
                    }
                    System.out.println("Maximum of array: " + max);
                    break;

                case 4:
                    min = numbers[0];
                    for (i = 1; i < size; i++) {
                        if (numbers[i] < min) {
                            min = numbers[i];
                        }
                    }
                    System.out.println("Minimum of array: " + min);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}