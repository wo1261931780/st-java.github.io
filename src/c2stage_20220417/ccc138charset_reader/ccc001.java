package c2stage_20220417.ccc138charset_reader;

import java.io.*;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220417
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-21-44  ������
 */
public class ccc001 {
    public static void main(String[] args) throws IOException {
        File demo = new File("src/c2stage_20220417/ccc138charset/demo.txt");
        InputStream x = new FileInputStream(demo);
        // �Ķ�������������������Ϊ�������ʹ��
        Reader x1 = new InputStreamReader(x, "GBK");
        // Reader x1 = new InputStreamReader(x, StandardCharsets.UTF_8);
        // ����ͽ̳̲�һ�����̳���˫����ָ���˱����ʽ
        // ����ֱ��ʹ�ó�������
        // String x2;
        // while ((x2 = x1.readline()) != null) {
        // �����jdk16��һ�����������ֱ��ָ��readline�����ﲻ��
        // }
        int x2;
        while ((x2 = x1.read()) != -1) {
            System.out.print((char) x2);
        }
        // ����ֱ�Ӷ�ȡҲ���ᱨ��
    }
}
