package designpatterns.chain.approvers;

public class Director extends Approver {

  public Director(Approver successor) {
    super(successor);
  }

  @Override
  public void processRequest(Purchase purchase) {
    if(purchase.getAmount() < 10_000.0) {
      super.printApprove(purchase);
    } else {
      super.processRequest(purchase);      
    }
  }
  
}
