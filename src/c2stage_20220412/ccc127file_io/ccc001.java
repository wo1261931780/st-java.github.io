package c2stage_20220412.ccc127file_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220412.ccc127file_io
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-23-12  ���ڶ�
 */
public class ccc001 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream x = new FileInputStream("src/c2stage_20220412/ccc127file_io/demo.txt");
        // �����Ǽ�д��������ֱ��д·�����ڲ����Ǹ��ݽ�����½���һ��file��
        // ��һ��Դ�룺
        //     public FileInputStream(String name) throws FileNotFoundException {
        //         this(name != null ? new File(name) : null);
        //     }
    }
}
