package c2stage_20220220.ccc070genericity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc070genericity
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-22-48  ������
 */
public class ccc001genericity {
    public static void main(String[] args) {
        // ���͵Ľ���
        List<String> x = new ArrayList<>();
        x.add("java");
        x.add("java");
        x.add("java");
        // x.add(23.3);// �޷����˫��������
        List x1 = new ArrayList();// ��δָ�����͵�����£�Ĭ�Ͽ��������������
        x1.add(23.3);
        x1.add("demo");
        x1.add("demo");
        x1.add(true);
        for (Object i : x1) {
            // String demo = (String) x1;// ǿתʧ��
            // ���ͱȽ����
        }


    }
}
