package c2stage_20220410.ccc117creat;

import java.io.File;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220408.ccc117
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-21-59  ������
 */
public class ccc001 {
    public static void main(String[] args) {
        File x = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220410\\demo");
        // ����Ҫ����һ�������ڵ�Ŀ¼
        x.mkdir();//Ĭ��ֻ�ܴ���һ��Ŀ¼
        // ��������Ŀ¼�Ƕ༶�ģ�ֱ�ӷ���false
        // Ҫ�����༶Ŀ¼������mkdirs
        x.mkdirs();
    }
}
