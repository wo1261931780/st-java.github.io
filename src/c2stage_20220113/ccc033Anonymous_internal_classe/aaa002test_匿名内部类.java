package c2stage_20220113.ccc033Anonymous_internal_classe;

public class aaa002test_�����ڲ��� extends aaa001�ڲ��� {
    public void insm() {
        new aaa001�ڲ���() {
            @Override
            public void find() {
                // super.find();
                System.out.println("�����ڲ���");
            }
        }.find();
        // �����ڲ��࣬��������һ������
        // ��Ϊnew xx();������壬�൱����xx���½���һ������
        // �����ں�����Ҫ�����ڲ�������ʱ��ֱ����ʽ��̼���
        // ����������󣬲��ǡ��ڲ��ࡰ�Ķ���
        // ������д�ˡ��ڲ��ࡰ�ģ���Ϊ���ڲ��ࡰ�ļ̳���Ķ���
        // �����class�ļ���Ҳ˵��������������һ����
        new ccc031inside(){}.show(new ccc031inside(){});
        // �������˼�ǣ�
        // ���½���һ������Ȼ����������show����
        // ��Ϊshow������Ҫ���ݶ����������ִ���һ�������ȥ
        // ����˵�������ڲ��������Ϊһ������ֱ�Ӵ��ݹ�ȥ

    }

}
