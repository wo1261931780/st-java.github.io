package c2stage_20220220.ccc063for_case;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc063for_case
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-13-47  ������
 */
public class ccc002rundemo {
    public static void main(String[] args) {
        Collection<ccc001object> x = new ArrayList<>();
        x.add(new ccc001object("11", 11, 11));// ����ֱ��add
        x.add(new ccc001object("22", 22, 22));// ��Ϊ����add��ӵĶ��Ƕ�����Ҫ���д��ι���
        x.add(new ccc001object("33", 33, 33));
        System.out.println("��ǿforѭ����");
        for (ccc001object x1 : x) {
            System.out.println(x1.getName() + "\t" + x1.getAge() + "\t" + x1.getPrice());
        }
        System.out.println("��������");
        Iterator<ccc001object> demoit = x.iterator();
        // while (x.iterator().hasNext()) {//��Ϊ���ص���һ���������Կ���ֱ����ʽ���
        // ����ֱ�Ӵ������ᵼ����ѭ������indexû����ô��
        // �����൱��ÿ�η�����һ���µĵ���������Ȼ��Ե����������ж��Ƿ�Ϊ�գ�
        // ���Ϊ�գ��ͽ�����һ��ѭ��
        while (demoit.hasNext()) {
            // System.out.println(demoit.next());// ֱ�ӱ���ֻ��õ�����
            ccc001object show = demoit.next();
            System.out.println(show.getName() + "--" + show.getAge() + "--" + show.getPrice());
        }
        System.out.println("foreachѭ����");
        x.forEach(new Consumer<ccc001object>() {
            @Override
            public void accept(ccc001object xx) {
                System.out.println(xx.getName() + "**" + xx.getAge() + "**" + xx.getPrice());
            }
        });
        System.out.println("lambda���ʽ��");
        x.forEach(x1 -> System.out.println(x1.getName() + "==" + x1.getAge() + "==" + x1.getPrice()));
    }
}
