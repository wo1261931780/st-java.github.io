package abc����ѧϰ2021��10��2��.bbb039ATM����;

import java.util.ArrayList;
import java.util.Scanner;

public class bbb002���� {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        ArrayList<bbb001�˻���> a1 = new ArrayList();
        int choose_result = interface_start(scanner1);

        while (true) {
            if (choose_result == 1) {
                bbb001�˻��� account_info = interface_login(scanner1, a1);
                out:
                while (true) {
                    int login_choose = interface_account_operate(scanner1, a1, account_info);
                    switch (login_choose) {
                        case 1:
                            querydemo(scanner1, a1, account_info);
                            break;
                        case 2:
                            deposit(scanner1, a1, account_info);
                            break;
                        case 3:
                            interface_cash(scanner1, a1, account_info);
                            break;
                        case 4:
                            transferdemo(scanner1, a1, account_info);
                            break;
                        case 5:
                            change_account_detail(scanner1, a1, account_info);
                            break;
                        case 6:
                            break out;
                        case 7:
                            logout_account(scanner1, a1, account_info);
                            break;
                        default:
                            System.out.println("��Ҫ��Ƥ");

                    }
                }
            } else if (choose_result == 2) {
                interface_register(scanner1, a1);
            } else {
                break;
            }
        }
    }

    public static int interface_start(Scanner scanner1) {
        System.out.println("=====================����������=====================");
        System.out.println("1.��¼�˻�");
        System.out.println("2.ע���˻�");
        System.out.println("��ѡ�������");
        int start_int = scanner1.nextInt();
        return start_int;
    }

    public static bbb001�˻��� interface_login(Scanner scanner1, ArrayList<bbb001�˻���> a) {
        // bbb001�˻��� account_demo = new bbb001�˻���();
        System.out.println("=====================��ӭ�����¼ҳ��=====================");
        for (int i1 = 0; i1 < 3; i1++) {
            System.out.println("�������˻����ƣ�");
            String login_account = scanner1.nextLine();
            System.out.println("�������˻����룺");
            String login_password = scanner1.nextLine();
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i).getAccountName().equals(login_account) && a.get(i).getAccountpassword().equals(login_password)) {
                    System.out.println("��¼�ɹ�");
                    return a.get(i);
                }
            }
            System.out.println("��Ϣ��������������,��ǰ����" + (2 - i1) + "�λ���");
        }
        System.out.println("�������꣬����loser");
        return null;
    }

    public static void interface_register(Scanner scanner1, ArrayList<bbb001�˻���> a) {
        bbb001�˻��� account_demo = new bbb001�˻���();
        System.out.println("=====================��ӭ���뿪������=====================");
        System.out.println("�������˻����ƣ�");
        String s1 = scanner1.nextLine();
        account_demo.setAccountName(s1);
        Scanner xx = new Scanner(System.in);
        Scanner xx2 = new Scanner(System.in);

        System.out.println("�������˻����룺");
        String s2 = xx.nextLine();
        account_demo.setAccountpassword(s2);
        System.out.println("������ȡ�ֶ�ȣ�");

        int s3 = xx2.nextInt();
        account_demo.setAccountcashlimit(s3);
        a.add(account_demo);
        System.out.println("������ϣ������µ�½");
        // return account_demo;
    }

    public static int interface_account_operate(Scanner scanner1, ArrayList<bbb001�˻���> a, bbb001�˻��� info) {
        // String account_info = "";
        // for (int i = 0; i < a.size(); i++) {
        //     if (info == a.get(i).getAccountNumber()) {
        //         account_info = a.get(i).getAccountName();
        //     }
        // }
        // �ҿ���������ֱ����name��Ϊ�������ݣ�����Ҫ�������һ��

        System.out.println("=====================��ӭ" + info.getAccountName() + "��������б�=====================");
        System.out.println("1.��ѯ");
        System.out.println("2.���");
        System.out.println("3.ȡ��");
        System.out.println("4.ת��");
        System.out.println("5.�޸�����");
        System.out.println("6.�˳�");
        System.out.println("7.ע���˻�");
        System.out.println("��ѡ�������");
        int account_operate_int = scanner1.nextInt();
        return account_operate_int;
    }

    public static void querydemo(Scanner scanner1, ArrayList<bbb001�˻���> a, bbb001�˻��� info) {
        int i1 = scanner1.nextInt();
        System.out.println("=====================�������˺�����=====================");
        // ���������߼��ǣ��������룬У���Ƿ���ȷ����ȷ�͸�����Ϣ
        // ���������ڣ�Ҫ��ȡ����ͱ���õ���Ӧ�Ķ����ַ�����ϲ���У��
        for (int i = 0; i < 3; i++) {
            if (info.getAccountpassword().equals(i1)) {
                System.out.println("�˺����ƣ�" + info.getAccountName());
                System.out.println("�˺�������" + info.getAccountNumber());
                System.out.println("�˺���" + info.getAccountbalance());
                System.out.println("�˺�ȡ�ֶ�ȣ�" + info.getAccountcashlimit());
                return;
            }
            System.out.println("��Ϣ��������������,��ǰ����" + (2 - i1) + "�λ���");
        }
        System.out.println("�������꣬����loser");
        return;
    }

    public static void deposit(Scanner scanner1, ArrayList<bbb001�˻���> a, bbb001�˻��� info) {
        int i1 = scanner1.nextInt();
        System.out.println("=====================����������Ϣ=====================");
        for (int i = 0; i < 3; i++) {
            if (info.getAccountpassword().equals(i1)) {
                System.out.println("�������");
                int cash_balance = scanner1.nextInt() + info.getAccountbalance();
                info.setAccountbalance(cash_balance);
                System.out.println("�˺����ƣ�" + info.getAccountName());
                System.out.println("�˺�������" + info.getAccountNumber());
                System.out.println("�˺���" + info.getAccountbalance());
                System.out.println("�˺�ȡ�ֶ�ȣ�" + info.getAccountcashlimit());
                return;
            }
            System.out.println("��Ϣ��������������,��ǰ����" + (2 - i1) + "�λ���");
        }
        System.out.println("�������꣬����loser");
        return;


    }

    public static void interface_cash(Scanner scanner1, ArrayList<bbb001�˻���> a, bbb001�˻��� info) {
        System.out.println("=====================������ȡ������=====================");
        System.out.println("������ȡ���");
        int cash_out_num = scanner1.nextInt();
        if (cash_out_num > info.getAccountcashlimit() || cash_out_num > info.getAccountbalance()) {
            System.out.println("������ȣ�����������");
        } else {
            int cash_now = info.getAccountbalance() - cash_out_num;
            info.setAccountbalance(cash_now);
            System.out.println("cash success,��ǰ���" + info.getAccountbalance());
        }
        // return cash_out_num;
    }

    public static void transferdemo(Scanner scanner1, ArrayList<bbb001�˻���> a, bbb001�˻��� info) {
        System.out.println("=====================������ת����Ϣ=====================");
        int i = scanner1.nextInt();
        for (int i1 = 0; i1 < a.size(); i1++) {
            if (a.get(i).getAccountNumber() == i) {
                System.out.println("ת�˳ɹ�");
                info.setAccountbalance(info.getAccountbalance() - i);
                System.out.println("��ǰ�˻���" + info.getAccountbalance());
                return;
            }
        }
        System.out.println("�޶�Ӧ�˻�������������");
    }

    public static void change_account_detail(Scanner scanner1, ArrayList<bbb001�˻���> a, bbb001�˻��� info) {
        System.out.println("=====================�������޸���Ϣ=====================");
        System.out.println("�������˻�����");
        info.setAccountName(scanner1.nextLine());
        System.out.println("�������˻�ȡ�ֶ�ȣ�");
        info.setAccountcashlimit(scanner1.nextInt());
        System.out.println("�޸ĳɹ�");
        // System.out.println("�������˻�����");
    }

    public static void logout_account(Scanner scanner1, ArrayList<bbb001�˻���> a, bbb001�˻��� info) {
        System.out.println("=====================�������˺�����=====================");
        while (true) {
            System.out.println("���룺");
            if (info.getAccountpassword().equals(scanner1.nextLine())) {
                System.out.println("ȷ��ɾ���˺ţ�");
                if (scanner1.nextInt() == 1) {
                    for (int i = 0; i < a.size(); i++) {
                        if (a.get(i) == info) {
                            a.remove(i);
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }
}
