package dec16thclass;

public class BuilderPattern {

    public static void main(String[] args) {


        //Abstraction - Revealing the functionality and hiding the implementation
        BankingSite site = new BankingSite("Admin");

        site.login()
                .navigateToBalancesTab()
                .viewCredits()
                .navigateToBalancesTab()
                .viewCurrentBalanceAsOfDate()
                .viewDebits()
                .logout();




    }
}
