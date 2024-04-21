public class UnliCallTextsPackage implements UnliCallTextsOffer {
    @Override
    public String showUnliCallsTextOffer(TelcoSubscription telcoSubscription) {
        return telcoSubscription.getTelcoName() + "\n" +
                (telcoSubscription.getUnliCallText() ? "Unlimited calls and texts for ₱0" : "No unlimited calls and texts");
    }
}