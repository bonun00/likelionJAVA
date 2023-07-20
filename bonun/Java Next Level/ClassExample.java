public class ClassExample{

    public static void main(String[] args) {

         BankAccount account = new BankAccount();
//         System.out.println(account);
//         System.out.println(account.bankCode);
//         System.out.println(account.isDormant);
//
//         account.password = 123456;
         account.changePassword(123456);
         System.out.println(account.getPassword());
         //System.out.println(account.password);

    }
}