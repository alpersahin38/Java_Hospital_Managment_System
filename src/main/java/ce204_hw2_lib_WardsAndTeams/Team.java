package ce204_hw2_lib_WardsAndTeams;
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import java.util.*;

import ce204_hw2_lib_Organization.History;
import ce204_hw2_lib_Organization.Person.Gender;

import java.sql.Date;

// line 47 "ce204-hw2-WardsAndTeams.ump"
// line 106 "ce204-hw2-WardsAndTeams.ump"
public class Team
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Team Attributes
  private String name;

  //Team Associations
  private List<Doctor> doctors;
  private Hospital hospital;
  private List<Patient> patients;
  private ConsultantDoctor consultantDoctor;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Team(String aName, Hospital aHospital, ConsultantDoctor aConsultantDoctor)
  {
    name = aName;
    doctors = new ArrayList<Doctor>();
    boolean didAddHospital = setHospital(aHospital);
    if (!didAddHospital)
    {
      throw new RuntimeException("Unable to create team due to hospital. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    patients = new ArrayList<Patient>();
    boolean didAddConsultantDoctor = setConsultantDoctor(aConsultantDoctor);
    if (!didAddConsultantDoctor)
    {
      throw new RuntimeException("Unable to create team due to consultantDoctor. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }
  /* Code from template association_GetMany */
  public Doctor getDoctor(int index)
  {
    Doctor aDoctor = doctors.get(index);
    return aDoctor;
  }

  public List<Doctor> getDoctors()
  {
    List<Doctor> newDoctors = Collections.unmodifiableList(doctors);
    return newDoctors;
  }

  public int numberOfDoctors()
  {
    int number = doctors.size();
    return number;
  }

  public boolean hasDoctors()
  {
    boolean has = doctors.size() > 0;
    return has;
  }

  public int indexOfDoctor(Doctor aDoctor)
  {
    int index = doctors.indexOf(aDoctor);
    return index;
  }
  /* Code from template association_GetOne */
  public Hospital getHospital()
  {
    return hospital;
  }
  /* Code from template association_GetMany */
  public Patient getPatient(int index)
  {
    Patient aPatient = patients.get(index);
    return aPatient;
  }

  public List<Patient> getPatients()
  {
    List<Patient> newPatients = Collections.unmodifiableList(patients);
    return newPatients;
  }

  public int numberOfPatients()
  {
    int number = patients.size();
    return number;
  }

  public boolean hasPatients()
  {
    boolean has = patients.size() > 0;
    return has;
  }

  public int indexOfPatient(Patient aPatient)
  {
    int index = patients.indexOf(aPatient);
    return index;
  }
  /* Code from template association_GetOne */
  public ConsultantDoctor getConsultantDoctor()
  {
    return consultantDoctor;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfDoctors()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addDoctor(Doctor aDoctor)
  {
    boolean wasAdded = false;
    if (doctors.contains(aDoctor)) { return false; }
    Team existingTeam = aDoctor.getTeam();
    if (existingTeam == null)
    {
      aDoctor.setTeam(this);
    }
    else if (!this.equals(existingTeam))
    {
      existingTeam.removeDoctor(aDoctor);
      addDoctor(aDoctor);
    }
    else
    {
      doctors.add(aDoctor);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeDoctor(Doctor aDoctor)
  {
    boolean wasRemoved = false;
    if (doctors.contains(aDoctor))
    {
      doctors.remove(aDoctor);
      aDoctor.setTeam(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addDoctorAt(Doctor aDoctor, int index)
  {  
    boolean wasAdded = false;
    if(addDoctor(aDoctor))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDoctors()) { index = numberOfDoctors() - 1; }
      doctors.remove(aDoctor);
      doctors.add(index, aDoctor);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveDoctorAt(Doctor aDoctor, int index)
  {
    boolean wasAdded = false;
    if(doctors.contains(aDoctor))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDoctors()) { index = numberOfDoctors() - 1; }
      doctors.remove(aDoctor);
      doctors.add(index, aDoctor);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addDoctorAt(aDoctor, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOneToMandatoryMany */
  public boolean setHospital(Hospital aHospital)
  {
    boolean wasSet = false;
    //Must provide hospital to team
    if (aHospital == null)
    {
      return wasSet;
    }

    if (hospital != null && hospital.numberOfTeams() <= Hospital.minimumNumberOfTeams())
    {
      return wasSet;
    }

    Hospital existingHospital = hospital;
    hospital = aHospital;
    if (existingHospital != null && !existingHospital.equals(aHospital))
    {
      boolean didRemove = existingHospital.removeTeam(this);
      if (!didRemove)
      {
        hospital = existingHospital;
        return wasSet;
      }
    }
    hospital.addTeam(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPatients()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Patient addPatient(String aId, Gender aGender, int aAge, Date aAccepted, History aSickness, Ward aWard)
  {
    return new Patient(aId, aGender, aAge, aAccepted, aSickness, aWard, this);
  }

  public boolean addPatient(Patient aPatient)
  {
    boolean wasAdded = false;
    if (patients.contains(aPatient)) { return false; }
    Team existingTeam = aPatient.getTeam();
    boolean isNewTeam = existingTeam != null && !this.equals(existingTeam);
    if (isNewTeam)
    {
      aPatient.setTeam(this);
    }
    else
    {
      patients.add(aPatient);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removePatient(Patient aPatient)
  {
    boolean wasRemoved = false;
    //Unable to remove aPatient, as it must always have a team
    if (!this.equals(aPatient.getTeam()))
    {
      patients.remove(aPatient);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addPatientAt(Patient aPatient, int index)
  {  
    boolean wasAdded = false;
    if(addPatient(aPatient))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPatients()) { index = numberOfPatients() - 1; }
      patients.remove(aPatient);
      patients.add(index, aPatient);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePatientAt(Patient aPatient, int index)
  {
    boolean wasAdded = false;
    if(patients.contains(aPatient))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPatients()) { index = numberOfPatients() - 1; }
      patients.remove(aPatient);
      patients.add(index, aPatient);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPatientAt(aPatient, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOneToOptionalOne */
  public boolean setConsultantDoctor(ConsultantDoctor aNewConsultantDoctor)
  {
    boolean wasSet = false;
    if (aNewConsultantDoctor == null)
    {
      //Unable to setConsultantDoctor to null, as team must always be associated to a consultantDoctor
      return wasSet;
    }
    
    Team existingTeam = aNewConsultantDoctor.getTeam();
    if (existingTeam != null && !equals(existingTeam))
    {
      //Unable to setConsultantDoctor, the current consultantDoctor already has a team, which would be orphaned if it were re-assigned
      return wasSet;
    }
    
    ConsultantDoctor anOldConsultantDoctor = consultantDoctor;
    consultantDoctor = aNewConsultantDoctor;
    consultantDoctor.setTeam(this);

    if (anOldConsultantDoctor != null)
    {
      anOldConsultantDoctor.setTeam(null);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    while (doctors.size() > 0)
    {
      Doctor aDoctor = doctors.get(doctors.size() - 1);
      aDoctor.delete();
      doctors.remove(aDoctor);
    }
    
    Hospital placeholderHospital = hospital;
    this.hospital = null;
    if(placeholderHospital != null)
    {
      placeholderHospital.removeTeam(this);
    }
    for(int i=patients.size(); i > 0; i--)
    {
      Patient aPatient = patients.get(i - 1);
      aPatient.delete();
    }
    ConsultantDoctor existingConsultantDoctor = consultantDoctor;
    consultantDoctor = null;
    if (existingConsultantDoctor != null)
    {
      existingConsultantDoctor.setTeam(null);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "hospital = "+(getHospital()!=null?Integer.toHexString(System.identityHashCode(getHospital())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "consultantDoctor = "+(getConsultantDoctor()!=null?Integer.toHexString(System.identityHashCode(getConsultantDoctor())):"null");
  }
}