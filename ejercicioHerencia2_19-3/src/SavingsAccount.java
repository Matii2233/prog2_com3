public class SavingsAccount extends Account{
    protected boolean isActive;

    public SavingsAccount(float balance, float annualRate) {
        super(balance, annualRate);
        if (balance>=10000) {
            this.isActive = true;
        } else {
            this.isActive = false;
        }
        this.withdrawsNumber = 0;
        this.consignmentNumber = 0;
        this.monthlyFee = 0;
    }

    public boolean isActive() {
        return isActive;
    }


    @Override
    public void toConsign(float n){
        if (isActive) {
            this.balance = this.balance + n;
            consignmentNumber++;
        } else {
            System.out.println("La cuenta no esta activa");
            consignmentNumber++;
        }
    }
    public void toWithdraw(float n) {
        if (isActive && n <= balance && n >0) {
            this.balance = this.balance - n;
            withdrawsNumber++;
        } else if (isActive == false && n<= balance && n>0) {
            System.out.println("La cuenta no esta activa");
            withdrawsNumber++;
        } else if (n> balance || n<0) {
            System.out.println("Cantidad incorrecta");
            withdrawsNumber++;
        }
    }
    public void calculateMonthlyExtract() {
        float monthlyRate = annualRate/12;
        if (withdrawsNumber>4) {
            float monthlyExtract = this.balance*(monthlyFee+1000-monthlyRate);
            System.out.println("El extracto mensual es: "+ monthlyExtract);
        } else {
            float monthlyExtract = this.balance*(monthlyFee-monthlyRate);
            System.out.println("El extracto mensual es: "+ monthlyExtract);
        }
    }
    public void calculateMonthlyRate() {
        System.out.println("El interes mensual es: "+ balance*annualRate/12f);
    }
    public void print() {
        System.out.println("fondos: "+ balance);
        System.out.println("comision mensual: "+ monthlyFee);
        System.out.println("transacciones de la cuenta: "+ (withdrawsNumber+consignmentNumber));
    }
}
