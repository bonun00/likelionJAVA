public class BankAccount{
    // 멤버 변수
    // private <= 동일한 클래스에서만 수정할 수 있다
    private int bankCode;
    private int accountNO;
    private String owner;
    private int balance;
    private int password;
    private boolean isDormant;
//private <- 멤버 변수를 함부로 접근하지 못하도록 한다
    // 메소드
    public void inquiry() {}
    public void deposit() {}
    public void heldInDormant() {}
    public void changePassword(int password){
        this.password = password;
    }

    BankAccount(){

    }


    //생성자
    //클래스 내부에 정의
    //생성자 메서드명은 클래스의 클래스명과 일치
    //new 연산자와 함께 사용
    BankAccount(
            int bankCode,
            int accountNO,
            String owner,
            int balance,
            int password,
            boolean isDormant
    ){
       this.bankCode = bankCode;
       this.accountNO = accountNO;
       this.owner = owner;
       this.balance = balance;
       this.password = password;
       this.isDormant = isDormant;
    }


    public int getBankCode() {
        return bankCode;
    }

    public void setBankCode(int bankCode) {
        this.bankCode = bankCode;
    }

    public int getAccountNO() {
        return accountNO;
    }

    public void setAccountNO(int accountNO) {
        this.accountNO = accountNO;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public boolean isDormant() {
        return isDormant;
    }

    public void setDormant(boolean dormant) {
        isDormant = dormant;
    }
}
