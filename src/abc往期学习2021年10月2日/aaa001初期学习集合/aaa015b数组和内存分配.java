package abc����ѧϰ2021��10��2��.aaa001����ѧϰ����;

public class aaa015b������ڴ���� {
    public static void main(String[] args) {
        System.out.println("�������");
        int[] arr = new int[5];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        arr[0] = 100;
        arr[2] = 100;
        System.out.println("--------------------------");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println("--------------------------");
        // ��������ָ����ͬ
        int[] xx1 = arr;
        // ������arr�ĵ�ַ����xx1��Ȼ��xx1���ʵ�ʱ��ֱ���ҵ�arr���������ڵأ��ٲ��arr������
        System.out.println(xx1);
        System.out.println(xx1[0]);
        System.out.println(xx1[1]);
        System.out.println(xx1[2]);
        // ���������ǲ鿴�����ֵ�������޸������ֵ���ٴη��ʵ�ʱ�򣬽������ͬ
    }
}
