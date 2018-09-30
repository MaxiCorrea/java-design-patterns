package designpatterns.facade.camera;

public class Shutter {

  private double speed;

  public void setSpeed(double speed) {
    this.speed = speed;
  }

  public void trigger() {
    System.out.format("Open shutter for %.3f seconds\n", speed);
  }

}
