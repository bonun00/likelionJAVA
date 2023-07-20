public class SavingAccount extends BankAccount implements Withdrawable {

    boolean isOverdraft;
    void transfer(){}
    //외부에서 클래스 접근해서 사용할려면 public 사용
    public void withdraw(){
        System.out.println("Withdraw");
    }

}
