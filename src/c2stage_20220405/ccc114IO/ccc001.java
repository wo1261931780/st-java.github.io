package c2stage_20220405.ccc114IO;

import java.io.File;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220405.ccc114IO
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-19-29  ���ڶ�
 */
public class ccc001 {
    public static void main(String[] args) {
        File x = new File("C:\\Users\\1\\Desktop\\FPgPobEVQAMPGbF.jpg");
        // ˫��б�ܣ�����Ϊ����Ϊת���
        // ���\n�������֣�ϵͳ����Ϊ�ǻ��У��������ļ��������У���������ɱ���
        // ˫��б�ܾͲ�������ʾ����
        long demo = x.length();
        // �ɴ˿��Կ�������file���͵Ķ��󣬻�ȡ���ȣ�ֻ��õ�long���͵�����
        // ��long���͵����ݣ�����ľ���x�ļ����ֽڸ���
        // File x = new File("C:/Users/1/Desktop/FPgPobEVQAMPGbF.jpg");
        // ��ʵ����Ҳ����ֱ������б�ܱ�ʾ�㼶����Ϊ�����ͻ������Ҳ����Ҫת�������
        // ������б�ܻᵼ���ļ���ȡ�Ĵ��󣬿������������������������Ҫ�����ļ������ƴ���
        File x1 = new File("C:/Users" + File.separator + "1/Desktop/FPgPobEVQAMPGbF.jpg");
        // ���ַָʽ�ĺô����ڿ�ƽ̨
        // ��api�����ַ������ڲ�ͬƽ̨���Զ�����ͬ����ʽ�����������
        show();
    }

    public static void show() {
        // ֧�־���·�������·��
        File x = new File("st-java.github.io/src/c2stage_20220405/ccc114IO/demo.txt");
        System.out.println(x.length());//0
        // ���·��������һ����Ŀ��
        // ���file�Ľ����һ���ļ��У���ô���Ҳ��0����Ϊ�ļ��еĴ�Сû������
        // Ҫ��ȡ�ļ��еĴ�С������Ҫ�����ļ����е������ļ������ܻ���ļ���С���ܺ�
        System.out.println(x.exists());// �ж�·���µ��ļ����Ƿ����
        // file�Ķ���/·�����治���ڶ����ԣ�
        // ��������ڣ�����Ҳ����ͨ������Ŀ¼�ķ�ʽ��������Ӧ·��
    }
}
