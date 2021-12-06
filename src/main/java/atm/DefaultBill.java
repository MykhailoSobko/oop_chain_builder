package atm;

public abstract class DefaultBill implements Bill {
    private DefaultBill next;
    private int billAmount;

    public DefaultBill(int billAmount) {
        this.billAmount = billAmount;
    }

    @Override
    public void setNext(DefaultBill bill) {
        next = bill;
    };

    public void process(int amount) {
        if (next != null) {
            next.process(amount % billAmount);
        }
        else if (amount % billAmount != 0) {
            throw new IllegalArgumentException();
        }
        System.out.println("Please receive " + amount / billAmount + " of " + billAmount + " UAH bills");
    };
}
