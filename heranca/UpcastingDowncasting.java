package heranca;

public class UpcastingDowncasting {
    public static void main(String[] args) {

        Account acc = new Account(1001, "alex", 0.0);
        BusinessAccount bacc  = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        /*UPCASTING
        -casting da subclasse para superclasse
        -uso comum: polimorfismo*/

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "BOB", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        /*DOWNCASTING
        Dawncasting:
        -casting da superclasse para a subclasse
        -palavra instanceOf
        -uso comum: métodos que recebem parâmetros genéricos (ex: Equals)*/

         BusinessAccount acc4 = (BusinessAccount)acc2;
         acc4.loan(100.0);

         // BusinessAccount acc5 = (BusinessAccount)acc3;
        if (acc3 instanceof BusinessAccount){ // se acc3 for um objeto que é instância de business acount:
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!!");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!!");
        }
    }
}
