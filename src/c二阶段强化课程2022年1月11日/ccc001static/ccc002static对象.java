package c���׶�ǿ���γ�2022��1��11��.ccc001static;

public class ccc002static���� {
    public static void main(String[] args) {
        ccc001static���� x = new ccc001static����();
        System.out.println(x.age);
        System.out.println(x.name);
        // x.comef = "111";
        // ���ھ�̬��Ա��������ֱ�ӷ��ʣ�����Ҳ���ԣ���ͬʱ���и�ֵ����
        // ������ֵ����������ĸ�ʽ����
        // ��������������Ȼ�����þ�̬�������������ø�ֵ����
        ccc001static����.comef = "000";//����.��̬��Ա����
        //�����ǱȽ��Ƽ��ķ��ʷ�ʽ
        System.out.println(x.comef);//������.��Ա����
        System.out.println(ccc001static����.comef);//����.��Ա����
        //��Ϊ��̬��Ա�����Ƕ������У����г�Ա�����Թ���ģ��������г�Ա����ֱ�ӷ���
        //���������Ƽ�ֱ���������ʣ��ȽϹ淶

    }
}
