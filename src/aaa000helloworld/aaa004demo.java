package aaa000helloworld;

public class aaa004demo {
    public static void main(String[] args) {
//        ��ֵ�����
        int b = 10;
        //�����+=�Ѿ�����������ת������
        b += 10;
        System.out.println("b������Ϊ��" + b);


        //�����Լ���i++��i--��
        //i++��++i��������ȫһ�¡�
        //��Ҫע�����--------------------------------
        int x = 1;
        int x1 = x++;//����ִ�е������ǣ��Ȱ�x=1��ֵ��x1��Ȼ���x����++������
        //����x=2��x1=1
        System.out.println(x1);//���Ϊ1
        System.out.println(x);//���Ϊ2
        System.out.println("--------------------------------------");
        int x2 = ++x;
        System.out.println(x2);//������Ϊ3,��Ϊx��ֵ��2�����ȼӺͣ�x=3��
        //Ȼ��x=3����ֵ��x2������x2=3

    }
}
