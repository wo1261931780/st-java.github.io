package c2stage_20220202.ccc034object_api;

import java.util.Objects;

public class ccc001object {
    /**
     * Ĭ��������extends object
     * public class ccc035object extends object{
     */
    int age;
    String name;

    public ccc001object() {
    }

    public ccc001object(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //��Ϊ���õ��������object��������ڴ���д

    /**
     * �����tostring����ڲ���д������£�
     * ��ֱ�ӵõ��������c2stage_20220113.ccc034Commonly_used_api.ccc035object@776ec8df��
     * ��ʵ�ʿ����Ƕȳ��������ǲ���Ҫ�����Ľ����
     * ��ˣ�Ϊ�˷���չʾ��һ����Ҫ��дһ��tostring����
     */
    @Override
    public String toString() {
        return "ccc035object{" + "age=" + age + ", name='" + name + '\'' + '}';//return������Ҫ��һ���ֺ���β
    }
    //����ǣ���ccc035object{age=20, name='junw'}��
    // �ٲ���һ�£���ΪĬ�������඼�̳�object����object�о���tostring������
    // ��������ֱ����дtostring��������
    /*
    object�е�Դ����д����
        //--------------------------------------------
        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
            //���������ս�������ص��Ƕ��ڴ��У�����+@+����Ĺ�ϣֵ��16���Ƶ�ַ��
            //���Ϊ����c2stage_20220113.ccc034Commonly_used_api.ccc035object@776ec8df��
        }
        //--------------------------------------------
    */
    // ���ּ�����ͨ�ü�����ֱ���Ҽ���ѡ�в������ɼ��������д

    // ***********************************************


    // @Override
    // public boolean equals(Object obj) {//ʵ������һ�ֶ�̬�ķ�ʽ����������
    //     // return super.equals(obj);
    //     // if (obj instanceof ccc001object) {
    //     //     ccc001object x = (ccc001object) obj;//ִ��һ��ǿת������
    //     //     //��ΪobjĬ���Ƕ������ͣ����������жϵõ�����ccc���ͣ����Կ���ִ��ת��
    //     //     //ת���Ժ󷽱����Ǻ����������
    //     //     if (this.name.equals(x.name) && this.age == x.age) {
    //     //         return true;
    //     //     }
    //     // }
    //     // return false;
    //     // ***********************************************

    //     // ����Ĵ��벻��
    //     if (obj instanceof ccc001object) {
    //         return this.name.equals(((ccc001object) obj).name) && this.age == ((ccc001object) obj).age ? true : false;
    //     }
    //     return false;
    // }

    // ***********************************************
    //�����ǹٷ����ɵ���д����

    @Override
    public boolean equals(Object o) {//�����ж��Ƿ�ͬ������(��ַ��ͬ)
        if (this == o) {
            return true;
        }
        if (!(o instanceof ccc001object)) {//�����Ƿ�����xx��
            // ����Ҳ����ʹ��getclass�ķ���ȥ��ȡ������
            return false;
        }
        ccc001object that = (ccc001object) o;
        return age == that.age && Objects.equals(name, that.name);//���age��name��һ����name�϶�Ϊͬһ������
    }


}
