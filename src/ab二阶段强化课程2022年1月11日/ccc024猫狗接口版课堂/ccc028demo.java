package ab���׶�ǿ���γ�2022��1��11��.ccc024è���ӿڰ����;

import ab���׶�ǿ���γ�2022��1��11��.ccc023è���ӿڰ�.ccc024cat;
import ab���׶�ǿ���γ�2022��1��11��.ccc023è���ӿڰ�.ccc026�ӿ�;

public class ccc028demo {
    public static void main(String[] args) {
        ccc026�ӿ� cat = new ccc024cat();
        System.out.print("ʹ�ýӿڵķ�����");
        cat.jump();//�ӿ���д���jump����
        //������ô��⣺
        //jump����ԭ���ǽӿڵ��д��ڵģ����������jump����������ʵ��
        //���Խӿ�ͨ����̬�ķ����������д����Ķ���cat���Ϳ��Ե���jump����
        System.out.println("-----------------------");
        ccc029animal a = new ccc026cat();
        a.setName("111");
        a.setAge(001);
        System.out.println("���������������趨��"+a.getName() +"�������ǣ�"+ a.getAge());
        //ʹ��animal�ķ���
        //ͬ��
        //animal�в��д��ι���
        //���Ը���animalͨ����̬�ķ����������д����Ķ���a�����ܶ�aʹ��set��get����
        System.out.println("���ι���ʹ�õ���animal�ķ���--------------------");
        System.out.print("ʹ��animal�����eat������");
        //û��ln��sout����ǣ�sout(xx)+�����һ����䡣
        a.eat();//animal��д���eat����
        System.out.println("�̳кͽӿ�ͬʱʹ�ã������˱���-----------------");
        ccc026cat cat2 = new ccc026cat();
        cat2.eat();
        cat2.jump();
        //ͬʱʹ�õ���˼�ǣ�����̳��˸���animal��ͬʱʵ���˽ӿڣ�
        //���������и���ͽӿڵ��е�jump��eat����
        //�������д������󣬿���ֱ��ʹ�����������������˴�����
    }
}
