package d���׶���β2021��10��2��.ddd081treeset;
/*
    TreeSet�����ص�
        1:Ԫ�����������˳����ָ�洢��ȡ����˳�򣬶��ǰ���һ���Ĺ���������򣬾�������ʽȡ���ڹ��췽��
            TreeSet()��������Ԫ�ص���Ȼ�����������
            TreeSet(Comparator comparator) ������ָ���ıȽ�����������
        2:û�д������ķ��������Բ���ʹ����ͨforѭ������
        3:������Set���ϣ����Բ������ظ�Ԫ�صļ���
 */

import java.util.TreeSet;

public class ddd082treeset�ص� {
    public static void main(String[] args) {
        System.out.println("showdemo");
        TreeSet<Integer> x = new TreeSet<>();
        // �����ڲ��洢������������
        // �������ʹ洢��ʱ���û�����İ�װ������
        // ���������������int���͵İ�װ��integer
        x.add(11);
        x.add(33);
        x.add(22);
        x.add(22);
        for (Integer i : x) {
            System.out.println(i);
            // ��ʹ�������˳������Ҳ�ᰴ����Ȼ����������
            // ������11-22-33
            // ʵ��ҵ���У������Ĳ����������ͣ��Ǵ������Ķ����࣬
            // �����Ҫ����ָ������������Ȼ������ô����Ҫ����д����
        }
    }
}
