package ce204_hw2_lib_Organization;
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import java.sql.Date;

// line 122 "ce204-hw2-Organization.ump"
// line 237 "ce204-hw2-Organization.ump"
public class History
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //History Attributes
  private String diagnosis;
  private String treatment;
  private String notes;
  private Date date;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public History(String aDiagnosis, String aTreatment, String aNotes, Date aDate)
  {
    diagnosis = aDiagnosis;
    treatment = aTreatment;
    notes = aNotes;
    date = aDate;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setDiagnosis(String aDiagnosis)
  {
    boolean wasSet = false;
    diagnosis = aDiagnosis;
    wasSet = true;
    return wasSet;
  }

  public boolean setTreatment(String aTreatment)
  {
    boolean wasSet = false;
    treatment = aTreatment;
    wasSet = true;
    return wasSet;
  }

  public boolean setNotes(String aNotes)
  {
    boolean wasSet = false;
    notes = aNotes;
    wasSet = true;
    return wasSet;
  }

  public boolean setDate(Date aDate)
  {
    boolean wasSet = false;
    date = aDate;
    wasSet = true;
    return wasSet;
  }

  public String getDiagnosis()
  {
    return diagnosis;
  }

  public String getTreatment()
  {
    return treatment;
  }

  public String getNotes()
  {
    return notes;
  }

  public Date getDate()
  {
    return date;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "diagnosis" + ":" + getDiagnosis()+ "," +
            "treatment" + ":" + getTreatment()+ "," +
            "notes" + ":" + getNotes()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "date" + "=" + (getDate() != null ? !getDate().equals(this)  ? getDate().toString().replaceAll("  ","    ") : "this" : "null");
  }
}