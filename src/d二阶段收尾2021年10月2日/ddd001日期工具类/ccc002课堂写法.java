package d���׶���β2021��10��2��.ddd001���ڹ�����;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ccc002����д�� {
    private ccc002����д��() {
    }

    public static String Datetostring(Date x, String format) {
        SimpleDateFormat x1 = new SimpleDateFormat(format);
        String x2 = x1.format(x);
        // ���ȣ�format�������ⲿ���÷�����ʱ��ֱ�Ӷ��壬���õ�ʱ�������
        // ��Σ�������ֲ�������
        // һ��Ҫ�ǵã�format����Date���͵Ķ���
        // �������Ϊ��format�ǰ��ո�ʽ�����õ���dateִ��һ���ع�
        // parse��ͬ���൱�ڰ�string���󣬱��date����
        return x2;
    }

    public static Date stringtodate(String x, String format) throws ParseException {
        SimpleDateFormat x1 = new SimpleDateFormat(format);
        Date x2 = x1.parse(x);
        return x2;
    }
}

