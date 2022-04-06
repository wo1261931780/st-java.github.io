package c2stage_20220403.ccc105exceptions;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220403.ccc105exceptions
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-13-04  ������
 */


/**
 * Ŀ�꣺�쳣�ĸ������ϵ��
 * <p>
 * ʲô���쳣��
 * �쳣�ǳ�����"����"����"ִ��"�Ĺ����п��ܳ��ֵ����⡣
 * �쳣��Ӧ�þ�����ǰ����ġ�
 * �쳣����Ҳ���޷��������Ա���ģ��쳣������̫������ˣ�������ֻ����ǰ��Ԥ����
 * �쳣һ�������ˣ����û����ǰ��������ͻ��˳�JVM���������ֹ���������쳣����Ҫ��ǰ����ġ�
 * <p>
 * �о��쳣���ұ����쳣��Ȼ����ǰ�����쳣�����ֵ��ǳ���İ�ȫ, ��׳�ԣ�����
 * Java��Ϊ�����Ĵ����쳣�����һ����������
 * <p>
 * �쳣����ϵ:
 * Java���쳣�̳еĸ����ǣ�Throwable��
 * <p>
 * Throwable(���࣬�����쳣��)
 * /              \
 * Error           Exception���쳣����Ҫ�о��ʹ���
 * /            \
 * ����ʱ�쳣      RuntimeException(����ʱ�쳣)
 * <p>
 * <p>
 * Error : �������˼�����ش���Error���޷�ͨ������Ĵ���һ�����֣�����Ա����Ϊ���ˣ�
 * ֻ������ϵͳ���Ż���Ŀ��
 * �����ڴ汼����JVM����ı������������Ա������ᡣ
 * <p>
 * Exception:�����쳣�࣬�����ǿ����д����ڱ������ִ�еĹ����п��ܳ��ֵĴ���
 * ������Ҫ��ǰ����ġ��Ա�������׳��
 * <p>
 * Exception�쳣�ķ���:
 * 1.����ʱ�쳣���̳���Exception���쳣���������࣬����׶ξͻᱨ��
 * �������Ա����ġ�����������Ͳ���ͨ������
 * <p>
 * 2.����ʱ�쳣: �̳���RuntimeException���쳣���������࣬����׶��ǲ������ģ�������
 * ����ʱ�׶ο��ܳ��֣�����ʱ�쳣���Դ���Ҳ���Բ���������׶��ǲ������ģ�
 * �������н׶ο��ܳ��֣����ǽ�����ǰ������
 * С�᣺
 * �쳣�ǳ����ڱ���������еĹ����п��ܳ��ֵĴ��󣡣�
 * �쳣��Ϊ2�ࣺ����ʱ�쳣������ʱ�쳣��
 * -- ����ʱ�쳣���̳���Exception,����׶ξͱ������봦��������벻ͨ����
 * -- ����ʱ�쳣���̳���RuntimeException,����׶β��ᱨ������ʱ�ſ��ܳ��֡�
 * �쳣һ����ĳ��֣��������ֹ������Ҫ�о��쳣�������쳣�������쳣���������׳!!
 */

public class ccc001runtime_exceptions {
    public static void main(String[] args) {
    }

    public static void show1() {
        // �������쳣���ࣺ
        int[] x = {12, 123, 13};
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        // System.out.println(x[3]);// ���������쳣
    }

    public static void show2() {
        String x2 = null;
        System.out.println(x2);
        // System.out.println(x2.length());//��ָ���쳣
    }

    public static void show3() {
        Object x = 23;
        String x2 = (String) x;//ǿ������ת��
    }

    public static void show4() {
        int x = 10 / 0;//��ѧ�����쳣
        String x1 = "a321sd56";
        Integer demo = Integer.valueOf(x1);//����׶β��������н׶η����޷�ת��
        System.out.println(demo);
    }
}
