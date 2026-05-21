import java.util.Scanner;

public class jaba {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] patients = new String[10];
        String[] slots = new String[10];

        int count = 0;

        while (true) {

            System.out.println("\n1.Book");
            System.out.println("2.Show");
            System.out.println("3.Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Patient Name: ");
                patients[count] = sc.nextLine();

                System.out.print("Time Slot: ");
                slots[count] = sc.nextLine();

                count++;

                System.out.println("Appointment Booked");

            } else if (choice == 2) {

                for (int i = 0; i < count; i++) {
                    System.out.println(patients[i] + " - " + slots[i]);
                }

            } else {
                break;
            }
        }
    }
}
