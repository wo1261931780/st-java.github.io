package d���׶���β2021��10��2��.ddd024���Ͻ���;

import java.util.ArrayList;
import java.util.Collection;

public class ddd026collection���÷���add {
    public static void main(String[] args) {
        Collection<String> x = new ArrayList<>();
        x.add("aaa");
        x.add("bbb");
        // x.add("aaa");
        System.out.println(x);
        // ��������[aaa, bbb, aaa]
        // ʵ�����Ǵ����ظ���ӵ����
        // --------------------------------------------------------
        // �鿴Դ�룺
        // public boolean add(E e) {
        //     modCount++;
        //     add(e, elementData, size);
        //     return true;
        // }
        // --------------------------------------------------------
        System.out.println(x.add("aaa"));
        // ���е�x.add()���᷵��true
        System.out.println(x);
        // ������Ĳ�ͬ�����ϵ�������԰�˳��
        // ��һ��������������������Ժ��������
        // ����Դ������ͼ�Ժ�
        // alt+7���ɽ�����Ŀ�ṹ


    }
}
