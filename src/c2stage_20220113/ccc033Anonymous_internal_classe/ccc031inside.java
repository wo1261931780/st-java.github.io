package c2stage_20220113.ccc033Anonymous_internal_classe;

public class ccc031inside {
    public void show2() {
        System.out.println("�ڲ����е�sout");
        //�����ڲ�����Ҫ�����ڷ����У�
        new ccc032ceshi() {
            //ͬʱ��Ҫ��д�̳еķ���
            @Override
            public void show() {
                System.out.println("�ڲ����е�show����");
            }
        };
        //��Ҫ�ֺţ������������ڲ�����һ������
        //�̳��˸���/ʵ���˸ýӿڵģ�������������
        //�������һ�¡���������������������������������������������������
        //new �����ڲ���(){};���������ڲ����������ʽ
        //new �����ڲ���(){��д�ӿ�/����ķ���};

        new ccc032ceshi() {
            @Override
            public void show() {
                System.out.println("��д�����еķ���");
            }
        }.show();
        //�����������
        //����������������������������������������������������
        //new �����ڲ���(){}.show();�����ڲ���ĵ���
        //������ڣ�����x.show();

        ccc032ceshi xx = new ccc032ceshi() {
            @Override
            public void show() {
                System.out.println("");
            }
        };
        //��Ϊһ�������͹�ȥ
        xx.show();
    }
    public void show(ccc031inside x){
        System.out.println("���ݳɹ�");
        x.show2();
    }
}
