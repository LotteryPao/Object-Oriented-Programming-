public class CoffeeShop {
    public static void main(String[] args) {
       
        Customer joseph = new Customer("Joseph", 200);
        Customer peter = new Customer("Peter", 0);
        Customer unknown = new Customer();

        peter.addPoints(200);
        peter.addPoints(20);

        joseph.redeemReward();
        peter.redeemReward();
        unknown.redeemReward();

        joseph.displayCustomerInfo();
        peter.displayCustomerInfo();
        unknown.displayCustomerInfo();

        Customer.displayTotalCustomers();
       
        Customer diane = new Customer("Diane", 0);
        diane.addPoints(50);
        Customer.displayTotalCustomers();

        Customer.getAllowedRewardsRedemption(joseph);
        Customer.getAllowedRewardsRedemption(peter);
        Customer.getAllowedRewardsRedemption(diane);
    }
}
