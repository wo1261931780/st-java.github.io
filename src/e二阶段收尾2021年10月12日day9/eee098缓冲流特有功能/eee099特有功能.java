package e���׶���β2021��10��12��day9.eee098���������й���;

import java.io.*;

public class eee099���й��� {
    public static void main(String[] args) throws IOException {
        File xx = new File("l:\\java\\demo.txt");
        BufferedWriter x = new BufferedWriter(new FileWriter(xx));
        for (int i = 0; i < 10; i++) {
            x.write("java" + i);
            // x.write("\r\n");
            x.newLine();
            // �Դ��Ļ��з��ţ����ⲻͬϵͳ֮��Ĳ���
        }
        System.out.println("-------------");
        x.close();
        show(xx);
    }

    public static void show(File x) throws IOException {
        BufferedReader x1 = new BufferedReader(new FileReader(x));
        String x2 = "";
        while ((x2 = x1.readLine()) != null) {
            // readline���Զ���ȡ�ַ����ķ�����
            // ͬ���ģ�ÿ�ζ�ȡ���ᣬ���ı�ǰ��һ��
            // ����x2ֻ�����ı����ݣ�û�л��з���
            // ���Ա����ֶ�����
            System.out.println(x2);
        }
    }
}
