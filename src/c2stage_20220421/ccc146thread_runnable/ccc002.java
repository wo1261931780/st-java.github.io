package c2stage_20220421.ccc146thread_runnable;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220421.ccc146thread_runnable
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-22-54  ������
 */
public class ccc002 {
    public static void main(String[] args) {
        // Runnable x = new Runnable() {
        //     @Override
        //     public void run() {
        //         System.out.println("���������ڲ���");
        //     }
        // };
        // Thread x1=new Thread(x);
        // �����ϣ������ڲ������һ������
        // ����ʵ���๹����̣߳�Ҳֻ����Ҫһ��Ŀ��������
        // ��ˣ���ֱ�ӽ�Ŀ�����ŵ��߳��У��Ϳ�����ɹ������
        // ����ķ�����̫�鷳------------------------------
        Thread x1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("���������ڲ���");
            }
        });
        x1.start();
    }
}
