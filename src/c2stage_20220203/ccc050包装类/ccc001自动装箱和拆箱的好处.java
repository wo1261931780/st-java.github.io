package c2stage_20220203.ccc050��װ��;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220203.ccc050��װ��
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-11-24  ������
 */
public class ccc001�Զ�װ��Ͳ���ĺô� {
    public static void main(String[] args) {
        Integer x = 23;//�����������������Ƕ�������
        String x1 = x.toString();//��Ϊ�Ƕ������Կ��Լ̳�object�࣬��tostring����
        //tostring����������һ���ַ���
        System.out.println(x1);
        // �ַ������ͱ����������
        String x2 = "11";
        int x3 = Integer.parseInt(x2);
        System.out.println(++x3);//12
        String x4 = "123.12";
        Double x5 = Double.parseDouble(x4);
        System.out.println(++x5);//124.12
        // *****************************************
        int x6 = Integer.valueOf(x2);//����x2�������������ͣ����򱨴�
        Double x7 = Double.valueOf(x4);//ͬ����װ��ֻ��ת��Ϊ��Ӧ������
        //ֱ��ʹ��valueof����ת������

    }
}
