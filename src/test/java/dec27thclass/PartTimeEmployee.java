package dec27thclass;

public class PartTimeEmployee {

    public class ContractEmployee implements employee {
        @Override
        public int calculateSalary() {

            int salary = 25000;

            return salary;
        }

        @Override
        public int getBenefits() {

            int salary = calculateSalary();
            int benefits = salary % 5;

            return benefits;
        }
    }

}


