package ce204_hw2_lib_Organization;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 113 "ce204-hw2-Organization.ump"
// line 232 "ce204-hw2-Organization.ump"
public class Address
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Address Attributes
  private String street;
  private String city;
  private String state;
  private String zipCode;
  private String country;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Address(String aStreet, String aCity, String aState, String aZipCode, String aCountry)
  {
    street = aStreet;
    city = aCity;
    state = aState;
    zipCode = aZipCode;
    country = aCountry;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setStreet(String aStreet)
  {
    boolean wasSet = false;
    street = aStreet;
    wasSet = true;
    return wasSet;
  }

  public boolean setCity(String aCity)
  {
    boolean wasSet = false;
    city = aCity;
    wasSet = true;
    return wasSet;
  }

  public boolean setState(String aState)
  {
    boolean wasSet = false;
    state = aState;
    wasSet = true;
    return wasSet;
  }

  public boolean setZipCode(String aZipCode)
  {
    boolean wasSet = false;
    zipCode = aZipCode;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountry(String aCountry)
  {
    boolean wasSet = false;
    country = aCountry;
    wasSet = true;
    return wasSet;
  }

  public String getStreet()
  {
    return street;
  }

  public String getCity()
  {
    return city;
  }

  public String getState()
  {
    return state;
  }

  public String getZipCode()
  {
    return zipCode;
  }

  public String getCountry()
  {
    return country;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "street" + ":" + getStreet()+ "," +
            "city" + ":" + getCity()+ "," +
            "state" + ":" + getState()+ "," +
            "zipCode" + ":" + getZipCode()+ "," +
            "country" + ":" + getCountry()+ "]";
  }
}