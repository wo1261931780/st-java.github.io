package ccc010è�͹�;

public class ccc002testcat extends ccc001testanimal {
    public ccc002testcat() {
        ccc001testanimal x1 = new ccc001testanimal(11, "aa");
        // ������Ȼ���޲ι��죬���ǵ����˸���Ĵ��ι��췽��
        // ��ʵ�������Ҳ���ԣ�

    }

    public ccc002testcat(int age, String name) {

    }

    @Override
    public void eatsm() {
        System.out.println("����è���㣬��дeat����");
    }
}
