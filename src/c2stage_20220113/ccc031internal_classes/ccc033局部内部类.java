package c2stage_20220113.ccc031internal_classes;

public class ccc033�ֲ��ڲ��� {
    private int xx = 10;

    public void eat() {

        //�����е��࣬�ֲ��ڲ���
        class some {
            // ��Ա�ڲ��������м��з�����
            // �ֲ��ڲ����Ƿ����м����࣬���л����Լ�����������

            // ��Ϊ�ֲ��ڲ�������ڷ����У����Ե��ø����ķ���Ҳ��Ҫ�����¶���
            public void show() {
                System.out.println("show inside stuff");
            }
        }
        some ss = new some();
        // �������еķ��������������д�������
        // ����������Ĳ�������λ�ڷ����ڲ����������
        ss.show();
    }
}
