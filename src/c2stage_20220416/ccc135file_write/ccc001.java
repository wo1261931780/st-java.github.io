package c2stage_20220416.ccc135file_write;

import java.io.*;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220416.ccc135file_write
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-16-40  ������
 */
public class ccc001 {
    public static void main(String[] args) throws IOException {
        System.out.println("����");
        Writer x = new FileWriter("src/c2stage_20220416/ccc135file_write/ccc001.txt");
        x.write('x');
        // x.write('123');//�����Ŷ����ַ���Ҫд�ַ�����������˫���ţ�Ҳ˵��������������ַ���д��
        x.write("123");
        x.write('a');
        x.close();// close���Զ�ִ��flush���������Բ���Ҫ�ֶ�ˢ��
        // ��û�йرյ�����£�ֱ�Ӷ�ȡû������
        Reader x1 = new FileReader("src/c2stage_20220416/ccc135file_write/ccc001.txt");
        int len;
        while ((len = x1.read()) != -1) {
            System.out.println(len);
        }
        x1.close();


    }
}
