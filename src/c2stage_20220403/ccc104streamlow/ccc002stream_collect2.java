package c2stage_20220403.ccc104streamlow;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220403.ccc104streamlow
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-12-56  ������
 */
public class ccc002stream_collect2 {
    public static void main(String[] args) {
        List<String> x = new ArrayList<>();
        x.add("a1");
        x.add("a2");
        x.add("a3");
        x.add("d4");
        x.add("g5");
        Stream<String> demo1 = x.stream().filter(s -> s.startsWith("g"));
        List<String> demo2 = demo1.collect(Collectors.toList());
        List<String> demo3 = demo1.toList();
        // �������������������ֱ�ӽ�streamת��Ϊlist���͵ļ��϶���
        // �������tolist��õļ��ϲ����޸ļ����е�Ԫ�أ�Ϊ���ɱ伯��
        // ���ɱ伯�ϣ����е�������Listof����
        // stream��õķ����Ϳɱ�
    }
}
