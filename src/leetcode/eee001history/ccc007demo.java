package leetcode.eee001history;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-23-47  ������
 */
public class ccc007demo {

    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        String x1=x.nextLine();
        String x2=x.nextLine();
        int j=0;
        String demo1=x1.toUpperCase();// Converts all of the characters in this String to upper case using the rules of the default locale. This method is equivalent to toUpperCase(Locale.getDefault()).
        // �����е�char�ַ�ת��Ϊ��д��String����
        String demo2=x2.toUpperCase();
        for(int i=0;i<demo1.length();i++){
            String x3=String.valueOf(demo1.charAt(i));
            if(x3.equals(demo2)){
                j++;
            }
        }
        System.out.println(j);
    }
}
