package c2stage_20220403.ccc108exception_handle;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220403.ccc108exception_handle
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-13-12  ����һ
 */
public class ccc001 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("������۸�");
                int demo = x.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
