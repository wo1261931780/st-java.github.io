package e���׶���β2021��10��8��.eee021hashmap����;
/*
    ����
        ����һ��HashMap���ϣ�����ѧ��(String)��ֵ��ѧ������(Student)���洢������ֵ��Ԫ�أ�������

    ˼·��
        1:����ѧ����
        2:����HashMap���϶���
        3:����ѧ������
        4:��ѧ����ӵ�����
        5:��������
            ��ʽ1������ֵ
            ��ʽ2����ֵ�Զ����Ҽ���ֵ
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class eee024������ {
    public static void main(String[] args) {
        System.out.println("��ʼ");
        eee023ѧ���� x1 = new eee023ѧ����("111", "a1");
        eee023ѧ���� x2 = new eee023ѧ����("222", "a2");
        eee023ѧ���� x3 = new eee023ѧ����("333", "a3");
        HashMap<String, eee023ѧ����> x = new HashMap<>();
        // ������Ҫ�������õĶ��������ı�
        x.put("001", x1);
        x.put("002", x2);
        x.put("003", x3);
        Set<Map.Entry<String, eee023ѧ����>> xx = x.entrySet();
        for (Map.Entry<String, eee023ѧ����> xx1 : xx) {
            System.out.println(xx1.getKey() + "----" + xx1.getValue().getName() + "--" + xx1.getValue().getNum());
        }
        System.out.println("����");
        // ����������������ڣ�չʾhashmap�Ĺ���
        // ��������һ��ѧ���࣬Ȼ��ѧ�������и��ֱ���
        // ��Ѱ��ѧ������ֻ��Ҫͨ��key��ȡ����
        // Ȼ��ͨ���һ�ȡ��keyȥ��λѧ������ʹ��get/set���������õ������ڲ��ı���
        // ������
        // �ҵ��˺�һ��key����Ӧ���˺���Ϣ���û�����ip��ַ���ֻ��ŵȵ�
        // ��ֻ��Ҫ����keyȥ��ȡ�û������ܲ鵽�û����µ�������Ϣ
    }
}
