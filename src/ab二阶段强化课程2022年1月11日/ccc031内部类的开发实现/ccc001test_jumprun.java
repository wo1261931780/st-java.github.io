package ab���׶�ǿ���γ�2022��1��11��.ccc031�ڲ���Ŀ���ʵ��;

public class ccc001test_jumprun {
    public static void main(String[] args) {
        System.out.println("�������ִ࣬�в���");
        ccc001test_jumpint x = new ccc001test_jumpimp();
        ccc001test_jumpopt x1 = new ccc001test_jumpopt();
        x1.method(x);
        System.out.println("------------------------");
        System.out.println("�����������ڲ��������");
        x1.method(new ccc001test_jumpint() {
            @Override
            public void jump() {
                System.out.println("������������");
            }
        });
        // ��������ڲ���ֱ�������x����
        // �ô��Ǽ����˽ӿ�ʵ����Ĵ���

    }
}
