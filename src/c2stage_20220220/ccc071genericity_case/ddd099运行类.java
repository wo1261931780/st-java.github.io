package c2stage_20220220.ccc071genericity_case;

public class ddd099������ {
    public static void main(String[] args) {
        ddd097ѧ���� x1 = new ddd097ѧ����();
        x1.setName("a1");
        ddd098��ʦ�� x2 = new ddd098��ʦ��();
        x2.setAge(11);
        System.out.println(x1.getName() + "--" + x2.getAge());
        // ���������ַ�������ָ���������ͣ����򱨴�
        ddd100���Ͳ���<String> xx = new ddd100���Ͳ���<>();
        // ����ָ�������Ժ���set�����У����Զ���������
        // ���͵ĺô����ڣ�����ָ����Ҫ���ͺ��ٽ��д���
        // ����̶����͵����ݷ�������
        // ���������ָ�����ͣ�Ҳ�����Ǵ��������ʱ�������
        // ������ָ��string�࣬��ô����set/get����string��
        xx.setT("a");
        System.out.println(xx.getT());
        ddd100���Ͳ���<Integer> xx1 = new ddd100���Ͳ���<>();
        xx1.setT(11);
        System.out.println(xx1.getT());
        System.out.println("����--------------------");
    }
}
