package bbb028Stringuild���;
// 2021��9��18��14:38:56
// ʹ��stringbuilder����������ڣ�
// ÿ��ʹ��string�����ַ�����������Ϊ���ַ���������һ���µ��ڴ��ַ
// ���������ڴ�ռ�ù���
// stringbuilder�������Ϊһ���ɱ�����


public class bbb032StringBuild��� {
    public static void main(String[] args) {
        // 2021��9��18��14:42:35��
        // ����һ�����ֹ��췽����һ�ִ�������һ�ֲ�������
        StringBuilder a1 = new StringBuilder();
        //newҲ����ͨ����׺���Զ�����ǰ׺
        StringBuilder demostring = new StringBuilder("111");
        //demostring�Ľ��Ϊ111
        System.out.println("demostring���ַ�Ϊ��" + demostring);
        System.out.println("-------------------------------------------");

        StringBuilder x0 = demostring.append(222);
        StringBuilder x1 = demostring.append(333);
        System.out.println("x0�Ľ��Ϊ��" + x0);
        // x0����˼�ǣ���demostring�ĺ������222��Ȼ��ֵ��x0
        // ���x0��ʵ���ϻ�����Ѿ����ӳ��ȵ�demostring
        // ͬʱ�������ǰ�demostring��ֵ��x0�����Զ��ߵ�ַ��ͬ��
        // �����111222333
        System.out.println("-------------------------------------------");

        if (demostring == x0) {
            // ���Ϊtrue
            System.out.println(true);
            System.out.println("demostring��x0��ȫ��ͬ");
        } else {
            System.out.println(false);
            System.out.println("����ͬ");
        }
        System.out.println("-------------------------------------------");


        //���������ַ�����Ҫ����˫���ţ���������ֱ�Ӹ����
        demostring.append("iii");
        //��ʽ��̣�Ҳ˵������Ҫ��ǰ׺��,���ҽ����ֱ�Ӹ��ں���
        demostring.append(555).append(666).append(777);
        //���Ϊ111222333iii555666777
        System.out.println("demostring���ַ�Ϊ��" + demostring);
        System.out.println("-------------------------------------------");

        if (demostring == x0) {
            System.out.println(true);
            System.out.println("����x0������Ϊ��" + x0);
            // �����111222333iii555666777
        } else {
            System.out.println(false);
        }
        System.out.println("-------------------------------------------");
        //����demostring��xxһ��ı�
        demostring.reverse();
        //ֱ�ӽ����ַ�����ת��ǰ��Ҫ��demostring��string����
        //��ת�ַ����Ժ�demostringչʾ��777666555iii333222111
        System.out.println("demostring���ַ�Ϊ��" + demostring);
    }
}
