package leetcode.eee002deke_code.aaa002_20220209;


import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String[] start = x.nextLine().split(" ");
        for (String i : start) {
            switch (i) {
                case "1":
                    System.out.println("1");
                    show1();
                    break;
                case "2":
                    System.out.println("2");
                    break;
                case "3":
                    System.out.println("1");
                    break;
                case "4":
                    System.out.println("2");
                    break;
                case "5":
                    System.out.println("1");
                    break;
                default:
                    return;
            }
        }


    }

    public static void show1() {// A
        StringBuilder x = new StringBuilder();
        x.append("A");
    }

    public static void show2() {// Ctrl-C
    }

    public static void show3() {// Ctrl-X
    }

    public static void show4(StringBuilder x) {// Ctrl-V

    }

    public static StringBuilder show5(StringBuilder x) {// ��Ctrl-A
        if (x == null) {
            return null;
        } else {
            return x;
        }
    }

}
