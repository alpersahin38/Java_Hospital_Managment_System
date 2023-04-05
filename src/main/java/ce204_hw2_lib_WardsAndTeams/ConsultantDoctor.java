package ce204_hw2_lib_WardsAndTeams;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import java.util.*;

import ce204_hw2_lib_Organization.History;
import ce204_hw2_lib_Organization.Person.Gender;

import java.sql.Date;

// line 33 "ce204-hw2-WardsAndTeams.ump"
// line 94 "ce204-hw2-WardsAndTeams.ump"
public class ConsultantDoctor extends Doctor
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ConsultantDoctor Associations
  private Team team;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ConsultantDoctor()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public Team getTeam()
  {
    return team;
  }

  public boolean hasTeam()
  {
    boolean has = team != null;
    return has;
  }
  /* Code from template association_GetMany_specialization */
  public Patient getPatient_Patient(int index)
  {
    Patient aPatient = (Patient)super.getPatient(index);
    return aPatient;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Patient> getPatients_Patient()
  {
    List<? extends Patient> newPatients = super.getPatients();
    return (List<Patient>)newPatients;
  }
  /* Code from template association_SetOptionalOneToOne */
  public boolean setTeam(Team aNewTeam)
  {
    boolean wasSet = false;
    if (team != null && !team.equals(aNewTeam) && equals(team.getConsultantDoctor()))
    {
      //Unable to setTeam, as existing team would become an orphan
      return wasSet;
    }

    team = aNewTeam;
    ConsultantDoctor anOldConsultantDoctor = aNewTeam != null ? aNewTeam.getConsultantDoctor() : null;

    if (!this.equals(anOldConsultantDoctor))
    {
      if (anOldConsultantDoctor != null)
      {
        anOldConsultantDoctor.team = null;
      }
      if (team != null)
      {
        team.setConsultantDoctor(this);
      }
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfPatients_Patient()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne_specialization */
  public Patient addPatient(String aId, Gender aGender, int aAge, Date aAccepted, History aSickness, Ward aWard, Team aTeam)
  {
    // need to keep this because of the type differences between sub & super classes
    return new Patient(aId, aGender, aAge, aAccepted, aSickness, aWard, aTeam);
  }
  public void delete()
  {
    Team existingTeam = team;
    team = null;
    if (existingTeam != null)
    {
      existingTeam.delete();
    }
    super.delete();
  }

public static ConsultantDoctor get(int i) {
	// TODO Auto-generated method stub
	return null;
}

}