package c2stage_20220412.ccc127file_io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220412.ccc127file_io
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-23-12  ���ڶ�
 */
public class ccc001 {
    public static void main(String[] args) throws IOException {
        FileInputStream x = new FileInputStream("src/c2stage_20220412/ccc127file_io/demo.txt");
        // �����Ǽ�д��������ֱ��д·�����ڲ����Ǹ��ݽ�����½���һ��file��
        // ��һ��Դ�룺
        //     public FileInputStream(String name) throws FileNotFoundException {
        //         this(name != null ? new File(name) : null);
        //     }
        // ��ʵ�ڲ����ǽ�����Ϊһ��file���󣬽����˹���
        int demo = x.read();// ���ﵣ�����Ƕ�ȡ�Ľ�������ڣ����ܻ᷵��-1�����Ա��뱨��
        System.out.println((char) demo);// ���Ϊ1
        // ����ÿ�ζ����ȡһ���ֽڷ��أ���int������������32λ�ģ����Խ���û����
        // ����Ϊ���ֺ�Ӣ�ģ�����ռ��һ���ֽڣ�����ֱ�Ӷ�ȡû����

        int demo2 = x.read();// read�������ײ���stream������ʽ�����Զ�ȡ�ǰ���˳����ǰ�ߵ�
        System.out.println((char) demo2);// ��Ϊ�����ģ�һ������ռ�������ֽڣ����Ի�����

    }
}
