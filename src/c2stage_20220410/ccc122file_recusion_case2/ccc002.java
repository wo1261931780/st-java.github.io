package c2stage_20220410.ccc122file_recusion_case2;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220410.ccc122file_recusion_case2
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-21-08  ������
 */
public class ccc002 {
    public static void main(String[] args) {
        int num = 0;
        System.out.println(show(1));
    }

    public static int show(int x) {
        // x++;
        if (x == 10) {
            return 1;
        } else {
            return 2 * show(x + 1) + 2;
        }
        // �ݹ鲻��Ҫ�������ݵı仯���ڵݹ�����У���������ᷢ���ı�
        // 2022��4��10��21:44:01������û�����׵ݹ顣ԭ�����������
        // ��ô˵�ɣ���ֻ��Ҫ�ж��սڵ�������Ƕ���
        // ��������ݣ�ֱ�Ӱ��չ�ʽ����Ϳ���
        // �����ҵ�һ������ݣ��ǵڶ��������2��+2
        // ��ô����return��ʱ��ֱ��2*f(x)+2�Ϳ���
        // ֻҪ��ʽ���ڣ�x���ߵ��ս�㣬��ô��û����
    }
}
