package aaa001����ѧϰ����;

public class aaa011dowhileѭ�� {
    // public static void main(String[] args) {
    // /*
    // Scanner b11 = new Scanner(System.in);
    // System.out.println("��������:");
    // int xx = b11.nextInt();
    // int count = 0;
    // int zf = 645968746;
    // while (xx < zf) {
    // 	xx *= 2;
    // 	count++;
    // }
    // System.out.println("��Ҫ�۵�"+count+"��");
    // */
    //     double xx = 9943213;
    //     //�������������ĸ߶ȣ�
    //     // һ��ֽ�۵����ٴ��ܳ������ĸ߶�
    //     int x1 = 0;
    //     do {
    //         x1++;
    //         xx = xx / 2;
    //     } while (xx > 1354);
    //     System.out.println(x1);
    // }
    //----------------------------------------------------------------------------------
    //2021��9��7��14:43:04��ѭ��һ��������
    //1.for(����){}
    //2.do{}while(����)
    //3.while(����){}
    //���ߵĲ�֮ͬ�����ڣ�
    //1.do{}while()ѭ���У�����ִ��һ��do�ڲ������Ȼ����ִ��while�е������жϡ�
    //2.forѭ����whileѭ�������ߵı���λ�ò�ͬ��
    // for���ڲ��������i��while�����涨���i
    //3.����������У�������ѭ����ֱ��ctrl+c����ǿ�ƽ���
    //��ѭ��
		/*
		for(;;) {
			System.out.println("for");
		}
		*/
        /*
        while(true) {
            System.out.println("while");
        }
        */
        /*
                do {
                System.out.println("do...while");
            }while(true);
         */
    //***********************************************************************************
    // public static void main(String[] args) {
    //     double xx = 9943213;
    //     //ʹ��forѭ��������۵������ļ���
    //     int x1 = 1;
    //     for (int x2 = 0; x1 < xx; x2++) {
    //         x1 *= 2;
    //         System.out.println("��ʱѭ������Ϊ��" + x2);
    //     }
    //     System.out.println(x1);
    // }
    // //----------------------------------------------------------------------------------
    // public static void main(String[] args) {
    //     double xx = 9943213;
    //     //ʹ��do()while{}ѭ��������۵������ļ���
    //     int x1 = 1;
    //     int x2 = 0;
    //     do {
    //         x1 *= 2;
    //         //ԭʽΪx1+=x1*2��
    //         //ʵ����ֻ��Ҫдһ�γ˷�����
    //         x2++;
    //         //��֮ͬ��������x2������һ�Σ�����Ϊ15��
    //         System.out.println("��ʱѭ������Ϊ��" + x2);
    //         System.out.println(x1);
    //     } while (x1 < xx);
    // }
    //----------------------------------------------------------------------------------
    public static void main(String[] args) {
        double xx = 9943213;
        //ʹ��do()while{}ѭ��������۵������ļ���
        int x1 = 1;
        int x2 = 0;
        while (x1 < xx) {
            x1 *= 2;
            x2++;
            System.out.println(x1);
            System.out.println("��ʱѭ������Ϊ��" + x2);
        }
    }
}
