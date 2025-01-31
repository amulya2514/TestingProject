package dec16thclass;

public class BankingSite {

    private String username;
    private String password;

private BankingSite(){
    System.out.println("This is a default Constructor");


}

    public BankingSite(String username){

    //only one explicit constructor can be called here
    this();
        this.username=username;

    }



    public BankingSite login(){
            System.out.println("Logged in to the banking app successfully");

            //return new BankingSite();
 //this(); //refer to the default constructor present in this class
            return this;
        }
        public BankingSite navigateToBalancesTab(){

            System.out.println("Navigate to balances tab");
            //return new BankingSite();

            return this;

        }
        public BankingSite viewCredits(){

            System.out.println("View Credits");
            //return new BankingSite();
            return this;

        }
        public BankingSite viewDebits(){

            System.out.println("View Debits");
            //Anonymus Object - Object is created in heap but there is non reference to state
            //return new BankingSite();
            return this;
            //this keyword will help us in referring to the current object that we are working on

        }
        public BankingSite viewCurrentBalanceAsOfDate(){

            System.out.println("View balances as of date");

            //return new BankingSite();
            return this;

        }

        public BankingSite generateStatements(){

            System.out.println("Generate Statements");

            //return new BankingSite();
            return this;

        }

        public BankingSite logout(){
            System.out.println("Logout from the app");

            //return new BankingSite();
            return this;
        }
    }
