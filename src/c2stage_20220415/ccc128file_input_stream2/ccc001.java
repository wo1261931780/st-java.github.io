package c2stage_20220415.ccc128file_input_stream2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220415.ccc128file_input_stream2
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-22-54  ������
 */
public class ccc001 {
    public static void main(String[] args) throws IOException {
        File demo = new File("src/c2stage_20220415/ccc128file_input_stream2/demo.txt");
        InputStream x = new FileInputStream(demo);
        System.out.println(demo.length());//343,������long���͵�
        byte[] x1 = new byte[(int) demo.length()];// ����Ҫת��Ϊint����
        int demo2 = x.read(x1);
        // System.out.println(new String(x1, 0, demo2));
        // ���Ļ��Ƕ�������
        byte[] demobyte = x.readAllBytes();// ��������ֱ�Ӷ�ȡ���е��ֽ��ļ�
        System.out.println("--" + new String(demobyte, 0, demobyte.length) + "--");//

    }
}
