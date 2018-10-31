package designpatterns.chain.approvers;

public class Purchase {

  private final int number;
  private final double amount;
  private final String purpose;

  public Purchase(int number, double amount, String purpose) {
    this.number = number;
    this.amount = amount;
    this.purpose = purpose;
  }

  public int getNumber() {
    return number;
  }

  public double getAmount() {
    return amount;
  }

  public String getPurpose() {
    return purpose;
  }

  @Override
  public String toString() {
    return String.format("%d %.1f %s", getNumber(), getAmount(), getPurpose());
  }

}
