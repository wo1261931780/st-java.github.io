package leetcode.eee002deke_code.aaa005_20220308;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa004_20220305
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-17-32  ���ڶ�
 */
public class ccc001 {
    public static void main(String[] args) {
        int[] x=new int[6];
        int[] x1={1,1,1,2,1,3,1,4};
        System.arraycopy(x1,2,x,3,2);
        //----------Ŀ�����飬��ʼλ��ճ����x���飬ճ������3�����Ƴ���2
        System.out.println(Arrays.toString(x));//ע��������s����Arrays
        // x�����[0, 0, 0, 1, 2, 0]
    }
}
