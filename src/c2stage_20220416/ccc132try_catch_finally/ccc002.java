package c2stage_20220416.ccc132try_catch_finally;

import java.io.*;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220416.ccc132try_catch_finally
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-12-54  ������
 */
public class ccc002 {
    public static void main(String[] args) throws IOException {
        File x = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220416\\ccc132try_catch_finally\\ccc002.java");
        File xx = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220416\\ccc132try_catch_finally\\ccc002.txt");
        InputStream x1 = null;
        OutputStream x2 = null;
        int len = 0;
        byte[] demo = new byte[1024];
        try {
            x1 = new FileInputStream(x);
            len = x1.read(demo);
            // x2 = new FileOutputStream(xx, true);
            x2 = new FileOutputStream(xx);
            x2.write(demo, 0, len);
            return;//����ķ�����䣬��ʹִ�У����·�����ͣ��Ҳ����Ӱ��finally�����
            // ͬ��finally�������return�����ջ�ִ��finally�еĴ���
            // �������߼�Ӧ���ǣ�return1=11��return2=22��
            // ����ֻ�᷵��return2�Ľ��������return1�ķ��ؽ����ʧ
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("����-----------------------------");
            // �����������׳��쳣��finally�е�����Ҳ��ִ�г���
            // Ҫ��finally��ִ�У�ֻ��jvm��;�˳���
            try {
                if (x1 != null && x2 != null) {
                    x1.close();//���������Ѿ��رչ����ٴιرճ����쳣����
                    x2.close();
                }
                // ������Դû�б�����
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("����");

        }
    }
}
