package c2stage_20220331.ccc001stream_case;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220331.ccc001stream_case
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-21-12  ������
 */
public class ccc002rundemo {
    public static int money;//��main����֮ǰ���أ���Ϊȫ�ֱ���

    public static void main(String[] args) {
        List<ccc001object> x1 = new ArrayList<>();
        List<ccc001object> x2 = new ArrayList<>();
        x1.add(new ccc001object("a1", 11, "y", 1));
        x1.add(new ccc001object("a2", 20, "y", 1));
        x1.add(new ccc001object("a3", 20, "n", 1));
        x1.add(new ccc001object("a4", 9, "n", 1));
        x2.add(new ccc001object("b4", 31, "n", 1));
        x2.add(new ccc001object("b5", 31, "n", 1));
        x2.add(new ccc001object("b1", 31, "n", 1));
        x2.add(new ccc001object("b2", 31, "n", 1));
        x2.add(new ccc001object("b3", 11, "y", 1));
        show1(x1);
        show1(x2);
    }

    public static void show1(List<ccc001object> x1) {
        ccc003top_employee demop = x1.stream().max((a1, a2) -> a1.getProfit() - a2.getProfit()).map(s -> new ccc003top_employee(s.getName(), s.getProfit())).get();
        // ����һ���������д��룺
        // 1.�����ҵ���max�������ڲ��½�һ���Ƚ������Ƚ����ݾ���profit
        // 2.����map�����������װΪһ��employee���󣬷�װ�����ݾ���нˮ������
        // 3.����get�������Զ������ʽȥ��ý��
        System.out.println(demop);

        x1.stream().sorted((a1, a2) -> a1.getProfit() - a2.getProfit()).skip(1).limit(x1.size() - 2).forEach(s -> {
            money += s.getProfit();
        });
        // ����һ������Ĵ���
        // ���ȵ���sorted������������һ����������
        // Ȼ������һ���������ֵ��
        // ���Ƴ���Ϊ2��ȥ��һ����Сֵ��
        // ���Ŷ����е�Ԫ�ر�������Ϊ��Ҫ�ڱ����ڼ�����ݴ���
        // �����ʹ��{}��������д����
        
        money /= x1.size() - 2;
        System.out.println(money);
    }
}
