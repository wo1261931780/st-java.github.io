package ab����ѧϰ2021��10��2��.aaa000helloworld;

public class aaa004demo {
    public static void main(String[] args) {
        // ��ֵ�����
        int b = 10;
        //�����+=�Ѿ�����������ת������
        b += 10;
        System.out.println("b������Ϊ��" + b);

        //�����Լ���i++��i--��
        //i++��++i��������ȫһ�¡�
        //��Ҫע�����--------------------------------
        int x = 1;
        //����ִ�е������ǣ��Ȱ�x=1��ֵ��x1��Ȼ���x����++������
        int x1 = x++;
        //����x=2��x1=1
        //���Ϊ1
        System.out.println(x1);
        //���Ϊ2
        System.out.println(x);
        System.out.println("--------------------------------------");
        int x2 = ++x;
        //������Ϊ3,��Ϊx��ֵ��2�����ȼӺͣ�x=3��
        System.out.println(x2);
        //Ȼ��x=3����ֵ��x2������x2=3

        // 2021��12��15��18:17:00������ѧϰ
        System.out.println("-----------��չ�����������˽�Ͳο���--------------");
        int k = 3;
        int p = 5;
        // k  3 4 5 4
        // p  5 4 3 4
        // rs    3  +  5  -   4  + 4   - 5   +  4 + 2
        int rs = k++ + ++k - --p + p-- - k-- + ++p + 2;
        // ��������У�x++���Ͱ���x�ĳ������ݷ�����̣�����ͷ���x�����Ժ������
        System.out.println(k); // 4
        System.out.println(p); // 4
        System.out.println(rs); // 9
    }
}
