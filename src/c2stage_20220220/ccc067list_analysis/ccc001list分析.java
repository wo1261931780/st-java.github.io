package c2stage_20220220.ccc067list_analysis;

import java.util.LinkedList;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc067list_analysis
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-20-30  ������
 */
public class ccc001list���� {
    public static void main(String[] args) {
        LinkedList<String> x = new LinkedList<>();
        // �������й��ܵ�ʱ�򣬾Ͳ��ܰ��ն�̬ȥ��
        x.addFirst("1q");
        x.addFirst("2q");
        x.addFirst("3q");
        x.addFirst("4q");
        x.addFirst("5q");
        x.addFirst("6q");
        // �Ƚ������
        // ջ�Ķ��нṹ
        System.out.println(x);// [6q, 5q, 4q, 3q, 2q, 1q]

        // ************************
        System.out.println("��ȡ��һ���ӵ���" + x.getFirst());// 6q
        // ����ջ�Ľṹ���Ƚ����
        System.out.println("�����һ���ӵ���" + x.removeFirst());
        System.out.println(x);// ʣ���ӵ�
        System.out.println("***********");
        show();
        showpush();
    }

    public static void show() {
        LinkedList<String> x = new LinkedList<>();
        x.addLast("��1��");
        x.addLast("��2��");
        x.addLast("��3��");
        x.addLast("��4��");
        x.addLast("��5��");
        x.addLast("��6��");
        System.out.println(x);// [��1��, ��2��, ��3��, ��4��, ��5��, ��6��]
        // ������������˳��
        System.out.println(x.removeFirst());// ��1��
        System.out.println(x);// [��2��, ��3��, ��4��, ��5��, ��6��]
    }

    public static void showpush() {
        LinkedList<String> x = new LinkedList<>();
        x.addFirst("1a");
        x.push("demo");// Դ�������addfirst
        System.out.println(x);// [demo, 1a]
        System.out.println(x.pop());// demo��Դ�������removefirst

        System.out.println(x.offerLast("lll"));//������û�гɹ���Դ�������addlast


    }

}
