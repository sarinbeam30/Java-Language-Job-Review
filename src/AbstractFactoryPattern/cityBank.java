package AbstractFactoryPattern;

class cityBank implements Bank {
    private final String bankName;

    cityBank() {
        this.bankName = "cityBank";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
