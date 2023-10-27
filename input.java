import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();// float, boolean 
        System.out.println(age);

        String name = sc.next(); // only enter single name
        String name2 = sc.nextLine(); // total line come
        System.out.println(name);
    }
}
