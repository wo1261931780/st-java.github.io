package ab����ѧϰ2021��10��2��.bbb018string���췽��;

import java.util.Arrays;
import java.util.Scanner;

public class bbb004string�ĳ���api {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("�������Ӧ���ַ�����");
        String xx = x.nextLine();
        // slength(xx);
        // srindex(xx);
        // blindex(xx);
        arrst(xx);
        // subst(xx);
        // zjst(xx);
        tihuanst(xx);
        statwi(xx);
    }

    // public static void
// 1��public int length(): ��ȡ�ַ����ĳ���

    public static void slength(String x) {
        System.out.println("�ַ����ĳ���Ϊ��" + x.length());
    }

    // 2��public char charAt(int index): ��ȡĳ������λ�ô����ַ�

    public static void srindex(String x) {
        System.out.println("��ȡ�ַ�����ָ��λ�ã�" + x.charAt(1));
    }

    // 3��public char[] toCharArray()��: ���ַ���ת�����ַ�����

    public static void blindex(String x) {
        for (int i = 0; i < x.length(); i++) {
            System.out.println("�����ַ���" + i + "λ���ַ��ǣ�" + (byte) x.charAt(i));
            System.out.println("�����ַ���" + i + "λ���ַ��ǣ�" + (char) x.charAt(i));
        }
    }

    public static void arrst(String x) {
        char[] democh = x.toCharArray();
        System.out.println("����һ���ַ����飺" + Arrays.toString(democh));
    }

    // 4��public String substring(int beginIndex, int endIndex) ����ȡ���ݣ�(��ǰ�������)

    public static void subst(String x) {
        // [0, 1, 2, 3, 4, 5, 6, 7, 8]
        System.out.println("��ȡ���ַ���Ϊ��" + x.substring(0, 5));//�����ʾ��ȡ�˼����ַ������01234
        System.out.println("��ȡ���ַ���Ϊ��" + x.substring(2, 5));//234
        System.out.println("��ȡ���ַ���Ϊ��" + x.substring(4, 5));//4
    }

    // 5��public String substring(int beginIndex):�ӵ�ǰ����һֱ��ȡ��ĩβ

    public static void zjst(String x) {
        // [0, 1, 2, 3, 4, 5, 6, 7, 8]
        System.out.println("��ȡ���ַ���Ϊ��" + x.substring(2));//�ӵڼ����ַ���ȡ����󣬽��2345678
        System.out.println("��ȡ���ַ���Ϊ��" + x.substring(4));//45678
        System.out.println("��ȡ���ַ���Ϊ��" + x.substring(5));//5678
    }

    // 6��public String replace(CharSequence target, CharSequence replacement)

    public static void tihuanst(String x) {
        // [0, 1, 2, 3, 4, 5, 6, 7, 8]
        System.out.println("�滻��Ľ���ǣ���" + x.replace("4", "**"));//0123**5
    }

    // 7��public boolean contains(CharSequence s)

    public static void containst(String x) {
        // [0, 1, 2, 3, 4, 5, 6, 7, 8]
        System.out.println("���������ݣ�" + x.contains("4"));//�������true��false
    }

    // 8��public boolean startsWith(String prefix)

    public static void statwi(String x) {
        // [0, 1, 2, 3, 4, 5, 6, 7, 8]
        System.out.println("��ʲô��ʼ��" + x.startsWith("012"));//�������true��false
        System.out.println("��ʲô��ʼ��" + x.startsWith("4"));//�������true��false
        // ֻ�ж���ʲô��ʼ���м��ֶ��޷��ж�
    }

    // 9��public String[] split(String s): ����ĳ�����ݰ��ַ����ָ���ַ������鷵�ء�

    public static void spst(String x) {
        // [0, 1, 2, 3, 4, 5, 6, 7, 8]
        System.out.println("��ʲô��ʼ��" + x.split("3"));//���õ�����һ������
        String[] demo = x.split("4");
        System.out.println(Arrays.toString(demo));
    }

}
