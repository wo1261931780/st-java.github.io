package ccc029�ڲ���;

public class ccc030outter {
    private int age = 10;

    public class innn {//�ڲ���
        //�ڲ���ĺ����ǣ�����м䣬�ٴ���һ���࣬
//����ڲ������������ֱ��ʹ����ԭ���Ĳ����ͷ���
        public void show() {//�ڲ������ֱ�ӷ����ⲿ��age��Ա
            System.out.println(age);
        }
    }

    public void see() {//�ⲿ�ķ���������ͬ�����У������ڲ��ķ����������ȴ�������
        innn x = new innn();
        x.show();
    }
}
