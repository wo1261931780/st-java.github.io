package deke_code.aaa002_20220209;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Author: Amos
 * E-mail: amos@amoscloud.com
 * Date: 2021/8/17
 * Time: 18:42
 * Description:100%
 */
public class a69��������Ϸ {
    public static void main(String[] args) {
        /*
        ��Ϸ��������һ��ֻ����Ӣ����ĸ���ַ�����
        �ַ����е�������ĸ�����������ͬ���Ϳ���������
        ���ַ����Ϸ���ִ�������Ķ�����
        ֱ���޷���������Ϊֹ��
        ��ʱ��Ϸ������
        ������յõ����ַ������ȡ�

        �����ԭʼ�ַ���strֻ�ܰ�����СдӢ����ĸ����ĸ�Ĵ�Сд���У����Ȳ�����100��
        �����Ϸ�������ַ����ĳ���

        ��ע�������а����Ǵ�СдӢ����ĸ�Ǿ�Ϊ�쳣���룬ֱ�ӷ���0��

        ������mMbccbc���Ϊ3
         */

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();

        int len = str.replaceAll("[A-Z]", "")
                .replaceAll("[a-z]", "")
                .length();
        if (len != 0) {
            System.out.println(0);
            return;
        }

        LinkedList<Character> characters = new LinkedList<>();
        for (char c : str.toCharArray()) {
            characters.add(c);
        }

        int count = 0;
        while (characters.size() != count) {
            count = characters.size();
            for (int i = 0; i < characters.size() - 1; i++) {
                if (characters.get(i) == characters.get(i + 1)) {
                    characters.remove(i);
                    characters.remove(i);
                    i--;
                }
            }
        }

        System.out.println(characters.size());

    }
}
