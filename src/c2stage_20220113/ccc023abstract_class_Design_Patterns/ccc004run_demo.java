package c2stage_20220113.ccc023abstract_class_Design_Patterns;

public class ccc004run_demo {
    public static void main(String[] args) {
        // ccc002bank_huoqi x=new ccc002bank_huoqi();
        // x.caculate_rates();
        // ������˺Ż����������д���������ʹ�õ�get��set�����ڸ���
        // ��ô����Ҫ��������ʹ��super�ȷ����������вι������
        ccc002bank_huoqi x=new ccc002bank_huoqi("111",100000);
        x.caculate_rates();
        x.login("111","100000");
        ccc003bank_dingqi x1=new ccc003bank_dingqi("222",100000);
        x1.caculate_rates();
    }
}
