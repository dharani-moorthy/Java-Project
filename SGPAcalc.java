import java.util.Scanner;
public class SGPAcalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of subject:");
        int n = scan.nextInt();
        double Total = 0;
        int credit = 0;
        System.out.println("Enter the grade and credit for each sub :");
        for (int i = 0; i < n; i++) {
            String sub = scan.next();
            int c = scan.nextInt();
            int grade = 0;
            if (sub.equals("O")) {
                grade = 10;
            } else if (sub.equals("A+")) {
                grade = 9;
            } else if (sub.equals("A")) {
                grade = 8;
            } else if (sub.equals("B+")) {
                grade = 7;
            } else if (sub.equals("B")) {
                grade = 6;
            } else if (sub.equals("C+")) {
                grade = 5;
            } else if (sub.equals("C")) {
                grade = 4;
            } else {
                System.out.println("Invalid");
                continue;
            }
            Total += grade * c;
            credit += c;
        }
        if (Total == 0) {
            System.out.println("Invalid");
        } else {
            double Sgpa = Total / credit;
            System.out.printf("Your SGPA is:%.2f\n", Sgpa);
        }

    }
}


