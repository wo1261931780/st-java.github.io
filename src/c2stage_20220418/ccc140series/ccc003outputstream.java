package c2stage_20220418.ccc140series;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220418.ccc140series
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-22-02  ����һ
 */
public class ccc003outputstream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream x = new ObjectInputStream(new FileInputStream("src/c2stage_20220418/ccc140series/ccc002rundemo.txt"));
        ccc001object demo = (ccc001object) x.readObject();// ����javaΪ�˱���ǿ������ת������ʹ��������ǿת��Ҳ���������
        // ������Ҫ�׳��쳣
        x.close();// ��Դ�رյ��Ⱥ󣬶Է����л�û��̫���Ӱ��
        System.out.println(demo);// ccc001object{name='a1', age=11, address='null'}
        // ������뱣��·����һ�£��������ױ���
    }
}
