package c2stage_20220220.ccc075genericity_tp;

import java.util.ArrayList;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc075genericity_tp
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-12-51  ������
 */
public class ccc004run {
    public static void main(String[] args) {
        ArrayList<ccc002BMW> x = new ArrayList<>();
        x.add(new ccc002BMW());
        x.add(new ccc002BMW());
        x.add(new ccc002BMW());
        ArrayList<ccc003BENZ> x1 = new ArrayList<>();
        x1.add(new ccc003BENZ());
        x1.add(new ccc003BENZ());
        x1.add(new ccc003BENZ());
        // comp(x1);// ֱ��ʹ�ûᱨ����Ϊ���������õ����Ͳ�ͬ
        // ���仰˵�������е����ã�ʹ�õ��õ�ʱ��������½�
        competition(x);
        competition(x1);
    }

    public static void comp(ArrayList<ccc002BMW> x) {
        System.out.println("no");
    }

    public static void competition(ArrayList<?> x) {// ���ʺ������������������
        // ���ǻ��������
        // ������Ĭ��ֻ��car����ʹ�ø����ͣ��������˸�dog��û�����Ʒ������ᵼ��dogҲ�������������
        System.out.println("ok");
    }

    public static void comps(ArrayList<? extends ccc001> x) {
        // ʹ��extends��������
        System.out.println("�������������ʹ�ø÷���");
    }
}
