package dec27thclass;

public class ContractEmployee implements employee {
    @Override
    public int calculateSalary() {

        int salary= 10000;

        return salary;
    }

    @Override
    public int getBenefits() {

        int salary=calculateSalary();
        int benefits = salary%10;

        return benefits;
    }
}
