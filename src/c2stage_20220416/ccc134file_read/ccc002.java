package c2stage_20220416.ccc134file_read;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220416.ccc134file_read
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-16-28  ������
 */
public class ccc002 {
    public static void main(String[] args) throws IOException {
        File x = new File("src/c2stage_20220416/ccc134file_read/demo001.txt");
        FileReader x1 = new FileReader(x);
        int len;
        char[] demo = new char[1024];// ������ַ�Ϊ��λ�ģ��൱���ַ�*1024��
        // ���һ���ַ�3���ֽڣ�����3*1024
        while ((len = x1.read(demo)) != -1) {
            String x3 = new String(demo, 0, len);
            System.out.println(x3);

        }

    }
}
