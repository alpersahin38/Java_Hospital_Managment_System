package ce204_hw2_lib_Treatment;
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 44 "ce204-hw2-Treatment.ump"
// line 108 "ce204-hw2-Treatment.ump"
public class Therapy extends Treatment
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Therapy Associations
  private Presscription presscription;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Therapy(Patient aPatient, Presscription aPresscription)
  {
    super(aPatient);
    boolean didAddPresscription = setPresscription(aPresscription);
    if (!didAddPresscription)
    {
      throw new RuntimeException("Unable to create therapy due to presscription. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public Presscription getPresscription()
  {
    return presscription;
  }
  /* Code from template association_SetOneToMany */
  public boolean setPresscription(Presscription aPresscription)
  {
    boolean wasSet = false;
    if (aPresscription == null)
    {
      return wasSet;
    }

    Presscription existingPresscription = presscription;
    presscription = aPresscription;
    if (existingPresscription != null && !existingPresscription.equals(aPresscription))
    {
      existingPresscription.removeTherapy(this);
    }
    presscription.addTherapy(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Presscription placeholderPresscription = presscription;
    this.presscription = null;
    if(placeholderPresscription != null)
    {
      placeholderPresscription.removeTherapy(this);
    }
    super.delete();
  }

}