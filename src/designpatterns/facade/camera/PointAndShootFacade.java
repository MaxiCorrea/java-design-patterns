package designpatterns.facade.camera;

public class PointAndShootFacade {

  private Shutter shutter;
  private Aperture aperture;
  private Film film;

  public PointAndShootFacade() {
    shutter = new Shutter();
    aperture = new Aperture();
    film = new Film();
  }

  public void takePicture() {
    LightMeter lightMeter = new LightMeter(film.getFilmSpeed());
    shutter.setSpeed(lightMeter.getRecommendedShutterSpeed());
    aperture.setSize(lightMeter.getRecommendedApertureSize());
    shutter.trigger();
  }

}
