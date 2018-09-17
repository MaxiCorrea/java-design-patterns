package designpatterns.builder.user;

import static org.junit.Assert.*;
import org.junit.Test;

public class UserTest {

  @Test
  public void shouldBuildAUserWithAllData() {
    User user = new User.Builder("Maxi" , "Correa").
                    withMiddleName("").
                    withSalutation("Hello").
                    withSuffix("MC").
                    withStreetAddress("Hebert").
                    withCity("Buenos Aires").
                    withState("Moreno").
                    isFemale(false).
                    isEmployed(false).
                    isHomeOwner(false).
                    build();
    
    assertEquals("Correa" , user.getFirstName());
    assertEquals("Maxi" , user.getLastName());
    assertTrue(user.getMiddleName().isEmpty());
    assertEquals("Hello" , user.getSalutation());
    assertEquals("MC" , user.getSuffix());
    assertEquals("Hebert" , user.getStreetAddress());
    assertEquals("Buenos Aires" , user.getCity());
    assertEquals("Moreno" , user.getState());
    assertFalse(user.isFemale());
    assertFalse(user.isEmployed());
    assertFalse(user.isHomewOwner());   
  }

}
