package c2stage_20220418.ccc143properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220418.ccc143properties
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-21-38  ���ڶ�
 */
public class ccc001 {
    public static void main(String[] args) throws IOException {
        Properties x = new Properties();
        x.put("demo", "demo");// ��Ϊ��map����ģ�����ֱ��ʹ��putҲ���ԣ�
        x.setProperty("ceshi", "123");//setproperties�ĵײ�Ҳ��put������ʹ�������api���Ե�רҵ
        x.setProperty("ceshi2", "222");
        x.setProperty("ceshi2", "222");
        x.setProperty("ceshi2", "222");
        System.out.println(x);// {ceshi=123, ceshi2=222, demo=demo}
        x.store(new FileWriter("src/c2stage_20220418/ccc143properties/ccc001.properties"), "���������ļ���give me 100RMB");
        // ��Դ�ᱻ�Զ��رգ�����Ҫ�ֶ�����
        // #Tue Apr 19 21:45:03 CST 2022�ڲ����Զ����ô���ʱ�䣬
        // ���ÿ�ζ���д�룬��ôʱ����Զ�����
        

    }
}
