package ab����ѧϰ2021��10��2��.bbb039ATM����;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class bbb004��ѧ_������ {
    public static void main(String[] args) {
        // 2������һ�����϶������ں��ڴ����˻�����
        ArrayList<bbb003��ѧ_��> accounts = new ArrayList<>();

        // 3��չʾϵͳ��ӭҳ��
        System.out.println("======��ӭ�����뵽����ATMϵͳ===============");
        while (true) {
            System.out.println("1����¼�˻�");
            System.out.println("2��ע���˻�");
            System.out.println("����ѡ�������");
            Scanner sc = new Scanner(System.in);
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    // ��¼����
                    login(accounts, sc);
                    break;
                case 2:
                    // ע���˻�
                    register(accounts, sc);
                    break;
                default:
                    System.out.println("��ǰ����Ĳ��������ڣ�");
            }
        }
    }

    /**
     * �û���¼����
     */
    private static void login(ArrayList<bbb003��ѧ_��> accounts, Scanner sc) {
        System.out.println("==================��ӭ�����뵽��¼����======================");
        if (accounts.size() > 0) {
            while (true) {
                System.out.println("���������¼�Ŀ��ţ�");
                String cardId = sc.next();
                // 2�����ݿ���ȥ�����в�ѯ�Ƿ�����˻�����
                bbb003��ѧ_�� acc = getAccountByCardId(cardId, accounts);
                // �ж��˻������Ƿ���ڣ�����˵��������ȷ
                if (acc != null) {
                    while (true) {
                        // 3���ж������Ƿ���ȷ
                        System.out.println("���������¼�����룺");
                        String passWord = sc.next();
                        if (acc.getPassWord().equals(passWord)) {
                            // ��¼�ɹ��ˣ�
                            System.out.println("��ӭ�㣺" + acc.getUserName() + "����/Ůʿ����ϵͳ�����ɿ�ʼ�������ҵ����!");
                            // չʾ��¼�ɹ���Ĳ������档
                            showCommand(sc, acc, accounts);
                            return;
                        } else {
                            System.out.println("�������벻��ȷ��");
                        }
                    }
                } else {
                    System.out.println("���Ų����ڣ���ȷ�ϣ�");
                }
            }
        } else {
            System.out.println("��ǰϵͳ���κ��˻�������ע���ٵ�¼��");
        }
    }

    /**
     * ��¼��չʾ�Ľ���
     */
    private static void showCommand(Scanner sc, bbb003��ѧ_�� acc, ArrayList<bbb003��ѧ_��> accounts) {
        while (true) {
            System.out.println("==================��ӭ�����뵽��������======================");
            System.out.println("1����ѯ");
            System.out.println("2�����");
            System.out.println("3��ȡ��");
            System.out.println("4��ת��");
            System.out.println("5���޸�����");
            System.out.println("6���˳�");
            System.out.println("7��ע���˻�");
            System.out.println("��������������");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    // ��ѯ�˻���Ϣչʾ
                    showAccount(acc);
                    break;
                case 2:
                    // ���
                    depositMoney(acc, sc);
                    break;
                case 3:
                    // ȡ��
                    drawMoney(acc, sc);
                    break;
                case 4:
                    // ת��
                    transferMoney(acc, accounts, sc);
                    break;
                case 5:
                    // �޸�����
                    updatePassWord(acc, sc);
                    return; // ������ǰ�����ķ��������ջص���ҳ
                case 6:
                    // �˳� �ص���ҳ
                    System.out.println("��ӭ�´μ������٣���");
                    return; // ������¼���ȫ������
                case 7:
                    // ע���˻�
                    accounts.remove(acc); // �Ӽ��϶�����ɾ����ǰ�˻�����
                    System.out.println("�����˻��Ѿ���������٣����������Խ��е�¼�ˣ�");
                    return;
                default:
                    System.out.println("���Ĳ�����������");
            }
        }

    }


    /**
     * �޸ĵ�ǰ�˻����������
     *
     * @param acc
     */
    private static void updatePassWord(bbb003��ѧ_�� acc, Scanner sc) {
        // 1���жϾ������Ƿ���ȷ
        while (true) {
            System.out.println("�������뵱ǰ������֤��");
            String passWord = sc.next();
            if (acc.getPassWord().equals(passWord)) {
                while (true) {
                    // 2������������
                    System.out.println("�������������룺");
                    String newPassWord = sc.next();
                    System.out.println("����ȷ�������룺");
                    String okPassWord = sc.next();
                    // 3���ȶ����������Ƿ�һ��
                    if (newPassWord.equals(okPassWord)) {
                        acc.setPassWord(okPassWord);
                        System.out.println("�����Ѿ��޸ĳɹ��������µ�¼��");
                        return;
                    } else {
                        System.out.println("�������벻һ�£�");
                    }
                }
            } else {
                System.out.println("���������������������ȷ�����룡");
            }
        }
    }

    /**
     * �ӵ�ǰ�˻������аѽ��ת�������˻�����
     *
     * @param acc
     * @param accounts
     * @param sc
     */
    private static void transferMoney(bbb003��ѧ_�� acc, ArrayList<bbb003��ѧ_��> accounts, Scanner sc) {
        // 1���ж��Լ����˻����Ƿ���Ǯ
        if (acc.getMoney() <= 0) {
            System.out.println("���Լ���ûǮ���ͱ�ת�˰ɣ�");
            return;
        }

        // 2���ж����˻������Ƿ���ڵ���2����
        if (accounts.size() >= 2) {
            while (true) {
                // 3���õ�ǰ�û�����Է����˺Ž���ת��
                System.out.println("��������Է����ţ�");
                String cardId = sc.next();

                // 4�����ݿ��Ų�ѯ�������е��˻�����
                bbb003��ѧ_�� otherAcc = getAccountByCardId(cardId, accounts);
                // 5���ж��˻������Ƿ���ڣ���������˻����������Լ���
                if (otherAcc != null) {
                    // 6���жϵ�ǰ�˻��Ƿ����Լ���
                    if (acc.getCardId().equals(otherAcc.getCardId())) {
                        System.out.println("���ܸ��Լ��˻�ת�ˣ�");
                    } else {
                        // 7����ʽ���뵽ת���߼���
                        // �������»�
                        String rs = "*" + otherAcc.getUserName().substring(1);
                        System.out.println("����ȷ��[" + rs + "]��������ȷ�ϣ�");
                        System.out.println("��������Է������ϣ�");
                        String preName = sc.next();
                        if (otherAcc.getUserName().startsWith(preName)) {
                            // ��֤ͨ��
                            while (true) {
                                System.out.println("��������ת�˵Ľ���������ת�ˣ�" + acc.getMoney() + "Ԫ����");
                                double money = sc.nextDouble();
                                if (money > acc.getMoney()) {
                                    System.out.println("�㲻������û����ô��Ǯ����ת��");
                                } else {
                                    // ��ʼת
                                    acc.setMoney(acc.getMoney() - money); // �����Լ��˻�
                                    otherAcc.setMoney(otherAcc.getMoney() + money);
                                    System.out.println("���Ѿ����ת�ˣ�����ǰ��ʣ�ࣺ" + acc.getMoney());
                                    return;
                                }
                            }

                        } else {
                            System.out.println("������Է�����Ϣ����");
                        }
                    }
                } else {
                    System.out.println("�������ת�˿��Ų����ڣ�");
                }
            }
        } else {
            System.out.println("��ǰϵͳ��û�������˻�����ת�ˣ�ȥע��һ���˻��ɣ�");
        }

    }

    private static void drawMoney(bbb003��ѧ_�� acc, Scanner sc) {
        System.out.println("==================��ӭ�����˻�ȡ�����======================");
        // 1���ж��˻�������Ƿ���ڵ���100
        double money = acc.getMoney();
        if (money >= 100) {
            while (true) {
                // 2������ȡǮ�Ľ��
                System.out.println("��������ȡǮ�Ľ�");
                double drawMoney = sc.nextDouble();
                // 3���ж�ȡǮ����Ƿ񳬹��˵����޶�
                if (drawMoney > acc.getQuotaMoney()) {
                    System.out.println("����ǰȡ�������ÿ���޶");
                } else {
                    // 4���жϵ�ǰȡǮ����ǳ������˻������
                    if (drawMoney > money) {
                        System.out.println("��ǰ���㣡��ǰ����ǣ�" + money);
                    } else {
                        // �����˻����
                        acc.setMoney(money - drawMoney);
                        System.out.println("����ǰȡǮ��ɣ����������Ǯ����ǰʣ������ǣ�" + acc.getMoney());
                        break;
                    }
                }
            }
        } else {
            System.out.println("����ǰ�˻�����100Ԫ����Ǯȥ�ɣ�");
        }
    }

    private static void depositMoney(bbb003��ѧ_�� acc, Scanner sc) {
        System.out.println("==================��ӭ�����˻�������======================");
        System.out.println("�����������");
        double money = sc.nextDouble();
        acc.setMoney(acc.getMoney() + money);
        showAccount(acc);
    }

    private static void showAccount(bbb003��ѧ_�� acc) {
        System.out.println("==================����ǰ�˻�������Ϣ����======================");
        System.out.println("���ţ�" + acc.getCardId());
        System.out.println("������" + acc.getUserName());
        System.out.println("��" + acc.getMoney());
        System.out.println("����ȡ�ֶ�ȣ�" + acc.getQuotaMoney());
    }

    /**
     * ��������
     */
    private static void register(ArrayList<bbb003��ѧ_��> accounts, Scanner sc) {
        System.out.println("==================��ӭ�����뵽��������======================");
        // 2������һ���˻������װ�˻���Ϣ
        bbb003��ѧ_�� acc = new bbb003��ѧ_��();
        // 1��¼���û��˻���Ϣ
        System.out.println("���������˻����ƣ�");
        String userName = sc.next();
        acc.setUserName(userName);

        while (true) {
            System.out.println("���������˻����룺");
            String passWord = sc.next();
            System.out.println("��������ȷ�����룺");
            String okPassWord = sc.next();
            if (okPassWord.equals(passWord)) {
                // ����������
                acc.setPassWord(okPassWord);
                break;
            } else {
                System.out.println("������������벻һ�£�");
            }
        }
        System.out.println("�������õ���ȡ�ֶ�ȣ�");
        double quataMoney = sc.nextDouble();
        acc.setQuotaMoney(quataMoney);
        // �ؼ��㣺Ϊ��ǰ�˻�����һ�������8λ������Ϊ���ţ����Ų����������û��Ŀ����ظ���
        String cardId = createCardId(accounts);
        acc.setCardId(cardId);

        // 3�����˻�������뵽��������������ȥ
        accounts.add(acc);
        System.out.println("��ϲ��," + acc.getUserName() + "����/Ůʿ����������ɣ����Ŀ����ǣ�" + acc.getCardId());
    }

    public static String createCardId(ArrayList<bbb003��ѧ_��> accounts) {
        while (true) {
            String cardId = "";
            // ���8������
            Random r = new Random();
            for (int i = 1; i <= 8; i++) {
                cardId += r.nextInt(10);
            }
            // �ж���������Ƿ��ظ������ݿ���ȥ��ѯ�˻�����
            bbb003��ѧ_�� account = getAccountByCardId(cardId, accounts);
            if (account == null) {
                return cardId;
            }
        }
    }

    public static bbb003��ѧ_�� getAccountByCardId(String cardId, ArrayList<bbb003��ѧ_��> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            bbb003��ѧ_�� acc = accounts.get(i);
            if (acc.getCardId().equals(cardId)) {
                return acc;
            }
        }
        return null;
    }
}
