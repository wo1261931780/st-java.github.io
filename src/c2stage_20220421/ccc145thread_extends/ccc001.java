package c2stage_20220421.ccc145thread_extends;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220421
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-13-10  ������
 */
public class ccc001 {
    public static void main(String[] args) {
        // demo x = new demo();
        Thread x = new demo();// �������Ǵ������̶߳���ͨ����̬�ķ�ʽ
        System.out.println("�߳̿�ʼִ��");
        x.start();
        // �������ŵ����棬Ҳ�������߳���ִ�����
        for (int i = 0; i < 5; i++) {
            System.out.println("�������߳�----------------");
        }
        // demo x = new demo();
        // System.out.println("�߳̿�ʼִ��");
        // x.start();
        // �������µĴ���˳�������߳�Ҳ�ͻᰴ�մ��ϵ��µ�ִ��˳�����
        x.run();
        // ���ֱ�ӵ���run��������ô���ǵ�����ͨ������û��ʹ�õ��̵߳�����
        // start��run��ʵ����ִ����run������ֻ�����ߵ�·����һ��


    }
}

class demo extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("�������߳�");
        }
    }
}
