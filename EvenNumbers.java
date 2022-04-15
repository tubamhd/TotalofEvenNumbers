import java.util.Scanner;
public class EvenNumbers {
    public static void main(String[] args) {
        int no1;
        int total = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Please Enter Number; ");
            no1 = input.nextInt();

            if (no1 % 4 == 0){
                total += no1;
            }
        }while (no1 % 2 == 0);
        System.out.println("Total:  "+ total);
    }
}
