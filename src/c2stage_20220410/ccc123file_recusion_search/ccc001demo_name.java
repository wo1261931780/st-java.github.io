package c2stage_20220410.ccc123file_recusion_search;

import java.io.File;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220410.ccc123file_recusion_search
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-21-50  ������
 */
public class ccc001demo_name {
    public static void main(String[] args) {
        show(new File("e:/"), "nginx.conf");
    }

    private static void show(File f1, String f2) {
        if (f1.isDirectory() && f1 != null) {
            File[] f1_list = f1.listFiles();
            if (f1_list != null) {
                for (File file : f1_list) {
                    if (file.isFile()) {
                        if (file.getName().contains(f2)) {
                            System.out.println("�ҵ���");
                            System.out.println(file.getAbsolutePath());
                            // Runtime xx = Runtime.getRuntime();
                            // try {
                            //     xx.exec(file.getAbsolutePath());
                            //     // ������������ܣ���ʹ����java������Ĺ��ܣ�
                            //     // ��������ֻ�����exe�ļ�����������ʱ����Ч
                            // } catch (IOException e) {
                            //     e.printStackTrace();
                            // }
                            return;
                            // Ϊʲô����û����ֹ����
                        }
                    } else {
                        show(file, f2);
                    }
                }
            }
        } else {
            System.out.println("Ŀ¼Ϊ��");
        }

    }
}
