package ce204_hw2_test;

import static org.junit.Assert.*;


import org.junit.Test;


import ce204_hw2_lib_Treatment.*;

public class ce204_hw2_test_Treatment {

	
	@Test
	public void DiagnosisPatient_Test1() {
	    Patient patient = new Patient();
	    Diagnosis diagnosis = new Diagnosis(patient);
        assertEquals(patient, diagnosis.getPatient());

	}
	
	@Test
    public void DiagnosisExamination_Test1() {
	    Patient patient = new Patient();
	    Doctor doctor = new Doctor();
	    Diagnosis diagnosis = new Diagnosis(patient);
        Examination examination = new Examination(patient,doctor);
        diagnosis.addExamination(examination);
        assertEquals(1, diagnosis.numberOfExaminations());
        assertEquals(examination, diagnosis.getExamination(0));
    }
	
	@Test
    public void DiagnosisTreatment_Test1() {
	    Patient patient = new Patient();
	    Treatment treatment = new Treatment(patient);
	    Diagnosis diagnosis = new Diagnosis(patient);
        diagnosis.addTreatment(treatment);
        assertEquals(1, diagnosis.numberOfTreatments());
        assertEquals(treatment, diagnosis.getTreatment(0));
    }
	
	
	@Test
    public void DiagnosisPresscription_Test1() {
	    Patient patient = new Patient();
	    Presscription presscription = new Presscription(patient);
	    Diagnosis diagnosis = new Diagnosis(patient);
        diagnosis.addPresscription(presscription);
        assertEquals(1, diagnosis.numberOfPresscriptions());
        assertEquals(presscription, diagnosis.getPresscription(0));
    }
	
	@Test
    public void DiagnosisDoctor_Test1() {
	    Patient patient = new Patient();
	    Doctor doctor = new Doctor();
	    Diagnosis diagnosis = new Diagnosis(patient);
        diagnosis.addDoctor(doctor);
        assertEquals(1, diagnosis.numberOfDoctors());
        assertEquals(doctor, diagnosis.getDoctor(0));
    }
	

	@Test
    public void DoctorDiagnosis_Test1() {
	    Patient patient = new Patient();
	    Doctor doctor = new Doctor();
	    Diagnosis diagnosis = new Diagnosis(patient);
        doctor.addDiagnosi(diagnosis);
        assertEquals(1, doctor.numberOfDiagnosis());
        assertEquals(diagnosis, doctor.getDiagnosi(0));
    }
	
	
	
	@Test
    public void DoctorPresscriptions_Test1() {
	    Patient patient = new Patient();
	    Doctor doctor = new Doctor();
	    Presscription presscription = new Presscription(patient);
        doctor.addPresscription(presscription);
        assertEquals(1, doctor.numberOfPresscriptions());
        assertEquals(presscription, doctor.getPresscription(0));
    }
	
	
	
	@Test
    public void DoctorPatients_Test1() {
	    Patient patient = new Patient();
	    Doctor doctor = new Doctor();
	    doctor.addPatient(patient);
        assertEquals(1, doctor.numberOfPatients());
        assertEquals(patient, doctor.getPatient(0));
    }

	
	@Test
    public void DoctorTreatments_Test1() {
	    Patient patient = new Patient();
	    Treatment treatment = new Treatment(patient);
	    Doctor doctor = new Doctor();
	    doctor.addTreatment(treatment);
        assertEquals(1, doctor.numberOfTreatments());
        assertEquals(treatment, doctor.getTreatment(0));
    }
	
	@Test
    public void DoctorExaminations_Test1() {
	    Patient patient = new Patient();
	    Doctor doctor = new Doctor();
	    doctor.addExamination(patient);
	    Examination examination = new Examination(patient, doctor);
        assertEquals(2, doctor.numberOfExaminations());
        assertEquals(examination, doctor.getExamination(1));
    }
	
	
	
	@Test
    public void ExaminationDiagnosis_Test1() {
	    Patient patient = new Patient();
	    Doctor doctor = new Doctor();
	    Diagnosis diagnosis = new Diagnosis(patient);
	    Examination examination = new Examination(patient, doctor);
	    examination.addDiagnosi(diagnosis);
        assertEquals(1, examination.numberOfDiagnosis());
        assertEquals(diagnosis, examination.getDiagnosi(0));
    }
	
	
	@Test
    public void ExaminationDoctor_Test1() {
	    Patient patient = new Patient();
	    Doctor doctor = new Doctor();
	    Examination examination = new Examination(patient, doctor);
        assertEquals(doctor, examination.getDoctor());
    }
	
	
	@Test
    public void ExaminationPatient_Test1() {
	    Patient patient = new Patient();
	    Doctor doctor = new Doctor();
	    Examination examination = new Examination(patient, doctor);
        assertEquals(patient, examination.getPatient());
    }
	
	@Test
    public void PatientTreatment_Test1() {
	    Patient patient = new Patient();
	    Treatment treatment = new Treatment(patient);
	    patient.addTreatment(treatment);
        assertEquals(1, patient.numberOfTreatments());
        assertEquals(treatment, patient.getTreatment(0));
    }
	
	@Test
    public void PatientPresscription_Test1() {
	    Patient patient = new Patient();
	    Presscription presscription = new Presscription(patient);
	    patient.addPresscription();
        assertEquals(2, patient.numberOfPresscriptions());
        assertEquals(presscription, patient.getPresscription(0));
    }
	
	@Test
    public void PatientDoctor_Test1() {
	    Patient patient = new Patient();
	    Doctor doctor = new Doctor();
	    patient.addDoctor(doctor);
        assertEquals(1, patient.numberOfDoctors());
        assertEquals(doctor, patient.getDoctor(0));
    }
	
	@Test
    public void PatientDiagnosis_Test1() {
	    Patient patient = new Patient();
	    Diagnosis diagnosis = new Diagnosis(patient);
	    patient.addDiagnosi(diagnosis);
        assertEquals(1, patient.numberOfDiagnosis());
        assertEquals(diagnosis, patient.getDiagnosi(0));
    }
	
	@Test
    public void PatientExamination_Test1() {
	    Patient patient = new Patient();
	    Doctor doctor = new Doctor();
	    Examination examination = new Examination(patient, doctor);
	    patient.addExamination(examination);
        assertEquals(1, patient.numberOfExaminations());
        assertEquals(examination, patient.getExamination(0));
    }	
	
	  //private List<Diagnosis> diagnosis;

	@Test
    public void PresscriptionTherapy_Test1() {
	    Patient patient = new Patient();
	    Presscription presscription = new Presscription(patient);
	    Therapy therapy = new Therapy(patient, presscription);
	    presscription.addTherapy(patient);
        assertEquals(2, presscription.numberOfTherapies());
        assertEquals(therapy, presscription.getTherapy(0));
    }
	
	@Test
    public void PresscriptionPatient_Test1() {
	    Patient patient = new Patient();
	    Presscription presscription = new Presscription(patient);
        assertEquals(patient, presscription.getPatient());
    }
	
	@Test
    public void PresscriptionDoctor_Test1() {
	    Patient patient = new Patient();
	    Presscription presscription = new Presscription(patient);
	    Doctor doctor = new Doctor();
	    presscription.addDoctor(doctor);
        assertEquals(1, presscription.numberOfDoctors());
        assertEquals(doctor, presscription.getDoctor(0));
    }
	
	
	@Test
    public void PresscriptionDiagnosis_Test1() {
	    Patient patient = new Patient();
	    Presscription presscription = new Presscription(patient);
	    Diagnosis diagnosis = new Diagnosis(patient);
	    presscription.addDiagnosi(diagnosis);
        assertEquals(1, presscription.numberOfDiagnosis());
        assertEquals(diagnosis, presscription.getDiagnosi(0));
    }
	
	
	
	@Test
    public void TreatmentPatient_Test1() {		
		Patient patient = new Patient();
		Treatment treatment = new Treatment(patient);
        assertEquals(patient, treatment.getPatient());
    }
	
	
	@Test
    public void TreatmentDoctor_Test1() {
	    Patient patient = new Patient();
		Treatment treatment = new Treatment(patient);
	    Doctor doctor = new Doctor();
	    treatment.addDoctor(doctor);
        assertEquals(1, treatment.numberOfDoctors());
        assertEquals(doctor, treatment.getDoctor(0));
    }
	
	@Test
    public void TreatmentDiagnosis_Test1() {
		Patient patient = new Patient();
		Treatment treatment = new Treatment(patient);
	    Diagnosis diagnosis = new Diagnosis(patient);
	    treatment.addDiagnosi(diagnosis);
        assertEquals(1, treatment.numberOfDiagnosis());
        assertEquals(diagnosis, treatment.getDiagnosi(0));
    }
	
	
	@Test
    public void SurgeryPatient_Test1() {		
		Patient patient = new Patient();
		Surgery surgery = new Surgery(patient);
		assertEquals(patient, surgery.getPatient());
    }
	
	
	@Test
    public void TherapyDiagnosis_Test1() {
	    Patient patient = new Patient();
	    Presscription presscription = new Presscription(patient);
	    Therapy therapy = new Therapy(patient, presscription);
	    Diagnosis diagnosis = new Diagnosis(patient);
	    therapy.addDiagnosi(diagnosis);
        assertEquals(1, therapy.numberOfDiagnosis());
        assertEquals(diagnosis, therapy.getDiagnosi(0));
    }
	
	
	@Test
    public void TherapyDoctor_Test1() {
	    Patient patient = new Patient();
	    Presscription presscription = new Presscription(patient);
	    Therapy therapy = new Therapy(patient, presscription);
	    Doctor doctor = new Doctor();
	    therapy.addDoctor(doctor);
        assertEquals(1, therapy.numberOfDoctors());
        assertEquals(doctor, therapy.getDoctor(0));
    }
	
	
	@Test
    public void TherapyPresscription_Test1() {
	    Patient patient = new Patient();
	    Presscription presscription = new Presscription(patient);
	    Therapy therapy = new Therapy(patient, presscription);
        assertEquals(presscription, therapy.getPresscription());
    }
	
	
}
