package c2stage_20220203.ccc040api_date;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class ddd003�������� {
    public static void main(String[] args) throws ParseException {
        Scanner x = new Scanner(System.in);
        System.out.println("�������ַ�����");
        String x1 = x.nextLine();
        Date x2 = new Date();
        String x3 = ddd002����д��.Datetostring(x2, "yyyy-MM-dd-HH-mm-ss");
        System.out.println(x3);
        // System.out.println("�������ַ�����");
        // String x2 = x.nextLine();
        Date x4 = ddd002����д��.stringtodate(x1, "yyyy-MM-dd-HH-mm-ss");
        System.out.println(x4);

    }
}
