package ccc027�����������βκͷ���ֵ;

public class ccc030demo {
    public static void main(String[] args) {
        //������������󣬵��÷���
        ccc029��������� xx=new ccc029���������();
        //��Ϊ�������е�use�����Ǵ��εģ�����������animal���еĶ���
        ccc028animal x=new ccc031����();
        xx.use(x);
        //����use���������һ��animal�еĶ���
        //����animal�ǳ������͵ģ����ܴ�������
        //���Ա��������࣬ͨ����̬�ķ�ʽ������
        //ccc028animal x=new ccc031����();�����൱���������д�����һ������x��
        //��x�߱�animal��������������
        //��ʱ���������x���ݻ�use�����У�
        //ʵ�ֵ�Ч���ǡ����������е�xxʹ��use������
        //��use����ʵ����animal�еĶ���x.eat
        //���Ľ���ǣ�animal�е�xʹ����eat����
        ccc028animal a2= xx.getanimal();//�൱��animal a2=new ����
        a2.eat();
        //������ʽ�Ĳ�������޲εķ����У��Դ��˴�������Ĳ���
    }
}
