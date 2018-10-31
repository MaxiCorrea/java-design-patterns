package designpatterns.chain.approvers;

public class VicePresident extends Approver {

  public VicePresident(Approver successor) {
    super(successor);
  }

  @Override
  public void processRequest(Purchase purchase) {
    if(purchase.getAmount() < 25_000.0) {
      super.printApprove(purchase);
    } else {
      super.processRequest(purchase);
    }
  }
  
}
