package bbb041�������ѧϰ;

public class bbb043����ѧϰ {
    public static void main(String[] args) {//�����඼��main����
        bbb042������ x = new bbb042������();
        //�����д�����x��Ϊ����
        x.pay("asd", 456);
        //�������е�pay�����������ո�ʽ���Զ���x�����˶��塣
        //ֱ�Ӹ�����x��brand�������и�ֵ��
        x.brand = "aaa";
        System.out.println(x.brand);
    }
}
