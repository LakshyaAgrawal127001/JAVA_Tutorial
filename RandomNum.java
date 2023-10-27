import java.util.Scanner;

public class RandomNum {
    public static void main(String[] args) {
        int mynum = (int) (Math.random() * 100);
        Scanner rn = new Scanner(System.in);
        int userNumber = 0;

        do{
            System.out.println("Guess the number : ");
            userNumber = rn.nextInt();

            if(userNumber == mynum) System.out.println("whoo");
           

            else if(userNumber > mynum) System.out.println("The number is large");

            else System.out.println("Your number is too small");

        }while(userNumber >= 0);

        System.out.println("My number was : " );
        System.out.println(mynum);

    }
}
