package leetcode.eee118������Ŀ;

//Ӧ�ü���������ճ���������Ǳ�д�����ʱ�򣬾�����Ҫ�õ�����ͨ������ַ���ƥ�䡣
// ���磺linux�����������룬ls *.txt �����г���ǰĿ¼�����еĽ�β��.txt���ļ���
// ����һ�κ���ʵ���˴���$��*����ͨ������ַ�����ƥ�书�ܡ�
// ���У�$��ʾ���ȴ���0�����ִ�,*��ʾ���ⳤ�ȵ��ַ�����
// Ҫ�󣺰����Լ������㷨�������д�ú�����5���հס�
// ��ע�⣺��������ȫƥ����ܷ���true������
// 1.txt, a.txt����ƥ��*.txt,
// 2.tx����txta����ƥ��*.txt�������Ĳ����뷵��ֵ��˵����μ�������ע�͡�
public class test {
    // ��������: ���ʽ�Ƿ�ƥ��ɹ�, $��ʾ���ȴ��� 0 �����ִ���*��ʾ���ⳤ���ַ���
// �������: @pRule, ��'\0'�������ַ�������ʾ����;
// @pStr, ��'\0'�����Ĵ�ƥ����ַ���;
// ����ֵ:true:ƥ��ɹ�; false: ƥ��ʧ��
    public static boolean isRegularMatching(String text, String number) {
        int text_length = text.length();
        int number_length = number.length();
        int istext = 0;
        int isnumber = 0;
        // while (istext < text_length && isnumber < number_length) {
        //     switch () {// _____(1) _____
        //         //�������ַ����������ִ�
        //         case '*': {
        //             //������ַ���
        //             istext += 1;
        //             if (istext >= text_length) {
        //                 return true;
        //             } else {
        //                 for (int i = isnumber; i < number_length; i++) {
        //                     if (istext >= text_length) {// _____(2) _____//istext >= text_length
        //                         return true;
        //                     }
        //                 }
        //             }
        //             break;
        //         }
        //         case '$': {
        //             //��������ִ�
        //             if (isnumber <= number_length) {// _____(3) _____//isnumber <= number_length
        //                 return false;
        //             }// 0��ʾ48
        //             while ((isnumber < number_length) && (number.charAt(isnumber) >= '0') && (number.charAt(isnumber) <= '9')) {
        //                 isnumber += 1;
        //             }
        //             istext += 1;
        //             break;
        //         }
        //         default: {
        //             // charAt����ָ�����������ַ�
        //             if (text.charAt(istext) != number.charAt(isnumber)) {
        //                 return false;// _____(4) _____// return false
        //             }
        //             istext += 1;
        //             isnumber += 1;
        //             break;
        //         }
        //     }
        // }
        if (istext < text_length && isnumber >= number_length) {
            return text.charAt(istext) == '*';
        } else {
            return false;//_____(5) _____//false
        }
    }
}
