package c2stage_20220228.ccc077hash_principle;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220228.ccc077hashset
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-22-10  ����һ
 */
public class ccc001hash_principle {
    public static void main(String[] args) {
        String x = "demo1";
        String x1 = "demo";
        System.out.println(x.hashCode());
        System.out.println(x.hashCode());
        System.out.println(x1.hashCode());

        // hash�㷨��
        // JDK8�������ԣ�ʹ�ù�ϣֵ������ĳ������࣬
        // ������
        // һ����ϣֵ������ĳ������࣬����Ϊ16��
        // ��ô����һ����0-15֮��
        // ���Ը��ݽ�����ͽ�Ԫ�ط��ڶ�Ӧλ�ã�indexΪ0-15��

        // �����Ӧ�ô����λ��
        // ��Ҳ������Ϊ������Լ��㣬�����޷��Խ����������

        // null��ֱ�Ӵ��룬
        // ����null����equals�Ƚ������Ժ����
        // JDK7����Ԫ��ռ��Ԫ�ص�λ�ã�ָ����Ԫ�أ��滻��
        // JDK8����Ԫ������Ԫ���������
        // ��ι��أ���ͬ�����ľ��γ���һ���������ʽ
    }
}
