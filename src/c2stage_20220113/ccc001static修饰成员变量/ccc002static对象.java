package c2stage_20220113.ccc001static���γ�Ա����;

public class ccc002static���� {
    public static void main(String[] args) {
        ccc001static���� x = new ccc001static����();//����ʵ����Ա������ǰ�����½��˶���
        System.out.println(x.age);//����ʵ����Ա����������.������
        System.out.println(x.name);
        // x.comef = "111";//���ʾ�̬��Ա����
        // ���ھ�̬��Ա��������ֱ�ӷ��ʣ�����Ҳ���ԣ���ͬʱ���и�ֵ����
        // ������ֵ�����ã�����.��̬��Ա����=xxx...
        // ��������������Ȼ�����þ�̬�������������ø�ֵ����
        ccc001static����.comef = "000";//����.��̬��Ա����

        System.out.println(x.comef);//������.��̬��Ա���������Ƽ�
        System.out.println(ccc001static����.comef);//����.��̬��Ա�������Ƽ�
        //��Ϊ��̬��Ա�����Ƕ����������г�Ա����ģ��������г�Ա����ֱ�ӷ���
        //���������Ƽ�ֱ���������ʣ��ȽϹ淶

    }
}
