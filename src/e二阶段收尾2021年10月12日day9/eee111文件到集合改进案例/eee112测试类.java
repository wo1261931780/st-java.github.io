package e���׶���β2021��10��12��day9.eee111�ļ������ϸĽ�����;

import java.io.*;
import java.util.ArrayList;

public class eee112������ {
    public static void main(String[] args) throws IOException {
        BufferedReader x = new BufferedReader(new FileReader("l:\\java\\11.txt"));
        // ѧ�ţ�111	������aaa	���䣺11	��ַ��a1
        ArrayList<eee113������> x1 = new ArrayList<>();
        String i;
        while ((i = x.readLine()) != null) {
            String[] x3 = i.split("��");
            eee113������ x2 = new eee113������();
            x2.setNum(x3[0]);
            x2.setName(x3[1]);
            x2.setAge(x3[2]);
            // x2.setAge(Integer.parseInt(x3[2]));
            // ��������ֱ��ת��һ��
            x2.setAddress(x3[3]);
            x1.add(x2);
        }
        System.out.println(x1);
        System.out.println("------------------");
        for (eee113������ i2 : x1) {
            String x2 = "ѧ�ţ�" + i2.getNum() + "\t������" + i2.getName() + "\t���䣺" + i2.getAge() + "\t��ַ��" + i2.getAddress();
            System.out.println(x2);
        }
    }
}
