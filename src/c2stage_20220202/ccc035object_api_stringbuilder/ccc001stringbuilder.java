package c2stage_20220202.ccc035object_api_stringbuilder;


public class ccc001stringbuilder {
    public static void main(String[] args) {
        StringBuilder x=new StringBuilder();
        x.append(11);
        x.append(22);
        // Դ���������
        // @Override
        // @IntrinsicCandidate
        // public StringBuilder append(int i) {
        //     super.append(i);
        //     return this;
        // }
        // ����append���ص���һ��StringBuilder����
        // ��˶����ֱ�Ӽ�append�Ϳ��Լ���ʹ��
        // �Ӷ��γ�����ʽ���
        x.append(33);
        System.out.println(x);

    }
}
