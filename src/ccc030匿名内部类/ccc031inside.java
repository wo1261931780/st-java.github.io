package ccc030�����ڲ���;

public class ccc031inside {
    public void show2() {
        System.out.println("�ڲ����е�sout");
        new ccc032ceshi() {//�����ڲ�����Ҫ�����ڷ����У�
            //ͬʱ��Ҫ��д�̳еķ���
            @Override
            public void show() {
                System.out.println("�ڲ����е�show����");
            }
        };//��Ҫ�ֺţ������������ڲ�����һ������
        //�̳��˸���/ʵ���˸ýӿڵģ�������������
        //�������һ�¡���������������������������������������������������
        //new �����ڲ���(){};���������ڲ����������ʽ
        //new �����ڲ���(){��д�ӿ�/����ķ���};

        new ccc032ceshi() {
            @Override
            public void show() {
                System.out.println("��д�����еķ���");
            }
        }.show();//�����������
        //����������������������������������������������������
        //new �����ڲ���(){}.show();�����ڲ���ĵ���
        //������ڣ�����x.show();

        ccc032ceshi xx = new ccc032ceshi() {
            @Override
            public void show() {
                System.out.println("");
            }
        };//��Ϊһ�������͹�ȥ
        xx.show();
    }
}
