package ce204_hw2_test;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Test;

import ce204_hw2_lib_Organization.Address;
import ce204_hw2_lib_Organization.History;
import ce204_hw2_lib_WardsAndTeams.*;
import ce204_hw2_lib_Organization.Person.Gender;
import ce204_hw2_lib_Organization.Phone;

public class ce204_hw2_test_WardsAndTeams {

	@Test
	public void Hospital_Test1() {
		Phone phone = new Phone("+1", "296", "9412578");
		Address address = new Address("445 String Street", "Austin", "A", "73301", "ABD");
		Hospital hospital = new Hospital("32", address, phone);
		assertEquals("445 String Street", address.getStreet());
		assertEquals("Austin", address.getCity());
		assertEquals("A", address.getState());
		assertEquals("73301", address.getZipCode());
		assertEquals("ABD", address.getCountry());
		assertEquals("+1", phone.getCountryCode());
		assertEquals("296", phone.getAreaCode());
		assertEquals("9412578", phone.getNumber());
		assertEquals("32", hospital.getName());
	}

	@Test
	public void Hospital_Test2() {
		Phone phone = new Phone("+90", "568", "7851518");
		Address address = new Address("256 Murtaza Street", "Zonguldak", "Z", "67300", "Turkiye");
		Hospital hospital = new Hospital("45", address, phone);
		assertEquals("256 Murtaza Street", address.getStreet());
		assertEquals("Zonguldak", address.getCity());
		assertEquals("Z", address.getState());
		assertEquals("67300", address.getZipCode());
		assertEquals("Turkiye", address.getCountry());
		assertEquals("+90", phone.getCountryCode());
		assertEquals("568", phone.getAreaCode());
		assertEquals("7851518", phone.getNumber());
		assertEquals("45", hospital.getName());
	}

	@Test
	public void Hospital_Test3() {
		Phone phone = new Phone("+49", "274", "3687452");
		Address address = new Address("21 String Street", "Frankfurt", "F", "60306", "Germany");
		Hospital hospital = new Hospital("61", address, phone);
		assertEquals("21 String Street", address.getStreet());
		assertEquals("Frankfurt", address.getCity());
		assertEquals("F", address.getState());
		assertEquals("60306", address.getZipCode());
		assertEquals("Germany", address.getCountry());
		assertEquals("+49", phone.getCountryCode());
		assertEquals("274", phone.getAreaCode());
		assertEquals("3687452", phone.getNumber());
		assertEquals("61", hospital.getName());
	}

	@Test
	public void HospitalTeam_Test1() {
		Phone phone = new Phone("+1", "362", "4326435");
		Address address = new Address("964 Lexington Street", "NewYork", "NY", "10001", "ABD");
		Hospital hospital = new Hospital("Physical therapy and rehabilitation Department", address, phone);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("38", hospital, consultantDoctor);
		hospital.addTeam(team);
		assertEquals(1, hospital.numberOfTeams());
		assertEquals(team, hospital.getTeam(0));
	}

	@Test
	public void HospitalTeam_Test2() {
		Phone phone = new Phone("+34", "234", "5421167");
		Address address = new Address("367 Flash Street", "Saint", "S", "741963", "Jersey");
		Hospital hospital = new Hospital("Nutrition and diet Department", address, phone);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("53", hospital, consultantDoctor);
		hospital.addTeam(team);
		assertEquals(1, hospital.numberOfTeams());
		assertEquals(team, hospital.getTeam(0));
	}

	@Test
	public void HospitalTeam_Test3() {
		Phone phone = new Phone("+1", "798", "3456256");
		Address address = new Address("2885 Dahmer Street", "Modesto", "M", "95313", "ABD");
		Hospital hospital = new Hospital("Nutrition and diet Department", address, phone);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("66", hospital, consultantDoctor);
		hospital.addTeam(team);
		assertEquals(1, hospital.numberOfTeams());
		assertEquals(team, hospital.getTeam(0));
	}

	@Test
	public void HospitalWard_Test1() {
		Phone phone = new Phone("+1", "354", "5423145");
		Address address = new Address("Sunset Street", "Budapest", "B", "10007", "Hungary");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Ward ward = new Ward("78", Gender.Female, 0, hospital);
		hospital.addWard(ward);
		assertEquals(1, hospital.numberOfWards());
		assertEquals(ward, hospital.getWard(0));
	}

	@Test
	public void HospitalWard_Test2() {
		Phone phone = new Phone("+36", "346", "3445234");
		Address address = new Address("Cars Street", "Frankfurt", "F", "521478", "Germany");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Ward ward = new Ward("13", Gender.Female, 0, hospital);
		hospital.addWard(ward);
		assertEquals(1, hospital.numberOfWards());
		assertEquals(ward, hospital.getWard(0));
	}

	@Test
	public void HospitalWard_Test3() {
		Phone phone = new Phone("+1", "213", "2536634");
		Address address = new Address("Arroyo Street", "Habana", "H", "11300", "Cuba");
		Hospital hospital = new Hospital("Check up Department", address, phone);
		Ward ward = new Ward("89", Gender.Female, 0, hospital);
		hospital.addWard(ward);
		assertEquals(1, hospital.numberOfWards());
		assertEquals(ward, hospital.getWard(0));
	}

	@Test
	public void DoctorlSpecialty_Test1() {
		Doctor doctor = new Doctor();
		doctor.addSpecialty("Run");
		assertEquals(1, doctor.numberOfSpecialty());
		assertEquals("Run", doctor.getSpecialty(0));
	}
	
	@Test
	public void DoctorlSpecialty_Test2() {
		Doctor doctor = new Doctor();
		doctor.addSpecialty("Nothing");
		assertEquals(1, doctor.numberOfSpecialty());
		assertEquals("Nothing", doctor.getSpecialty(0));
	}
	
	@Test
	public void DoctorlSpecialty_Test3() {
		Doctor doctor = new Doctor();
		doctor.addSpecialty("swimming");
		assertEquals(1, doctor.numberOfSpecialty());
		assertEquals("swimming", doctor.getSpecialty(0));
	}

	@Test
	public void DoctorlLocations_Test1() {
		Doctor doctor = new Doctor();
		doctor.addLocation("Kayseri");
		assertEquals(1, doctor.numberOfLocations());
		assertEquals("Kayseri", doctor.getLocation(0));
	}
	
	@Test
	public void DoctorlLocations_Test2() {
		Doctor doctor = new Doctor();
		doctor.addLocation("Rize");
		assertEquals(1, doctor.numberOfLocations());
		assertEquals("Rize", doctor.getLocation(0));
	}
	
	@Test
	public void DoctorlLocations_Test3() {
		Doctor doctor = new Doctor();
		doctor.addLocation("Trabzon");
		assertEquals(1, doctor.numberOfLocations());
		assertEquals("Trabzon", doctor.getLocation(0));
	}

	@Test
	public void DoctorlPatient_Test1() {
		Doctor doctor = new Doctor();
		Phone phone = new Phone("+90", "123", "4432211");
		Address address = new Address("123 Can Street", "İstanbul", "İ", "34", "Turkey");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Ward ward = new Ward("22", Gender.Female, 0, hospital);
		Date accepted = Date.valueOf("2007-01-01");
		Date historyDate = Date.valueOf("2002-10-10");
		History history = new History("flu", "medicine", "take medicine", historyDate);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("12", hospital, consultantDoctor);
		Patient patient = new Patient("12", Gender.Female, 12, accepted, history, ward, team);
		doctor.addPatient(patient);
		assertEquals(1, doctor.numberOfPatients());
		assertEquals(patient, doctor.getPatient(0));
	}
	
	@Test
	public void DoctorlPatient_Test2() {
		Doctor doctor = new Doctor();
		Phone phone = new Phone("+87", "423", "78515123118");
		Address address = new Address("Los Street", "Los Angeles", "LA", "324", "ABD");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Ward ward = new Ward("12", Gender.Female, 0, hospital);
		Date accepted = Date.valueOf("2023-01-01");
		Date historyDate = Date.valueOf("2022-10-10");
		History history = new History("flu", "painkiller", "take medicine", historyDate);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("12", hospital, consultantDoctor);
		Patient patient = new Patient("12", Gender.Female, 33, accepted, history, ward, team);
		doctor.addPatient(patient);
		assertEquals(1, doctor.numberOfPatients());
		assertEquals(patient, doctor.getPatient(0));
	}
	
	@Test
	public void DoctorlPatient_Test3() {
		Doctor doctor = new Doctor();
		Phone phone = new Phone("+90", "213", "7851518");
		Address address = new Address("123 Nor Street", "Stockholm", "S", "44", "Sweden");
		Hospital hospital = new Hospital("Oncology Department", address, phone);
		Ward ward = new Ward("44", Gender.Female, 0, hospital);
		Date accepted = Date.valueOf("2023-01-01");
		Date historyDate = Date.valueOf("2010-10-10");
		History history = new History("flu", "pill", "take medicine", historyDate);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("44", hospital, consultantDoctor);
		Patient patient = new Patient("44", Gender.Female, 44, accepted, history, ward, team);
		doctor.addPatient(patient);
		assertEquals(1, doctor.numberOfPatients());
		assertEquals(patient, doctor.getPatient(0));
	}
	
	

	@Test
	public void PatientAllergy_Test1() {
		Phone phone = new Phone("+90", "213", "7851518");
		Address address = new Address("123 Nor Street", "Stockholm", "S", "44", "Sweden");
		Hospital hospital = new Hospital("Oncology Department", address, phone);
		Ward ward = new Ward("32", Gender.Female, 0, hospital);
		Date accepted = Date.valueOf("2023-01-01");
		Date historyDate = Date.valueOf("2010-10-10");
		History history = new History("flu", "pill", "take medicine", historyDate);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("53", hospital, consultantDoctor);
		Patient patient = new Patient("53", Gender.Female, 20, accepted, history, ward, team);
		patient.addAllergy("Peanut");
		assertEquals(1, patient.numberOfAllergies());
		assertEquals("Peanut", patient.getAllergy(0));
	}
	
	@Test
	public void PatientAllergy_Test2() {
		Phone phone = new Phone("+87", "423", "78515123118");
		Address address = new Address("Los Street", "Los Angeles", "LA", "324", "ABD");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Ward ward = new Ward("32", Gender.Female, 0, hospital);
		Date accepted = Date.valueOf("2023-01-01");
		Date historyDate = Date.valueOf("2022-10-10");
		History history = new History("flu", "painkiller", "take medicine", historyDate);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("32", hospital, consultantDoctor);
		Patient patient = new Patient("32", Gender.Female, 20, accepted, history, ward, team);
		patient.addAllergy("Banana");
		assertEquals(1, patient.numberOfAllergies());
		assertEquals("Banana", patient.getAllergy(0));
	}
	
	@Test
	public void PatientAllergy_Test3() {
		Phone phone = new Phone("+90", "123", "4432211");
		Address address = new Address("123 Can Street", "İstanbul", "İ", "34", "Turkey");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Ward ward = new Ward("32", Gender.Female, 0, hospital);
		Date accepted = Date.valueOf("2007-01-01");
		Date historyDate = Date.valueOf("2002-10-10");
		History history = new History("flu", "medicine", "take medicine", historyDate);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("32", hospital, consultantDoctor);
		Patient patient = new Patient("32", Gender.Female, 20, accepted, history, ward, team);
		patient.addAllergy("Apple");
		assertEquals(1, patient.numberOfAllergies());
		assertEquals("Apple", patient.getAllergy(0));
	}

	@Test
	public void PatientDoctor_Test1() {
		Phone phone = new Phone("+90", "123", "4432211");
		Address address = new Address("123 Can Street", "İstanbul", "İ", "34", "Turkey");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Ward ward = new Ward("32", Gender.Female, 0, hospital);
		Date accepted = Date.valueOf("2007-01-01");
		Date historyDate = Date.valueOf("2002-10-10");
		History history = new History("flu", "medicine", "take medicine", historyDate);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("66", hospital, consultantDoctor);
		Patient patient = new Patient("66", Gender.Female, 6, accepted, history, ward, team);
		Doctor doctor = new Doctor();
		patient.addDoctor(doctor);
		assertEquals(1, patient.numberOfDoctors());
		assertEquals(doctor, patient.getDoctor(0));
	}
	
	@Test
	public void PatientDoctor_Test2() {
		Phone phone = new Phone("+90", "213", "7851518");
		Address address = new Address("123 Nor Street", "Stockholm", "S", "44", "Sweden");
		Hospital hospital = new Hospital("Oncology Department", address, phone);
		Ward ward = new Ward("32", Gender.Female, 0, hospital);
		Date accepted = Date.valueOf("2023-01-01");
		Date historyDate = Date.valueOf("2010-10-10");
		History history = new History("flu", "pill", "take medicine", historyDate);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("32", hospital, consultantDoctor);
		Patient patient = new Patient("32", Gender.Female, 20, accepted, history, ward, team);
		Doctor doctor = new Doctor();
		patient.addDoctor(doctor);
		assertEquals(1, patient.numberOfDoctors());
		assertEquals(doctor, patient.getDoctor(0));
	}
	
	@Test
	public void PatientDoctor_Test3() {
		Phone phone = new Phone("+87", "423", "78515123118");
		Address address = new Address("Los Street", "Los Angeles", "LA", "324", "ABD");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Ward ward = new Ward("32", Gender.Female, 0, hospital);
		Date accepted = Date.valueOf("2023-01-01");
		Date historyDate = Date.valueOf("2022-10-10");
		History history = new History("flu", "painkiller", "take medicine", historyDate);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("4", hospital, consultantDoctor);
		Patient patient = new Patient("4", Gender.Female, 34, accepted, history, ward, team);
		Doctor doctor = new Doctor();
		patient.addDoctor(doctor);
		assertEquals(1, patient.numberOfDoctors());
		assertEquals(doctor, patient.getDoctor(0));
	}
	@Test
	public void PatientSpecialReq_Test1() {
		Phone phone = new Phone("+90", "123", "4432211");
		Address address = new Address("123 Can Street", "İstanbul", "İ", "34", "Turkey");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Ward ward = new Ward("32", Gender.Female, 0, hospital);
		Date accepted = Date.valueOf("2007-01-01");
		Date historyDate = Date.valueOf("2002-10-10");
		History history = new History("flu", "medicine", "take medicine", historyDate);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("44", hospital, consultantDoctor);
		Patient patient = new Patient("22", Gender.Female, 20, accepted, history, ward, team);
		patient.addSpecialReq("Run");
		assertEquals(1, patient.numberOfSpecialReqs());
		assertEquals("Run", patient.getSpecialReq(0));
	}
	
	@Test
	public void PatientSpecialReq_Test2() {
		Phone phone = new Phone("+87", "423", "78515123118");
		Address address = new Address("Los Street", "Los Angeles", "LA", "324", "ABD");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Ward ward = new Ward("32", Gender.Female, 0, hospital);
		Date accepted = Date.valueOf("2023-01-01");
		Date historyDate = Date.valueOf("2022-10-10");
		History history = new History("flu", "painkiller", "take medicine", historyDate);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("44", hospital, consultantDoctor);
		Patient patient = new Patient("22", Gender.Female, 20, accepted, history, ward, team);
		patient.addSpecialReq("Nothing");
		assertEquals(1, patient.numberOfSpecialReqs());
		assertEquals("Nothing", patient.getSpecialReq(0));
	}
	
	@Test
	public void PatientSpecialReq_Test3() {
		Phone phone = new Phone("+90", "213", "7851518");
		Address address = new Address("123 Nor Street", "Stockholm", "S", "44", "Sweden");
		Hospital hospital = new Hospital("Oncology Department", address, phone);
		Ward ward = new Ward("32", Gender.Female, 0, hospital);
		Date accepted = Date.valueOf("2023-01-01");
		Date historyDate = Date.valueOf("2010-10-10");
		History history = new History("flu", "pill", "take medicine", historyDate);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("44", hospital, consultantDoctor);
		Patient patient = new Patient("22", Gender.Female, 20, accepted, history, ward, team);
		patient.addSpecialReq("Swimming");
		assertEquals(1, patient.numberOfSpecialReqs());
		assertEquals("Swimming", patient.getSpecialReq(0));
	}

	@Test
	public void PatientPrescription_Test1() {
		Phone phone = new Phone("+90", "123", "4432211");
		Address address = new Address("123 Can Street", "İstanbul", "İ", "34", "Turkey");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Ward ward = new Ward("32", Gender.Female, 0, hospital);
		Date accepted = Date.valueOf("2007-01-01");
		Date historyDate = Date.valueOf("2002-10-10");
		History history = new History("flu", "medicine", "take medicine", historyDate);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("32", hospital, consultantDoctor);
		Patient patient = new Patient("32", Gender.Female, 20, accepted, history, ward, team);
		patient.addPrescription("Medicine");
		assertEquals(1, patient.numberOfPrescriptions());
		assertEquals("Medicine", patient.getPrescription(0));
	}
	
	@Test
	public void PatientPrescription_Test2() {
		Phone phone = new Phone("+87", "423", "78515123118");
		Address address = new Address("Los Street", "Los Angeles", "LA", "324", "ABD");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Ward ward = new Ward("32", Gender.Female, 0, hospital);
		Date accepted = Date.valueOf("2023-01-01");
		Date historyDate = Date.valueOf("2022-10-10");
		History history = new History("flu", "painkiller", "take medicine", historyDate);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("32", hospital, consultantDoctor);
		Patient patient = new Patient("32", Gender.Female, 20, accepted, history, ward, team);
		patient.addPrescription("STOMACH PILL");
		assertEquals(1, patient.numberOfPrescriptions());
		assertEquals("STOMACH PILL", patient.getPrescription(0));
	}
	
	@Test
	public void PatientPrescription_Test3() {
		Phone phone = new Phone("+90", "213", "7851518");
		Address address = new Address("123 Nor Street", "Stockholm", "S", "44", "Sweden");
		Hospital hospital = new Hospital("Oncology Department", address, phone);
		Ward ward = new Ward("32", Gender.Female, 0, hospital);
		Date accepted = Date.valueOf("2023-01-01");
		Date historyDate = Date.valueOf("2010-10-10");
		History history = new History("flu", "pill", "take medicine", historyDate);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("32", hospital, consultantDoctor);
		Patient patient = new Patient("32", Gender.Female, 20, accepted, history, ward, team);
		patient.addPrescription("Asprin");
		assertEquals(1, patient.numberOfPrescriptions());
		assertEquals("Asprin", patient.getPrescription(0));
	}

	@Test
	public void TeamDoctor_Test1() {
		Phone phone = new Phone("+90", "213", "7851518");
		Address address = new Address("123 Huzur Street", "Hatay", "H", "44", "Turkey");
		Hospital hospital = new Hospital("Oncology Department", address, phone);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("12", hospital, consultantDoctor);
		Doctor doctor = new Doctor();
		team.addDoctor(doctor);
		assertEquals(1, team.numberOfDoctors());
		assertEquals(doctor, team.getDoctor(0));
	}

	@Test
	public void TeamDoctor_Test2() {
		Phone phone = new Phone("+90", "123", "4432211");
		Address address = new Address("123 Can Street", "İstanbul", "İ", "34", "Turkey");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("88", hospital, consultantDoctor);
		Doctor doctor = new Doctor();
		team.addDoctor(doctor);
		assertEquals(1, team.numberOfDoctors());
		assertEquals(doctor, team.getDoctor(0));
	}

	@Test
	public void TeamDoctor_Test3() {
		Phone phone = new Phone("+90", "213", "7851518");
		Address address = new Address("123 Nor Street", "Stockholm", "S", "44", "Sweden");
		Hospital hospital = new Hospital("Oncology Department", address, phone);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("78", hospital, consultantDoctor);
		Doctor doctor = new Doctor();
		team.addDoctor(doctor);
		assertEquals(1, team.numberOfDoctors());
		assertEquals(doctor, team.getDoctor(0));
	}

	@Test
	public void TeamPatient_Test1() {
		Phone phone = new Phone("+87", "423", "78515123118");
		Address address = new Address("Los Street", "Los Angeles", "LA", "324", "ABD");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Ward ward = new Ward("32", Gender.Female, 0, hospital);
		Date accepted = Date.valueOf("2023-01-01");
		Date historyDate = Date.valueOf("2022-10-10");
		History history = new History("flu", "medicine", "take medicine", historyDate);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("96", hospital, consultantDoctor);
		Patient patient = new Patient("21", Gender.Female, 32, accepted, history, ward, team);
		team.addPatient(patient);
		assertEquals(1, team.numberOfPatients());
		assertEquals(patient, team.getPatient(0));
	}
	
	@Test
	public void TeamPatient_Test2() {
		Phone phone = new Phone("+90", "213", "7851518");
		Address address = new Address("123 Nor Street", "Stockholm", "S", "44", "Sweden");
		Hospital hospital = new Hospital("Oncology Department", address, phone);
		Ward ward = new Ward("32", Gender.Female, 0, hospital);
		Date accepted = Date.valueOf("2023-01-01");
		Date historyDate = Date.valueOf("2010-10-10");
		History history = new History("flu", "medicine", "take medicine", historyDate);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("456", hospital, consultantDoctor);
		Patient patient = new Patient("456", Gender.Female, 20, accepted, history, ward, team);
		team.addPatient(patient);
		assertEquals(1, team.numberOfPatients());
		assertEquals(patient, team.getPatient(0));
	}
	
	@Test
	public void TeamPatient_Test3() {
		Phone phone = new Phone("+90", "123", "4432211");
		Address address = new Address("123 Can Street", "İstanbul", "İ", "34", "Turkey");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Ward ward = new Ward("32", Gender.Female, 0, hospital);
		Date accepted = Date.valueOf("2007-01-01");
		Date historyDate = Date.valueOf("2002-10-10");
		History history = new History("flu", "medicine", "take medicine", historyDate);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("23", hospital, consultantDoctor);
		Patient patient = new Patient("23", Gender.Female, 20, accepted, history, ward, team);
		team.addPatient(patient);
		assertEquals(1, team.numberOfPatients());
		assertEquals(patient, team.getPatient(0));
	}


	@Test
	public void WardPatient_Test1() {
		Phone phone = new Phone("+90", "123", "4432211");
		Address address = new Address("123 Can Street", "İstanbul", "İ", "34", "Turkey");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Ward ward = new Ward("32", Gender.Female, 0, hospital);
		Date accepted = Date.valueOf("2007-01-01");
		Date historyDate = Date.valueOf("2002-10-10");
		History history = new History("flu", "medicine", "take medicine", historyDate);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("32", hospital, consultantDoctor);
		Patient patient = new Patient("32", Gender.Female, 20, accepted, history, ward, team);
		ward.addPatient(patient);
		assertEquals(1, ward.numberOfPatients());
		assertEquals(patient, ward.getPatient(0));
	}
	
	@Test
	public void WardPatient_Test2() {
		Phone phone = new Phone("+87", "423", "78515123118");
		Address address = new Address("Los Street", "Los Angeles", "LA", "324", "ABD");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Ward ward = new Ward("32", Gender.Female, 0, hospital);
		Date accepted = Date.valueOf("2023-01-01");
		Date historyDate = Date.valueOf("2022-10-10");
		History history = new History("flu", "painkiller", "take medicine", historyDate);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("789", hospital, consultantDoctor);
		Patient patient = new Patient("789", Gender.Female, 78, accepted, history, ward, team);
		ward.addPatient(patient);
		assertEquals(1, ward.numberOfPatients());
		assertEquals(patient, ward.getPatient(0));
	}
	
	@Test
	public void WardPatient_Test3() {
		Phone phone = new Phone("+90", "213", "7851518");
		Address address = new Address("123 Nor Street", "Stockholm", "S", "44", "Sweden");
		Hospital hospital = new Hospital("Oncology Department", address, phone);
		Ward ward = new Ward("32", Gender.Female, 0, hospital);
		Date accepted = Date.valueOf("2023-01-01");
		Date historyDate = Date.valueOf("2010-10-10");
		History history = new History("flu", "pill", "take medicine", historyDate);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("13", hospital, consultantDoctor);
		Patient patient = new Patient("13", Gender.Female, 20, accepted, history, ward, team);
		ward.addPatient(patient);
		assertEquals(1, ward.numberOfPatients());
		assertEquals(patient, ward.getPatient(0));
	}

	@Test
	public void ConsultantDoctorPatient_Test1() {
		Phone phone = new Phone("+90", "123", "4432211");
		Address address = new Address("123 Can Street", "İstanbul", "İ", "34", "Turkey");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Ward ward = new Ward("32", Gender.Female, 0, hospital);
		Date accepted = Date.valueOf("2007-01-01");
		Date historyDate = Date.valueOf("2002-10-10");
		History history = new History("flu", "medicine", "take medicine", historyDate);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("14", hospital, consultantDoctor);
		Patient patient = new Patient("14", Gender.Female, 20, accepted, history, ward, team);
		consultantDoctor.addPatient(patient);
		assertEquals(1, consultantDoctor.numberOfPatients());
		assertEquals(patient, consultantDoctor.getPatient(0));
	}
	
	@Test
	public void ConsultantDoctorPatient_Test2() {
		Phone phone = new Phone("+87", "423", "78515123118");
		Address address = new Address("Los Street", "Los Angeles", "LA", "324", "ABD");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Ward ward = new Ward("32", Gender.Female, 0, hospital);
		Date accepted = Date.valueOf("2023-01-01");
		Date historyDate = Date.valueOf("2022-10-10");
		History history = new History("flu", "painkiller", "take medicine", historyDate);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("55", hospital, consultantDoctor);
		Patient patient = new Patient("55", Gender.Female, 55, accepted, history, ward, team);
		consultantDoctor.addPatient(patient);
		assertEquals(1, consultantDoctor.numberOfPatients());
		assertEquals(patient, consultantDoctor.getPatient(0));
	}
	
	@Test
	public void ConsultantDoctorPatient_Test3() {
		Phone phone = new Phone("+90", "213", "7851518");
		Address address = new Address("123 Nor Street", "Stockholm", "S", "44", "Sweden");
		Hospital hospital = new Hospital("Oncology Department", address, phone);
		Ward ward = new Ward("32", Gender.Female, 0, hospital);
		Date accepted = Date.valueOf("2023-01-01");
		Date historyDate = Date.valueOf("2010-10-10");
		History history = new History("flu", "pill", "take medicine", historyDate);
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("3772", hospital, consultantDoctor);
		Patient patient = new Patient("3772", Gender.Female, 30, accepted, history, ward, team);
		consultantDoctor.addPatient(patient);
		assertEquals(1, consultantDoctor.numberOfPatients());
		assertEquals(patient, consultantDoctor.getPatient(0));
	}

	@Test
	public void ConsultantDoctorLocation_Test1() {
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		consultantDoctor.addLocation("Kayseri");
		assertEquals(1, consultantDoctor.numberOfLocations());
		assertEquals("Kayseri", consultantDoctor.getLocation(0));
	}
	
	@Test
	public void ConsultantDoctorLocation_Test2() {
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		consultantDoctor.addLocation("İzmir");
		assertEquals(1, consultantDoctor.numberOfLocations());
		assertEquals("İzmir", consultantDoctor.getLocation(0));
	}
	
	@Test
	public void ConsultantDoctorLocation_Test3() {
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		consultantDoctor.addLocation("Paris");
		assertEquals(1, consultantDoctor.numberOfLocations());
		assertEquals("Paris", consultantDoctor.getLocation(0));
	}

	@Test
	public void ConsultantDoctorSpecialty_Test1() {
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		consultantDoctor.addSpecialty("swimming");
		assertEquals(1, consultantDoctor.numberOfSpecialty());
		assertEquals("swimming", consultantDoctor.getSpecialty(0));
	}
	
	@Test
	public void ConsultantDoctorSpecialty_Test2() {
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		consultantDoctor.addSpecialty("Run");
		assertEquals(1, consultantDoctor.numberOfSpecialty());
		assertEquals("Run", consultantDoctor.getSpecialty(0));
	}
	
	@Test
	public void ConsultantDoctorSpecialty_Test3() {
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		consultantDoctor.addSpecialty("Nothing");
		assertEquals(1, consultantDoctor.numberOfSpecialty());
		assertEquals("Nothing", consultantDoctor.getSpecialty(0));
	}

	@Test
	public void JuniorDoctorLocation_Test1() {
		JuniorDoctor juniorDoctor = new JuniorDoctor();
		juniorDoctor.addLocation("Madrid");
		assertEquals(1, juniorDoctor.numberOfLocations());
		assertEquals("Madrid", juniorDoctor.getLocation(0));
	}
	
	@Test
	public void JuniorDoctorLocation_Test2() {
		JuniorDoctor juniorDoctor = new JuniorDoctor();
		juniorDoctor.addLocation("Athena");
		assertEquals(1, juniorDoctor.numberOfLocations());
		assertEquals("Athena", juniorDoctor.getLocation(0));
	}
	
	@Test
	public void JuniorDoctorLocation_Test3() {
		JuniorDoctor juniorDoctor = new JuniorDoctor();
		juniorDoctor.addLocation("Rize");
		assertEquals(1, juniorDoctor.numberOfLocations());
		assertEquals("Rize", juniorDoctor.getLocation(0));
	}

	@Test
	public void JuniorDoctorSpecialty_Test1() {
		JuniorDoctor juniorDoctor = new JuniorDoctor();
		juniorDoctor.addSpecialty("swimming");
		assertEquals(1, juniorDoctor.numberOfSpecialty());
		assertEquals("swimming", juniorDoctor.getSpecialty(0));
	}
	
	@Test
	public void JuniorDoctorSpecialty_Test2() {
		JuniorDoctor juniorDoctor = new JuniorDoctor();
		juniorDoctor.addSpecialty("Nothing");
		assertEquals(1, juniorDoctor.numberOfSpecialty());
		assertEquals("Nothing", juniorDoctor.getSpecialty(0));
	}
	
	@Test
	public void JuniorDoctorSpecialty_Test3() {
		JuniorDoctor juniorDoctor = new JuniorDoctor();
		juniorDoctor.addSpecialty("Run");
		assertEquals(1, juniorDoctor.numberOfSpecialty());
		assertEquals("Run", juniorDoctor.getSpecialty(0));
	}

	@Test
	public void JuniorDoctorPatient_Test1() {
		Phone phone = new Phone("+90", "213", "7851518");
		Address address = new Address("123 Nor Street", "Stockholm", "S", "44", "Sweden");
		Hospital hospital = new Hospital("Oncology Department", address, phone);
		Ward ward = new Ward("32", Gender.Female, 0, hospital);
		Date accepted = Date.valueOf("2023-01-01");
		Date historyDate = Date.valueOf("2010-10-10");
		History history = new History("flu", "pill", "take medicine", historyDate);
		JuniorDoctor juniorDoctor = new JuniorDoctor();
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("23", hospital, consultantDoctor);
		Patient patient = new Patient("23", Gender.Female, 23, accepted, history, ward, team);
		juniorDoctor.addPatient(patient);
		assertEquals(1, juniorDoctor.numberOfPatients());
		assertEquals(patient, juniorDoctor.getPatient(0));
	}
	
	@Test
	public void JuniorDoctorPatient_Test2() {
		Phone phone = new Phone("+87", "423", "78515123118");
		Address address = new Address("Los Street", "Los Angeles", "LA", "324", "ABD");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Ward ward = new Ward("32", Gender.Female, 0, hospital);
		Date accepted = Date.valueOf("2023-01-01");
		Date historyDate = Date.valueOf("2022-10-10");
		History history = new History("flu", "painkiller", "take medicine", historyDate);
		JuniorDoctor juniorDoctor = new JuniorDoctor();
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("11", hospital, consultantDoctor);
		Patient patient = new Patient("11", Gender.Female, 11, accepted, history, ward, team);
		juniorDoctor.addPatient(patient);
		assertEquals(1, juniorDoctor.numberOfPatients());
		assertEquals(patient, juniorDoctor.getPatient(0));
	}
	
	@Test
	public void JuniorDoctorPatient_Test3() {
		Phone phone = new Phone("+90", "123", "4432211");
		Address address = new Address("123 Can Street", "İstanbul", "İ", "34", "Turkey");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Ward ward = new Ward("32", Gender.Female, 0, hospital);
		Date accepted = Date.valueOf("2007-01-01");
		Date historyDate = Date.valueOf("2002-10-10");
		History history = new History("flu", "medicine", "take medicine", historyDate);
		JuniorDoctor juniorDoctor = new JuniorDoctor();
		ConsultantDoctor consultantDoctor = new ConsultantDoctor();
		Team team = new Team("532", hospital, consultantDoctor);
		Patient patient = new Patient("532", Gender.Female, 11, accepted, history, ward, team);
		juniorDoctor.addPatient(patient);
		assertEquals(1, juniorDoctor.numberOfPatients());
		assertEquals(patient, juniorDoctor.getPatient(0));
	}

}
