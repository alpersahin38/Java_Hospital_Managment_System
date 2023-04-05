package ce204_hw2_lib_Organization;
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 130 "ce204-hw2-Organization.ump"
// line 242 "ce204-hw2-Organization.ump"
public class Phone
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Phone Attributes
  private String countryCode;
  private String areaCode;
  private String number;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Phone(String aCountryCode, String aAreaCode, String aNumber)
  {
    countryCode = aCountryCode;
    areaCode = aAreaCode;
    number = aNumber;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCountryCode(String aCountryCode)
  {
    boolean wasSet = false;
    countryCode = aCountryCode;
    wasSet = true;
    return wasSet;
  }

  public boolean setAreaCode(String aAreaCode)
  {
    boolean wasSet = false;
    areaCode = aAreaCode;
    wasSet = true;
    return wasSet;
  }

  public boolean setNumber(String aNumber)
  {
    boolean wasSet = false;
    number = aNumber;
    wasSet = true;
    return wasSet;
  }

  public String getCountryCode()
  {
    return countryCode;
  }

  public String getAreaCode()
  {
    return areaCode;
  }

  public String getNumber()
  {
    return number;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "countryCode" + ":" + getCountryCode()+ "," +
            "areaCode" + ":" + getAreaCode()+ "," +
            "number" + ":" + getNumber()+ "]";
  }
}