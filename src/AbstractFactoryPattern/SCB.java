package AbstractFactoryPattern;

class SCB implements Bank {
   public final String bankName;

    SCB(){
        this.bankName = "SCB";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
