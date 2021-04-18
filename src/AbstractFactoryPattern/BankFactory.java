package AbstractFactoryPattern;

class BankFactory extends AbstractFactory {
    public Bank getBank(String bank) {
        if(bank == null){
            return null;
        }

        if(bank.equalsIgnoreCase("HSBC"))
        {
            return new HSBC();
        }
        else if(bank.equalsIgnoreCase("cityBank"))
        {
            return new cityBank();
        }
        else if(bank.equalsIgnoreCase("SCB"))
        {
            return new SCB();
        }

        return null;
    }

    public Loan getLoan(String loan){
        return null;
    }
}
