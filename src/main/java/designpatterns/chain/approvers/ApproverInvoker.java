package designpatterns.chain.approvers;

public class ApproverInvoker {

  private Approver approverChain;

  public ApproverInvoker() {
    buildChain();
  }

  private void buildChain() {
    approverChain = new Director(new VicePresident(new President(null)));
  }

  public void makeRequest(Purchase purchase) {
    approverChain.processRequest(purchase);
  }
  
}
