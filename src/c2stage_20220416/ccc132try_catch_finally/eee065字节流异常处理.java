package c2stage_20220416.ccc132try_catch_finally;

import java.io.FileOutputStream;
import java.io.IOException;

public class eee065�ֽ����쳣���� {
    public static void main(String[] args) {
        FileOutputStream x = null;
        try {
            x = new FileOutputStream("l:\\java\\ee.txt");
            x.write(97);
            // 1.���ȶ��쳣����try...catch����
            // x.close();
            // ����write�����쳣�Ժ󣬲������ִ�������close����
            // ���ǵ����е���Դ���뱻�رգ��������һ��finally��䣬��֤����ִ��
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (x != null) {
                try {
                    x.close();
                    // 2.����ִ��close������쳣�����׳�
                    // 3.���ǵ�x�Ķ������⣬���ȶ�x���г�ʼ������
                    // �ڿ�ͷ����FileOutputStream x = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                // �������ﻹ��һ�����⣬���������·���쳣��
                // ֱ�ӵ���xΪnull��
                // ��������finally�е�x.closeΪ��ָ��
                // --
                // java��û��ָ��ģ�����˵��"javaָ��"ָ�ľ���java������
                // ��ָ����ǿ����ã�
                // java��ָ���쳣�������ñ���Ϊ�գ�ȴ�����˷��������ʱ��ͻ���ֿ�ָ���쳣��
                // --
                // ˵�˻����ǣ�
                // �ҵ�x��null��null���޷�����д������ģ����Ա���
                // ͬʱ��nullҲ�޷�ִ��close������
                // ����ǿ�ָ���쳣
            }
        }
    }
}
