package c2stage_20220213.ccc056lambda���ʽ;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220213.ccc056lambda���ʽ
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-22-28  ������
 */
public class ccc003lambda�� {
    public static void main(String[] args) {
        ccc001demo_interface x = new ccc001demo_interface() {
            @Override
            public void show() {
                System.out.println("��1");
            }
        };
        show(x);
        // ******************************************
        ccc001demo_interface x1 = () -> {
            System.out.println("��2");
        };
        show(x1);
        // ******************************************
        ccc001demo_interface x2 = () -> System.out.println("��3");
        show(x2);

        // ******************************************
        // ccc001demo_interface x3 = () -> System.out.println("��4");
        show(() -> System.out.println("��4"));

    }

    public static void show(ccc001demo_interface x) {
        x.show();
        System.out.println("����");
    }
}
