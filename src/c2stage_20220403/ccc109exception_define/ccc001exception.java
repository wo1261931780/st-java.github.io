package c2stage_20220403.ccc109exception_define;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220403.ccc109exception_define
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-13-37  ����һ
 */

/**
 * Ŀ��:�Զ����쳣(�˽�)
 * <p>
 * ����:Java�Ѿ�Ϊ�����п��ܳ��ֵ��쳣�������һ����������.
 * ����ʵ�ʿ�����,�쳣���������������,Java�޷�Ϊ
 * ������������е��쳣������һ�������ࡣ
 * ����һ����ҵ�����Ϊ�Լ���Ϊ��ĳ��ҵ�����ⶨ���һ���쳣
 * ����Ҫ�Լ����Զ����쳣��.
 * <p>
 * ������Ϊ����С��0�꣬����200�����һ���쳣��
 * <p>
 * �Զ����쳣:
 * �Զ������ʱ�쳣.
 * a.����һ���쳣��̳�Exception.
 * b.��д��������
 * c.�ڳ����쳣�ĵط���throw new �Զ�������׳�!
 * ����ʱ�쳣�Ǳ���׶ξͱ������Ѹ���ǿ�ң�һ����Ҫ������
 * <p>
 * �Զ�������ʱ�쳣.
 * a.����һ���쳣��̳�RuntimeException.
 * b.��д��������
 * c.�ڳ����쳣�ĵط���throw new �Զ�������׳�!
 * ���Ѳ�ǿ�ң�����׶β�����������ʱ�ſ��ܳ��֣���
 */
public class ccc001exception extends Exception {//����ʱ�쳣

    public ccc001exception() {
    }

    public ccc001exception(String message) {
        super(message);
    }
    // ���е��Զ����쳣������Ҫ�����쳣��
    // ���Ҽ̳�Exception��
    // Ȼ�����׳������ʱ�򣬲��ܽ����Ѷ����쳣�ĵ���
}
