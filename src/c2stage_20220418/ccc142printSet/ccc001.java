package c2stage_20220418.ccc142printSet;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220418.ccc142printSet
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-21-20  ���ڶ�
 */
public class ccc001 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("ceshi ");// �������򵥵������
        PrintStream x = new PrintStream("src/c2stage_20220418/ccc142printSet/ccc001.txt");
        System.setOut(x);// �����ض��򣬽���ӡ����λ��������ļ���
        System.out.println("2022��4��19��21:25:07");
        System.out.println("����");

    }
}
