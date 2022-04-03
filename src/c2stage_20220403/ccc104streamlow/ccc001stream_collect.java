package c2stage_20220403.ccc104streamlow;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220331.ccc001stream_case2
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-22-20  ������
 */
public class ccc001stream_collect {
    public static void main(String[] args) {
        List<String> x = new ArrayList<>();
        x.add("a1");
        x.add("a2");
        x.add("a3");
        x.add("e4");
        x.add("b5");
        Stream<String> demo1 = x.stream().filter(s -> s.startsWith("a"));
        List<String> demo2 = demo1.collect(Collectors.toList());
        // ��������Ҫ�����stream�����ռ�����������Ҫ������stream���͵Ķ���
        // ��Σ���Ҫ�ռ�Ϊʲô���͵Ķ��󣬾ͱ���Ҫtoʲô���͵�
        // ����������tolist���Ǿ����ռ�Ϊlist���͵�
        // toset�������ռ�Ϊset���͵�
        System.out.println(demo2);

        // ��û���½�stream��������£�Ĭ��ֻ�ܱ��ռ�һ��
        // ����е���������ˮ�ĸ���
        // Set<String> demo4 = demo1.collect(Collectors.toSet());//ֱ�����лᱨ��

        // Ҫʹ���µ��ռ�����ǰ����stream��û�б��ռ���
        Stream<String> demo3 = x.stream().filter(s -> s.startsWith("c"));
        Set<String> demo4 = demo3.collect(Collectors.toSet());
        System.out.println(demo4);
    }

    public static void show(List<String> x) {
        // ���仰��˵��
        // �κ�һ�����ϣ��ܱ������ε���Ϊstream�����������stream���ռ�
        Stream<String> demo1 = x.stream().filter(s -> s.startsWith("c"));
        Object[] demo2 = demo1.toArray();// ֱ�ӵ��÷�������ת��Ϊ�������͵Ķ���
        // ע������ļ�����������Ϊobject
        // �е�ʱ��ҵ����Ҫ����ת��Ϊstring����ȥ����
        String[] demo3 = demo1.toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        // ������ǽ�һ��stream����ָ��ת��Ϊstring���͵�����
        // ��д�������Ƿ������ã�
        String[] demo4 = demo1.toArray(String[]::new);

    }
}
