package abc����ѧϰ2021��10��2��.ccc033ð�������arrays����;

import java.util.Arrays;

public class ccc036array {
    public static void main(String[] args) {
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
