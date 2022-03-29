package d���׶���β2021��10��2��.eee039����������;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * ����
 * ͨ������ʵ�ֶ����������е�ϴ�ƣ����ƺͿ��ơ�Ҫ�󣺶��ƽ�������
 * ˼·��
 * 1:����HashMap�����Ǳ�ţ�ֵ����
 * 2:����ArrayList���洢���
 * 3:������ɫ����͵�������
 * 4:��0��ʼ��HashMap����洢��ţ����洢��Ӧ���ơ�ͬʱ��ArrayList����洢���
 * 5:ϴ��(ϴ���Ǳ��)����Collections��shuffle()����ʵ��
 * 6:����(����Ҳ�Ǳ�ţ�Ϊ�˱�֤���������ģ�����TreeSet���Ͻ���)
 * 7:���巽������(����TreeSet���ϣ���ȡ��ţ���HashMap�����Ҷ�Ӧ����)
 * 8:���ÿ��Ʒ���
 */
public class eee043������������ {
    public static void main(String[] args) {
        //����HashMap�����Ǳ�ţ�ֵ����
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        //����ArrayList���洢���
        ArrayList<Integer> array = new ArrayList<Integer>();

        //������ɫ����͵�������
        String[] colors = {"��Ƭ", "÷��", "����", "����"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //��0��ʼ��HashMap����洢��ţ����洢��Ӧ���ơ�ͬʱ��ArrayList����洢���
        int index = 0;

        for (String number : numbers) {
            for (String color : colors) {
                hm.put(index, color + number);
                array.add(index);
                index++;
            }
        }
        hm.put(index, "С��");
        array.add(index);
        index++;
        hm.put(index, "����");
        array.add(index);
        // --------------------------------------------------------------------------------------------------------------
        //ϴ��(ϴ���Ǳ��)����Collections��shuffle()����ʵ��
        Collections.shuffle(array);

        //����(����Ҳ�Ǳ�ţ�Ϊ�˱�֤���������ģ�����TreeSet���Ͻ���)
        TreeSet<Integer> lqxSet = new TreeSet<Integer>();
        TreeSet<Integer> lySet = new TreeSet<Integer>();
        TreeSet<Integer> fqySet = new TreeSet<Integer>();
        TreeSet<Integer> dpSet = new TreeSet<Integer>();

        for (int i = 0; i < array.size(); i++) {
            int x = array.get(i);
            if (i >= array.size() - 3) {
                dpSet.add(x);
            } else if (i % 3 == 0) {
                lqxSet.add(x);
            } else if (i % 3 == 1) {
                lySet.add(x);
            } else if (i % 3 == 2) {
                fqySet.add(x);
            }
        }
        // --------------------------------------------------------------------------------------------------------------
        //���ÿ��Ʒ���
        lookPoker("����ϼ", lqxSet, hm);
        lookPoker("����", lySet, hm);
        lookPoker("������", fqySet, hm);
        lookPoker("����", dpSet, hm);
    }

    /**
     * ���巽������(����TreeSet���ϣ���ȡ��ţ���HashMap�����Ҷ�Ӧ����)
     */
    public static void lookPoker(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm) {
        System.out.print(name + "�����ǣ�");
        for (Integer key : ts) {
            String poker = hm.get(key);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
