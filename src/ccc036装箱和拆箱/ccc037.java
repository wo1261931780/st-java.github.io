package ccc036װ��Ͳ���;

public class ccc037 {
    public static void main(String[] args) {
        Integer x=100;
        System.out.println(x);
        //������Զ�װ�䣬�����ݴӻ�������ת��Ϊ��װ����
        //Integer���ǰ�װ����
        x+=200;
        System.out.println(x);
        //�����Զ�ִ����װ��Ͳ���Ĺ��̣�
        //���������
        x=x.intValue()+100;
        System.out.println(x);
        //intvalue���ǲ������
        if (x==null){//Ĭ�Ͻ��в�Ϊnull���ж�
            System.out.println("null����");
        }else {
            System.out.println(x+"---ok");
        }
    }
}
