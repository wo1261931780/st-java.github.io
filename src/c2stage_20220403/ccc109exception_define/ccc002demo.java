package c2stage_20220403.ccc109exception_define;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220403.ccc109exception_define
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-13-38  ����һ
 */
public class ccc002demo {
    public static void main(String[] args) {
        try {
            show(-55);
        } catch (ccc001exception e) {
            e.printStackTrace();
        }
        //trycatch���ƺ���ӵ�����ǩ�����������ѡ��һ���Ϳ���
    }

    public static void show(int age) throws ccc001exception {
        if (age < 0 || age > 200) {
            // throw��throws�Ĳ��
            // throw���쳣�������½�һ���쳣������throw����
            // throws�Ƿ��������е��쳣
            throw new ccc001exception(age + "illegal");
            //��Ϊ�Ǳ���ʱ�쳣��ֻҪд�����ͻᱨ��
        }
    }
}
