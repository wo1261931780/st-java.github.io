package c2stage_20220220.ccc073genericity_method;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc073genericity_method
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-12-04  ������
 */
public class ccc001genericity {
    public static void main(String[] args) {
        int[] s = {165, 4, 687, 89, 789, 79};
        String[] s1 = {"11", "11", "11", "11", "11", "11"};
        show(s);
        show(s1);
        // ------------------------------------------------
        // show2(int[] s);
        // show2(s);
        show2(s1);// ���ͷ����ж��������飬
        // ����Ҫ�����������͵����飬�������ͻᱨ��

    }

    public static <T> void show(T t) {
        System.out.println("run dev");
    }

    // �Զ���һ��ʵ����������ƴ�ӵķ���

    public static <T> void show2(T[] t) {// ���͵Ĵ�����ĸ��Ҫһ��
        // ����������������ͣ�ʹ�ù����У���Ҫ����Ϊ�������ͣ������ǻ�������
        StringBuilder x = new StringBuilder("[");
        if (t != null) {
            // for (T i:t){
            //     x.append(i);
            // }
            for (int i = 0; i < t.length; i++) {
                // if (i == t.length - 1) {
                //     x.append(i);
                // } else {
                //     x.append(t[i]).append(",");
                // }
                x.append(t[i]).append(i == t.length - 1 ? "" : ",");
            }
            x.append("]");
        }
        x.toString();
    }
}
