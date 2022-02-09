package deke_code.aaa002_20220209;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;


/**
 * Created with IntelliJ IDEA.
 * Author: Amos
 * E-mail: amos@amoscloud.com
 * Date: 2021/3/12
 * Time: 16:21
 * Description:
 */
public class a33�ڴ���Դ���� {
    public static void main(String[] args) {
        /*
          ��һ�������ڴ�أ��ڴ水�մ�С���ȷ���
          ÿ�����������ɸ������ڴ���Դ
          �û������һϵ���ڴ�����
          ��Ҫ��������ڴ���е���Դ
          �����������ɹ�ʧ���б�
          �����������
          1.������ڴ�Ҫ���ڵ����ڴ��������
          ��������������ڴ�ͱ������
          ���ȷ�������С�ģ����ڴ治�ܲ��ʹ��
          2.��Ҫ������˳�����
          ��������ȷ��䣬�п����ڴ������������Ϊtrue
          û�п����򷵻�false
          ע�ͣ��������ڴ��ͷ�

          ��������
          ����Ϊ�����ַ���
          ��һ��Ϊ�ڴ����Դ�б�
          �����ڴ�����������Ϣ���������ݼ��ö��ŷָ�
          һ��������Ϣ����ð�ŷָ�
          ð��ǰΪ�ڴ����ȴ�С��ð�ź�Ϊ����
          ��Դ�б�����1024
          ÿ�����ȵ�����������4096

          �ڶ���Ϊ�����б�
          ������ڴ��С���ö��ŷָ�����б�����100000

          ��
          64:2,128:1,32:4,1:128
          50,36,64,128,127

          �������
          ���Ϊ�ڴ�ط�����
          ��true,true,true,false,false

          ʾ��һ��
          ���룺
          64:2,128:1,32:4,1:128
          50,36,64,128,127
          �����
          true,true,true,false,false

          ˵��:
          �ڴ����Դ������64k��2����128k��1����32k��4����1k��128�����ڴ���Դ
          ���50,36,64,128,127���ڴ��������У�
          ������ڴ������ǣ�64,64,128,null,null
          �����������ڴ�ʱ�Ѿ���128�����ȥ���������Ľ����
          true,true,true,false,false
         */
        Scanner in = new Scanner(System.in);
        TreeMap<Integer, Integer> pool = new TreeMap<>();
        Arrays.stream(in.nextLine().split(","))
                .forEach(x -> {
                    String[] split = x.split(":");
                    pool.put(Integer.parseInt(split[0]),
                            Integer.parseInt(split[1]));
                });
        List<Integer> list = Arrays.stream(in.nextLine().split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        in.close();

        StringBuilder builder = new StringBuilder();

        for (Integer size : list) {
            boolean flag = false;
            for (Integer k : pool.keySet()) {
                Integer v = pool.get(k);
                if (k >= size && v != 0) {
                    builder.append("true,");
                    pool.put(k, v - 1);
                    flag = true;
                    break;
                }
            }
            if (!flag) builder.append("false,");
        }

        System.out.println(builder.substring(0, builder.length() - 1));
    }
}
