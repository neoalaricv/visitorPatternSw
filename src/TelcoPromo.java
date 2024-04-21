public class TelcoPromo {
    public static void main(String[] args) {
        TelcoSubscription smart = new Telco("Smart", 15, 500, false);
        TelcoSubscription globe = new Telco("Globe", 10, 450, true);
        TelcoSubscription ditto = new Telco("Ditto", 8, 400, true);

        UsagePromo promo = new TelcoAllowance();
        UnliCallTextsOffer unli = new UnliCallTextsPackage();

        System.out.println("Smart Data Usage Offer and price: " + promo.showAllowance(smart));
        System.out.println("Globe Data Usage Offer and price: " + promo.showAllowance(globe));
        System.out.println("Ditto Data Usage Offer and price: " + promo.showAllowance(ditto));

        System.out.println("\nSmart unlimited calls and text package: " +
                unli.showUnliCallsTextOffer(smart));
        System.out.println("Globe unlimited calls and text package: " +
                unli.showUnliCallsTextOffer(globe));
        System.out.println("Ditto unlimited calls and text package: " +
                unli.showUnliCallsTextOffer(ditto));
    }
}