package designpatterns.facade.camera;

public class Client {

  private PointAndShootFacade facade;
  
  public Client(PointAndShootFacade facade) {
    this.facade = facade;
  }
  
  public void takePicture() {
    facade.takePicture();
  }
  
}
