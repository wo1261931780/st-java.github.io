package c2stage_20220403.ccc110exception_define_case;

import java.util.Scanner;

public class ccc023������ {
    public static void main(String[] args) {
        System.out.println("������");
        ccc022������ x = new ccc022������();
        Scanner x1 = new Scanner(System.in);
        System.out.println("�����������");
        int x2 = x1.nextInt();
        try {
            x.checkscore(x2);
        } catch (ccc021�����쳣 e) {
            e.printStackTrace();
        }
    }
}
