package c���׶�ǿ���γ�2022��1��11��.ccc106������д�ͼ������;

public class ccc008zi extends ccc007fu {

    @Override
    // override��ע��
    // ��������ķ���call������д�Ĺ������Ƿ��д���
    // �����е�private���ݣ����޷����̳еģ�Ҳ���޷�������
    public void call(String name) {
        // �����ͬ�����ǲ�����һ�£����Ƿ�����д
        System.out.println("��������");
        System.out.println("---------------");
        // System.out.println("call to :"+name);
        // ���������Ƕ���ģ����ǿ���ֱ�Ӽ���super��ֱ�ӵ��ø���ķ���
        super.call(name);
        // ֱ�Ӵ��ݲ���
    }
}
