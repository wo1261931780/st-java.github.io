package c2stage_20220213.ccc052arrays;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220213.ccc052arrays
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-17-45  ������
 */
public class ccc001arrays���� {
    public static void main(String[] args) {
        // arrays�ǲ����������ݵĹ���
        int[] x = {1, 2, 13, 231, 23, 1};
        System.out.println(Arrays.toString(x));
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
        // array��Ҫ�Ǹ��ֲ�������ķ���
        // ˵�˻����ǣ�
        // �������飬��Ҫ������չʾ�Ȳ�����ֱ����arrays�Ϳ���
        int[] xx = {16, 54, 321, 4, 561, 65, 45, 136, 4};
        System.out.println(Arrays.toString(xx));
        // sout(xx)ֱ��չʾ��ֻ����������ַ
        // tostring���ַ�������ʽ�������������
        Arrays.sort(xx);
        // sort�����鰴������˳������
        // �����ԭ�����ַ���䣬ֻ��˳�����仯
        System.out.println(Arrays.toString(xx));
        // math��arrays���ֹ����࣬��̨(Դ��)��private���Σ���ֹ��紴������
        // ��Ա��public static ���Σ�ʹ�����������ʳ�Ա����
    }
}
