package c2stage_20220416.ccc134file_read;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220416.ccc134file_read
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-16-17  ������
 */
public class ccc001 {
    public static void main(String[] args) throws IOException {
        File x = new File("src/c2stage_20220416/ccc134file_read/demo001.txt");
        FileReader x1 = new FileReader(x);
        // ����Ķ�ȡ��Ҫ���ļ��ı����ʽ���ʹ���չʾ�����ı����ʽһ�£�����չʾҲ������
        int demo;
        while ((demo = x1.read()) != -1) {
            System.out.println("չʾ���----------");
            System.out.println((char) demo);// ��ʵ��ת��Ҳ���ԣ�����ȫ�������ֱ��룬���û���˵û������
        }
    }
}
