package c2stage_20220213.ccc056lambda���ʽ;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220213.ccc056lambda���ʽ
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-20-36  ������
 */
public class ccc002impliment {
    public static void main(String[] args) {
        ccc001demo_interface x = new ccc001demo_interface() {
            @Override
            public void show() {
                System.out.println("show");
            }
        };
        // ����Ϊ�ӿ��ڲ�ֻ��һ�����������Կ����϶������ڲ������д��ʽ��ȫ��ͬ
        // ͬʱ�������Ҳ�ܹ���java���
        ccc001demo_interface x1 = () -> {//�����ھ����β�
            System.out.println("show");
        };
        // ǰ������˵���������ڲ��౾�����һ������
        // ��ˣ�����ֱ�ӵ��������ڲ�������һ����
        run(() -> {
            System.out.println("��һ���ļ���ʽ");
        });
    }

    public static void run(ccc001demo_interface x) {
        x.show();
        System.out.println("���Ƿ���");
    }
}
