package c2stage_20220220.ccc075genericity_tp;

import java.util.ArrayList;
import java.util.List;

/**
 * ����ͨ�����<?>
 * List<?>����ʾԪ������δ֪��List������Ԫ�ؿ���ƥ���κε�����
 * ���ִ�ͨ�����List����ʾ���Ǹ��ַ���List�ĸ��࣬�����ܰ�Ԫ����ӵ�����
 * ------------------------------------------------------------
 * ����ͨ������ޣ�<? extends ����>
 * List<? extends Number>������ʾ��������Number������������
 * ���
 * extends number��ʾ����ֻ����number��number������
 * ------------------------------------------------------------
 * ����ͨ������ޣ�<? super ����>
 * List<? super Number>������ʾ��������Number�����丸����
 * ����һ�°ɣ�
 * super number��ʾ����ֻ����number��number�ĸ��࣬
 * �൱��������һ�����ݵ�����
 */
public class eee008����ͨ��������޺����� {
    public static void main(String[] args) {
        List<?> x = new ArrayList<>();
        List<? extends Number> x1 = new ArrayList<Integer>();
        // x1.add(1);
        List<? super Number> x2 = new ArrayList<>();
        // x2.add("aa");

    }

}
