package leetcode.eee116���Ƶ����ļ���;
/*
    ����
        ��E:\\itcast ����ļ��и��Ƶ�ģ��Ŀ¼��

    ˼·��
        1:��������ԴĿ¼File����·����E:\\itcast
        2:��ȡ����ԴĿ¼File���������(itcast)
        3:����Ŀ�ĵ�Ŀ¼File����·������ģ����+itcast���(myCharStream\\itcast)
        4:�ж�Ŀ�ĵ�Ŀ¼��Ӧ��File�Ƿ���ڣ���������ڣ��ʹ���
        5:��ȡ����ԴĿ¼�������ļ���File����
        6:����File���飬�õ�ÿһ��File���󣬸�File������ʵ��������Դ�ļ�
            ����Դ�ļ���E:\\itcast\\mn.jpg
        7:��ȡ����Դ�ļ�File���������(mn.jpg)
        8:����Ŀ�ĵ��ļ�File����·������Ŀ�ĵ�Ŀ¼+mn.jpg���(myCharStream\\itcast\\mn.jpg)
        9:�����ļ�
            �����ļ����������ı��ļ�������ͼƬ����Ƶ���ļ������Բ����ֽ��������ļ�
 */

import java.io.*;

public class eee117 {
    public static void main(String[] args) throws IOException {
        File x = new File("l:\\java\\demo");
        String zfloder = x.getName();
        File s = new File("l:\\22", zfloder);
        if (!s.exists()) {
            s.mkdirs();
        }
        // File s = new File("l:\\22");
        File[] x1 = x.listFiles();
        for (File i : x1) {
            // ����ֱ�ӻ�ȡ���ļ��������е��ļ�����
            String ii = i.getName();
            // ��ȡ�������Ժ���Ŀ���ļ����ڴ�����Ӧ��ͬ������
            File file = new File(s, ii);
            // ִ�д����ļ�����
            crfile(i, file);
            // -----------------------------------------------
            // while (i.isDirectory()) {
            //     File[] x2 = i.listFiles();
            //     for (File i2 : x2) {
            //         byte[] x3 = new byte[1024];
            //         BufferedReader x4 = new BufferedReader(new FileReader(i2));
            //         BufferedWriter x5 = new BufferedWriter(new FileWriter(s));
            //         String x6;
            //         while ((x6 = x4.readLine()) != null) {
            //             x5.write(x6);
            //             x5.newLine();
            //             x5.flush();
            //         }
            //         x4.close();
            //         x5.close();
            //     }
            // }
        }

    }

    /**
     * alt+enterֱ�Ӵ�������
     */
    private static void crfile(File i, File file) throws IOException {
        //         BufferedReader x4 = new BufferedReader(new FileReader(i2));
        //         BufferedWriter x5 = new BufferedWriter(new FileWriter(s));
        // ���ȣ��������ֽ�����ʽ��������������Բ���ʹ��buffer����
        BufferedInputStream x = new BufferedInputStream(new FileInputStream(i));
        BufferedOutputStream x1 = new BufferedOutputStream(new FileOutputStream(file));
        byte[] x2 = new byte[1024];
        int i2;
        while ((i2 = x.read(x2)) != -1) {
            // ��Σ������д��Ҳ��Ҫ�����ֽ�����ʽ������ֱ��ʹ���ַ�����
            x1.write(x2, 0, i2);
        }
        x.close();
        x1.close();

    }
}
