package c2stage_20220416.ccc130file_output_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220416.ccc130file_output_stream
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-10-46  ������
 */
public class ccc001 {
    public static void main(String[] args) throws IOException {
        File x = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220416\\ccc130file_output_stream\\demo.txt");
        // FileOutputStream x1 = new FileOutputStream(x);// ������ʱ��������е�����
        FileOutputStream x1 = new FileOutputStream(x, true);// ���һ��true����ʾ׷������
        x1.write(123);
        x1.write('b');
        x1.write('a');
        // x1.write(Integer.parseInt("1"));
        byte[] x2 = {'a', 'b', 'c'};
        x1.write(x2);// �����������ʽд������
        byte[] x3 = "��������".getBytes();// ���ַ�������ֽ�����
        x1.write(x3);
        x1.write("\r\n".getBytes());// ���з�����ϵͳ����
        byte[] x4 = {'A', 'B', 'C', 'D'};
        x1.write(x4, 0, 2);// дָ�����飬��0��ʼ��д��ĳ���Ϊ2
        x1.flush();// ˢ�����ݣ���֤�ڴ�д��Ӳ��
        // ����Ķ�д�Ǵ�ͷ��ʼ���е�
        // ����ļ��������ݣ�Ҳ����и��ǣ�Ȼ���ͷ��ʼд��


    }
}
