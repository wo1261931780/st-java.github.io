package c2stage_20220213.ccc051������ʽ;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220213.ccc051������ʽ
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-16-54  ������
 */
public class ccc004�ַ����ָ� {
    public static void main(String[] args) {
        String x = "���ѬB111���ѬBasd���ѬBadasdasd111asdadas1a1sda32";
        String[] demo = x.split("\\w+");
        for (int i = 0; i < demo.length; i++) {
            System.out.println(demo[i]);
        }
        String show_str = x.replaceAll("\\w+", " ");
        System.out.println(show_str);

    }
}
