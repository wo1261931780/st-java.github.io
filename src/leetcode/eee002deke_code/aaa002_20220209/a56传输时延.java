package leetcode.eee002deke_code.aaa002_20220209;

import java.util.Scanner;


public class a56����ʱ�� {
    public static void main(String[] args) {
        /*
         Ϊ�˳�ַ���Gpu������
         ��Ҫ�����ܶ�Ľ����񽻸�GPUִ�У�
         ������һ���������飬
         ����Ԫ�ر�ʾ����1s�����������������
         ��ÿ�붼����������
         ����GPU���һ��ִ��n������
         һ��ִ�к�ʱ1s��
         �ڱ�֤Gpu�����е�����£�������Ҫ�೤ʱ��ִ����ɡ�

         ��������
           ��һ������Ϊgpu���ִ�е��������
           ȡֵ��Χ1~10000
           �ڶ�������Ϊ��������ĳ���
           ȡֵ��Χ1~10000
           ����������Ϊ��������
           ���ַ�Χ1~10000

         �������
           ִ��������������Ҫ������

         ����
           ����
            3
            5
            1 2 3 4 5
           ���
            6

            ˵����һ�����ִ��3������  ���ٺ�ʱ6s

          ����2
            ����
             4
             5
             5 4 1 1 1
            ���
             5

           ˵����һ�����ִ��4������  ���ٺ�ʱ5s
         */

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine().trim());
        int len = Integer.parseInt(in.nextLine().trim());
        String[] split = in.nextLine().split(" ");
        int[] ints = new int[len];
        for (int i = 0; i < len; i++) {
            ints[i] = Integer.parseInt(split[i]);
        }

        int time = 0;
        int more = 0;
        for (int i : ints) {
            if (i + more > n) more = i + more - n;
            else more = 0;
            time++;
        }
        while (more > 0) {
            more -= n;
            time++;
        }

        System.out.println(time);
        in.close();
    }
}
