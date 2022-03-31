package c2stage_20220331.ccc001stream_case;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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
        x1.add(new ccc001object("a1", 33245, "y", 1));
        x1.add(new ccc001object("a2", 8855, "y", 1));
        x1.add(new ccc001object("a3", 321, "n", 1));
        x1.add(new ccc001object("a4", 987, "n", 1));
        x2.add(new ccc001object("b4", 321, "n", 1));
        x2.add(new ccc001object("b5", 789, "n", 1));
        x2.add(new ccc001object("b1", 654, "n", 1));
        x2.add(new ccc001object("b2", 32161, "n", 1));
        x2.add(new ccc001object("b3", 215, "y", 1));
        show1(x1);
        show1(x2);
        Stream<ccc001object> x3 = Stream.concat(x1.stream(), x2.stream());
        x3.forEach(s -> System.out.println("������" + s.getName() + "--" + s.getProfit()));
        // �õ��Ľ����x1������+x2������
        // �����൱�ڰ��ڲ����е����ݰ���˳��ϲ�������Ȼ����������������
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
        show2(money, x1.size() - 2);
    }

    public static void show2(int num, int num2) {
        BigDecimal x1 = BigDecimal.valueOf(num);
        BigDecimal x2 = BigDecimal.valueOf(num2);

        BigDecimal result = x1.divide(x2, 2, RoundingMode.HALF_UP);
        // �����ݷ���������������
        System.out.println("�����ȵĽ����" + result);
    }

}
