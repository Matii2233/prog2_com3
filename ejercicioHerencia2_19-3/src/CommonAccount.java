public class CommonAccount extends Account{
    //atributos
    protected float overdraft;



    //constructor
    public CommonAccount(float balance, float annualRate) {
        super(balance, annualRate);
        this.overdraft = 0;
    }



    //getters and setters
    public float getOverdraft() {return overdraft;}
    public void setOverdraft(float o) {this.overdraft = o;}



    //metodos
    @Override
    public void toConsign(float n){
        if (overdraft==0){
            balance = balance+n;
            consignmentNumber++;
        } else if (overdraft>0){
            if (n>overdraft) {
                n=n-overdraft;
                overdraft=0;
                balance = balance+n;
                consignmentNumber++;
            } else if (n<overdraft) {
                overdraft=overdraft-n;
                n=0;
                balance = balance + n;
                consignmentNumber++;
            } else if (n==overdraft) {
                n=n-overdraft;
                overdraft=0;
                balance = balance + n;
                consignmentNumber++;
            }
        }
    }
    public void toWithdraw(float n){
        if (n>balance) {
            overdraft -= balance-n;
            balance = 0;
            withdrawsNumber++;
        } if (n<=balance) {
            balance = balance - n;
            withdrawsNumber++;
        }
    }
    public void calculateMonthlyRate(){System.out.println("El interes mensual es: "+ balance*annualRate/12f);}
    public void calculateMonthlyExtract(){
        float monthlyRate = annualRate/12;
        float monthlyExtract = balance*(monthlyFee-monthlyRate);
        System.out.println("El extracto mensual es: "+ monthlyExtract);
    }
    public void print(){
        System.out.println("fondos: "+ balance);
        System.out.println("comision mensual: "+ monthlyFee);
        System.out.println("transacciones de la cuenta: "+ (withdrawsNumber+consignmentNumber));
        System.out.println("sobregiro: "+ overdraft);
    }
}
