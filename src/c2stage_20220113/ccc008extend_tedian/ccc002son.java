package c2stage_20220113.ccc008extend_tedian;

public class ccc002son extends ccc001father {
    public static void main(String[] args) {
        ccc002son x = new ccc002son();
        x.run();
        x.run2();

    }

    public void run() {//��û������˵��������£����еĶ������ȵ������еķ���
        // ��ʵ����һ��ʹ����д�����ǲ���overrideҲ�������
        System.out.println("����run");
    }

    public void run2() {
        // run();
        super.run();//ͨ��super��ֱ�ӵ��ø����run����
    }
}
