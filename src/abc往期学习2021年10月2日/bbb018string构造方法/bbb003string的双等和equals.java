package abc����ѧϰ2021��10��2��.bbb018string���췽��;

import java.util.Scanner;

public class bbb003string��˫�Ⱥ�equals {
    public static void main(String[] args) {
        String name = "11A";
        String paw = "22A";
        Scanner x = new Scanner(System.in);
        System.out.println("�˺�");
        String x1 = x.nextLine();
        System.out.println("���룺");
        String x2 = x.nextLine();
        // if (name == x1 && paw == x2) {//˫�ȺűȽϵ��ǵ�ַ������Ƚ����ݱ�����equals����
        // equals������Ϊobject����ʾ��������������
        // ��������ִ�Сд
        if (name.equals(x1) && paw.equals(x2)) {
            System.out.println("correct");
        } else {
            System.out.println("please try again");
        }
        if (name.equalsIgnoreCase(x1) && paw.equalsIgnoreCase(x2)) {
            System.out.println("�����ִ�Сд��������ȷ");
        }
        // ��������������˫�ȣ���������������equals
    }
}
