package c2stage_20220202.ccc034object_api;

public class ccc003object_equals {
    // 2022��1��31��20:27:35�������ȥ��
// 2022��2��1��09:16:14����ʼ��һ��push
// 2022��2��2��10:00:32����ʼ�Ͽ�
    public static void main(String[] args) {
        show();
    }

    public static void show(){
        ccc001object x = new ccc001object(11, "aaa");
        ccc001object x1 = new ccc001object(11, "aaa");
        //�������������������˵��������ͬ������ζ�Ŷ�����ͬһ��
        // ����ֱ��ʹ��equalsֻ�ܱȽϵ�ַ�Ƿ�һ��

        System.out.println(x.equals(x1));//���Ϊfalse
        System.out.println(x==x1);//���Ϊfalse
        //�����Ҫ�Ƚ����ݣ���Ҫ�ڶ������У����з�������д
        // �������дλ�ã�����show�����У����Ǵ������������
    }


}
