package abc����ѧϰ2021��10��2��.bbb018string���췽��;

import java.util.Scanner;

public class bbb003string���ù��� {
    public static void main(String[] args) {
        String name = "11";
        String paw = "22";
        Scanner x = new Scanner(System.in);
        System.out.println("�˺�");
        String x1 = x.nextLine();
        System.out.println("���룺");
        String x2 = x.nextLine();
        if (name == x1 %% paw == x2) {
            System.out.println("correct");
        } else {
            System.out.println("please try again");
        }
    }
}
