package ab����ѧϰ2021��10��2��.aaa001����ѧϰ����;

/**
 * �����ҳ�101-200֮������������
 * ������ʲô���������1�����������⣬���ܱ������������������ͽ�������
 */
public class aaa027������ {
    public static void main(String[] args) {
        show();
        System.out.println("end");

    }

    public static void show() {
        // int x=100;
        for (int i = 101, x = 0; i < 200; i += 2) {
            // if (i % 3 == 0 || i % 7 == 0 || i % 5 == 0) {
            // } else {
            //     System.out.println(i);
            //     // x++;
            //     System.out.println(++x);
            // }
            // ������ж��Ƿ���357�ı�����ͬʱ�Ѿ��ų�������ż�����ݣ����Ϊ25��
            //�ź�λ������ʶ��״̬�Ƿ����ı�

            boolean a = true;
            for (int j = 3; j < i / 2; j++) {
                if (i % j == 0) {
                    //�������������˵���������������Բ�����չʾ
                    a = false;
                    break;
                }
            }
            if (a == true) {
                System.out.println(i);
                System.out.println(++x);
            }

        }
    }


}
