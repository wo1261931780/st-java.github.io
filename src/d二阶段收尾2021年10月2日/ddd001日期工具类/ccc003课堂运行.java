package d���׶���β2021��10��2��.ddd001���ڹ�����;

import javax.sound.midi.Soundbank;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class ccc003�������� {
    public static void main(String[] args) throws ParseException {
        Scanner x = new Scanner(System.in);
        System.out.println("�������ַ�����");
        String x1 = x.nextLine();
        Date x2 = new Date();
        String x3 = ccc002����д��.Datetostring(x2, "yyyy-MM-dd-HH-mm-ss");
        System.out.println(x3);
        // System.out.println("�������ַ�����");
        // String x2 = x.nextLine();
        Date x4 = ccc002����д��.stringtodate(x1, "yyyy-MM-dd-HH-mm-ss");
        System.out.println(x4);

    }
}
