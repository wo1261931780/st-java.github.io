package d���׶���β2021��10��2��.ddd089�ɼ�������;

public class ddd090������ {
    private String name;
    private int ywscore;
    private int mathscore;
    private int totalscore;

    public ddd090������() {
    }

    public ddd090������(String name, int ywscore, int mathscore, int totalscore) {
        this.name = name;
        this.ywscore = ywscore;
        this.mathscore = mathscore;
        this.totalscore = totalscore;
    }

    public int getTotalscore() {
        return totalscore;
    }

    public void setTotalscore(int totalscore) {
        this.totalscore = totalscore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYwscore() {
        return ywscore;
    }

    public void setYwscore(int ywscore) {
        this.ywscore = ywscore;
    }

    public int getMathscore() {
        return mathscore;
    }

    public void setMathscore(int mathscore) {
        this.mathscore = mathscore;
    }

    /**
     * �����ķ���������ֱ������һ���ܷ�����
     * �����ṩһ���ַܷ���
     */
    public int getsum() {
        return this.ywscore + this.mathscore;
    }
}
