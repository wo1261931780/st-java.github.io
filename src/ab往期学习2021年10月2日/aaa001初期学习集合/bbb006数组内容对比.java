package ab����ѧϰ2021��10��2��.aaa001����ѧϰ����;

public class bbb006�������ݶԱ� {
    public static void main(String[] args) {
        // int[] x1 = {23, 1351, 8, 3, 2165, 43, 132, 1856, 4};
        // int[] x2 = {23, 2165, 8, 13541, 43, 3, 132, 1856, 4};
        // System.out.println(x1.length);
        // System.out.println(x2.length);
        // int xx=0;
        // �������������ѭ���������Ľ���Ƚ�׼ȷ��
        // System.out.println("��ʼ�Ա�------");
        // for (int z1 = 0; z1 < x1.length; z1++) {
        //     System.out.println("ѭ��2------");
        //     for (int z2 = 0; z2 < x2.length; z2++) {
        //         if (x1[z1] == x2[z2]) {
        //             System.out.println("����������ͬ,��ͬ��Ϊ��"+x2[z2]);
        //             xx++;
        //         } else {
        //         }
        //     }
        // }
        // System.out.println("��ͬ���ݸ�����"+xx);
        // System.out.println("ѭ������--------------");
        boolean b11 = db();
        System.out.println(b11);
        System.out.println("�ָ���-------------------------");
        boolean b22 = db2();
        //�����������˳�򣬽����ʾ���鲻ͬ���Ƿ�˳��Ҳ������data��һ�֣�
        System.out.println(b22);
    }

    public static boolean db() {
        int[] x1 = {23, 1351, 8, 3, 2165, 43, 132, 1856, 4};
        int[] x2 = {23, 2165, 8, 13541, 43, 3, 132, 1856, 4};
        //        int z1 =0;
        //        int z2 =0;
        if (x1.length != x2.length) {
            System.out.println("����ͬ");
            return false;
        } else {
            /*�������û�н��з��أ���ô������Ȼ����С�
            for (int z1 = 0; z1 < x1.length; z1++) {
                System.out.println("�ڶ���ѭ��");
                for (int z2 = 0; z2 < x2.length; z2++) {
                    if (x1[z1] != x2[z2]) {
                        return false;
                    }
                }
            }*/
        }//���ֻѭ��һ�Σ���ô��ͬ�ı�񣬲�ͬ�������ǿ��������ġ�
        for (int z1 = 0; z1 < x1.length; z1++) {
            System.out.println("�ڶ���ѭ��");
            for (int z2 = 0; z2 < x2.length; z2++) {
                if (x1[z1] != x2[z2]) {
                    return false;
                }
            }
        }
        //�����falseû�з��أ��������Ȼ��return������Ҫ�ǵüӡ�
        return true;
    }

    //����ȫ������demo�����Ե���˳���Ӱ�졣
    //����ȫ������demo�����Ե���˳���Ӱ�졣
    //����ȫ������demo�����Ե���˳���Ӱ�졣
    //����ȫ������demo�����Ե���˳���Ӱ�졣
    //����ȫ������demo�����Ե���˳���Ӱ�졣
    //����ȫ������demo�����Ե���˳���Ӱ�졣
    //����ȫ������demo�����Ե���˳���Ӱ�졣
    public static boolean db2() {
        int[] x1 = {23, 16, 4};
        int[] x2 = {16, 23, 4};
        if (x1.length != x2.length) {
            System.out.println("����ͬ");
            return false;
        } else {
        }//���ֻѭ��һ�Σ���ô��ͬ�ı�񣬲�ͬ�������ǿ��������ġ�
        for (int z1 = 0; z1 < x1.length; z1++) {
            System.out.println("�ڶ���ѭ��");
            if (x1[z1] != x2[z1]) {
                return false;
            }
        }
        //�����falseû�з��أ��������Ȼ��return������Ҫ�ǵüӡ�
        return true;
    }
}
