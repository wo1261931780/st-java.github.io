package c2stage_20220418.ccc141printstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220418.ccc141printstream
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-23-25  ����һ
 */
public class ccc001 {
    public static void main(String[] args) throws FileNotFoundException {
        // PrintStream x = new PrintStream("src/c2stage_20220418/ccc141printstream/ccc001.txt");
        // ���ߵĲ����������Ĵ�ӡ������ʵ��д�����ݵ�׷�Ӳ���
        PrintStream x = new PrintStream(new FileOutputStream("src/c2stage_20220418/ccc141printstream/ccc001.txt", true));
        x.print("����");
        x.print("123");
        x.print("abc");
        x.println("abc");
        x.println("---");
        x.close();
        // ��ӡ��Ҳ��ˢ�����ݣ�Ȼ����д������ı�����ִ����ղ���
        // �ײ㻹��ʹ���˻��������
        // �ڴ�ӡ������棬printwriter
        PrintWriter x1 = new PrintWriter("src/c2stage_20220418/ccc141printstream/ccc001.txt");
        x1.println("demo");
        x1.close();
        // ��jdk16�У�һ��ʼ��ӡ��ֻ֧���ֽ�д��
        // ��printwriter֧���ַ�д�룬
        // ���Ƕ��ߵ�������һ����
    }
}
