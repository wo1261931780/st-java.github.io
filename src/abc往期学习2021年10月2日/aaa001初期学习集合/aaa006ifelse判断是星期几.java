package abc����ѧϰ2021��10��2��.aaa001����ѧϰ����;

import java.util.Scanner;

public class aaa006ifelse�ж������ڼ� {
    public static void main(String[] args) {
		/*System.out.println("����ʱ�䣺");
		Scanner b11 = new Scanner(System.in);
		int x1 = b11.nextInt();
		if (x1 == 1){
			System.out.println("ʱ���ǣ�����һ");
			}else if (x1 == 2){
			System.out.println("ʱ���ǣ����ڶ�");
			}else if (x1 == 3){
			System.out.println("ʱ���ǣ�������");
			}else if (x1 == 4){
			System.out.println("ʱ���ǣ�������");
			}else if (x1 == 5){
			System.out.println("ʱ���ǣ�������");
			}else if (x1 == 6){
			System.out.println("ʱ���ǣ�������");
			}else if (x1 == 7){
			System.out.println("ʱ���ǣ�������");
			}
		else{
			System.out.println("ʱ�����");
		}*/
        System.out.println("С������ĩ�ɼ���");
        Scanner b11 = new Scanner(System.in);
        int x1 = b11.nextInt();

        if (0 <= x1 && x1 <= 60) {
            System.out.println("С����������");
        } else if (60 < x1 && x1 <= 75) {
            System.out.println("С����������");
        } else if (75 < x1 && x1 < 90) {
            System.out.println("���Խ���ƨ�ɿ���");
        } else if (90 < x1 && x1 <= 100) {
            System.out.println("���Խ���ȥŷ������");
        } else {
            System.out.println("��������");
        }
        //���ݲ��ԣ���ȷ���ݣ��߽����ݣ���������

		/*if (0 <= x1 <= 60){
			System.out.println("С����������");
		}else if (60 < x1 <= 75){
			System.out.println("С����������");
		}else if (75 < x1 <= 90){
			System.out.println("���Խ���ƨ�ɿ���");
		}else if (90 < x1 <= 100){
			System.out.println("���Խ���ȥŷ������");
		}else
			System.out.println("��������");*/
    }
}
