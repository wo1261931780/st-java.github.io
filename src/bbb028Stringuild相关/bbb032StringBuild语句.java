package bbb028Stringuild���;

public class bbb032StringBuild��� {
    public static void main(String[] args) {
        StringBuilder aa1 = new StringBuilder();
        //newҲ����ͨ����׺���Զ�����ǰ׺
        StringBuilder b11 = new StringBuilder("123");
        System.out.println(b11);
        //123
        StringBuilder xx=b11.append(555);
        StringBuilder x1=b11.append(2.5);
        //�����123555���൱����b11����ֱ�ӽ�����555
        //���������ַ�����Ҫ����˫���ţ���������ֱ�Ӹ����
        System.out.println(xx);
        //1235552.5
        if(b11==xx){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        //xx����˼�ǣ���b11�ĺ������555��Ȼ��ֵ��xx.
        //����b11��xx��ͬһ��������Ϊb11�Ѿ���չ��555��
        b11.append(66666);
        //Ҳ˵������Ҫ��ǰ׺��,���ҽ����ֱ�Ӹ��ں���
        b11.append(111).append(222).append(333);
        //��ʽ���
        System.out.println(b11);
        //1235552.566666111222333
        if(b11==xx){
            System.out.println(true);
            System.out.println(xx);
            //1235552.566666111222333
        }else {
            System.out.println(false);
        }
        //����b11��xxһ��ı�
        b11.reverse();
        //333222111666665.2555321
        //ֱ�ӽ����ַ�����ת��ǰ��Ҫ��b11��string����
        System.out.println(b11);
    }
}
