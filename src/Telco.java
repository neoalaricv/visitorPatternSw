public class Telco implements TelcoSubscription {
    private final String name;
    private final int dataAllowance;
    private final int promoPrice;
    private final boolean unliCallText;

    public Telco(String name, int dataAllowance, int promoPrice, boolean unliCallText) {
        this.name = name;
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.unliCallText = unliCallText;
    }

    @Override
    public int getDataAllowance() {
        return dataAllowance;
    }

    @Override
    public int getPromoPrice() {
        return promoPrice;
    }

    @Override
    public boolean getUnliCallText() {
        return unliCallText;
    }

    @Override
    public String getTelcoName() {
        return name;
    }
}