public class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(TelcoSubscription telcoSubscription) {
        return telcoSubscription.getTelcoName() + "\n" + telcoSubscription.getDataAllowance() + " GB for ₱" + telcoSubscription.getPromoPrice();
    }
}