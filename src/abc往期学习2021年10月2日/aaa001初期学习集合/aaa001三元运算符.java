package abc����ѧϰ2021��10��2��.aaa001����ѧϰ����;

public class aaa001��Ԫ����� {
    public static void main(String[] args) {
        //ceshi
        int tiger1 = 100;
        int tiger2 = 200;
        //        �����Ƿ����
        boolean zl = tiger1 == tiger2 ? true : false;
        //��Ԫ������ĺ��壺
        //int weight                  = t1==t2       ?    true:false;
        //����int���͵�weight,��������ұ�=�ж�t1�Ƿ����t2���ǣ������true�����������
        System.out.println(zl);
        //1�űȽ���
        //boolean max = tiger1 > tiger2 ? true : false;
        //������
        //System.out.println("shifouxiangdeng:"+zl);
        //System.out.println("1hao:"+max);
        System.out.println("-------------");
        int h1 = 984231;
        int h2 = 49842613;
        int h3 = 9846231;
        int taller = h1 > h2 ? h1 : h2;
        int tallst = taller > h3 ? taller : h3;
        // �ʺ��ұߣ�������true/false��Ҳ����������������ʽ
        System.out.println("max:" + tallst);
    }
}
