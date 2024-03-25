public class Main {
    public static void main(String[] args) {
        //SavingsAccount sAccount = new SavingsAccount(8000, 0.12f);
        SavingsAccount sAccount = new SavingsAccount(12000, 0.12f);
        CommonAccount cAccount = new CommonAccount(5000, 0.05f);

        
        // cuenta ahorros
        sAccount.setMonthlyFee(0.01f);
        System.out.println(sAccount.getBalance());
        System.out.println(sAccount.getAnnualRate()*sAccount.getBalance());
        System.out.println(sAccount.getMonthlyFee()*sAccount.getBalance());

        System.out.println("Consignacion de 1000");
        sAccount.toConsign(1000);
        System.out.println("actualizacion de fondos: "+sAccount.getBalance());

        System.out.println("Retiro de 3100");
        sAccount.toWithdraw(3100);
        System.out.println("actualizacion de fondos: "+sAccount.getBalance());

        System.out.println();
        sAccount.calculateMonthlyRate();

        System.out.println();
        sAccount.calculateMonthlyExtract();

        System.out.println();
        sAccount.print();




        // cuenta corriente
        cAccount.setMonthlyFee(0.01f);
        System.out.println(cAccount.getBalance());
        System.out.println(cAccount.getAnnualRate()*cAccount.getBalance());
        System.out.println(cAccount.getMonthlyFee()*cAccount.getBalance());


        System.out.println("retiro de 6200");
        cAccount.toWithdraw(6200);
        System.out.println("fondos actualizados: "+ cAccount.getBalance());

        System.out.println("consignacion de 4200");
        cAccount.toConsign(4200);
        System.out.println("fondos actualizados "+ cAccount.getBalance());

        System.out.println();
        cAccount.calculateMonthlyRate();

        System.out.println();
        cAccount.calculateMonthlyExtract();

        System.out.println();
        cAccount.print();
    }
}