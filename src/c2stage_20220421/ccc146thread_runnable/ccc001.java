package c2stage_20220421.ccc146thread_runnable;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220421.ccc146thread_runnable
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-22-37  ������
 */
public class ccc001 {
    public static void main(String[] args) {
        Runnable x = new demo();// ���ﴴ������һ��������󣬶������̱߳���
        Thread x1 = new Thread(x);// �����̵߳�ʱ�򣬰�����Ҫ��������񣬽����̴߳���
        x1.start();// Ȼ������
        for (int i = 0; i < 5; i++) {
            System.out.println("�������߳�");
        }
        // ����Ĵ����ͻ�������̺߳����߳̽���ִ�е����
        // ԭ������ִ�У�����Ҳ����Ϊ������ռ�õ��ڴ治һ��
    }
}

class demo implements Runnable {
    // ��Ϊ��ʵ���࣬���Կ��Լ̳б����
    // ͬʱ���Զ��ʵ�֣������˵������Ĺ��ܸ���ǿ��
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("�������߳�");
        }
    }
    // �����˵�����ﲻ���ڴ����̣߳�
    // �����ڴ������Ա��߳�ʹ�õ�������
    // ֻ������������࣬��д���߳̽ӿ�
}
