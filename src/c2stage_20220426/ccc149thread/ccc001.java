package c2stage_20220426.ccc149thread;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220426
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-21-22  ���ڶ�
 */
public class ccc001 {
    public static void main(String[] args) {
        ccc002 x = new ccc002();
        Thread demo = new Thread(x);
        demo.start();
        System.out.println("------------------------------------");
        // Thread x1 = new Thread(new ccc002());
        // new Thread(new ccc002()).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("�����߳�2");
            }
        }).start();
        System.out.println("------------------------------------");
        new Thread(() -> System.out.println("�����߳�3")).start();
        System.out.println("------------------------------------");
    }


}

class ccc002 implements Runnable {
    @Override
    public void run() {
        // ��Ҫԭ����run����Ϊvoid��û�з���ֵ�����Բ����õ����
        // ����˵��ֻ��ִ�еĹ���
        System.out.println("����ʵ����");
    }
}
