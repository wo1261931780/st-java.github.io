package c2stage_20220417.ccc139charset_writer;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220417.ccc139charset_writer
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-22-26  ������
 */
public class ccc001 {
    public static void main(String[] args) throws IOException {
        File x = new File("src/c2stage_20220417/ccc139charset_writer/demo.txt");
        OutputStream x1 = new FileOutputStream(x);
        Writer x2 = new OutputStreamWriter(x1, StandardCharsets.UTF_8);
        // ����û����Դ���п���������������Ҫתһ����ʹ�û���������ȥд����
        BufferedWriter x3 = new BufferedWriter(x2);
        x3.write("���ԣ�demo");
        x3.close();// һ��Ҫ�ǵùر�
    }
}
