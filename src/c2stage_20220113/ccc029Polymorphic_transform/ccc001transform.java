package c2stage_20220113.ccc029Polymorphic_transform;

public class ccc001transform {
    public static void main(String[] args) {
        ccc018animal x = new ccc019cat();//��̬�ķ�ʽ�������󣬶������cat�еķ���
        x.run();
        if (x instanceof ccc021dog) {//�ж϶��������ָ�򣬵����ǲ���dog��
            //�����dog�࣬��ô��ֱ��Ϊtrue������ִ���ڲ��ķ���
            ccc021dog xx = (ccc021dog) x;//��Ϊx��animal�еĵ�ַ���������ǿת�����dog��ĵ�ַ
            // ��ǿת��ĵ�ַ��ֵ��dog����¶���xx
            xx.run();// Ȼ�����dog���еķ���
        } else if (x instanceof ccc019cat) {//�����cat��ĵ�ַ����ô����ִ��
            ccc019cat xx = (ccc019cat) x;// ͬ����ǿת��ַ����animal��cat���͵�ַ����ֵ�¶���xx
            xx.run();
            xx.coach();// ��ֵ���൱���¶���xx��cat�࣬��˿���ֱ�ӵ�������cat�е����з���

            // �����ִ�����̣����仰˵�����ͨ����̬�ķ�ʽ�����Ķ�����Ҫ�����������з���
            // ��ô����ִ��һ��ǿ��ת��
            // ��ǿ��ת����Ҳ�൱���½���һ��cat���͵Ķ���������¶����������ķ���
        }
        // ���漸��֪ʶ�㣺
// �ж����
// ǿ��ת����ԭ��
// ǿ��ת���Ĺ���

    }
}
