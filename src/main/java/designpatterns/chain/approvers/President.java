package designpatterns.chain.approvers;

public class President extends Approver {

  public President(Approver successor) {
    super(successor);
  }

  @Override
  public void processRequest(Purchase purchase) {
    if (purchase.getAmount() < 100_000.0) {
      super.printApprove(purchase);
    } else {
      super.processRequest(purchase);
    }
  }

}
