package c2stage_20220418.ccc140series;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220418.ccc140demo
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-21-31  ����һ
 */
public class ccc002rundemo {
    public static void main(String[] args) throws IOException {
        System.out.println("---------------------");
        ccc001object x = new ccc001object("a1", 11, "22");
        // �����½�һ������
        FileOutputStream demo = new FileOutputStream("src/c2stage_20220418/ccc140series/ccc002rundemo.txt");
        // Ȼ���½�һ�������
        ObjectOutputStream x1 = new ObjectOutputStream(demo);
        // �������л���ǰ�ᣬ�������л����������
        x1.writeObject(x);
        x1.close();
        // ���л��Ĵ洢��ֱ�Ӵ�û�����壬��Ϊ�������Ϊ�˵��ö�����
        // ���ǲ�����������

    }
}
