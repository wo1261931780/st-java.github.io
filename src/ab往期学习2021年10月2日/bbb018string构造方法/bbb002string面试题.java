package ab����ѧϰ2021��10��2��.bbb018string���췽��;

public class bbb002string������ {
    public static void main(String[] args) {

        show1();
        show2();
        show3();
    }

    public static void show1() {
        String x1 = new String("aa");
        //����Ĺ�����ʵ���ϴ�������������
        // һ�������ǳ����صģ�һ�������Ƕ��ڴ��
        String x2 = "aa";
        // ����Ĭ�ϻᴴ��һ�������صģ����ǳ��������Ѿ����ˣ����Ի�Ĭ��ʹ���Ѿ������ĵ�ַ
        System.out.println(x1 == x2);
        // ���Ϊfalse
        // ����x1ָ����ڴ�ĵ�ַ����x2ָ�����صĵ�ַ
    }

    public static void show2() {
        String x1 = "abc";//������
        String x2 = "ab";
        String x3 = x2 + 'c';//ֻҪ����˫����ֱ�Ӹ����������ڶ��ڴ�
        System.out.println(x1 == x3);
        // ���Ϊfalse
    }

    public static void show3() {
        String x1 = "abc";//������
        String x2 = "a" + "b" + "c";//�����أ��϶�������abc��������ָ����ͬ
        //����Ĵ��룬����׶ξ��Ѿ���ɣ�������Ϊ���ս��һ��
        // String x2 = 'a' + 'b' + 'c';//����
        // x2 += 'c';
        System.out.println(x1 == x2);
        // ���Ϊtrue
    }
}
