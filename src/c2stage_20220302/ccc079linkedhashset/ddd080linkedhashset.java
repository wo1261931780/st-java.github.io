package c2stage_20220302.ccc079linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * LinkedHashSet�����ص�
 * 1:��ϣ�������ʵ�ֵ�Set�ӿڣ����п�Ԥ��ĵ�������
 * 2:������֤Ԫ������Ҳ����˵Ԫ�صĴ洢��ȡ��˳����һ�µ�
 * 3:�ɹ�ϣ��֤Ԫ��Ψһ��Ҳ����˵û���ظ���Ԫ��
 */

public class ddd080linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<String> x = new LinkedHashSet<>();
        x.add("a1");
        x.add("a2");
        x.add("a3");
        x.add("a4");
        x.add("a5");
        x.add("a5");
        x.add("a5");
        for (String i : x) {
            System.out.println(i);
        }
        show();
    }
    public static void show(){
        Set<Integer> x=new TreeSet<>();
        x.add(123);
        x.add(2345);
        x.add(135);
        x.add(3453);
        x.add(34);
        for (Integer demo:x){
            System.out.println(demo);
        }

        System.out.println(x);


    }
}
