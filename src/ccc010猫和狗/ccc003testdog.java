package ccc010è�͹�;

import java.util.Scanner;

public class ccc003testdog extends ccc001testanimal {
    public ccc003testdog() {
        Scanner d1 = new Scanner(System.in);
        Scanner d2 = new Scanner(System.in);
        System.out.println("���������䣺");
        int dage = d1.nextInt();
        System.out.println("������������");
        String dname = d2.nextLine();
        ccc001testanimal x2 = new ccc001testanimal(dage, dname);
        // ccc001testanimal x2 = new ccc001testanimal();
        // x2.setName(dname);
        // x2.setAge(dage);
    }

    public ccc003testdog(int age, String name) {
    }

    @Override
    public void eatsm() {
        System.out.println("���ǹ����⣬��дeat����");
    }
}
