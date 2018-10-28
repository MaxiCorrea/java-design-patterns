package designpatterns.builder.user;

public class Client {

  public static void main(String[] args) {
    User user = new User.Builder("Maxi", "Correa").isFemale(false).withCity("Moreno").build();
    user.getFirstName();
    user.getLastName();
    user.isFemale();
    user.getCity();
  }

}
