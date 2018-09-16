package designpatterns.builder.user;

public class User {

  private final String lastName;
  private final String firstName;
  private final String middleName;
  private final String salutation;
  private final String suffix;
  private final String streetAddress;
  private final String city;
  private final String state;
  private final boolean isFemale;
  private final boolean isEmployed;
  private final boolean isHomewOwner;

  private User(Builder builder) {
    this.lastName = builder.lastName;
    this.firstName = builder.firstName;
    this.middleName = builder.middleName;
    this.salutation = builder.salutation;
    this.suffix = builder.suffix;
    this.streetAddress = builder.streetAddress;
    this.city = builder.city;
    this.state = builder.state;
    this.isFemale = builder.isFemale;
    this.isEmployed = builder.isEmployed;
    this.isHomewOwner = builder.isHomewOwner;
  }

  public String getLastName() {
    return lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public String getSalutation() {
    return salutation;
  }

  public String getSuffix() {
    return suffix;
  }

  public String getStreetAddress() {
    return streetAddress;
  }

  public String getCity() {
    return city;
  }

  public String getState() {
    return state;
  }

  public boolean isFemale() {
    return isFemale;
  }

  public boolean isEmployed() {
    return isEmployed;
  }

  public boolean isHomewOwner() {
    return isHomewOwner;
  }

  public static class Builder {

    private String lastName;
    private String firstName;
    private String middleName;
    private String salutation;
    private String suffix;
    private String streetAddress;
    private String city;
    private String state;
    private boolean isFemale;
    private boolean isEmployed;
    private boolean isHomewOwner;

    public Builder(String lastName, String firstName) {
      this.lastName = lastName;
      this.firstName = firstName;
    }

    public Builder withMiddleName(String middleName) {
      this.middleName = middleName;
      return this;
    }

    public Builder withSalutation(String salutation) {
      this.salutation = salutation;
      return this;
    }

    public Builder withSuffix(String suffix) {
      this.suffix = suffix;
      return this;
    }

    public Builder withStreetAddress(String streetAddress) {
      this.streetAddress = streetAddress;
      return this;
    }

    public Builder withCity(String city) {
      this.city = city;
      return this;
    }

    public Builder withState(String state) {
      this.state = state;
      return this;
    }

    public Builder isFemale(boolean isFemale) {
      this.isFemale = isFemale;
      return this;
    }

    public Builder isEmployed(boolean isEmployed) {
      this.isEmployed = isEmployed;
      return this;
    }

    public Builder isHomewOwner(boolean isHomewOwner) {
      this.isHomewOwner = isHomewOwner;
      return this;
    }

    public User build() {
      return new User(this);
    }

  }

}
