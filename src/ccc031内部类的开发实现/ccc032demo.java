package ccc031�ڲ���Ŀ���ʵ��;

public class ccc032demo {
    public static void main(String[] args) {
        ccc033jumpoperator x = new ccc033jumpoperator();
        x.jump();
        ccc034jump x1 = new ccc035dog();
        x.method(x1);

        System.out.println("-----------------");
        x.method(new ccc034jump() {
            @Override
            public void jump() {
                System.out.println("finish");
            }//�����ڲ��࣬�����˴�����Ĺ��̣�ֱ���������ʽ�����˶���
        });
    }
}
