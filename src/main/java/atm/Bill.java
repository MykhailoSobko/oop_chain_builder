package atm;

public interface Bill {
    void setNext(DefaultBill bill);
    void process(int amount);
}
