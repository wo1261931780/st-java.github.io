package ab����ѧϰ2021��10��2��.aaa001����ѧϰ����;

public class bbb008��ת {
    public static void main(String[] args) {
        /*int[] xx={1,2,3,4,5};
        int[] x1=new int[5];
        int z=x1.length;
        for (int x=0;x<xx.length;x++){
            x1[z]=xx[x];
            z--;
        }
        System.out.println(x1[0]+","+x1[1]+","+x1[2]+","+x1[3]+","+x1[4]);*/
        //�������Լ�д�ġ������Ǳ��
        int[] xx = {11, 22, 33, 44, 55};
        //�м�ֵ����������x2λ�õ����ݣ�Ȼ��ֵ��x3λ��
        int x1 = 0;
        for (int x2 = 0, x3 = xx.length - 1; x2 <= x3; x2++, x3--) {
            //����x1����0�ŵ�11
            x1 = xx[x2];
            //Ȼ��x2��0��11���ı�Ϊx3��4��55
            xx[x2] = xx[x3];
            //��ʱx3��4��55�����x1��11
            xx[x3] = x1;
            //��һ�ֽ�����������{55��22��33��44��11}
            //---------------------------------------
            // �ڶ��֣�x2���1�ţ�x3���3��
            //x1����x2��1��22��
            //x2����x3��44��
            //x3����x1��22
            //�ڶ��ֽ�����������{55��44��33��22��11}
            //---------------------------------------
            //�����ֿ�ʼ��x2��x3������ȣ�
            //����Ϊ�˴�����ż�������ֵ����飬���뱣���Ⱥ�=
        }
        // System.out.print(xx[0]+","+xx[1]+","+xx[2]+","+xx[3]+","+xx[4]);
        // ���ÿ���ֱ�������xx������Ҫ����
        bl(xx);
    }

    public static void bl(int[] xx) {
        System.out.print("[");
        for (int ss = 0; ss < xx.length; ss++) {
            if (ss < xx.length - 1) {
                System.out.print(xx[ss] + ",");
            } else {
                System.out.print(xx[ss]);
            }
        }
        System.out.print("]");
        //�������ͣ��β�ֱ��Ӱ��ʵ��
    }
}
