package AbstractFactoryPattern;

public class FactoryCreator
{
    public static AbstractFactory getFactory(String choice)
    {
        if(choice.equalsIgnoreCase("Loan"))
            return new LoanFactory();
        else if(choice.equalsIgnoreCase("Bank"))
            return new BankFactory();

        return null;
    }
}
