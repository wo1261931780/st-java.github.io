package ccc017��̬��ת��;

public class ccc020 {
    public static void main(String[] args) {
        ccc018animal x = new ccc019cat();
        //���������ֵ������ʹ��
        //��cat�����д���x��ʹ�ø���animal�Ĺ���
        //�����x����ʵ����������cat�д��ڵģ�����x�Ƕ�̬�ģ�����ʹ�ø���Ĺ���
        x.run();//����������ʾ�Ļ��ǡ�cat���е�run������
        System.out.println("-------------------------------");
        ccc019cat c = (ccc019cat) x;//����ת�ͣ���cat x(����)��cat c(����)��
        c.coach();
        c.run();
        System.out.println("-------------------------------");
        ccc019cat d1=new ccc019cat();//��������c�ʹ���һ���µ�cat����û�в��
        //������ֱ�ӵ���cat�еķ���
        d1.run();
        d1.coach();
        System.out.println("-------------------------------");
        x=new ccc021dog();//����ת�ͣ��ø����������ʹ������Ĺ���
        //�����x������cat�У��䵽����dog�У��Ӷ�ʹ��dog�Ĺ���
        //��Ϊ��Ҫʹ����д�����Թ��ܵ����Ʋ��ܸģ�������run
        x.run();
    }
}
