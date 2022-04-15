package leetcode.eee002deke_code.aaa009_20220414;

import java.util.*;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa009_20220414
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-13-02  ������
 * ����һ��������㹤�ߣ� A��ʾ�����ƶ���D��ʾ�����ƶ���W��ʾ�����ƶ���S��ʾ�����ƶ����ӣ�0,0���㿪ʼ�ƶ����������ַ��������ȡһЩ���꣬�����������������������ļ����档
 * <p>
 * ���룺
 * <p>
 * �Ϸ�����ΪA(����D����W����S) + ���֣���λ���ڣ�
 * <p>
 * ����֮����;�ָ���
 * <p>
 * �Ƿ��������Ҫ���ж�������AA10;  A1A;  $%$;  YAD; �ȡ�
 * <p>
 * ������һ���򵥵����� �磺
 * <p>
 * A10;S20;W10;D30;X;A1A;B10A11;;A10;
 * <p>
 * ������̣�
 * <p>
 * ��㣨0,0��
 * <p>
 * +   A10   =  ��-10,0��
 * <p>
 * +   S20   =  (-10,-20)
 * <p>
 * +   W10  =  (-10,-10)
 * <p>
 * +   D30  =  (20,-10)
 * <p>
 * +   x    =  ��Ч
 * <p>
 * +   A1A   =  ��Ч
 * <p>
 * +   B10A11   =  ��Ч
 * <p>
 * +  һ���� ��Ӱ��
 * <p>
 * +   A10  =  (10,-10)
 * <p>
 * ��� ��10�� -10��
 * <p>
 * ���ݷ�Χ��ÿ��������ַ����������� 1\le n \le 10000 \1��n��10000  �����걣֤���� -2^{31} \le x,y \le 2^{31}-1 \?2
 * 31
 * ��x,y��2
 * 31
 * ?1  �������ֲ��ֽ�������
 */
public class ccc002 {
    public static Map<Integer, Integer> map = new HashMap<>();

    static {
        map.put(0, 0);
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String[] init_jh = x.nextLine().split(";");
        List<String> demo = new ArrayList<>();
        for (int i = init_jh.length - 1; i > 0; i--) {
            if (init_jh[i].length() == 3 || init_jh[i].length() == 2) {
                String substring = init_jh[i].substring(0, 1);
                int substring2 = 0;
                try {
                    substring2 = Integer.valueOf(init_jh[i].substring(1, init_jh[i].length()));
                    // 2022��4��15��13:32:11��������һ���쳣����
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
                if (show(substring, substring2)) {
                    demo.add(init_jh[i]);
                }
            }
        }
        show2(demo);


    }

    // ���Ƚ��õ����ַ���������Ϊһ�����飬
    // �����������ɾ�����Ȳ�����3�ģ����ַ�������wasd�ģ�
    // ʹ�ú�����ַ���2��������б����
    // Ȼ��������Ԫ�ش�������ָ�Գ�ʼ��map�������ݲ���
    // ������յ�map�������

    public static boolean show(String substring, int substring2) {
        boolean x = false;
        if (substring.equals("W") || substring.equals("A") || substring.equals("S") || substring.equals("D")) {
            x = true;
        }
        try {
            int i = substring2 % 2;
        } catch (Exception e) {
            x = false;
        }
        return x;
    }

    public static void show2(List<String> demo) {
        for (String s : demo) {
            String str = s.substring(0, 1);
            int str2 = Integer.parseInt(s.substring(1, s.length() - 1));
            switch (str) {
                case "W":
                    map.put(0, map.get(0) + str2);
                    break;
                case "A":
                    map.put(map.get(0) - str2, 0);
                    break;
                case "S":
                    map.put(0, map.get(0) - str2);
                    break;
                case "D":
                    map.put(map.get(0) + str2, 0);
                    break;
                default:
                    break;
            }
        }
        System.out.println(map);

    }

}
