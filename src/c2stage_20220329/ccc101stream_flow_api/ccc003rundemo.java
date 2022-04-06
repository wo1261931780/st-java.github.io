package c2stage_20220329.ccc101stream_flow_api;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220329.ccc003stream_flow_api
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-20-47  ������
 */

/**
 * Ŀ�꣺Stream���ĳ���API
 * forEach : ��һ����(����)
 * count��ͳ�Ƹ���
 * -- long count();
 * filter : ����Ԫ��
 * -- Stream<T> filter(Predicate<? super T> predicate)
 * limit : ȡǰ����Ԫ��
 * skip : ����ǰ����
 * map : �ӹ�����
 * concat : �ϲ�����
 */
public class ccc003rundemo {
    public static void main(String[] args) {
        List<String> x = new ArrayList<>();
        x.stream().map(s -> new ccc002object(s)).forEach(System.out::println);
        // ����Ĵ�����ǣ�����ʹ��һ��map���������ڲ��Ķ���ӹ�
        // �ӹ��Ժ󽫻�õĶ����װΪobject���еĶ���
        // Ȼ��Խ�����б�������
        x.stream().map(ccc002object::new).forEach(System.out::println);
        // ������Ǽ�д�������Ƚ���һ�����������ã�Ȼ�����һ����������
        // ���õ���������˫����
    }
}
