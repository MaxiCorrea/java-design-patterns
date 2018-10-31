package designpatterns.chain.approvers;

public abstract class Approver {

  private Approver successor;

  public Approver(Approver successor) {
    this.successor = successor;
  }

  public void processRequest(Purchase purchase) {
    if (successor != null) {
      successor.processRequest(purchase);
    }
  }

  void printApprove(Purchase purchase) {
    System.out.println(getClass().getSimpleName() + " Approved request " + purchase);
  }

}
