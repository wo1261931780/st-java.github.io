package abc����ѧϰ2021��10��2��.bbb032������ϰ;

import java.util.ArrayList;
import java.util.Scanner;

public class bbb002ӰƬ��Ϣ���� {
    public static void main(String[] args) {
        ArrayList<bbb002��Ӱ��> x = new ArrayList<>();
        x.add(show());
        x.add(show());
        x.add(show());
        x.add(new bbb002��Ӱ��("����", 10, 9));//Ҳ��������ֱ���½�һ������

        for (int i = 0; i < x.size(); i++) {
            System.out.println("���ƣ�" + x.get(i).getName() + "���۸�" + x.get(i).getPrice() + "��������" + x.get(i).getScore());
        }

    }

    public static bbb002��Ӱ�� show() {
        bbb002��Ӱ�� x = new bbb002��Ӱ��();
        Scanner x1 = new Scanner(System.in);
        Scanner x2 = new Scanner(System.in);
        x.setName(x1.nextLine());
        x.setScore(x2.nextInt());
        x.setPrice(x2.nextInt());
        return x;
    }
}
