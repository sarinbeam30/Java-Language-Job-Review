package AbstractFactoryPattern;

class HSBC implements Bank{

    private final String bankName;  // bankName --> uninitialized final variable or blank final variable
    public HSBC(){
        // we can only initialized final variable in constructor part
        bankName = "HSBC Bank";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
