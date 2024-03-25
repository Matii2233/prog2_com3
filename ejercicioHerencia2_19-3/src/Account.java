public abstract class Account {
    protected float balance;
    protected int consignmentNumber = 0;
    protected int withdrawsNumber = 0;
    protected float annualRate;
    protected float monthlyFee = 0;


    public Account(float balance, float annualRate) {
        this.balance = balance;
        this.annualRate = annualRate;
        this.consignmentNumber = 0;
        this.withdrawsNumber = 0;
        this.monthlyFee = 0;
    }


    public float getBalance(){return balance;}
    public void setBalance(float b){balance = b;}
    public int getConsignmentNumber(){return consignmentNumber;}
    public int getWithdrawsNumber(){return withdrawsNumber;}
    public float getAnnualRate(){return annualRate;}
    public void setAnnualRate(float ar){annualRate = ar;}
    public float getMonthlyFee(){return monthlyFee;}
    public void setMonthlyFee(float mf){monthlyFee = mf;}


    // Metodos
    public abstract void toConsign(float n);
    public abstract void toWithdraw(float n);
    public abstract void calculateMonthlyRate();
    public abstract void calculateMonthlyExtract();
    public abstract void print();
}
