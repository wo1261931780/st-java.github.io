package c2stage_20220329.ccc003stream_flow_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220329.ccc003stream_flow_api
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-20-59  ������
 */
public class ccc004stream�ϲ� {
    public static void main(String[] args) {
        List<String> x = new ArrayList<>();
        x.add("1");
        x.add("1");
        x.add("1");
        Stream<String> demo1 = x.stream().skip(2);
        Stream<String> demo2 = x.stream().limit(3);
        // �ϲ���ǰ���Ƕ��ߵ�����һ��
        Stream<String> demo3 = Stream.concat(demo1, demo2);
        // �����һ�£�����Ҫָ��stream��������Ϊobject
        demo1.distinct();// ȥ���ظ��ķ���
        // ��Ϊdemo1�������stream�����ͣ���������ֱ�ӵ���stream����api����
        
    }
}
