package abc����ѧϰ2021��10��2��.bbb029����Ȼ������Ĳ���;

import java.util.ArrayList;

public class bbb030a����ArrayList {
    public static void main(String[] args) {
        System.out.println("��ʼ����");
        ArrayList<String> x = new ArrayList<>();
        x.add("s");
        x.add("ss");
        System.out.println(x);
        System.out.println("------------------");
        x.add(0, "222");
        // ��0��λ�ò���Ԫ���Ժ�����Ԫ�ػ��Զ�˳��
        // ��һ�δ�ӡ�����Ϊ��[s, ss]
        // ����Ľ���ǣ�[222, s, ss]
        // Ҳ˵������ʹ�ᷢ���仯���������ʾҲ�ǰ��ն��ڴ��Ԫ�ؽ���չʾ

        System.out.println(x);
    }
}
