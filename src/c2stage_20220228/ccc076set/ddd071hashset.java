package c2stage_20220228.ccc076set;

import java.util.HashSet;

public class ddd071hashset {
    public static void main(String[] args) {
        // hashset���ײ�Ϊ��ϣ��
        // �Ե���˳��û�б�֤��Ҳ����ʹ��forѭ������
        // ����ı�������Ҫ�����Ҫindex�ı�����ʽ�������Ķ�����
        // ͬʱ�������set���ǲ����ظ�Ԫ�ص�
        // ����˵��
        // ʹ��hashset�½�����ֱ��add���Ա����ظ����⣬
        // �������½�����Ȼ��add����hashset�У�����Ҫ�����ж�equals��hashcode����������д����
        HashSet<String> x = new HashSet<>();
        x.add("a1");
        x.add("a2");
        x.add("a3");
        x.add("a4");
        // x.add("asfgsd2");
        // x.add("fgjfghj3");
        // x.add("ghfkghj4");
        x.add("a5");
        x.add("a5");
        x.add("a5");

        for (String x1 : x) {
            System.out.println(x1);
            System.out.println(x1.hashCode());
            // a1-a5�����Ԫ�ض�Ӧhash����Ϊ��3056-3060
            // ʵ�ʰ�˳������
        }
        // ����������a1-5�ķ�ʽȥ��ӣ�
        // ���ջ��ǵõ���˳�����е�Ԫ��
    }
}
