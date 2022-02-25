package c2stage_20220220.ccc062lambda_for;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc062lambda_for
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-13-25  ������
 */
public class ccc001lambda���� {
    public static void main(String[] args) {
        // int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Collection<Integer> x = new ArrayList<>();
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        x.add(5);
        // ���Ը�ʽ��
        x.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer s) {
                System.out.println(s);
            }
        });
        // �򻯸�ʽ1��
        x.forEach((Integer s) -> System.out.println(s));
        // �򻯸�ʽ2��
        x.forEach(s -> System.out.println(s));
        // �򻯸�ʽ3��
        x.forEach(System.out::println);

    }
}
