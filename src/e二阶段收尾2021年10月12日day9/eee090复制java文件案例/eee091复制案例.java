package e���׶���β2021��10��12��day9.eee090����java�ļ�����;

import java.io.*;

public class eee091���ư��� {
    public static void main(String[] args) throws IOException {
        System.out.println("-----");
        File x = new File("l:\\java\\eee087.java");
        copy(x);

    }

    public static void copy(File x) throws IOException {
        InputStreamReader x1 = new InputStreamReader(new FileInputStream(x));
        OutputStreamWriter x2 = new OutputStreamWriter(new FileOutputStream("l:\\java\\demo\\22.java"));
        int i;
        while ((i = x1.read()) != -1) {
            x2.write(i);
        }
        System.out.println("����");
        x1.close();
        x2.close();
        // ��Ϊû��close����������û��ˢ��
    }

    public static void copybyte(File x) throws IOException {
        InputStreamReader x1 = new InputStreamReader(new FileInputStream(x));
        OutputStreamWriter x2 = new OutputStreamWriter(new FileOutputStream("l:\\java\\33.java"));
        // byte[] xx = new byte[1024];
        char[] xx = new char[1024];
        // ����byte������ֽ�������ģ����ַ�������Ҫchar���͵�����
        int i;
        while ((i = x1.read(xx)) != -1) {
            x2.write(xx, 0, i);
        }
        x1.close();
        x2.close();
        System.out.println("����");
    }
}
