package d���׶���β2021��10��2��.eee032ͳ���ַ�������;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * ���������
 * ��������һ�����ʣ�Ҫ�������ÿ��Ԫ�ص�������
 * ����
 * ���� CaCO3������ɷֱ�Ϊ Ca��1��C��1��O��3����� Ca1C1O3
 * ���� Fe2(SO4)3������ɷֱ�Ϊ Fe��2��S��3��O��12����� Fe2S3O12
 * ��ע�⣺Ԫ����������ĸ��д��ʣ����ĸ��Сд��������������ʾ�����еĽṹ��
 * Ϊ������ֶ��ٴΣ�
 * ------------------------
 * ca��һ��Ԫ�أ�c��o��fe��s��һ�����Ԫ��
 * ����Ҫ�˷�
 */

public class Ԫ�� {
    public static void main(String[] args) {

        // ���ȶ�Ԫ�ؽ��б������ж��ж�����Ԫ��
        // Ȼ���ж�Ԫ�ظ�����
        // ���������
        TreeMap<String, Integer> element_map = new TreeMap<>();
        // �����ʽΪhashmap��
        // Ԫ����Ϊ����Ԫ�ظ�����Ϊֵ
        // ------------
        // TreeMap�ĺô����ڣ��Լ�����������
        // �����Ԫ��
        element_map.put("Ca", 0);//67/97
        element_map.put("C", 0);//67
        element_map.put("O", 0);//79
        element_map.put("Fe", 0);//70/101
        element_map.put("S", 0);//83

        Scanner input_element = new Scanner(System.in);
        System.out.println("������Ԫ�أ�");
        // ���������Ϊ�ַ���
        String ch_element = input_element.nextLine();

        // ����
        for (int i = 0; i < ch_element.length(); i++) {
            char index_element = ch_element.charAt(i);
            char index_element2 = ch_element.charAt(i++);
            if (index_element == 83 || index_element == 79 || index_element == 70) {
                Integer map_value = element_map.get(index_element);
                if (map_value == 0) {
                    element_map.put(String.valueOf(index_element), 1);
                } else {
                    map_value++;
                    element_map.put(String.valueOf(index_element), map_value);
                }
            } else if (index_element == 67) {
                if (index_element2 == 97) {
                    Integer map_value = element_map.get("Ca");
                    if (map_value == 0) {
                        element_map.put("Ca", 1);
                    } else {
                        map_value++;
                        element_map.put("Ca", map_value);
                    }
                } else {
                    Integer map_value = element_map.get(index_element);
                    if (map_value == 0) {
                        element_map.put(String.valueOf(index_element), 1);
                    } else {
                        map_value++;
                        element_map.put(String.valueOf(index_element), map_value);
                    }
                }

            }

        }

        System.out.println(element_map);

    }
}
