package dec27thclass;

public class FullTimeEmployee {

    public class ContractEmployee implements employee {
        @Override
        public int calculateSalary() {

            int salary = 40000;

            return salary;
        }

        @Override
        public int getBenefits() {

            int salary = calculateSalary();
            int benefits = salary % 30;

            return benefits;
        }
    }
}
