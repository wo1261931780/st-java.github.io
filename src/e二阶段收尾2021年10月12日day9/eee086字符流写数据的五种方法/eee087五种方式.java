package e���׶���β2021��10��12��day9.eee086�ַ���д���ݵ����ַ���;
/*
    ���췽����
        OutputStreamWriter?(OutputStream out)������һ��ʹ��Ĭ���ַ������OutputStreamWriter

    д���ݵ�5�ַ�ʽ��
        void write?(int c)��дһ���ַ�
        void write?(char[] cbuf)��д��һ���ַ�����
        void write?(char[] cbuf, int off, int len)��д���ַ������һ����
        void write?(String str)��дһ���ַ���
        void write?(String str, int off, int len)��дһ���ַ�����һ����
 */

import java.io.*;


public class eee087���ַ�ʽ {
    public static void main(String[] args) throws IOException {
        File x = new File("l:\\java\\dd.txt");
        // one(x);
        // onesz(x);
        // onest(x);
        onebytept(x);
    }

    public static void one(File x) throws IOException {
        OutputStreamWriter x1 = new OutputStreamWriter(new FileOutputStream(x));
        x1.write(97);
        // �����е�����£��ļ����ַ��д��ڻ�����
        // Ҫ���ļ���չʾ���ݣ�
        // ����Ҫ����flush����ϴ������
        x1.flush();
        x1.write(98);
        // ˢ��ֻ���������ݺ�ִ��
        x1.close();
        // close�������Դ�ˢ�¹���
        System.out.println("����");
    }

    public static void onesz(File x) throws IOException {
        // byte[] x1 = {97, 98, 99, 100};
        char[] x1 = {'a', 'b', 'c', 'd', 'e'};
        OutputStreamWriter x2 = new OutputStreamWriter(new FileOutputStream(x));
        // x2.write(x1, 0, x1.length);
        // ����ֱ��ʹ��byte���ͻᱨ��
        x2.write(x1, 1, 3);
        // �����ǣ���1����λ�ÿ�ʼ������3��
        // ���ս��Ϊ��bcd
        // ���ԭ���ı���
        // �ı���������������������Խ�磬�������ﲻ��ʹ��x1.length����Ϊ���ջ�õ�-1

        x2.close();
    }

    public static void onest(File x) throws IOException {
        String x1 = "eeeee";
        OutputStreamWriter x2 = new OutputStreamWriter(new FileOutputStream(x));
        x2.write(x1);
        // System.out.println(String.valueOf("eeee".getBytes()));
        // �õ�һ����ַ
        // x2.write(String.valueOf("eeee".getBytes()));
        x2.close();
        System.out.println("onest����");
    }

    public static void onebytept(File x) throws IOException {
        String x1 = "12345";
        OutputStreamWriter x2 = new OutputStreamWriter(new FileOutputStream(x));
        // x2.write(x1, 0, x1.length());
        x2.write(x1, 1, 3);
        // ���յõ���234
        // �����12345��Ӧ������λ��Ϊ0-4
        // ��1��ʼ�����Ǵ�2��ʼ
        x2.close();
    }
}
