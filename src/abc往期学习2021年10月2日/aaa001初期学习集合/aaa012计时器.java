package abc����ѧϰ2021��10��2��.aaa001����ѧϰ����;

// ��ת������䡣
// public class aaa012��ʱ�� {
//     public static void main(String[] args) {
//         System.out.println("���Խ��");
//         for (int i = 1; i < 6; i++) {
//             if (i % 2 == 0) {
//                 continue;
//                 // ����ѭ�����ݣ�ֱ��ִ����һ��ѭ��
//                 // for(){
//                 // continue;
//                 // xx++;
//                 // }
//                 // ���ʱ����ֱ������xx++�����ִ��for�е��жϡ�
//                 //continue�����ִ��for�е�ѭ��
//                 //break���ѭ����һ�����
//                 //break;
//             }
//             System.out.println(i);
//         }
//     }
// }

import java.util.Scanner;

/**
 * ѭ��Ƕ�ף�2021��9��7��16:14:45
 * �Զ���ʱ��������ʱ�䣬�Զ���ʾ����ʱ
 */
public class aaa012��ʱ�� {
    public static void main(String[] args) {
        Scanner b11 = new Scanner(System.in);
        System.out.println("��������ӣ�");
        int minute = b11.nextInt();
        //int minute = 0;
        int hours = 0;
        int twenty_four = 1;
        //���û�ж���24����Դ��ֱ��д24����ô24����һ��ħ��ֵ�����ݱ�д����
        //��������Ѱ����Դ�����뽡׳
        int sixty = 61;
        if (minute > sixty) {
            System.out.println("ʱ���������������");
        } else {
            for (System.out.println("��ʼ��ʱ---------"); hours < twenty_four; minute++) {
                if (minute == 60) {
                    hours++;
                    minute = 0;
                    System.out.println("ʱ���ǣ�" + hours + "ʱ" + minute + "��");
                    System.out.println("һСʱ��ȥ��------------------");
                } else {
                    System.out.println("ʱ���ǣ�" + hours + "ʱ" + minute + "��");
                }
                //�����Ǽ��棬�����޷��Զ��������ʱ�䡣
			/*for(System.out.println("��ʼ��ʱ---------");hours < 24;hours++){
				for(minute = 0;minute < 60;minute++){
					System.out.println("ʱ���ǣ�"+hours+"ʱ"+minute+"��");
				}*/
            }
            System.out.println("ʱ�����ޣ��������");
        }
        show();
    }
    public static void show(){

        int minutes=59;
        int day=2;
        Scanner x=new Scanner(System.in);
        System.out.println("please type your article:");
        int i = x.nextInt();
        for (int hour=0;hour<day;i++){
//            System.out.println("show me the time");
            if (i>minutes){
                i=0;
                hour++;
                System.out.println(hour+":"+i);
            }else {
//                i++;
                System.out.println(hour+":"+i);
            }
        }
    }
}
