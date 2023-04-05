package ce204_hw2_lib_Organization;
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 137 "ce204-hw2-Organization.ump"
// line 247 "ce204-hw2-Organization.ump"
public class FullName
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //FullName Attributes
  private String title;
  private String givenName;
  private String middleName;
  private String familyName;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public FullName(String aTitle, String aGivenName, String aMiddleName, String aFamilyName)
  {
    title = aTitle;
    givenName = aGivenName;
    middleName = aMiddleName;
    familyName = aFamilyName;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setTitle(String aTitle)
  {
    boolean wasSet = false;
    title = aTitle;
    wasSet = true;
    return wasSet;
  }

  public boolean setGivenName(String aGivenName)
  {
    boolean wasSet = false;
    givenName = aGivenName;
    wasSet = true;
    return wasSet;
  }

  public boolean setMiddleName(String aMiddleName)
  {
    boolean wasSet = false;
    middleName = aMiddleName;
    wasSet = true;
    return wasSet;
  }

  public boolean setFamilyName(String aFamilyName)
  {
    boolean wasSet = false;
    familyName = aFamilyName;
    wasSet = true;
    return wasSet;
  }

  public String getTitle()
  {
    return title;
  }

  public String getGivenName()
  {
    return givenName;
  }

  public String getMiddleName()
  {
    return middleName;
  }

  public String getFamilyName()
  {
    return familyName;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "title" + ":" + getTitle()+ "," +
            "givenName" + ":" + getGivenName()+ "," +
            "middleName" + ":" + getMiddleName()+ "," +
            "familyName" + ":" + getFamilyName()+ "]";
  }
}