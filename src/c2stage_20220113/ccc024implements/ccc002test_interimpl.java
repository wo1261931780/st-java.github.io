package c2stage_20220113.ccc024implements;

public class ccc002test_interimpl implements ccc001test_inter {
    int age = 11;
    // ������ڱ������ظ������⣬��̬�����Ķ���Ҳ�������ʵ�����еı���

    @Override
    public void demorun() {
        System.out.println("��ִ����demorun��д����");
        System.out.println(ccc001test_inter.age);
    }
}
