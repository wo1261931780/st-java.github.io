package c���׶�ǿ���γ�2022��1��11��.ccc021è�͹������స��;

import java.util.Scanner;

public class ccc025demo {
    public static void main(String[] args) {
        System.out.println("������è�����ƣ�");
        Scanner x = new Scanner(System.in);
        String namecat = x.nextLine();
        System.out.println("������è�����䣺");
        Scanner xx = new Scanner(System.in);
        int agecat = xx.nextInt();
        ccc022animal catx = new ccc023Cat();
        System.out.println("��ʼд��...");
        catx.setName(namecat);
        catx.setAge(agecat);
//        ccc022animal xa=new ccc023Cat(agecat,namecat);
        System.out.println(catx.getName() + "�Ѿ�" + catx.getAge() + "����");
        catx.eat();
    }
}
