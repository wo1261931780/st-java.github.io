package aaa001����ѧϰ����;
/*��ת������䡣
public class b11{
	public static void main(String[] args){
		System.out.println("���Խ��");
		for(int i = 1;i < 6;i++){
			if(i %2 == 0){
				continue;
				//break;
			}System.out.println(i);
		}
	}
}*/

import java.util.Scanner;

//�Զ���ʱ��������ʱ�䣬�Զ���ʾ����ʱ
public class aaa012��ʱ�� {
    public static void main(String[] args) {
        Scanner b11 = new Scanner(System.in);
        System.out.println("������ʱ�䣺");
        int minute = b11.nextInt();
        //int minute = 0;
        int hours = 0;
        if (minute > 61) {
            System.out.println("ʱ���������������");
        } else {
            for (System.out.println("��ʼ��ʱ---------"); hours < 24; minute++) {
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
    }
}
