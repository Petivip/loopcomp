import java.util.Scanner;

public class Main {

    public void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num, total = 0, i=0;
        // Loop should start here
        while(i < 10){
            i++;
            System.out.println("Enter 10 integers here: ");
            num = keyboard.nextInt();
            total += num;
        }
        // Loop should end here

        System.out.println("The total of all 10 numbers is " + total);

    }

}
