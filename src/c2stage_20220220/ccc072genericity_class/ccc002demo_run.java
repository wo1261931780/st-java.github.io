package c2stage_20220220.ccc072genericity_class;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc072genericity_case2
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-11-23  ������
 */
public class ccc002demo_run {
    public static void main(String[] args) {
        ccc001myarraylist<String> x=new ccc001myarraylist<>();
        // �൱����������һ��������
        // ���������û��ָ���Ķ������ͣ�����ʹ��string��int�ȵ�
        // ���������String����ȥ��Ӷ����Ժ�
        x.add("11");
        x.add("22");
        x.add("33");
        x.add("44");
        System.out.println(x);//�����ڲ���tostring����ִ������д
        // ���Կ���ֱ�Ӵ�ӡ���
        // ���Ǳ����ϣ��һ�����ʹ��ArrayList��api

    }
}
