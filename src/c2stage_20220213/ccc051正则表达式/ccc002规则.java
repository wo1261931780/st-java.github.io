package c2stage_20220213.ccc051������ʽ;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220213.ccc051������ʽ
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-13-39  ������
 */
public class ccc002���� {
    public static void main(String[] args) {

        //public boolean matches(String regex):�ж��Ƿ���������ʽƥ�䣬ƥ�䷵��true
        // ֻ���� a  b  c
        System.out.println("a".matches("[abc]")); // true
        System.out.println("z".matches("[abc]")); // false

        // ���ܳ���a  b  c
        System.out.println("a".matches("[^abc]")); // false
        System.out.println("z".matches("[^abc]")); // true

        System.out.println("a".matches("\\d")); // false
        System.out.println("3".matches("\\d")); // true
        System.out.println("333".matches("\\d")); // false
        System.out.println("z".matches("\\w")); // true
        System.out.println("2".matches("\\w")); // true
        System.out.println("21".matches("\\w")); // false
        System.out.println("��".matches("\\w")); //false
        System.out.println("��".matches("\\W")); // true
        System.out.println("---------------------------------");
        //  ��������ƥ��ֻ��У�鵥���ַ���

        // У������
        // ���������� ��ĸ �»��� ���� 6λ
        System.out.println("2442fsfsf".matches("\\w{6,}"));
        System.out.println("244f".matches("\\w{6,}"));

        // ��֤�� ���������ֺ��ַ�  ������4λ
        System.out.println("23dF".matches("[a-zA-Z0-9]{4}"));
        System.out.println("23_F".matches("[a-zA-Z0-9]{4}"));
        // System.out.println("23dF".matches("[\\w && ^_]{4}"));
        // �������Ȳ��ܴ�����
        // ��������^_��Ҫ������[]�м�
        System.out.println("23dF".matches("[\\w&&[^_]]{4}"));
        System.out.println("23_F".matches("[\\w&&[^_]]{4}"));

    }
}
