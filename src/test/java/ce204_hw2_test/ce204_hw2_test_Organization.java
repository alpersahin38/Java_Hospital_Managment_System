package ce204_hw2_test;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Test;

import ce204_hw2_lib_Organization.*;

public class ce204_hw2_test_Organization {

	@Test
	public void Phone_Test1() {
		Phone phone = new Phone("+1", "123", "4567890");
		String expectedCountryCode = "+1";
		String actualCountryCode = phone.getCountryCode();
		String expectedAreaCode = "123";
		String actualAreaCode = phone.getAreaCode();
		String expectedgetNumber = "4567890";
		String actualgetNumber = phone.getNumber();
		assertEquals(expectedCountryCode, actualCountryCode);
		assertEquals(expectedAreaCode, actualAreaCode);
		assertEquals(expectedgetNumber, actualgetNumber);
	}

	@Test
	public void Phone_Test2() {
		Phone phone = new Phone("+90", "538", "7851516");
		String expectedCountryCode = "+90";
		String actualCountryCode = phone.getCountryCode();
		String expectedAreaCode = "538";
		String actualAreaCode = phone.getAreaCode();
		String expectedgetNumber = "7851516";
		String actualgetNumber = phone.getNumber();
		assertEquals(expectedCountryCode, actualCountryCode);
		assertEquals(expectedAreaCode, actualAreaCode);
		assertEquals(expectedgetNumber, actualgetNumber);
	}

	@Test
	public void Phone_Test3() {
		Phone phone = new Phone("+90", "213", "7851518");
		String expectedCountryCode = "+90";
		String actualCountryCode = phone.getCountryCode();
		String expectedAreaCode = "213";
		String actualAreaCode = phone.getAreaCode();
		String expectedgetNumber = "7851518";
		String actualgetNumber = phone.getNumber();
		assertEquals(expectedCountryCode, actualCountryCode);
		assertEquals(expectedAreaCode, actualAreaCode);
		assertEquals(expectedgetNumber, actualgetNumber);
	}

	@Test
	public void Address_Test1() {
		Address address = new Address("123 Fener Street", "Rize", "Turkey", "12345", "Turkey");
		assertEquals("123 Fener Street", address.getStreet());
		assertEquals("Rize", address.getCity());
		assertEquals("Turkey", address.getState());
		assertEquals("12345", address.getZipCode());
		assertEquals("Turkey", address.getCountry());
	}

	@Test
	public void Address_Test2() {
		Address address = new Address("Cumhuriyet Street", "Kayseri", "Turkey", "34233", "Turkey");
		assertEquals("Cumhuriyet Street", address.getStreet());
		assertEquals("Kayseri", address.getCity());
		assertEquals("Turkey", address.getState());
		assertEquals("34233", address.getZipCode());
		assertEquals("Turkey", address.getCountry());
	}

	@Test
	public void Address_Test3() {
		Address address = new Address("123 Main Street", "NewYork", "NY", "324", "ABD");
		assertEquals("123 Main Street", address.getStreet());
		assertEquals("NewYork", address.getCity());
		assertEquals("NY", address.getState());
		assertEquals("324", address.getZipCode());
		assertEquals("ABD", address.getCountry());
	}

	@Test
	public void Person_Test1() {
		Phone phone = new Phone("+1", "538", "6748357");
		FullName name = new FullName("Mrs", "Jane", "Catherine", "SEYMOUR");
		// public Person(String aTitle, String aGivenName, String aMiddleName, String
		// aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone)
		Address address = new Address("13 Broadway Street", "New York", "NY", "38000", "Turkiye");
		Date date = Date.valueOf("1945-10-12");
		Person person = new Person("Mrs", "Jane", "Catherine", "SEYMOUR", name, date, Person.Gender.Female, address,
				phone);
		assertEquals("Mrs", person.getTitle());
		assertEquals("Jane", person.getGivenName());
		assertEquals("Catherine", person.getMiddleName());
		assertEquals("SEYMOUR", person.getFamilyName());
		assertEquals(Date.valueOf("1945-10-12"), person.getBirthDate());
		assertEquals(Person.Gender.Female, person.getGender());
		assertEquals("13 Broadway Street", address.getStreet());
		assertEquals("New York", address.getCity());
		assertEquals("NY", address.getState());
		assertEquals("38000", address.getZipCode());
		assertEquals("Turkiye", address.getCountry());
		assertEquals("+1", phone.getCountryCode());
		assertEquals("538", phone.getAreaCode());
		assertEquals("6748357", phone.getNumber());
	}

	@Test
	public void Person_Test2() {
		Phone phone = new Phone("+961", "345", "3946152");
		FullName name = new FullName("Mr", "Keanu", "John", "Reeves");
		// public Person(String aTitle, String aGivenName, String aMiddleName, String
		// aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone)
		Address address = new Address("Tripadvisor Street", "Beyrut", "B", "616", "Lübnan");
		Date date = Date.valueOf("1936-04-16");
		Person person = new Person("Mr", "Keanu", "John", "Reeves", name, date, Person.Gender.Male, address, phone);
		assertEquals("Mr", person.getTitle());
		assertEquals("Keanu", person.getGivenName());
		assertEquals("John", person.getMiddleName());
		assertEquals("Reeves", person.getFamilyName());
		assertEquals(Date.valueOf("1936-04-16"), person.getBirthDate());
		assertEquals(Person.Gender.Male, person.getGender());
		assertEquals("Tripadvisor Street", address.getStreet());
		assertEquals("Beyrut", address.getCity());
		assertEquals("B", address.getState());
		assertEquals("616", address.getZipCode());
		assertEquals("Lübnan", address.getCountry());
		assertEquals("+961", phone.getCountryCode());
		assertEquals("345", phone.getAreaCode());
		assertEquals("3946152", phone.getNumber());
	}

	@Test
	public void Person_Test3() {
		Phone phone = new Phone("+90", "538", "5293842");
		FullName name = new FullName("Mr", "Alper", "Huseyin", "ŞAŞAR");
		// public Person(String aTitle, String aGivenName, String aMiddleName, String
		// aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone)
		Address address = new Address("Maras Gebze Street", "Kayseri", "K", "38000", "Turkiye");
		Date date = Date.valueOf("2002-02-15");
		Person person = new Person("Mr", "Alper", "Huseyin", "ŞAŞAR", name, date, Person.Gender.Male, address, phone);
		assertEquals("Mr", person.getTitle());
		assertEquals("Alper", person.getGivenName());
		assertEquals("Huseyin", person.getMiddleName());
		assertEquals("ŞAŞAR", person.getFamilyName());
		assertEquals(Date.valueOf("2002-02-15"), person.getBirthDate());
		assertEquals(Person.Gender.Male, person.getGender());
		assertEquals("Maras Gebze Street", address.getStreet());
		assertEquals("Kayseri", address.getCity());
		assertEquals("K", address.getState());
		assertEquals("38000", address.getZipCode());
		assertEquals("Turkiye", address.getCountry());
		assertEquals("+90", phone.getCountryCode());
		assertEquals("538", phone.getAreaCode());
		assertEquals("5293842", phone.getNumber());
	}

	@Test
	public void PersonGetHospital_Test1() {
		Phone phone = new Phone("+1", "345", "3944589");
		FullName name = new FullName("Mr", "Robert", "Christopher", "EVANS");
		// public Person(String aTitle, String aGivenName, String aMiddleName, String
		// aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone)
		Address address = new Address("Massachusetts Street", "Boston", "B", "02108", "ABD");
		Date date = Date.valueOf("1981-06-13");
		Person person = new Person("Mr", "Robert", "Christopher", "EVANS", name, date, Person.Gender.Male, address,
				phone);
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		person.addHospital(hospital);
		assertEquals(hospital, person.getHospital(0));
	}

	@Test
	public void PersonGetHospital_Test2() {
		Phone phone = new Phone("+61", "741", "9658234");
		FullName name = new FullName("Mr", "Chris", "Hulk", "HEMSWORTH");
		// public Person(String aTitle, String aGivenName, String aMiddleName, String
		// aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone)
		Address address = new Address("Hoiser Lane Street", "Melbourne", "M", "3000", "Australia");
		Date date = Date.valueOf("1983-08-11");
		Person person = new Person("Mr", "Chris", "Hulk", "HEMSWORTH", name, date, Person.Gender.Male, address, phone);
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		person.addHospital(hospital);
		assertEquals(hospital, person.getHospital(0));
	}

	@Test
	public void PersonGetHospital_Test3() {
		Phone phone = new Phone("+1", "369", "7013095");
		FullName name = new FullName("Mrs", "Scarlett", "Ingrid", "JOHANSSON");
		// public Person(String aTitle, String aGivenName, String aMiddleName, String
		// aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone)
		Address address = new Address("Fourth Street", "Manhattan", "M", "10004", "ABD");
		Date date = Date.valueOf("1984-11-22");
		Person person = new Person("Mrs", "Scarlett", "Ingrid", "JOHANSSON", name, date, Person.Gender.Female, address,
				phone);
		Hospital hospital = new Hospital("Physical therapy and rehabilitation Department", address, phone);
		person.addHospital(hospital);
		assertEquals(hospital, person.getHospital(0));
	}

	@Test
	public void PersonIndexOfHospital_Test1() {
		Phone phone = new Phone("+1", "361", "1274200");
		FullName name = new FullName("Mr", "Robert", "Jhon", "DOWNEY");
		// public Person(String aTitle, String aGivenName, String aMiddleName, String
		// aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone)
		Address address = new Address("34 Romer Street", "Frankfurt", "F", "60306", "Germany");
		Date date = Date.valueOf("1965-04-05");
		Person person = new Person("Mr", "Robert", "Jhon", "DOWNEY", name, date, Person.Gender.Male, address, phone);
		Hospital hospital = new Hospital("Child Health and Diseases Department", address, phone);
		Hospital hospital2 = new Hospital("Dermatology Department", address, phone);
		person.addHospital(hospital);
		person.addHospital(hospital2);
		assertEquals(0, person.indexOfHospital(hospital));
		assertEquals(1, person.indexOfHospital(hospital2));
	}

	@Test
	public void PersonIndexOfHospital_Test2() {
		Phone phone = new Phone("+1", "296", "9412578");
		FullName name = new FullName("Mrs", "Dakota", "Mayi", "JOHNSON");
		// public Person(String aTitle, String aGivenName, String aMiddleName, String
		// aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone)
		Address address = new Address("45 SoCo Street", "Austin", "A", "73301", "ABD");
		Date date = Date.valueOf("1989-07-27");
		Person person = new Person("Mrs", "Dakota", "Mayi", "JOHNSON", name, date, Person.Gender.Female, address,
				phone);
		Hospital hospital = new Hospital("Physical therapy and rehabilitation Department", address, phone);
		Hospital hospital2 = new Hospital("Check up Department", address, phone);
		person.addHospital(hospital);
		person.addHospital(hospital2);
		assertEquals(0, person.indexOfHospital(hospital));
		assertEquals(1, person.indexOfHospital(hospital2));
	}

	@Test
	public void PersonIndexOfHospital_Test3() {
		Phone phone = new Phone("+36", "387", "1495296");
		FullName name = new FullName("Mrs", "Barbara", "Tyger", "PALVIN");
		// public Person(String aTitle, String aGivenName, String aMiddleName, String
		// aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone)
		Address address = new Address("14 Kazinczy Street", "Budapest", "B", "10007", "Hungary");
		Date date = Date.valueOf("1993-05-13");
		Person person = new Person("Mrs", "Barbara", "Tyger", "PALVIN", name, date, Person.Gender.Male, address, phone);
		Hospital hospital = new Hospital("Allergy Department", address, phone);
		Hospital hospital2 = new Hospital("Neurology Department", address, phone);
		person.addHospital(hospital);
		person.addHospital(hospital2);
		assertEquals(0, person.indexOfHospital(hospital));
		assertEquals(1, person.indexOfHospital(hospital2));
	}

	@Test
	public void Nurse_Test1() {
		Phone phone = new Phone("+1", "354", "6113838");
		FullName name = new FullName("Mrs", "Angelina", "Croft", "JOLIE");
		// public Nurse(String aTitle, String aGivenName, String aMiddleName, String
		// aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone, Date aJoined, Department aDepartment)
		Address address = new Address("Sunset Boulevard", "Los Angeles", "LA", "90001", "ABD");
		Date date = Date.valueOf("1975-06-04");
		Date joinedDate = Date.valueOf("2021-04-16");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Department department = new Department(hospital);
		Nurse nurse = new Nurse("Mrs", "Angelina", "Croft", "JOLIE", name, date, Person.Gender.Female, address, phone,
				joinedDate, department);
		assertEquals("Mrs", nurse.getTitle());
		assertEquals("Angelina", nurse.getGivenName());
		assertEquals("Croft", nurse.getMiddleName());
		assertEquals("JOLIE", nurse.getFamilyName());
		assertEquals(name, nurse.getName());
		assertEquals(Date.valueOf("1975-06-04"), nurse.getBirthDate());
		assertEquals(Person.Gender.Female, nurse.getGender());
		assertEquals("Sunset Boulevard", address.getStreet());
		assertEquals("Los Angeles", address.getCity());
		assertEquals("LA", address.getState());
		assertEquals("90001", address.getZipCode());
		assertEquals("ABD", address.getCountry());
		assertEquals("+1", phone.getCountryCode());
		assertEquals("354", phone.getAreaCode());
		assertEquals("6113838", phone.getNumber());
		assertEquals(Date.valueOf("2021-04-16"), nurse.getJoined());
		assertEquals(department, nurse.getDepartment());

	}

	@Test
	public void Nurse_Test2() {
		Phone phone = new Phone("+36", "387", "1495296");
		FullName name = new FullName("Mrs", "Barbara", "Tyger", "PALVIN");
		// public Nurse(String aTitle, String aGivenName, String aMiddleName, String
		// aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone, Date aJoined, Department aDepartment)
		Address address = new Address("14 Kazinczy Street", "Budapest", "B", "10007", "Hungary");
		Date date = Date.valueOf("1993-05-13");
		Date joinedDate = Date.valueOf("2023-01-20");
		Hospital hospital = new Hospital("Child Health and Diseases Department", address, phone);
		Department department = new Department(hospital);
		Nurse nurse = new Nurse("Mrs", "Barbara", "Tyger", "PALVIN", name, date, Person.Gender.Female, address, phone,
				joinedDate, department);
		assertEquals("Mrs", nurse.getTitle());
		assertEquals("Barbara", nurse.getGivenName());
		assertEquals("Tyger", nurse.getMiddleName());
		assertEquals("PALVIN", nurse.getFamilyName());
		assertEquals(name, nurse.getName());
		assertEquals(Date.valueOf("1993-05-13"), nurse.getBirthDate());
		assertEquals(Person.Gender.Female, nurse.getGender());
		assertEquals("14 Kazinczy Street", address.getStreet());
		assertEquals("Budapest", address.getCity());
		assertEquals("B", address.getState());
		assertEquals("10007", address.getZipCode());
		assertEquals("Hungary", address.getCountry());
		assertEquals("+36", phone.getCountryCode());
		assertEquals("387", phone.getAreaCode());
		assertEquals("1495296", phone.getNumber());
		assertEquals(Date.valueOf("2023-01-20"), nurse.getJoined());
		assertEquals(department, nurse.getDepartment());

	}

	@Test
	public void Nurse_Test3() {
		Phone phone = new Phone("+1", "296", "9412578");
		FullName name = new FullName("Mrs", "Dakota", "Mayi", "JOHNSON");
		// public Nurse(String aTitle, String aGivenName, String aMiddleName, String
		// aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone, Date aJoined, Department aDepartment)
		Address address = new Address("45 SoCo Street", "Austin", "A", "73301", "ABD");
		Date date = Date.valueOf("1989-07-27");
		Date joinedDate = Date.valueOf("2020-03-30");
		Hospital hospital = new Hospital("Physical therapy and rehabilitation Department", address, phone);
		Department department = new Department(hospital);
		Nurse nurse = new Nurse("Mrs", "Dakota", "Mayi", "JOHNSON", name, date, Person.Gender.Female, address, phone,
				joinedDate, department);
		assertEquals("Mrs", nurse.getTitle());
		assertEquals("Dakota", nurse.getGivenName());
		assertEquals("Mayi", nurse.getMiddleName());
		assertEquals("JOHNSON", nurse.getFamilyName());
		assertEquals(name, nurse.getName());
		assertEquals(Date.valueOf("1989-07-27"), nurse.getBirthDate());
		assertEquals(Person.Gender.Female, nurse.getGender());
		assertEquals("45 SoCo Street", address.getStreet());
		assertEquals("Austin", address.getCity());
		assertEquals("A", address.getState());
		assertEquals("73301", address.getZipCode());
		assertEquals("ABD", address.getCountry());
		assertEquals("+1", phone.getCountryCode());
		assertEquals("296", phone.getAreaCode());
		assertEquals("9412578", phone.getNumber());
		assertEquals(Date.valueOf("2020-03-30"), nurse.getJoined());
		assertEquals(department, nurse.getDepartment());

	}

	@Test
	public void OperationsStaff_Test1() {
		Phone phone = new Phone("+90", "538", "7851518");
		FullName name = new FullName("Mr", "Murat", "Hasan", "BOZ");
		// public OperationsStaff(String aTitle, String aGivenName, String aMiddleName,
		// String aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone, Date aJoined, Department aDepartment)
		Address address = new Address("389 Murtaza Street", "Zonguldak", "NY", "67300", "Turkiye");
		Date date = Date.valueOf("1980-03-13");
		Date joinedDate = Date.valueOf("2016-05-23");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Department department = new Department(hospital);
		OperationsStaff operationsStaff = new OperationsStaff("Mr", "Murat", "Hasan", "BOZ", name, date,
				Person.Gender.Male, address, phone, joinedDate, department);
		assertEquals("Mr", operationsStaff.getTitle());
		assertEquals("Murat", operationsStaff.getGivenName());
		assertEquals("Hasan", operationsStaff.getMiddleName());
		assertEquals("BOZ", operationsStaff.getFamilyName());
		assertEquals(Date.valueOf("1980-03-13"), operationsStaff.getBirthDate());
		assertEquals(Person.Gender.Male, operationsStaff.getGender());
		assertEquals("389 Murtaza Street", address.getStreet());
		assertEquals("Zonguldak", address.getCity());
		assertEquals("NY", address.getState());
		assertEquals("67300", address.getZipCode());
		assertEquals("Turkiye", address.getCountry());
		assertEquals("+90", phone.getCountryCode());
		assertEquals("538", phone.getAreaCode());
		assertEquals("7851518", phone.getNumber());
		assertEquals(Date.valueOf("2016-05-23"), operationsStaff.getJoined());
		assertEquals(department, operationsStaff.getDepartment());

	}

	@Test
	public void OperationsStaff_Test2() {
		Phone phone = new Phone("+49", "274", "3689571");
		FullName name = new FullName("Mr", "Hans", "Florian", "ZIMMER");
		// public OperationsStaff(String aTitle, String aGivenName, String aMiddleName,
		// String aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone, Date aJoined, Department aDepartment)
		Address address = new Address("34 Romer Street", "Frankfurt", "F", "60306", "Germany");
		Date date = Date.valueOf("1957-08-12");
		Date joinedDate = Date.valueOf("2001-01-27");
		Hospital hospital = new Hospital("Child Health and Diseases Department", address, phone);
		Department department = new Department(hospital);
		OperationsStaff operationsStaff = new OperationsStaff("Mr", "Hans", "Florian", "ZIMMER", name, date,
				Person.Gender.Male, address, phone, joinedDate, department);
		assertEquals("Mr", operationsStaff.getTitle());
		assertEquals("Hans", operationsStaff.getGivenName());
		assertEquals("Florian", operationsStaff.getMiddleName());
		assertEquals("ZIMMER", operationsStaff.getFamilyName());
		assertEquals(Date.valueOf("1957-08-12"), operationsStaff.getBirthDate());
		assertEquals(Person.Gender.Male, operationsStaff.getGender());
		assertEquals("34 Romer Street", address.getStreet());
		assertEquals("Frankfurt", address.getCity());
		assertEquals("F", address.getState());
		assertEquals("60306", address.getZipCode());
		assertEquals("Germany", address.getCountry());
		assertEquals("+49", phone.getCountryCode());
		assertEquals("274", phone.getAreaCode());
		assertEquals("3689571", phone.getNumber());
		assertEquals(Date.valueOf("2001-01-27"), operationsStaff.getJoined());
		assertEquals(department, operationsStaff.getDepartment());

	}

	@Test
	public void OperationsStaff_Test3() {
		Phone phone = new Phone("+1", "361", "1274200");
		FullName name = new FullName("Mr", "Robert", "Jhon", "DOWNEY");
		// public OperationsStaff(String aTitle, String aGivenName, String aMiddleName,
		// String aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone, Date aJoined, Department aDepartment)
		Address address = new Address("332 Lexington Street", "New York", "NY", "10001", "ABD");
		Date date = Date.valueOf("1965-04-05");
		Date joinedDate = Date.valueOf("1989-03-12");
		Hospital hospital = new Hospital("Physical therapy and rehabilitation Department", address, phone);
		Department department = new Department(hospital);
		OperationsStaff operationsStaff = new OperationsStaff("Mr", "Robert", "Jhon", "DOWNEY", name, date,
				Person.Gender.Male, address, phone, joinedDate, department);
		assertEquals("Mr", operationsStaff.getTitle());
		assertEquals("Robert", operationsStaff.getGivenName());
		assertEquals("Jhon", operationsStaff.getMiddleName());
		assertEquals("DOWNEY", operationsStaff.getFamilyName());
		assertEquals(Date.valueOf("1965-04-05"), operationsStaff.getBirthDate());
		assertEquals(Person.Gender.Male, operationsStaff.getGender());
		assertEquals("332 Lexington Street", address.getStreet());
		assertEquals("New York", address.getCity());
		assertEquals("NY", address.getState());
		assertEquals("10001", address.getZipCode());
		assertEquals("ABD", address.getCountry());
		assertEquals("+1", phone.getCountryCode());
		assertEquals("361", phone.getAreaCode());
		assertEquals("1274200", phone.getNumber());
		assertEquals(Date.valueOf("1989-03-12"), operationsStaff.getJoined());
		assertEquals(department, operationsStaff.getDepartment());

	}

	@Test
	public void Doctor_Test1() {
		Phone phone = new Phone("+1", "213", "2532244");
		FullName name = new FullName("Mr", "Mark", "Alan", "RUFFALO");
		Address address = new Address("366 Kenosha Street", "Wisconsin", "W", "339974", "ABD");
		Date date = Date.valueOf("1967-06-13");
		Date joinedDate = Date.valueOf("1980-05-30");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mr", "Mark", "Alan", "RUFFALO", name, date, Person.Gender.Female, address, phone,
				joinedDate, department);
		assertEquals("Mr", doctor.getTitle());
		assertEquals("Mark", doctor.getGivenName());
		assertEquals("Alan", doctor.getMiddleName());
		assertEquals("RUFFALO", doctor.getFamilyName());
		assertEquals(Date.valueOf("1967-06-13"), doctor.getBirthDate());
		assertEquals(Person.Gender.Female, doctor.getGender());
		assertEquals("366 Kenosha Street", address.getStreet());
		assertEquals("Wisconsin", address.getCity());
		assertEquals("W", address.getState());
		assertEquals("339974", address.getZipCode());
		assertEquals("ABD", address.getCountry());
		assertEquals("+1", phone.getCountryCode());
		assertEquals("213", phone.getAreaCode());
		assertEquals("2532244", phone.getNumber());
		assertEquals(Date.valueOf("1980-05-30"), doctor.getJoined());
		assertEquals(department, doctor.getDepartment());

	}

	@Test
	public void Doctor_Test2() {
		Phone phone = new Phone("+53", "132", "4935627");
		FullName name = new FullName("Mrs", "Ana", "De", "ARMAS");
		Address address = new Address("Arroyo Street", "Habana", "H", "11300", "Cuba");
		Date date = Date.valueOf("1988-04-30");
		Date joinedDate = Date.valueOf("2019-05-22");
		Hospital hospital = new Hospital("Check up Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mrs", "Ana", "De", "ARMAS", name, date, Person.Gender.Female, address, phone,
				joinedDate, department);
		assertEquals("Mrs", doctor.getTitle());
		assertEquals("Ana", doctor.getGivenName());
		assertEquals("De", doctor.getMiddleName());
		assertEquals("ARMAS", doctor.getFamilyName());
		assertEquals(Date.valueOf("1988-04-30"), doctor.getBirthDate());
		assertEquals(Person.Gender.Female, doctor.getGender());
		assertEquals("Arroyo Street", address.getStreet());
		assertEquals("Habana", address.getCity());
		assertEquals("H", address.getState());
		assertEquals("11300", address.getZipCode());
		assertEquals("Cuba", address.getCountry());
		assertEquals("+53", phone.getCountryCode());
		assertEquals("132", phone.getAreaCode());
		assertEquals("4935627", phone.getNumber());
		assertEquals(Date.valueOf("2019-05-22"), doctor.getJoined());
		assertEquals(department, doctor.getDepartment());

	}

	@Test
	public void Doctor_Test3() {
		Phone phone = new Phone("+1", "421", "7369982");
		FullName name = new FullName("Mr", "Scott", "Mike", "EVANS");
		Address address = new Address("Sudbury Street", "Massachusetts", "M", "02360", "ABD");
		Date date = Date.valueOf("1983-08-21");
		Date joinedDate = Date.valueOf("2015-02-22");
		Hospital hospital = new Hospital("Dermatology Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mr", "Scott", "Mike", "EVANS", name, date, Person.Gender.Male, address, phone,
				joinedDate, department);
		assertEquals("Mr", doctor.getTitle());
		assertEquals("Scott", doctor.getGivenName());
		assertEquals("Mike", doctor.getMiddleName());
		assertEquals("EVANS", doctor.getFamilyName());
		assertEquals(Date.valueOf("1983-08-21"), doctor.getBirthDate());
		assertEquals(Person.Gender.Male, doctor.getGender());
		assertEquals("Sudbury Street", address.getStreet());
		assertEquals("Massachusetts", address.getCity());
		assertEquals("M", address.getState());
		assertEquals("02360", address.getZipCode());
		assertEquals("ABD", address.getCountry());
		assertEquals("+1", phone.getCountryCode());
		assertEquals("421", phone.getAreaCode());
		assertEquals("7369982", phone.getNumber());
		assertEquals(Date.valueOf("2015-02-22"), doctor.getJoined());
		assertEquals(department, doctor.getDepartment());

	}
	@Test
	public void DoctorAddSpecialty_Test1() {
		Phone phone = new Phone("+61", "741", "9658234");
		FullName name = new FullName("Mr", "Chris", "Hulk", "HEMSWORTH");
		Address address = new Address("Hoiser Lane Street", "Melbourne", "M", "3000", "Australia");
		Date date = Date.valueOf("1983-08-11");
		Date joinedDate = Date.valueOf("2007-01-13");
		Hospital hospital = new Hospital("Child Health and Diseases Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mr", "Chris", "Hulk", "HEMSWORTH", name, date, Person.Gender.Male, address, phone,
				joinedDate, department);
		doctor.addSpecialty("Oncology");

		assertEquals("Oncology", doctor.getSpecialty(0));

	}
	@Test
	public void DoctorAddSpecialty_Test2() {
		Phone phone = new Phone("+61", "741", "9658234");
		FullName name = new FullName("Mr", "Chris", "Hulk", "HEMSWORTH");
		Address address = new Address("Hoiser Lane Street", "Melbourne", "M", "3000", "Australia");
		Date date = Date.valueOf("1983-08-11");
		Date joinedDate = Date.valueOf("2007-01-13");
		Hospital hospital = new Hospital("Child Health and Diseases Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mr", "Chris", "Hulk", "HEMSWORTH", name, date, Person.Gender.Male, address, phone,
				joinedDate, department);
		doctor.addSpecialty("Pediatrics");

		assertEquals("Pediatrics", doctor.getSpecialty(0));

	}

	@Test
	public void DoctorAddSpecialty_Test3() {
		Phone phone = new Phone("+1", "369", "7013095");
		FullName name = new FullName("Mrs", "Scarlett", "Ingrid", "JOHANSSON");
		Address address = new Address("Fourth Street", "Manhattan", "M", "10004", "ABD");
		Date date = Date.valueOf("1984-11-22");
		Date joinedDate = Date.valueOf("2013-03-18");
		Hospital hospital = new Hospital("Physical therapy and rehabilitation Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mr", "Scarlett", "Ingrid", "JOHANSSON", name, date, Person.Gender.Female, address,
				phone, joinedDate, department);
		doctor.addSpecialty("Internal diseases");

		assertEquals("Internal diseases", doctor.getSpecialty(0));

	}

	@Test
	public void DoctorRemoveSpecialty_Test1() {
		Phone phone = new Phone("+1", "798", "3124578");
		FullName name = new FullName("Mr", "Ryan", "Thomas", "GOSLİNG");
		Address address = new Address("33 Whitehall Street", "London", "L", "22147", "ABD");
		Date date = Date.valueOf("1980-11-12");
		Date joinedDate = Date.valueOf("2014-05-21");
		Hospital hospital = new Hospital("neurology Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mr", "Ryan", "Thomas", "GOSLİNG", name, date, Person.Gender.Male, address, phone,
				joinedDate, department);
		doctor.addSpecialty("Brain and Nerve");
		doctor.removeSpecialty("Brain and Nerve");
		doctor.addSpecialty("Urology");

		assertEquals("Urology", doctor.getSpecialty(0));

	}

	@Test
	public void DoctorRemoveSpecialty_Test2() {
		Phone phone = new Phone("+44", "164", "77411547");
		FullName name = new FullName("Mr", "Henry", "William", "CAVIL");
		Address address = new Address("Flash Street", "Saint Helier", "SH", "741963", "Jersey");
		Date date = Date.valueOf("1983-05-05");
		Date joinedDate = Date.valueOf("2016-02-12");
		Hospital hospital = new Hospital("Nutrition and diet Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mr", "Henry", "William", "CAVIL", name, date, Person.Gender.Male, address, phone,
				joinedDate, department);
		doctor.addSpecialty("Puplic health");
		doctor.removeSpecialty("Puplic health");
		doctor.addSpecialty("Physiology");

		assertEquals("Physiology", doctor.getSpecialty(0));

	}

	@Test
	public void DoctorRemoveSpecialty_Test3() {
		Phone phone = new Phone("+1", "965", "2224578");
		FullName name = new FullName("Mr", "Jeremy", "Lee", "RENNER");
		Address address = new Address("Dahmer Street", "Modesto", "M", "95313", "ABD");
		Date date = Date.valueOf("1971-01-07");
		Date joinedDate = Date.valueOf("2010-05-30");
		Hospital hospital = new Hospital("Internal diseases Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mr", "Jeremy", "Lee", "RENNER", name, date, Person.Gender.Male, address, phone,
				joinedDate, department);
		doctor.addSpecialty("Gastroenterology Surgery");
		doctor.removeSpecialty("Gastroenterology Surgery");
		doctor.addSpecialty("Hematology");

		assertEquals("Hematology", doctor.getSpecialty(0));

	}

	@Test
	public void DoctorTestAddLocation_Test1() {
		Phone phone = new Phone("+90", "541", "9754714");
		FullName name = new FullName("Mr", "Mehmet", "Emre", "OZTURK");
		Address address = new Address("Irfanli Street", "Trabzon", "T", "61800", "Turkiye");
		Date date = Date.valueOf("2001-04-02");
		Date joinedDate = Date.valueOf("2023-02-10");
		Hospital hospital = new Hospital("Ear Nose Throat Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mr", "Mehmet", "Emre", "OZTURK", name, date, Person.Gender.Male, address, phone,
				joinedDate, department);
		doctor.addLocation("OF");

		assertEquals("OF", doctor.getLocation(0));

	}

	@Test
	public void DoctorTestAddLocation_Test2() {
		Phone phone = new Phone("+90", "536", "8217961");
		FullName name = new FullName("Mrs", "Elif", "Humeyra", "AKTURK");
		Address address = new Address("Ballica Street", "Trabzon", "T", "61800", "Turkiye");
		Date date = Date.valueOf("1992-01-23");
		Date joinedDate = Date.valueOf("2021-06-12");
		Hospital hospital = new Hospital("External Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mrs", "Elif", "Humeyra", "AKTURK", name, date, Person.Gender.Female, address, phone,
				joinedDate, department);
		doctor.addLocation("OF");

		assertEquals("OF", doctor.getLocation(0));

	}

	@Test
	public void DoctorTestAddLocation_Test3() {
		Phone phone = new Phone("+90", "561", "5457877");
		FullName name = new FullName("Mr", "Ibrahim", "Can", "VAR");
		Address address = new Address("Camli Street", "Caykara", "C", "61940", "Turkiye");
		Date date = Date.valueOf("1997-03-22");
		Date joinedDate = Date.valueOf("2020-12-26");
		Hospital hospital = new Hospital("Nephrology Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mr", "Ibrahim", "Can", "VAR", name, date, Person.Gender.Male, address, phone,
				joinedDate, department);
		doctor.addLocation("Caykara");

		assertEquals("Caykara", doctor.getLocation(0));

	}

	@Test
	public void DoctorRemoveLocation_Test1() {
		Phone phone = new Phone("+90", "545", "7843541");
		FullName name = new FullName("Mr", "Alper", "Can", "SAHIN");
		Address address = new Address("Cumhuriyet Street", "Kayseri", "K", "38000", "Turkiye");
		Date date = Date.valueOf("2002-03-14");
		Date joinedDate = Date.valueOf("2022-12-21");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mr", "Alper", "Can", "SAHIN", name, date, Person.Gender.Male, address, phone,
				joinedDate, department);
		doctor.addLocation("Cayeli");
		doctor.addLocation("Akkisla");
		doctor.removeLocation("Cayeli");

		assertEquals("Akkisla", doctor.getLocation(0));

	}

	@Test
	public void DoctorRemoveLocation_Test2() {
		Phone phone = new Phone("+1", "112", "8522247");
		FullName name = new FullName("Mr", "Christopher", "Michael", "PRATT");
		Address address = new Address("112 Mario Street", "Virginia", "V", "245896", "ABD");
		Date date = Date.valueOf("1979-06-21");
		Date joinedDate = Date.valueOf("2000-01-12");
		Hospital hospital = new Hospital("orthopedics Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mr", "Christopher", "Michael", "PRATT", name, date, Person.Gender.Male, address,
				phone, joinedDate, department);
		doctor.addLocation("New York");
		doctor.addLocation("Minnesota");
		doctor.removeLocation("New York");

		assertEquals("Minnesota", doctor.getLocation(0));

	}

	@Test
	public void DoctorRemoveLocation_Test3() {
		Phone phone = new Phone("+1", "114", "2547411");
		FullName name = new FullName("Mr", "Mike", "Bush", "CAPUANNO");
		Address address = new Address("414 Boston Street", "Massachusetts", "M", "234896", "ABD");
		Date date = Date.valueOf("1974-02-21");
		Date joinedDate = Date.valueOf("1999-04-03");
		Hospital hospital = new Hospital("endoscopy Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mr", "Mike", "Bush", "CAPUANNO", name, date, Person.Gender.Male, address, phone,
				joinedDate, department);
		doctor.addLocation("Canada");
		doctor.addLocation("Somerville");
		doctor.removeLocation("Canada");

		assertEquals("Somerville", doctor.getLocation(0));

	}

	@Test
	public void DoctorNumberOfSpecialty_Test1() {
		Phone phone = new Phone("+90", "545", "7843541");
		FullName name = new FullName("Mr", "Alper", "Can", "SAHIN");
		Address address = new Address("Cumhuriyet Street", "Kayseri", "K", "38000", "Turkiye");
		Date date = Date.valueOf("2002-03-14");
		Date joinedDate = Date.valueOf("2022-12-21");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mr", "Alper", "Can", "SAHIN", name, date, Person.Gender.Male, address, phone,
				joinedDate, department);
		doctor.addSpecialty("Puplic health");
		doctor.addSpecialty("Gastroenterology Surgery");
		assertEquals(doctor.numberOfSpecialty(), 2);

	}

	@Test
	public void DoctorNumberOfSpecialty_Test2() {
		Phone phone = new Phone("+1", "798", "3124578");
		FullName name = new FullName("Mr", "Ryan", "Thomas", "VAVIL");
		Address address = new Address("33 Whitehall Street", "London", "L", "22147", "ABD");
		Date date = Date.valueOf("1980-11-12");
		Date joinedDate = Date.valueOf("2014-05-21");
		Hospital hospital = new Hospital("neurology Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mr", "Ryan", "Thomas", "VAVIL", name, date, Person.Gender.Male, address, phone,
				joinedDate, department);
		doctor.addSpecialty("Brain and Nerve");
		doctor.addSpecialty("Urology");
		assertEquals(doctor.numberOfSpecialty(), 2);

	}

	@Test
	public void DoctorNumberOfSpecialty_Test3() {
		Phone phone = new Phone("+44", "164", "77411547");
		FullName name = new FullName("Mr", "Henry", "William", "CAVIL");
		Address address = new Address("Flash Street", "Saint Helier", "SH", "741963", "Jersey");
		Date date = Date.valueOf("1983-05-05");
		Date joinedDate = Date.valueOf("2016-02-12");
		Hospital hospital = new Hospital("neurology Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mr", "Henry", "William", "CAVIL", name, date, Person.Gender.Male, address, phone,
				joinedDate, department);
		doctor.addSpecialty("Physiology");
		doctor.addSpecialty("Hematology");
		assertEquals(doctor.numberOfSpecialty(), 2);

	}

	@Test
	public void DoctorIndexOfSpecialty_Test1() {
		Phone phone = new Phone("+1", "965", "2224578");
		FullName name = new FullName("Mr", "Jeremy", "Lee", "RENNER");
		Address address = new Address("Modesto Street", "Modesto", "M", "95313", "ABD");
		Date date = Date.valueOf("1971-01-07");
		Date joinedDate = Date.valueOf("2010-05-30");
		Hospital hospital = new Hospital("Internal diseases Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mr", "Jeremy", "Lee", "RENNER", name, date, Person.Gender.Male, address, phone,
				joinedDate, department);
		doctor.addSpecialty("Gastroenterology Surgery");
		doctor.addSpecialty("Hematology");
		assertEquals(doctor.indexOfSpecialty("Hematology"), 1);
	}

	@Test
	public void DoctorIndexOfSpecialty_Test2() {
		Phone phone = new Phone("+1", "798", "3124578");
		FullName name = new FullName("Mr", "Jeremy", "Lee", "GOSLİNG");
		Address address = new Address("33 Whitehall Street", "London", "L", "22147", "ABD");
		Date date = Date.valueOf("1980-11-12");
		Date joinedDate = Date.valueOf("2014-05-21");
		Hospital hospital = new Hospital("Neurology Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mr", "Jeremy", "Lee", "GOSLİNG", name, date, Person.Gender.Male, address, phone,
				joinedDate, department);
		doctor.addSpecialty("Brain and Nerve");
		doctor.addSpecialty("Urology");
		assertEquals(doctor.indexOfSpecialty("Urology"), 1);
	}

	@Test
	public void DoctorIndexOfSpecialty_Test3() {
		Phone phone = new Phone("+1", "798", "3124578");
		FullName name = new FullName("Mr", "Mark", "Alan", "RUFFALO");
		Address address = new Address("366 Kenosha Street", "Wisconsin", "W", "339974", "ABD");
		Date date = Date.valueOf("1967-06-13");
		Date joinedDate = Date.valueOf("1980-05-30");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mr", "Mark", "Alan", "RUFFALO", name, date, Person.Gender.Male, address, phone,
				joinedDate, department);
		doctor.addSpecialty("Internal diseases");
		doctor.addSpecialty("Pediatrics");
		assertEquals(doctor.indexOfSpecialty("Pediatrics"), 1);
	}

	@Test
	public void DoctorGetLocations_Test1() {
		Phone phone = new Phone("+44", "656", "4714469");
		FullName name = new FullName("Mrs", "Hayley", "Elizabeth", "ARWELL");
		Address address = new Address("14 Eiefel Street", "London", "L", "366477", "United Kingdom");
		Date date = Date.valueOf("1982-04-05");
		Date joinedDate = Date.valueOf("2000-10-30");
		Hospital hospital = new Hospital("Allergy Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mrs", "Hayley", "Elizabeth", "ARWELL", name, date, Person.Gender.Female, address,
				phone, joinedDate, department);
		doctor.addLocation("London");
		doctor.addLocation("Los Angeles");
		String[] expectedLocations = { "London", "Los Angeles" };
		assertArrayEquals(doctor.getLocations(), expectedLocations);
	}

	@Test
	public void DoctorGetLocations_Test2() {
		Phone phone = new Phone("+44", "656", "4714469");
		FullName name = new FullName("Mr", "Mark", "Alan", "RUFFALO");
		Address address = new Address("366 Kenosha Street", "Wisconsin", "W", "339974", "ABD");
		Date date = Date.valueOf("1967-06-13");
		Date joinedDate = Date.valueOf("1980-05-30");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mr", "Mark", "Alan", "RUFFALO", name, date, Person.Gender.Male, address, phone,
				joinedDate, department);
		doctor.addLocation("Wisconsin");
		doctor.addLocation("Habana");
		String[] expectedLocations = { "Wisconsin", "Habana" };
		assertArrayEquals(doctor.getLocations(), expectedLocations);
	}

	@Test
	public void DoctorGetLocations_Test3() {
		Phone phone = new Phone("+61", "741", "9658234");
		FullName name = new FullName("Mr", "Chris", "Hulk", "HEMSWORTH");
		Address address = new Address("Hoiser Lane Street", "Melbourne", "M", "3000", "Australia");
		Date date = Date.valueOf("1983-08-11");
		Date joinedDate = Date.valueOf("2007-01-13");
		Hospital hospital = new Hospital("Child Health and Diseases Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mr", "Mark", "Alan", "RUFFALO", name, date, Person.Gender.Male, address, phone,
				joinedDate, department);
		doctor.addLocation("Pediatrics");
		doctor.addLocation("Internal diseases");
		String[] expectedLocations = { "Pediatrics", "Internal diseases" };
		assertArrayEquals(doctor.getLocations(), expectedLocations);
	}

	@Test
	public void DoctorNumberOfLocations_Test1() {
		Phone phone = new Phone("+90", "213", "7851518");
		FullName name = new FullName("Mrs", "Ana", "De", "ARMAS");
		Address address = new Address("Arroyo Street", "Habana", "H", "11300", "Cuba");
		Date date = Date.valueOf("1988-04-30");
		Date joinedDate = Date.valueOf("2019-05-22");
		Hospital hospital = new Hospital("Check up Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mrs", "Ana", "De", "ARMAS", name, date, Person.Gender.Female, address, phone,
				joinedDate, department);
		doctor.addLocation("Habana");
		doctor.addLocation("Wisconsin");
		assertEquals(doctor.numberOfLocations(), 2);
	}

	@Test
	public void DoctorNumberOfLocations_Test2() {
		Phone phone = new Phone("+1", "213", "25322444");
		FullName name = new FullName("Mrs", "Mark", "Alan", "RUFFALO");
		Address address = new Address("366 Kenosha Street", "Wisconsin", "W", "339974", "ABD");
		Date date = Date.valueOf("1988-04-30");
		Date joinedDate = Date.valueOf("2019-05-22");
		Hospital hospital = new Hospital("Check up Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mrs", "Mark", "Alan", "RUFFALO", name, date, Person.Gender.Female, address, phone,
				joinedDate, department);
		doctor.addLocation("New York");
		doctor.addLocation("Wisconsin");
		assertEquals(doctor.numberOfLocations(), 2);
	}

	@Test
	public void DoctorNumberOfLocations_Test3() {
		Phone phone = new Phone("+1", "421", "7369982");
		FullName name = new FullName("Mrs", "Mark", "Alan", "RUFFALO");
		Address address = new Address("Sudbury Street", "Massachusetts", "M", "02360", "ABD");
		Date date = Date.valueOf("1983-08-21");
		Date joinedDate = Date.valueOf("2015-02-22");
		Hospital hospital = new Hospital("Dermatology Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mrs", "Mark", "Alan", "RUFFALO", name, date, Person.Gender.Female, address, phone,
				joinedDate, department);
		doctor.addLocation("Massachusetts");
		doctor.addLocation("London");
		assertEquals(doctor.numberOfLocations(), 2);
	}

	@Test
	public void DoctorIndexOfLocation_Test1() {
		Phone phone = new Phone("+36", "387", "1495296");
		FullName name = new FullName("Mrs", "Barbara", "Tyger", "PALVIN");
		Address address = new Address("14 Kazinczy Street", "Budapest", "B", "10007", "Hungary");
		Date date = Date.valueOf("1993-05-13");
		Date joinedDate = Date.valueOf("2023-01-20");
		Hospital hospital = new Hospital("Child Health and Diseases Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mrs", "Barbara", "Tyger", "PALVIN", name, date, Person.Gender.Female, address,
				phone, joinedDate, department);
		doctor.addLocation("New York");
		doctor.addLocation("Budapest");
		assertEquals(doctor.indexOfLocation("Budapest"), 1);
	}

	@Test
	public void DoctorIndexOfLocation_Test2() {
		Phone phone = new Phone("+1", "296", "9412578");
		FullName name = new FullName("Mrs", "Dakota", "Mayi", "JOHNSON");
		Address address = new Address("45 SoCo Street", "Austin", "A", "73301", "ABD");
		Date date = Date.valueOf("1989-07-27");
		Date joinedDate = Date.valueOf("2020-03-30");
		Hospital hospital = new Hospital("Physical therapy and rehabilitation Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mrs", "Dakota", "Mayi", "JOHNSON", name, date, Person.Gender.Female, address, phone,
				joinedDate, department);
		doctor.addLocation("Zonguldak");
		doctor.addLocation("Austin");
		assertEquals(doctor.indexOfLocation("Austin"), 1);
	}

	@Test
	public void DoctorIndexOfLocation_Test3() {
		Phone phone = new Phone("+1", "361", "1274200");
		FullName name = new FullName("Mr", "Robert", "Jhon", "DOWNEY");
		Address address = new Address("34 Romer Street", "Frankfurt", "F", "60306", "Germany");
		Date date = Date.valueOf("1965-04-05");
		Date joinedDate = Date.valueOf("1989-03-12");
		Hospital hospital = new Hospital("Child Health and Diseases Department", address, phone);
		Department department = new Department(hospital);
		Doctor doctor = new Doctor("Mr", "Robert", "Jhon", "DOWNEY", name, date, Person.Gender.Male, address, phone,
				joinedDate, department);
		doctor.addLocation("Trabzon");
		doctor.addLocation("Frankfurt");
		assertEquals(doctor.indexOfLocation("Frankfurt"), 1);
	}

	@Test
	public void Surgeon_Test1() {
		Phone phone = new Phone("+1", "354", "6113838");
		FullName name = new FullName("Mrs", "Angelina", "Croft", "JOLIE");
		// public OperationsStaff(String aTitle, String aGivenName, String aMiddleName,
		// String aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone, Date aJoined, Department aDepartment)
		Address address = new Address("Sunset Street", "Budapest", "B", "10007", "Hungary");
		Date date = Date.valueOf("1975-06-04");
		Date joinedDate = Date.valueOf("2021-05-16");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Department department = new Department(hospital);
		Surgeon surgeon = new Surgeon("Mrs", "Angelina", "Croft", "JOLIE", name, date, Person.Gender.Female, address,
				phone, joinedDate, department);
		assertEquals("Mrs", surgeon.getTitle());
		assertEquals("Angelina", surgeon.getGivenName());
		assertEquals("Croft", surgeon.getMiddleName());
		assertEquals("JOLIE", surgeon.getFamilyName());
		assertEquals(Date.valueOf("1975-06-04"), surgeon.getBirthDate());
		assertEquals(Person.Gender.Female, surgeon.getGender());
		assertEquals("Sunset Street", address.getStreet());
		assertEquals("Budapest", address.getCity());
		assertEquals("B", address.getState());
		assertEquals("10007", address.getZipCode());
		assertEquals("Hungary", address.getCountry());
		assertEquals("+1", phone.getCountryCode());
		assertEquals("354", phone.getAreaCode());
		assertEquals("6113838", phone.getNumber());
		assertEquals(Date.valueOf("2021-05-16"), surgeon.getJoined());
		assertEquals(department, surgeon.getDepartment());

	}

	@Test
	public void Surgeon_Test2() {
		Phone phone = new Phone("+36", "387", "1495296");
		FullName name = new FullName("Mrs", "Barbara", "Tyger", "PALVIN");
		// public OperationsStaff(String aTitle, String aGivenName, String aMiddleName,
		// String aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone, Date aJoined, Department aDepartment)
		Address address = new Address("Kazinczy Street", "Budapest", "B", "10007", "Hungary");
		Date date = Date.valueOf("1993-07-13");
		Date joinedDate = Date.valueOf("2023-01-20");
		Hospital hospital = new Hospital("Child Health and Diseases Department", address, phone);
		Department department = new Department(hospital);
		Surgeon surgeon = new Surgeon("Mrs", "Barbara", "Tyger", "PALVIN", name, date, Person.Gender.Female, address,
				phone, joinedDate, department);
		assertEquals("Mrs", surgeon.getTitle());
		assertEquals("Barbara", surgeon.getGivenName());
		assertEquals("Tyger", surgeon.getMiddleName());
		assertEquals("PALVIN", surgeon.getFamilyName());
		assertEquals(Date.valueOf("1993-07-13"), surgeon.getBirthDate());
		assertEquals(Person.Gender.Female, surgeon.getGender());
		assertEquals("Kazinczy Street", address.getStreet());
		assertEquals("Budapest", address.getCity());
		assertEquals("B", address.getState());
		assertEquals("10007", address.getZipCode());
		assertEquals("Hungary", address.getCountry());
		assertEquals("+36", phone.getCountryCode());
		assertEquals("387", phone.getAreaCode());
		assertEquals("1495296", phone.getNumber());
		assertEquals(Date.valueOf("2023-01-20"), surgeon.getJoined());
		assertEquals(department, surgeon.getDepartment());

	}

	@Test
	public void Surgeon_Test3() {
		Phone phone = new Phone("+1", "296", "9412578");
		FullName name = new FullName("Mrs", "Dakota", "Mayi", "JOHNSON");
		// public OperationsStaff(String aTitle, String aGivenName, String aMiddleName,
		// String aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone, Date aJoined, Department aDepartment)
		Address address = new Address("SoCo Street", "Austin", "A", "73301", "ABD");
		Date date = Date.valueOf("1989-07-27");
		Date joinedDate = Date.valueOf("2020-03-30");
		Hospital hospital = new Hospital("Physical therapy and rehabilitation Department", address, phone);
		Department department = new Department(hospital);
		Surgeon surgeon = new Surgeon("Mrs", "Dakota", "Mayi", "JOHNSON", name, date, Person.Gender.Female, address,
				phone, joinedDate, department);
		assertEquals("Mrs", surgeon.getTitle());
		assertEquals("Dakota", surgeon.getGivenName());
		assertEquals("Mayi", surgeon.getMiddleName());
		assertEquals("JOHNSON", surgeon.getFamilyName());
		assertEquals(Date.valueOf("1989-07-27"), surgeon.getBirthDate());
		assertEquals(Person.Gender.Female, surgeon.getGender());
		assertEquals("SoCo Street", address.getStreet());
		assertEquals("Austin", address.getCity());
		assertEquals("A", address.getState());
		assertEquals("73301", address.getZipCode());
		assertEquals("ABD", address.getCountry());
		assertEquals("+1", phone.getCountryCode());
		assertEquals("296", phone.getAreaCode());
		assertEquals("9412578", phone.getNumber());
		assertEquals(Date.valueOf("2020-03-30"), surgeon.getJoined());
		assertEquals(department, surgeon.getDepartment());

	}

	@Test
	public void AdministrativeStaff_Test1() {
		Phone phone = new Phone("+90", "538", "7851518");
		FullName name = new FullName("Mr", "Murat", "Hasan", "BOZ");
		Address address = new Address("389 Murtaza Street", "Zonguldak", "Z", "67300", "Turkiye");
		Date date = Date.valueOf("1980-03-13");
		Date joinedDate = Date.valueOf("2016-05-23");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Department department = new Department(hospital);
		AdministrativeStaff administrativeStaff = new AdministrativeStaff("Mr", "Murat", "Hasan", "BOZ", name, date,
				Person.Gender.Male, address, phone, joinedDate, department);
		assertEquals("Mr", administrativeStaff.getTitle());
		assertEquals("Murat", administrativeStaff.getGivenName());
		assertEquals("Hasan", administrativeStaff.getMiddleName());
		assertEquals("BOZ", administrativeStaff.getFamilyName());
		assertEquals(Date.valueOf("1980-03-13"), administrativeStaff.getBirthDate());
		assertEquals(Person.Gender.Male, administrativeStaff.getGender());
		assertEquals("389 Murtaza Street", address.getStreet());
		assertEquals("Zonguldak", address.getCity());
		assertEquals("Z", address.getState());
		assertEquals("67300", address.getZipCode());
		assertEquals("Turkiye", address.getCountry());
		assertEquals("+90", phone.getCountryCode());
		assertEquals("538", phone.getAreaCode());
		assertEquals("7851518", phone.getNumber());
		assertEquals(Date.valueOf("2016-05-23"), administrativeStaff.getJoined());
		assertEquals(department, administrativeStaff.getDepartment());

	}

	@Test
	public void AdministrativeStaff_Test2() {
		Phone phone = new Phone("+49", "274", "3689571");
		FullName name = new FullName("Mr", "Hans", "Florian", "ZIMMER");
		// public OperationsStaff(String aTitle, String aGivenName, String aMiddleName,
		// String aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone, Date aJoined, Department aDepartment)
		Address address = new Address("34 Romer Street", "Frankfurt", "F", "60306", "Germany");
		Date date = Date.valueOf("1957-08-12");
		Date joinedDate = Date.valueOf("2001-01-27");
		Hospital hospital = new Hospital("Child Health and Diseases Department", address, phone);
		Department department = new Department(hospital);
		AdministrativeStaff administrativeStaff = new AdministrativeStaff("Mr", "Hans", "Florian", "ZIMMER", name, date,
				Person.Gender.Male, address, phone, joinedDate, department);
		assertEquals("Mr", administrativeStaff.getTitle());
		assertEquals("Hans", administrativeStaff.getGivenName());
		assertEquals("Florian", administrativeStaff.getMiddleName());
		assertEquals("ZIMMER", administrativeStaff.getFamilyName());
		assertEquals(Date.valueOf("1957-08-12"), administrativeStaff.getBirthDate());
		assertEquals(Person.Gender.Male, administrativeStaff.getGender());
		assertEquals("34 Romer Street", address.getStreet());
		assertEquals("Frankfurt", address.getCity());
		assertEquals("F", address.getState());
		assertEquals("60306", address.getZipCode());
		assertEquals("Germany", address.getCountry());
		assertEquals("+49", phone.getCountryCode());
		assertEquals("274", phone.getAreaCode());
		assertEquals("3689571", phone.getNumber());
		assertEquals(Date.valueOf("2001-01-27"), administrativeStaff.getJoined());
		assertEquals(department, administrativeStaff.getDepartment());

	}

	@Test
	public void AdministrativeStaff_Test3() {
		Phone phone = new Phone("+1", "361", "1274200");
		FullName name = new FullName("Mr", "Robert", "Jhon", "DOWNEY");
		// public OperationsStaff(String aTitle, String aGivenName, String aMiddleName,
		// String aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone, Date aJoined, Department aDepartment)
		Address address = new Address("389 Lexington Street", "New York", "NY", "10001", "ABD");
		Date date = Date.valueOf("1965-04-03");
		Date joinedDate = Date.valueOf("1989-03-12");
		Hospital hospital = new Hospital("Physical therapy and rehabilitation Department", address, phone);
		Department department = new Department(hospital);
		AdministrativeStaff administrativeStaff = new AdministrativeStaff("Mr", "Robert", "Jhon", "DOWNEY", name, date,
				Person.Gender.Male, address, phone, joinedDate, department);
		assertEquals("Mr", administrativeStaff.getTitle());
		assertEquals("Robert", administrativeStaff.getGivenName());
		assertEquals("Jhon", administrativeStaff.getMiddleName());
		assertEquals("DOWNEY", administrativeStaff.getFamilyName());
		assertEquals(Date.valueOf("1965-04-03"), administrativeStaff.getBirthDate());
		assertEquals(Person.Gender.Male, administrativeStaff.getGender());
		assertEquals("389 Lexington Street", address.getStreet());
		assertEquals("New York", address.getCity());
		assertEquals("NY", address.getState());
		assertEquals("10001", address.getZipCode());
		assertEquals("ABD", address.getCountry());
		assertEquals("+1", phone.getCountryCode());
		assertEquals("361", phone.getAreaCode());
		assertEquals("1274200", phone.getNumber());
		assertEquals(Date.valueOf("1989-03-12"), administrativeStaff.getJoined());
		assertEquals(department, administrativeStaff.getDepartment());

	}

	@Test
	public void FrontDeskStaff_Test1() {
		Phone phone = new Phone("+1", "213", "2532244");
		FullName name = new FullName("Mr", "Mark", "Alan", "RUFFALO");
		// public OperationsStaff(String aTitle, String aGivenName, String aMiddleName,
		// String aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone, Date aJoined, Department aDepartment)
		Address address = new Address("123 Main Street", "NewYork", "NY", "324", "ABD");
		Date date = Date.valueOf("1967-06-13");
		Date joinedDate = Date.valueOf("1980-05-30");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Department department = new Department(hospital);
		FrontDeskStaff frontDeskStaff = new FrontDeskStaff("Mr", "Mark", "Alan", "RUFFALO", name, date,
				Person.Gender.Male, address, phone, joinedDate, department);
		assertEquals("Mr", frontDeskStaff.getTitle());
		assertEquals("Mark", frontDeskStaff.getGivenName());
		assertEquals("Alan", frontDeskStaff.getMiddleName());
		assertEquals("RUFFALO", frontDeskStaff.getFamilyName());
		assertEquals(Date.valueOf("1967-06-13"), frontDeskStaff.getBirthDate());
		assertEquals(Person.Gender.Male, frontDeskStaff.getGender());
		assertEquals("123 Main Street", address.getStreet());
		assertEquals("NewYork", address.getCity());
		assertEquals("NY", address.getState());
		assertEquals("324", address.getZipCode());
		assertEquals("ABD", address.getCountry());
		assertEquals("+1", phone.getCountryCode());
		assertEquals("213", phone.getAreaCode());
		assertEquals("2532244", phone.getNumber());
		assertEquals(Date.valueOf("1980-05-30"), frontDeskStaff.getJoined());
		assertEquals(department, frontDeskStaff.getDepartment());

	}

	@Test
	public void FrontDeskStaff_Test2() {
		Phone phone = new Phone("+53", "132", "4935627");
		FullName name = new FullName("Mrs", "Ana", "De", "ARMAS");
		// public OperationsStaff(String aTitle, String aGivenName, String aMiddleName,
		// String aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone, Date aJoined, Department aDepartment)
		Address address = new Address("123 Arroyo Street", "Habana", "H", "11300", "Cuba");
		Date date = Date.valueOf("1988-04-22");
		Date joinedDate = Date.valueOf("2019-05-22");
		Hospital hospital = new Hospital("Check up Department", address, phone);
		Department department = new Department(hospital);
		FrontDeskStaff frontDeskStaff = new FrontDeskStaff("Mrs", "Ana", "De", "ARMAS", name, date,
				Person.Gender.Female, address, phone, joinedDate, department);
		assertEquals("Mrs", frontDeskStaff.getTitle());
		assertEquals("Ana", frontDeskStaff.getGivenName());
		assertEquals("De", frontDeskStaff.getMiddleName());
		assertEquals("ARMAS", frontDeskStaff.getFamilyName());
		assertEquals(Date.valueOf("1988-04-22"), frontDeskStaff.getBirthDate());
		assertEquals(Person.Gender.Female, frontDeskStaff.getGender());
		assertEquals("123 Arroyo Street", address.getStreet());
		assertEquals("Habana", address.getCity());
		assertEquals("H", address.getState());
		assertEquals("11300", address.getZipCode());
		assertEquals("Cuba", address.getCountry());
		assertEquals("+53", phone.getCountryCode());
		assertEquals("132", phone.getAreaCode());
		assertEquals("4935627", phone.getNumber());
		assertEquals(Date.valueOf("2019-05-22"), frontDeskStaff.getJoined());
		assertEquals(department, frontDeskStaff.getDepartment());

	}

	@Test
	public void FrontDeskStaff_Test3() {
		Phone phone = new Phone("+1", "421", "7369982");
		FullName name = new FullName("Mr", "Scott", "Mike", "EVANS");
		// public OperationsStaff(String aTitle, String aGivenName, String aMiddleName,
		// String aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone, Date aJoined, Department aDepartment)
		Address address = new Address("233 Sudbury Street", "Massachusetts", "M", "02360", "ABD");
		Date date = Date.valueOf("1983-08-21");
		Date joinedDate = Date.valueOf("2015-02-22");
		Hospital hospital = new Hospital("Dermatology Department", address, phone);
		Department department = new Department(hospital);
		FrontDeskStaff frontDeskStaff = new FrontDeskStaff("Mr", "Scott", "Alan", "EVANS", name, date,
				Person.Gender.Male, address, phone, joinedDate, department);
		assertEquals("Mr", frontDeskStaff.getTitle());
		assertEquals("Scott", frontDeskStaff.getGivenName());
		assertEquals("Alan", frontDeskStaff.getMiddleName());
		assertEquals("EVANS", frontDeskStaff.getFamilyName());
		assertEquals(Date.valueOf("1983-08-21"), frontDeskStaff.getBirthDate());
		assertEquals(Person.Gender.Male, frontDeskStaff.getGender());
		assertEquals("233 Sudbury Street", address.getStreet());
		assertEquals("Massachusetts", address.getCity());
		assertEquals("M", address.getState());
		assertEquals("02360", address.getZipCode());
		assertEquals("ABD", address.getCountry());
		assertEquals("+1", phone.getCountryCode());
		assertEquals("421", phone.getAreaCode());
		assertEquals("7369982", phone.getNumber());
		assertEquals(Date.valueOf("2015-02-22"), frontDeskStaff.getJoined());
		assertEquals(department, frontDeskStaff.getDepartment());

	}

	@Test
	public void Receptionist_Test1() {
		Phone phone = new Phone("+44", "164", "77411547");
		FullName name = new FullName("Mr", "Henry", "William", "CAVIL");
		// public OperationsStaff(String aTitle, String aGivenName, String aMiddleName,
		// String aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone, Date aJoined, Department aDepartment)
		Address address = new Address("367 Flash Street", "Saint", "SH", "741963", "Jersey");
		Date date = Date.valueOf("1983-05-06");
		Date joinedDate = Date.valueOf("2016-02-12");
		Hospital hospital = new Hospital("Nutrition and diet Department", address, phone);
		Department department = new Department(hospital);
		Receptionist receptionist = new Receptionist("Mr", "Henry", "William", "CAVIL", name, date, Person.Gender.Male,
				address, phone, joinedDate, department);
		assertEquals("Mr", receptionist.getTitle());
		assertEquals("Henry", receptionist.getGivenName());
		assertEquals("William", receptionist.getMiddleName());
		assertEquals("CAVIL", receptionist.getFamilyName());
		assertEquals(Date.valueOf("1983-05-06"), receptionist.getBirthDate());
		assertEquals(Person.Gender.Male, receptionist.getGender());
		assertEquals("367 Flash Street", address.getStreet());
		assertEquals("Saint", address.getCity());
		assertEquals("SH", address.getState());
		assertEquals("741963", address.getZipCode());
		assertEquals("Jersey", address.getCountry());
		assertEquals("+44", phone.getCountryCode());
		assertEquals("164", phone.getAreaCode());
		assertEquals("77411547", phone.getNumber());
		assertEquals(Date.valueOf("2016-02-12"), receptionist.getJoined());
		assertEquals(department, receptionist.getDepartment());

	}

	@Test
	public void Receptionist_Test2() {
		Phone phone = new Phone("+1", "798", "3124578");
		FullName name = new FullName("Mr", "Ryan", "Thomas", "GOSLİNG");
		// public OperationsStaff(String aTitle, String aGivenName, String aMiddleName,
		// String aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone, Date aJoined, Department aDepartment)
		Address address = new Address("154 Whitehall Street", "London", "L", "22147", "ABD");
		Date date = Date.valueOf("1980-11-21");
		Date joinedDate = Date.valueOf("2014-05-21");
		Hospital hospital = new Hospital("neurology Department", address, phone);
		Department department = new Department(hospital);
		Receptionist receptionist = new Receptionist("Mr", "Ryan", "Thomas", "GOSLİNG", name, date, Person.Gender.Male,
				address, phone, joinedDate, department);
		assertEquals("Mr", receptionist.getTitle());
		assertEquals("Ryan", receptionist.getGivenName());
		assertEquals("Thomas", receptionist.getMiddleName());
		assertEquals("GOSLİNG", receptionist.getFamilyName());
		assertEquals(Date.valueOf("1980-11-21"), receptionist.getBirthDate());
		assertEquals(Person.Gender.Male, receptionist.getGender());
		assertEquals("154 Whitehall Street", address.getStreet());
		assertEquals("London", address.getCity());
		assertEquals("L", address.getState());
		assertEquals("22147", address.getZipCode());
		assertEquals("ABD", address.getCountry());
		assertEquals("+1", phone.getCountryCode());
		assertEquals("798", phone.getAreaCode());
		assertEquals("3124578", phone.getNumber());
		assertEquals(Date.valueOf("2014-05-21"), receptionist.getJoined());
		assertEquals(department, receptionist.getDepartment());

	}

	@Test
	public void Receptionist_Test3() {
		Phone phone = new Phone("+1", "965", "2224578");
		FullName name = new FullName("Mr", "Jeremy", "Lee", "RENNER");
		// public OperationsStaff(String aTitle, String aGivenName, String aMiddleName,
		// String aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone, Date aJoined, Department aDepartment)
		Address address = new Address("2885 Dahmer Street", "Modesto", "M", "95313", "ABD");
		Date date = Date.valueOf("1971-03-13");
		Date joinedDate = Date.valueOf("2010-05-30");
		Hospital hospital = new Hospital("Internal diseases Department", address, phone);
		Department department = new Department(hospital);
		Receptionist receptionist = new Receptionist("Mr", "Jeremy", "Lee", "RENNER", name, date, Person.Gender.Male,
				address, phone, joinedDate, department);
		assertEquals("Mr", receptionist.getTitle());
		assertEquals("Jeremy", receptionist.getGivenName());
		assertEquals("Lee", receptionist.getMiddleName());
		assertEquals("RENNER", receptionist.getFamilyName());
		assertEquals(Date.valueOf("1971-03-13"), receptionist.getBirthDate());
		assertEquals(Person.Gender.Male, receptionist.getGender());
		assertEquals("2885 Dahmer Street", address.getStreet());
		assertEquals("Modesto", address.getCity());
		assertEquals("M", address.getState());
		assertEquals("95313", address.getZipCode());
		assertEquals("ABD", address.getCountry());
		assertEquals("+1", phone.getCountryCode());
		assertEquals("965", phone.getAreaCode());
		assertEquals("2224578", phone.getNumber());
		assertEquals(Date.valueOf("2010-05-30"), receptionist.getJoined());
		assertEquals(department, receptionist.getDepartment());

	}

	@Test
	public void TechnicalStaff_Test1() {
		Phone phone = new Phone("+1", "538", "6748357");
		FullName name = new FullName("Mrs", "Jane", "Catherine", "SEYMOUR");
		// public OperationsStaff(String aTitle, String aGivenName, String aMiddleName,
		// String aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone, Date aJoined, Department aDepartment)
		Address address = new Address("325 Broadway Street", "NewYork", "NY", "38000", "ABD");
		Date date = Date.valueOf("1945-06-13");
		Date joinedDate = Date.valueOf("1965-02-22");
		Hospital hospital = new Hospital("Mouth and dental health Department", address, phone);
		Department department = new Department(hospital);
		TechnicalStaff technicalStaff = new TechnicalStaff("Mrs", "Jane", "Catherine", "SEYMOUR", name, date,
				Person.Gender.Female, address, phone, joinedDate, department);
		assertEquals("Mrs", technicalStaff.getTitle());
		assertEquals("Jane", technicalStaff.getGivenName());
		assertEquals("Catherine", technicalStaff.getMiddleName());
		assertEquals("SEYMOUR", technicalStaff.getFamilyName());
		assertEquals(Date.valueOf("1945-06-13"), technicalStaff.getBirthDate());
		assertEquals(Person.Gender.Female, technicalStaff.getGender());
		assertEquals("325 Broadway Street", address.getStreet());
		assertEquals("NewYork", address.getCity());
		assertEquals("NY", address.getState());
		assertEquals("38000", address.getZipCode());
		assertEquals("ABD", address.getCountry());
		assertEquals("+1", phone.getCountryCode());
		assertEquals("538", phone.getAreaCode());
		assertEquals("6748357", phone.getNumber());
		assertEquals(Date.valueOf("1965-02-22"), technicalStaff.getJoined());
		assertEquals(department, technicalStaff.getDepartment());

	}

	@Test
	public void TechnicalStaff_Test2() {
		Phone phone = new Phone("+961", "345", "3946152");
		FullName name = new FullName("Mr", "Keanu", "John", "REEVES");
		// public OperationsStaff(String aTitle, String aGivenName, String aMiddleName,
		// String aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone, Date aJoined, Department aDepartment)
		Address address = new Address("196 Tripadvisor Street", "Beyrut", "B", "616", "Lübnan");
		Date date = Date.valueOf("1936-04-16");
		Date joinedDate = Date.valueOf("1970-06-25");
		Hospital hospital = new Hospital("Chech Up Department", address, phone);
		Department department = new Department(hospital);
		TechnicalStaff technicalStaff = new TechnicalStaff("Mr", "Keanu", "John", "REEVES", name, date,
				Person.Gender.Male, address, phone, joinedDate, department);
		assertEquals("Mr", technicalStaff.getTitle());
		assertEquals("Keanu", technicalStaff.getGivenName());
		assertEquals("John", technicalStaff.getMiddleName());
		assertEquals("REEVES", technicalStaff.getFamilyName());
		assertEquals(Date.valueOf("1936-04-16"), technicalStaff.getBirthDate());
		assertEquals(Person.Gender.Male, technicalStaff.getGender());
		assertEquals("196 Tripadvisor Street", address.getStreet());
		assertEquals("Beyrut", address.getCity());
		assertEquals("B", address.getState());
		assertEquals("616", address.getZipCode());
		assertEquals("Lübnan", address.getCountry());
		assertEquals("+961", phone.getCountryCode());
		assertEquals("345", phone.getAreaCode());
		assertEquals("3946152", phone.getNumber());
		assertEquals(Date.valueOf("1970-06-25"), technicalStaff.getJoined());
		assertEquals(department, technicalStaff.getDepartment());

	}

	@Test
	public void TechnicalStaff_Test3() {
		Phone phone = new Phone("+90", "538", "5293842");
		FullName name = new FullName("Mr", "Alper", "Huseyin", "ŞAŞAR");
		// public OperationsStaff(String aTitle, String aGivenName, String aMiddleName,
		// String aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone, Date aJoined, Department aDepartment)
		Address address = new Address("333 Maras Gebze Street", "Kayseri", "K", "38000", "Turkiye");
		Date date = Date.valueOf("2002-03-16");
		Date joinedDate = Date.valueOf("2023-04-11");
		Hospital hospital = new Hospital("Nephrology Department", address, phone);
		Department department = new Department(hospital);
		TechnicalStaff technicalStaff = new TechnicalStaff("Mr", "Alper", "Huseyin", "ŞAŞAR", name, date,
				Person.Gender.Female, address, phone, joinedDate, department);
		assertEquals("Mr", technicalStaff.getTitle());
		assertEquals("Alper", technicalStaff.getGivenName());
		assertEquals("Huseyin", technicalStaff.getMiddleName());
		assertEquals("ŞAŞAR", technicalStaff.getFamilyName());
		assertEquals(Date.valueOf("2002-03-16"), technicalStaff.getBirthDate());
		assertEquals(Person.Gender.Female, technicalStaff.getGender());
		assertEquals("333 Maras Gebze Street", address.getStreet());
		assertEquals("Kayseri", address.getCity());
		assertEquals("K", address.getState());
		assertEquals("38000", address.getZipCode());
		assertEquals("Turkiye", address.getCountry());
		assertEquals("+90", phone.getCountryCode());
		assertEquals("538", phone.getAreaCode());
		assertEquals("5293842", phone.getNumber());
		assertEquals(Date.valueOf("2023-04-11"), technicalStaff.getJoined());
		assertEquals(department, technicalStaff.getDepartment());

	}

	@Test
	public void Technician_Test1() {
		Phone phone = new Phone("+1", "354", "6113838");
		FullName name = new FullName("Mrs", "Angelina", "Croft", "JOLIE");
		// public OperationsStaff(String aTitle, String aGivenName, String aMiddleName,
		// String aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone, Date aJoined, Department aDepartment)
		Address address = new Address("377 Sunset Street", "NewYork", "NY", "324", "ABD");
		Date date = Date.valueOf("1975-06-04");
		Date joinedDate = Date.valueOf("2021-02-23");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Department department = new Department(hospital);
		Technician technician = new Technician("Mrs", "Angelina", "Croft", "JOLIE", name, date, Person.Gender.Female,
				address, phone, joinedDate, department);
		assertEquals("Mrs", technician.getTitle());
		assertEquals("Angelina", technician.getGivenName());
		assertEquals("Croft", technician.getMiddleName());
		assertEquals("JOLIE", technician.getFamilyName());
		assertEquals(Date.valueOf("1975-06-04"), technician.getBirthDate());
		assertEquals(Person.Gender.Female, technician.getGender());
		assertEquals("377 Sunset Street", address.getStreet());
		assertEquals("NewYork", address.getCity());
		assertEquals("NY", address.getState());
		assertEquals("324", address.getZipCode());
		assertEquals("ABD", address.getCountry());
		assertEquals("+1", phone.getCountryCode());
		assertEquals("354", phone.getAreaCode());
		assertEquals("6113838", phone.getNumber());
		assertEquals(Date.valueOf("2021-02-23"), technician.getJoined());
		assertEquals(department, technician.getDepartment());

	}

	@Test
	public void Technician_Test2() {
		Phone phone = new Phone("+36", "387", "1495296");
		FullName name = new FullName("Mrs", "Barbara", "Tyger", "PALVIN");
		// public OperationsStaff(String aTitle, String aGivenName, String aMiddleName,
		// String aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone, Date aJoined, Department aDepartment)
		Address address = new Address("228 Kazinczy Street", "Budapest", "B", "10007", "Hungary");
		Date date = Date.valueOf("1993-05-13");
		Date joinedDate = Date.valueOf("2023-01-20");
		Hospital hospital = new Hospital("Child Health and Diseases Department", address, phone);
		Department department = new Department(hospital);
		Technician technician = new Technician("Mrs", "Barbara", "Tyger", "PALVIN", name, date, Person.Gender.Female,
				address, phone, joinedDate, department);
		assertEquals("Mrs", technician.getTitle());
		assertEquals("Barbara", technician.getGivenName());
		assertEquals("Tyger", technician.getMiddleName());
		assertEquals("PALVIN", technician.getFamilyName());
		assertEquals(Date.valueOf("1993-05-13"), technician.getBirthDate());
		assertEquals(Person.Gender.Female, technician.getGender());
		assertEquals("228 Kazinczy Street", address.getStreet());
		assertEquals("Budapest", address.getCity());
		assertEquals("B", address.getState());
		assertEquals("10007", address.getZipCode());
		assertEquals("Hungary", address.getCountry());
		assertEquals("+36", phone.getCountryCode());
		assertEquals("387", phone.getAreaCode());
		assertEquals("1495296", phone.getNumber());
		assertEquals(Date.valueOf("2023-01-20"), technician.getJoined());
		assertEquals(department, technician.getDepartment());

	}

	@Test
	public void Technician_Test3() {
		Phone phone = new Phone("+1", "296", "9412578");
		FullName name = new FullName("Mrs", "Dakota", "Mayi", "JOHNSON");
		// public OperationsStaff(String aTitle, String aGivenName, String aMiddleName,
		// String aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone, Date aJoined, Department aDepartment)
		Address address = new Address("445 String Street", "Austin", "A", "73301", "ABD");
		Date date = Date.valueOf("1989-07-27");
		Date joinedDate = Date.valueOf("2020-03-30");
		Hospital hospital = new Hospital("Physical therapy and rehabilitation Department", address, phone);
		Department department = new Department(hospital);
		Technician technician = new Technician("Mrs", "Dakota", "Mayi", "JOHNSON", name, date, Person.Gender.Female,
				address, phone, joinedDate, department);
		assertEquals("Mrs", technician.getTitle());
		assertEquals("Dakota", technician.getGivenName());
		assertEquals("Mayi", technician.getMiddleName());
		assertEquals("JOHNSON", technician.getFamilyName());
		assertEquals(Date.valueOf("1989-07-27"), technician.getBirthDate());
		assertEquals(Person.Gender.Female, technician.getGender());
		assertEquals("445 String Street", address.getStreet());
		assertEquals("Austin", address.getCity());
		assertEquals("A", address.getState());
		assertEquals("73301", address.getZipCode());
		assertEquals("ABD", address.getCountry());
		assertEquals("+1", phone.getCountryCode());
		assertEquals("296", phone.getAreaCode());
		assertEquals("9412578", phone.getNumber());
		assertEquals(Date.valueOf("2020-03-30"), technician.getJoined());
		assertEquals(department, technician.getDepartment());

	}

	@Test
	public void Technologist_Test1() {
		Phone phone = new Phone("+90", "568", "7851518");
		FullName name = new FullName("Mr", "Murat", "Hasan", "BOZ");
		// public OperationsStaff(String aTitle, String aGivenName, String aMiddleName,
		// String aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone, Date aJoined, Department aDepartment)
		Address address = new Address("25 Murtaza Street", "Zonguldak", "Z", "67300", "Turkiye");
		Date date = Date.valueOf("1980-03-13");
		Date joinedDate = Date.valueOf("2016-05-23");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Department department = new Department(hospital);
		Technologist technologist = new Technologist("Mr", "Murat", "Hasan", "BOZ", name, date, Person.Gender.Male,
				address, phone, joinedDate, department);
		assertEquals("Mr", technologist.getTitle());
		assertEquals("Murat", technologist.getGivenName());
		assertEquals("Hasan", technologist.getMiddleName());
		assertEquals("BOZ", technologist.getFamilyName());
		assertEquals(Date.valueOf("1980-03-13"), technologist.getBirthDate());
		assertEquals(Person.Gender.Male, technologist.getGender());
		assertEquals("25 Murtaza Street", address.getStreet());
		assertEquals("Zonguldak", address.getCity());
		assertEquals("Z", address.getState());
		assertEquals("67300", address.getZipCode());
		assertEquals("Turkiye", address.getCountry());
		assertEquals("+90", phone.getCountryCode());
		assertEquals("568", phone.getAreaCode());
		assertEquals("7851518", phone.getNumber());
		assertEquals(Date.valueOf("2016-05-23"), technologist.getJoined());
		assertEquals(department, technologist.getDepartment());

	}

	@Test
	public void Technologist_Test2() {
		Phone phone = new Phone("+49", "274", "3689571");
		FullName name = new FullName("Mr", "Hans", "Florian", "ZIMMER");
		// public OperationsStaff(String aTitle, String aGivenName, String aMiddleName,
		// String aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone, Date aJoined, Department aDepartment)
		Address address = new Address("27 Romer Street", "Frankfurt", "F", "60306", "Germany");
		Date date = Date.valueOf("1957-08-12");
		Date joinedDate = Date.valueOf("2001-01-27");
		Hospital hospital = new Hospital("Child Health and Diseases Department", address, phone);
		Department department = new Department(hospital);
		Technologist technologist = new Technologist("Mr", "Hans", "Florian", "ZIMMER", name, date, Person.Gender.Male,
				address, phone, joinedDate, department);
		assertEquals("Mr", technologist.getTitle());
		assertEquals("Hans", technologist.getGivenName());
		assertEquals("Florian", technologist.getMiddleName());
		assertEquals("ZIMMER", technologist.getFamilyName());
		assertEquals(Date.valueOf("1957-08-12"), technologist.getBirthDate());
		assertEquals(Person.Gender.Male, technologist.getGender());
		assertEquals("27 Romer Street", address.getStreet());
		assertEquals("Frankfurt", address.getCity());
		assertEquals("F", address.getState());
		assertEquals("60306", address.getZipCode());
		assertEquals("Germany", address.getCountry());
		assertEquals("+49", phone.getCountryCode());
		assertEquals("274", phone.getAreaCode());
		assertEquals("3689571", phone.getNumber());
		assertEquals(Date.valueOf("2001-01-27"), technologist.getJoined());
		assertEquals(department, technologist.getDepartment());

	}

	@Test
	public void Technologist_Test3() {
		Phone phone = new Phone("+1", "361", "1274200");
		FullName name = new FullName("Mr", "Robert", "Jhon", "DOWNEY");
		// public OperationsStaff(String aTitle, String aGivenName, String aMiddleName,
		// String aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone, Date aJoined, Department aDepartment)
		Address address = new Address("964 Lexington Street", "New York", "NY", "10001", "ABD");
		Date date = Date.valueOf("1965-04-07");
		Date joinedDate = Date.valueOf("1989-03-12");
		Hospital hospital = new Hospital("Physical therapy and rehabilitation Department", address, phone);
		Department department = new Department(hospital);
		Technologist technologist = new Technologist("Mr", "Robert", "Jhon", "DOWNEY", name, date, Person.Gender.Male,
				address, phone, joinedDate, department);
		assertEquals("Mr", technologist.getTitle());
		assertEquals("Robert", technologist.getGivenName());
		assertEquals("Jhon", technologist.getMiddleName());
		assertEquals("DOWNEY", technologist.getFamilyName());
		assertEquals(Date.valueOf("1965-04-07"), technologist.getBirthDate());
		assertEquals(Person.Gender.Male, technologist.getGender());
		assertEquals("964 Lexington Street", address.getStreet());
		assertEquals("New York", address.getCity());
		assertEquals("NY", address.getState());
		assertEquals("10001", address.getZipCode());
		assertEquals("ABD", address.getCountry());
		assertEquals("+1", phone.getCountryCode());
		assertEquals("361", phone.getAreaCode());
		assertEquals("1274200", phone.getNumber());
		assertEquals(Date.valueOf("1989-03-12"), technologist.getJoined());
		assertEquals(department, technologist.getDepartment());

	}

	@Test
	public void SurgicalTechnologist_Test1() {
		Phone phone = new Phone("+44", "164", "77411547");
		FullName name = new FullName("Mr", "Henry", "William", "CAVIL");
		// public OperationsStaff(String aTitle, String aGivenName, String aMiddleName,
		// String aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone, Date aJoined, Department aDepartment)
		Address address = new Address("367 Flash Street", "Saint", "S", "741963", "Jersey");
		Date date = Date.valueOf("1983-05-06");
		Date joinedDate = Date.valueOf("2016-02-12");
		Hospital hospital = new Hospital("Nutrition and diet Department", address, phone);
		Department department = new Department(hospital);
		SurgicalTechnologist surgicalTechnologist = new SurgicalTechnologist("Mr", "Henry", "William", "CAVIL", name,
				date, Person.Gender.Male, address, phone, joinedDate, department);
		assertEquals("Mr", surgicalTechnologist.getTitle());
		assertEquals("Henry", surgicalTechnologist.getGivenName());
		assertEquals("William", surgicalTechnologist.getMiddleName());
		assertEquals("CAVIL", surgicalTechnologist.getFamilyName());
		assertEquals(Date.valueOf("1983-05-06"), surgicalTechnologist.getBirthDate());
		assertEquals(Person.Gender.Male, surgicalTechnologist.getGender());
		assertEquals("367 Flash Street", address.getStreet());
		assertEquals("Saint", address.getCity());
		assertEquals("S", address.getState());
		assertEquals("741963", address.getZipCode());
		assertEquals("Jersey", address.getCountry());
		assertEquals("+44", phone.getCountryCode());
		assertEquals("164", phone.getAreaCode());
		assertEquals("77411547", phone.getNumber());
		assertEquals(Date.valueOf("2016-02-12"), surgicalTechnologist.getJoined());
		assertEquals(department, surgicalTechnologist.getDepartment());

	}

	@Test
	public void SurgicalTechnologist_Test2() {
		Phone phone = new Phone("+1", "798", "3124578");
		FullName name = new FullName("Mr", "Ryan", "Thomas", "GOSLİNG");
		// public OperationsStaff(String aTitle, String aGivenName, String aMiddleName,
		// String aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone, Date aJoined, Department aDepartment)
		Address address = new Address("367 Flash Street", "Saint", "S", "741963", "Jersey");
		Date date = Date.valueOf("1980-11-21");
		Date joinedDate = Date.valueOf("2014-05-08");
		Hospital hospital = new Hospital("Neurology", address, phone);
		Department department = new Department(hospital);
		SurgicalTechnologist surgicalTechnologist = new SurgicalTechnologist("Mr", "Ryan", "Thomas", "GOSLİNG", name,
				date, Person.Gender.Male, address, phone, joinedDate, department);
		assertEquals("Mr", surgicalTechnologist.getTitle());
		assertEquals("Ryan", surgicalTechnologist.getGivenName());
		assertEquals("Thomas", surgicalTechnologist.getMiddleName());
		assertEquals("GOSLİNG", surgicalTechnologist.getFamilyName());
		assertEquals(Date.valueOf("1980-11-21"), surgicalTechnologist.getBirthDate());
		assertEquals(Person.Gender.Male, surgicalTechnologist.getGender());
		assertEquals("367 Flash Street", address.getStreet());
		assertEquals("Saint", address.getCity());
		assertEquals("S", address.getState());
		assertEquals("741963", address.getZipCode());
		assertEquals("Jersey", address.getCountry());
		assertEquals("+1", phone.getCountryCode());
		assertEquals("798", phone.getAreaCode());
		assertEquals("3124578", phone.getNumber());
		assertEquals(Date.valueOf("2014-05-08"), surgicalTechnologist.getJoined());
		assertEquals(department, surgicalTechnologist.getDepartment());

	}

	@Test
	public void SurgicalTechnologist_Test3() {
		Phone phone = new Phone("+44", "164", "77411547");
		FullName name = new FullName("Mr", "Jeremy", "Lee", "RENNER");
		// public OperationsStaff(String aTitle, String aGivenName, String aMiddleName,
		// String aFamilyName, FullName aName, Date aBirthDate, Gender aGender, Address
		// aHomeAddress, Phone aPhone, Date aJoined, Department aDepartment)
		Address address = new Address("2885 Dahmer Street", "Modesto", "M", "95313", "ABD");
		Date date = Date.valueOf("1971-03-13");
		Date joinedDate = Date.valueOf("2010-05-10");
		Hospital hospital = new Hospital("Internal diseases Department", address, phone);
		Department department = new Department(hospital);
		SurgicalTechnologist surgicalTechnologist = new SurgicalTechnologist("Mr", "Jeremy", "Lee", "RENNER", name,
				date, Person.Gender.Male, address, phone, joinedDate, department);
		assertEquals("Mr", surgicalTechnologist.getTitle());
		assertEquals("Jeremy", surgicalTechnologist.getGivenName());
		assertEquals("Lee", surgicalTechnologist.getMiddleName());
		assertEquals("RENNER", surgicalTechnologist.getFamilyName());
		assertEquals(Date.valueOf("1971-03-13"), surgicalTechnologist.getBirthDate());
		assertEquals(Person.Gender.Male, surgicalTechnologist.getGender());
		assertEquals("2885 Dahmer Street", address.getStreet());
		assertEquals("Modesto", address.getCity());
		assertEquals("M", address.getState());
		assertEquals("95313", address.getZipCode());
		assertEquals("ABD", address.getCountry());
		assertEquals("+44", phone.getCountryCode());
		assertEquals("164", phone.getAreaCode());
		assertEquals("77411547", phone.getNumber());
		assertEquals(Date.valueOf("2010-05-10"), surgicalTechnologist.getJoined());
		assertEquals(department, surgicalTechnologist.getDepartment());

	}

	@Test
	public void Hospital_Test1() {
		Phone phone = new Phone("+1", "538", "6748357");
		Address address = new Address("13 Broadway Street", "NewYork", "NY", "38000", "ABD");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Department department = new Department(hospital);
		hospital.addDepartment(department);
		assertEquals("13 Broadway Street", address.getStreet());
		assertEquals("NewYork", address.getCity());
		assertEquals("NY", address.getState());
		assertEquals("38000", address.getZipCode());
		assertEquals("ABD", address.getCountry());
		assertEquals("+1", phone.getCountryCode());
		assertEquals("538", phone.getAreaCode());
		assertEquals("6748357", phone.getNumber());
		assertEquals(department, hospital.getDepartment(0));

	}

	@Test
	public void Hospital_Test2() {
		Phone phone = new Phone("+961", "345", "3946152");
		Address address = new Address("25 Tripadvisor Street", "Beyrut", "B", "616", "Lübnan");
		Hospital hospital = new Hospital("Physiotheraphy Department", address, phone);
		Department department = new Department(hospital);
		hospital.addDepartment(department);
		assertEquals("25 Tripadvisor Street", address.getStreet());
		assertEquals("Beyrut", address.getCity());
		assertEquals("B", address.getState());
		assertEquals("616", address.getZipCode());
		assertEquals("Lübnan", address.getCountry());
		assertEquals("+961", phone.getCountryCode());
		assertEquals("345", phone.getAreaCode());
		assertEquals("3946152", phone.getNumber());
		assertEquals(department, hospital.getDepartment(0));

	}

	@Test
	public void Hospital_Test3() {
		Phone phone = new Phone("+62", "524", "6378824");
		Address address = new Address("24 Jetson Street", "Paris", "P", "28450", "France");
		Hospital hospital = new Hospital("Urology Department", address, phone);
		Department department = new Department(hospital);
		hospital.addDepartment(department);
		assertEquals("24 Jetson Street", address.getStreet());
		assertEquals("Paris", address.getCity());
		assertEquals("P", address.getState());
		assertEquals("28450", address.getZipCode());
		assertEquals("France", address.getCountry());
		assertEquals("+62", phone.getCountryCode());
		assertEquals("524", phone.getAreaCode());
		assertEquals("6378824", phone.getNumber());
		assertEquals(department, hospital.getDepartment(0));

	}

	@Test
	public void HospitalNumberOfDepartments_Test1() {
		Phone phone = new Phone("+36", "387", "1495296");
		Address address = new Address("124 Kazinczy Street", "Budapest", "B", "10007", "Hungary");
		Hospital hospital = new Hospital("Child Health and Diseases Department", address, phone);
		Department department = new Department(hospital);
		hospital.addDepartment(department);
		assertEquals(1, hospital.numberOfDepartments());
	}

	@Test
	public void HospitalNumberOfDepartments_Test2() {
		Phone phone = new Phone("+1", "296", "9412578");
		Address address = new Address("254 SoCo Street", "Austin", "A", "73301", "ABD");
		Hospital hospital = new Hospital("Physical therapy and rehabilitation Department", address, phone);
		Department department = new Department(hospital);
		hospital.addDepartment(department);
		assertEquals(1, hospital.numberOfDepartments());
	}

	@Test
	public void HospitalNumberOfDepartments_Test3() {
		Phone phone = new Phone("+53", "132", "4935627");
		Address address = new Address("557 Arroyo Street", "Habana", "H", "11300", "Cuba");
		Hospital hospital = new Hospital("Check up Department", address, phone);
		Department department = new Department(hospital);
		hospital.addDepartment(department);
		assertEquals(1, hospital.numberOfDepartments());
	}

	@Test
	public void HospitalRemoveDepartment_Test1() {
		Phone phone = new Phone("+1", "421", "7369982");
		Address address = new Address("233 Sudbury Street", "Massachusetts", "M", "02360", "ABD");
		Hospital hospital = new Hospital("Dermatology Department", address, phone);
		Hospital hospital2 = new Hospital("Emergency Department", address, phone);
		Department department = new Department(hospital);
		Department department2 = new Department(hospital2);
		hospital.addDepartment(department);
		hospital.addDepartment(department2);
		hospital.removeDepartment(department);
		assertEquals(department2, hospital.getDepartment(1));

	}

	@Test
	public void HospitalRemoveDepartment_Test2() {
		Phone phone = new Phone("+44", "164", "77411547");
		Address address = new Address("367 Flash Street", "Saint", "SH", "741963", "Jersey");
		Hospital hospital = new Hospital("Nutrition and diet Department", address, phone);
		Hospital hospital2 = new Hospital("neurology Department", address, phone);
		Department department = new Department(hospital);
		Department department2 = new Department(hospital2);
		hospital.addDepartment(department);
		hospital.addDepartment(department2);
		hospital.removeDepartment(department);
		assertEquals(department2, hospital.getDepartment(1));

	}

	@Test
	public void HospitalRemoveDepartment_Test3() {
		Phone phone = new Phone("+1", "798", "3124578");
		Address address = new Address("154 Whitehall Street", "London", "L", "22147", "ABD");
		Hospital hospital = new Hospital("Internal diseases Department", address, phone);
		Hospital hospital2 = new Hospital("Physical therapy and rehabilitation Department", address, phone);
		Department department = new Department(hospital);
		Department department2 = new Department(hospital2);
		hospital.addDepartment(department);
		hospital.addDepartment(department2);
		hospital.removeDepartment(department);
		assertEquals(department2, hospital.getDepartment(1));

	}

	@Test
	public void HospitalAddPerson_Test1() {
		Phone phone = new Phone("+961", "345", "3946152");
		Address address = new Address("Tripadvisor Street", "Beyrut", "B", "616", "Lübnan");
		FullName name = new FullName("Mr", "Keanu", "John", "REEVES");
		Date date = Date.valueOf("1963-04-16");
		Person person = new Person("Mr", "Keanu", "John", "REEVES", name, date, Person.Gender.Male, address, phone);
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		hospital.addPerson(person);
		assertEquals(person, hospital.getPerson(0));

	}

	@Test
	public void HospitalAddPerson_Test2() {
		Phone phone = new Phone("+90", "538", "5293842");
		Address address = new Address("Maras Gebze Street", "Kayseri", "K", "38000", "Turkiye");
		FullName name = new FullName("Mr", "Alper", "Huseyin", "ŞAŞAR");
		Date date = Date.valueOf("1963-04-16");
		Person person = new Person("Mr", "Alper", "Huseyin", "ŞAŞAR", name, date, Person.Gender.Male, address, phone);
		Hospital hospital = new Hospital("Urology Department", address, phone);
		hospital.addPerson(person);
		assertEquals(person, hospital.getPerson(0));

	}

	@Test
	public void HospitalAddPerson_Test3() {
		Phone phone = new Phone("+1", "538", "6748357");
		Address address = new Address("13 Broadway Street", "New York", "NW", "367444", "ABD");
		FullName name = new FullName("Mrs", "Jane", "Catherine", "SEYMOUR");
		Date date = Date.valueOf("1945-10-12");
		Person person = new Person("Mrs", "Jane", "Catherine", "SEYMOUR", name, date, Person.Gender.Female, address,
				phone);
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		hospital.addPerson(person);
		assertEquals(person, hospital.getPerson(0));

	}

	@Test
	public void HospitalRemovePerson_Test1() {
		Phone phone = new Phone("+1", "354", "6113838");
		Address address = new Address("123 Main Street", "NewYork", "NY", "324", "ABD");
		FullName name = new FullName("Mrs", "Angelina", "Croft", "JOLIE");
		Date date = Date.valueOf("1975-06-04");
		Person person = new Person("Mrs", "Angelina", "Croft", "JOLIE", name, date, Person.Gender.Female, address,
				phone);
		Person person2 = new Person("Mrs", "Jennifer", "Joanna", "ANISTON", name, date, Person.Gender.Female, address,
				phone);
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		hospital.addPerson(person);
		hospital.addPerson(person2);
		hospital.removePerson(person);
		assertEquals(person2, hospital.getPerson(0));

	}

	@Test
	public void HospitalRemovePerson_Test2() {
		Phone phone = new Phone("+24", "427", "4578766");
		Address address = new Address("24 Dacia Street", "Las Vegas", "LA", "74898", "ABD");
		FullName name = new FullName("Mrs", "Marcheline", "Lynne", "BETRAND");
		Date date = Date.valueOf("1968-04-24");
		Person person = new Person("Mrs", "Marcheline", "Lynne", "BETRAND", name, date, Person.Gender.Female, address,
				phone);
		Person person2 = new Person("Mrs", "Vivienne", "Marcheline", "PITT", name, date, Person.Gender.Female, address,
				phone);
		Hospital hospital = new Hospital("Internal medicine Department", address, phone);
		hospital.addPerson(person);
		hospital.addPerson(person2);
		hospital.removePerson(person);
		assertEquals(person2, hospital.getPerson(0));

	}

	@Test
	public void HospitalRemovePerson_Test3() {
		Phone phone = new Phone("+41", "257", "4115278");
		Address address = new Address("144 Dallas Street", "Texas", "T", "417445", "ABD");
		FullName name = new FullName("Mrs", "Zahara", "Marley", "PITT");
		Date date = Date.valueOf("1999-02-11");
		Person person = new Person("Mrs", "Zahara", "Marley", "PITT", name, date, Person.Gender.Female, address, phone);
		Person person2 = new Person("Mrs", "Megan", "Denise", "FOX", name, date, Person.Gender.Female, address, phone);
		Hospital hospital = new Hospital("Aesthetic, Plastic and Reconstructive Department", address, phone);
		hospital.addPerson(person);
		hospital.addPerson(person2);
		hospital.removePerson(person);
		assertEquals(person2, hospital.getPerson(0));

	}

	@Test
	public void DepartmentAddStaff_Test1() {
		Phone phone = new Phone("+1", "538", "6748357");
		Address address = new Address("325 Broadway Street", "New York", "NY", "427412", "ABD");
		FullName name = new FullName("Mrs", "Jane", "Catherine", "SEYMOUR");
		Date date = Date.valueOf("1995-01-24");
		Date joinedDate = Date.valueOf("2019-03-20");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Department department = new Department(hospital);
		Staff staff = new Staff("Mr", "Keanu", "John", "REEVES", name, date, Person.Gender.Male, address, phone,
				joinedDate, department);
		department.addStaff(staff);
		assertEquals(staff, department.getStaff(0));
	}

	@Test
	public void DepartmentAddStaff_Test2() {
		Phone phone = new Phone("+90", "538", "7425841");
		Address address = new Address("333 Maras Gebze Street", "Kayseri", "K", "38000", "Turkiye");
		FullName name = new FullName("Mr", "Alper", "Huseyin", "ŞAŞAR");
		Date date = Date.valueOf("2001-02-05");
		Date joinedDate = Date.valueOf("2023-04-05");
		Hospital hospital = new Hospital("Nephrology Department", address, phone);
		Department department = new Department(hospital);
		Staff staff = new Staff("Mrs", "Angelina", "Croft", "JOLIE", name, date, Person.Gender.Female, address, phone,
				joinedDate, department);
		department.addStaff(staff);
		assertEquals(staff, department.getStaff(0));
	}

	@Test
	public void DepartmentAddStaff_Test3() {
		Phone phone = new Phone("+1", "354", "6116864");
		Address address = new Address("228 Kazinczy Street", "Budapest", "B", "10007", "Hungary");
		FullName name = new FullName("Mrs", "Barbara", "Tyger", "PALVIN");
		Date date = Date.valueOf("1993-05-30");
		Date joinedDate = Date.valueOf("2014-01-02");
		Hospital hospital = new Hospital("Child Health and Diseases Department", address, phone);
		Department department = new Department(hospital);
		Staff staff = new Staff("Mrs", "Dakota", "Mayi", "JOHNSON", name, date, Person.Gender.Female, address, phone,
				joinedDate, department);
		department.addStaff(staff);
		assertEquals(staff, department.getStaff(0));
	}

	@Test
	public void Staff_Test1() {
		Phone phone = new Phone("+1", "296", "9742414");
		Address address = new Address("445 String Street", "Austin", "A", "73301", "ABD");
		FullName name = new FullName("Mr", "Murat", "Hasan", "BOZ");
		Date date = Date.valueOf("1980-02-15");
		Date joinedDate = Date.valueOf("2020-01-03");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Department department = new Department(hospital);
		Staff staff = new Staff("Mr", "Murat", "Hasan", "BOZ", name, date, Person.Gender.Male, address, phone,
				joinedDate, department);
		assertEquals("Mr", staff.getTitle());
		assertEquals("Murat", staff.getGivenName());
		assertEquals("Hasan", staff.getMiddleName());
		assertEquals("BOZ", staff.getFamilyName());
		assertEquals(Date.valueOf("1980-02-15"), staff.getBirthDate());
		assertEquals(Person.Gender.Male, staff.getGender());
		assertEquals("445 String Street", address.getStreet());
		assertEquals("Austin", address.getCity());
		assertEquals("A", address.getState());
		assertEquals("73301", address.getZipCode());
		assertEquals("ABD", address.getCountry());
		assertEquals("+1", phone.getCountryCode());
		assertEquals("296", phone.getAreaCode());
		assertEquals("9742414", phone.getNumber());
		assertEquals(Date.valueOf("2020-01-03"), staff.getJoined());
		assertEquals(department, staff.getDepartment());

	}

	@Test
	public void Staff_Test2() {
		Phone phone = new Phone("+49", "276", "5258897");
		Address address = new Address("27 Romer Street", "Frankfurt", "F", "60306", "Germany");
		FullName name = new FullName("Mr", "Hans", "Florian", "ZIMMER");
		Date date = Date.valueOf("1960-05-30");
		Date joinedDate = Date.valueOf("1985-02-28");
		Hospital hospital = new Hospital("Child Health and Diseases Department", address, phone);
		Department department = new Department(hospital);
		Staff staff = new Staff("Mr", "Hans", "Florian", "ZIMMER", name, date, Person.Gender.Male, address, phone,
				joinedDate, department);
		assertEquals("Mr", staff.getTitle());
		assertEquals("Hans", staff.getGivenName());
		assertEquals("Florian", staff.getMiddleName());
		assertEquals("ZIMMER", staff.getFamilyName());
		assertEquals(Date.valueOf("1960-05-30"), staff.getBirthDate());
		assertEquals(Person.Gender.Male, staff.getGender());
		assertEquals("27 Romer Street", address.getStreet());
		assertEquals("Frankfurt", address.getCity());
		assertEquals("F", address.getState());
		assertEquals("60306", address.getZipCode());
		assertEquals("Germany", address.getCountry());
		assertEquals("+49", phone.getCountryCode());
		assertEquals("276", phone.getAreaCode());
		assertEquals("5258897", phone.getNumber());
		assertEquals(Date.valueOf("1985-02-28"), staff.getJoined());
		assertEquals(department, staff.getDepartment());

	}

	@Test
	public void Staff_Test3() {
		Phone phone = new Phone("+1", "361", "2055200");
		Address address = new Address("Lexington Street", "New York", "NW", "10001", "ABD");
		FullName name = new FullName("Mr", "Robert", "Jhon", "DOWNEY");
		Date date = Date.valueOf("1980-02-15");
		Date joinedDate = Date.valueOf("2020-01-03");
		Hospital hospital = new Hospital("Physical therapy and rehabilitation Department", address, phone);
		Department department = new Department(hospital);
		Staff staff = new Staff("Mr", "Robert", "Jhon", "DOWNEY", name, date, Person.Gender.Male, address, phone,
				joinedDate, department);
		assertEquals("Mr", staff.getTitle());
		assertEquals("Robert", staff.getGivenName());
		assertEquals("Jhon", staff.getMiddleName());
		assertEquals("DOWNEY", staff.getFamilyName());
		assertEquals(Date.valueOf("1980-02-15"), staff.getBirthDate());
		assertEquals(Person.Gender.Male, staff.getGender());
		assertEquals("Lexington Street", address.getStreet());
		assertEquals("New York", address.getCity());
		assertEquals("NW", address.getState());
		assertEquals("10001", address.getZipCode());
		assertEquals("ABD", address.getCountry());
		assertEquals("+1", phone.getCountryCode());
		assertEquals("361", phone.getAreaCode());
		assertEquals("2055200", phone.getNumber());
		assertEquals(Date.valueOf("2020-01-03"), staff.getJoined());
		assertEquals(department, staff.getDepartment());

	}

	@Test
	public void StaffAddEducation_Test1() {
		Phone phone = new Phone("+50", "522", "7414141");
		Address address = new Address("Repuplic Street", "New York", "NY", "741900", "ABD");
		FullName name = new FullName("Mrs", "Hassan", "Ali", "SABBAH");
		Date date = Date.valueOf("1962-02-01");
		Date joinedDate = Date.valueOf("1980-06-03");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Department department = new Department(hospital);
		Staff staff = new Staff("Mrs", "Hassan", "Ali", "SABBAH", name, date, Person.Gender.Female, address, phone,
				joinedDate, department);
		staff.addEducation("Bachelor of Science");
		assertEquals("Bachelor of Science", staff.getEducation(0));

	}

	@Test
	public void StaffAddEducation_Test2() {
		Phone phone = new Phone("+50", "522", "7414141");
		Address address = new Address("Repuplic Street", "New York", "NY", "741900", "ABD");
		FullName name = new FullName("Mr", "Henry", "William", "CAVIL");
		Date date = Date.valueOf("1980-03-02");
		Date joinedDate = Date.valueOf("2000-01-10");
		Hospital hospital = new Hospital("Nutrition and diet Department", address, phone);
		Department department = new Department(hospital);
		Staff staff = new Staff("Mr", "Henry", "William", "CAVIL", name, date, Person.Gender.Female, address, phone,
				joinedDate, department);
		staff.addEducation("Medicine of Science");
		assertEquals("Medicine of Science", staff.getEducation(0));
	}

	@Test
	public void StaffAddEducation_Test3() {
		Phone phone = new Phone("+50", "522", "7414141");
		Address address = new Address("Repuplic Street", "New York", "NY", "741900", "ABD");
		FullName name = new FullName("Mr", "Ryan", "Thomas", "GOSLİNG");
		Date date = Date.valueOf("1995-06-26");
		Date joinedDate = Date.valueOf("2020-07-13");
		Hospital hospital = new Hospital("Neurology Department", address, phone);
		Department department = new Department(hospital);
		Staff staff = new Staff("Mr", "Ryan", "Thomas", "GOSLİNG", name, date, Person.Gender.Male, address, phone,
				joinedDate, department);
		staff.addEducation("Brain Surgery of Science");
		assertEquals("Brain Surgery of Science", staff.getEducation(0));
	}

	@Test
	public void StaffAddCertification_Test1() {
		Phone phone = new Phone("+44", "154", "7741547");
		Address address = new Address("2885 Dahmer Street", "Modesto", "M", "95313", "ABD");
		FullName name = new FullName("Mr", "Jeremy", "Lee", "RENNER");
		Date date = Date.valueOf("2000-10-03");
		Date joinedDate = Date.valueOf("2023-02-13");
		Hospital hospital = new Hospital("Internal diseases Department", address, phone);
		Department department = new Department(hospital);
		Staff staff = new Staff("Mr", "Jeremy", "Lee", "RENNER", name, date, Person.Gender.Male, address, phone,
				joinedDate, department);
		staff.addCertification("Certified Java Developer");
		assertEquals("Certified Java Developer", staff.getCertification(0));

	}

	@Test
	public void StaffAddCertification_Test2() {
		Phone phone = new Phone("+1", "538", "6748357");
		Address address = new Address("325 Broadway Street", "New York", "NY", "365247", "ABD");
		FullName name = new FullName("Mrs", "Jane", "Catherine", "SEYMOUR");
		Date date = Date.valueOf("1968-12-31");
		Date joinedDate = Date.valueOf("1998-01-01");
		Hospital hospital = new Hospital("Mouth and dental health Department", address, phone);
		Department department = new Department(hospital);
		Staff staff = new Staff("Mrs", "Jane", "Catherine", "SEYMOUR", name, date, Person.Gender.Male, address, phone,
				joinedDate, department);
		staff.addCertification("Frontend Developer");
		assertEquals("Frontend Developer", staff.getCertification(0));

	}

	@Test
	public void StaffAddCertification_Test3() {
		Phone phone = new Phone("+961", "345", "6348277");
		Address address = new Address("196 Tripadvisor Street", "Beyrut", "B", "616", "Lubnan");
		FullName name = new FullName("Mr", "Keanu", "John", "REEVES");
		Date date = Date.valueOf("1987-01-23");
		Date joinedDate = Date.valueOf("2020-12-19");
		Hospital hospital = new Hospital("Chech Up Department", address, phone);
		Department department = new Department(hospital);
		Staff staff = new Staff("Mr", "Keanu", "John", "REEVES", name, date, Person.Gender.Male, address, phone,
				joinedDate, department);
		staff.addCertification("Graphic artist");
		assertEquals("Graphic artist", staff.getCertification(0));

	}

	@Test
	public void StaffAddLanguages_Test1() {
		Phone phone = new Phone("+90", "538", "5393842");
		Address address = new Address("333 Maras Gebze Street", "Kayseri", "K", "38000", "Turkiye");
		FullName name = new FullName("Mr", "Alper", "Huseyin", "ŞAŞAR");
		Date date = Date.valueOf("2001-02-12");
		Date joinedDate = Date.valueOf("2023-04-03");
		Hospital hospital = new Hospital("Nephrology Department", address, phone);
		Department department = new Department(hospital);
		Staff staff = new Staff("Mr", "Alper", "Huseyin", "ŞAŞAR", name, date, Person.Gender.Male, address, phone,
				joinedDate, department);
		staff.addLanguage("English");
		assertEquals("English", staff.getLanguage(0));

	}

	@Test
	public void StaffAddLanguages_Test2() {
		Phone phone = new Phone("+90", "538", "5393842");
		Address address = new Address("377 Sunset Street", "NewYork", "NY", "324", "ABD");
		FullName name = new FullName("Mrs", "Angelina", "Croft", "JOLIE");
		Date date = Date.valueOf("1987-01-01");
		Date joinedDate = Date.valueOf("2013-04-09");
		Hospital hospital = new Hospital("Emergency Department", address, phone);
		Department department = new Department(hospital);
		Staff staff = new Staff("Mrs", "Angelina", "Croft", "JOLIE", name, date, Person.Gender.Female, address, phone,
				joinedDate, department);
		staff.addLanguage("German");
		assertEquals("German", staff.getLanguage(0));

	}

	@Test
	public void StaffAddLanguages_Test3() {
		Phone phone = new Phone("+36", "387", "1495296");
		Address address = new Address("228 Kazinczy Street", "Budapest", "B", "10007", "Hungary");
		FullName name = new FullName("Mrs", "Barbara", "Tyger", "PALVIN");
		Date date = Date.valueOf("1990-02-15");
		Date joinedDate = Date.valueOf("2020-04-01");
		Hospital hospital = new Hospital("Child Health and Diseases Department", address, phone);
		Department department = new Department(hospital);
		Staff staff = new Staff("Mrs", "Barbara", "Tyger", "PALVIN", name, date, Person.Gender.Male, address, phone,
				joinedDate, department);
		staff.addLanguage("French");
		assertEquals("French", staff.getLanguage(0));

	}

	@Test
	public void Patient_Test1() {
		Phone phone = new Phone("+90", "592", "8651512");
		FullName name = new FullName("Mr", "Salih", "Yusuf", "Goktas");
		Address address = new Address("Dicle Street", "Kayseri", "TR", "324", "Turkey");
		Date date = Date.valueOf("2002-01-10");
		Date accepted = Date.valueOf("2222-10-10");
		Date historyDate = Date.valueOf("2222-10-10");
		History history = new History("flu", "medicine", "take medicine", historyDate);
		Patient patient = new Patient("Mr", "Salih", "Yusuf", "Goktas", name, date, Person.Gender.Female, address,
				phone, "2", 20, accepted, history);
		assertEquals("Mr", patient.getTitle());
		assertEquals("Salih", patient.getGivenName());
		assertEquals("Yusuf", patient.getMiddleName());
		assertEquals("Goktas", patient.getFamilyName());
		assertEquals(name, patient.getName());
		assertEquals(Date.valueOf("2002-01-10"), patient.getBirthDate());
		assertEquals(Person.Gender.Female, patient.getGender());
		assertEquals("2", patient.getId());
		assertEquals(20, patient.getAge());
		assertEquals(Date.valueOf("2222-10-10"), patient.getAccepted());
		assertEquals(history, patient.getSickness());
		assertEquals("Dicle Street", address.getStreet());
		assertEquals("Kayseri", address.getCity());
		assertEquals("TR", address.getState());
		assertEquals("324", address.getZipCode());
		assertEquals("Turkey", address.getCountry());
		assertEquals("+90", phone.getCountryCode());
		assertEquals("592", phone.getAreaCode());
		assertEquals("8651512", phone.getNumber());
	}

	@Test
	public void Patient_Test2() {
		Phone phone = new Phone("+90", "222", "1112233");
		FullName name = new FullName("Mr", "Can", "Ali", "Goktas");
		Address address = new Address("Huzur Street", "Ankara", "TR", "324", "Turkey");
		Date date = Date.valueOf("2002-01-10");
		Date accepted = Date.valueOf("2222-10-10");
		Date historyDate = Date.valueOf("2222-10-10");
		History history = new History("headache", "painkiller", "take medicine", historyDate);
		Patient patient = new Patient("Mr", "Can", "Ali", "Goktas", name, date, Person.Gender.Female, address, phone,
				"2", 20, accepted, history);
		assertEquals("Mr", patient.getTitle());
		assertEquals("Can", patient.getGivenName());
		assertEquals("Ali", patient.getMiddleName());
		assertEquals("Goktas", patient.getFamilyName());
		assertEquals(name, patient.getName());
		assertEquals(Date.valueOf("2002-01-10"), patient.getBirthDate());
		assertEquals(Person.Gender.Female, patient.getGender());
		assertEquals("2", patient.getId());
		assertEquals(20, patient.getAge());
		assertEquals(Date.valueOf("2222-10-10"), patient.getAccepted());
		assertEquals(history, patient.getSickness());
		assertEquals("Huzur Street", address.getStreet());
		assertEquals("Ankara", address.getCity());
		assertEquals("TR", address.getState());
		assertEquals("324", address.getZipCode());
		assertEquals("Turkey", address.getCountry());
		assertEquals("+90", phone.getCountryCode());
		assertEquals("222", phone.getAreaCode());
		assertEquals("1112233", phone.getNumber());
	}

	@Test
	public void Patient_Test3() {
		Phone phone = new Phone("+90", "789", "4567896");
		FullName name = new FullName("Mr", "Zafer", "Bekir", "Yazıcı");
		Address address = new Address("Can Street", "Rize", "TR", "53", "Turkey");
		Date date = Date.valueOf("2002-01-10");
		Date accepted = Date.valueOf("1999-10-17");
		Date historyDate = Date.valueOf("2022-10-10");
		History history = new History("flu", "medicine", "take medicine", historyDate);
		Patient patient = new Patient("Mr", "Zafer", "Bekir", "Yazıcı", name, date, Person.Gender.Female, address,
				phone, "2", 20, accepted, history);
		assertEquals("Mr", patient.getTitle());
		assertEquals("Zafer", patient.getGivenName());
		assertEquals("Bekir", patient.getMiddleName());
		assertEquals("Yazıcı", patient.getFamilyName());
		assertEquals(name, patient.getName());
		assertEquals(Date.valueOf("2002-01-10"), patient.getBirthDate());
		assertEquals(Person.Gender.Female, patient.getGender());
		assertEquals("2", patient.getId());
		assertEquals(20, patient.getAge());
		assertEquals(Date.valueOf("1999-10-17"), patient.getAccepted());
		assertEquals(history, patient.getSickness());
		assertEquals("Can Street", address.getStreet());
		assertEquals("Rize", address.getCity());
		assertEquals("TR", address.getState());
		assertEquals("53", address.getZipCode());
		assertEquals("Turkey", address.getCountry());
		assertEquals("+90", phone.getCountryCode());
		assertEquals("789", phone.getAreaCode());
		assertEquals("4567896", phone.getNumber());
	}

	@Test
	public void PatientAddPrescription_Test1() {
		Phone phone = new Phone("+90", "789", "4567896");
		FullName name = new FullName("Mr", "Zafer", "Bekir", "Yazıcı");
		Address address = new Address("Can Street", "Rize", "TR", "53", "Turkey");
		Date date = Date.valueOf("2002-01-10");
		Date accepted = Date.valueOf("1999-10-17");
		Date historyDate = Date.valueOf("2022-10-10");
		History history = new History("headache", "painkiller", "take medicine", historyDate);
		Patient patient = new Patient("Mr", "Zafer", "Bekir", "Yazıcı", name, date, Person.Gender.Female, address,
				phone, "2", 20, accepted, history);
		patient.addPrescription("Asprin");
		assertEquals("Asprin", patient.getPrescription(0));

	}

	@Test
	public void PatientAddPrescription_Test2() {
		Phone phone = new Phone("+90", "789", "4567896");
		FullName name = new FullName("Mr", "Zafer", "Bekir", "Yazıcı");
		Address address = new Address("Can Street", "Rize", "TR", "53", "Turkey");
		Date date = Date.valueOf("2002-01-10");
		Date accepted = Date.valueOf("1999-10-17");
		Date historyDate = Date.valueOf("2022-10-10");
		History history = new History("headache", "painkiller", "take medicine", historyDate);
		Patient patient = new Patient("Mr", "Zafer", "Bekir", "Yazıcı", name, date, Person.Gender.Female, address,
				phone, "2", 20, accepted, history);
		patient.addPrescription("Painkiller");
		assertEquals("Painkiller", patient.getPrescription(0));

	}

	@Test
	public void PatientAddPrescription_Test3() {
		Phone phone = new Phone("+90", "789", "4567896");
		FullName name = new FullName("Mr", "Zafer", "Bekir", "Yazıcı");
		Address address = new Address("Can Street", "Rize", "TR", "53", "Turkey");
		Date date = Date.valueOf("2002-01-10");
		Date accepted = Date.valueOf("1999-10-17");
		Date historyDate = Date.valueOf("2022-10-10");
		History history = new History("headache", "painkiller", "take medicine", historyDate);
		Patient patient = new Patient("Mr", "Zafer", "Bekir", "Yazıcı", name, date, Person.Gender.Female, address,
				phone, "2", 20, accepted, history);
		patient.addPrescription("STOMACH PILL");
		assertEquals("STOMACH PILL", patient.getPrescription(0));

	}

	@Test
	public void PatientRemovePrescription_Test1() {
		Phone phone = new Phone("+90", "789", "4567896");
		FullName name = new FullName("Mr", "Zafer", "Bekir", "Yazıcı");
		Address address = new Address("Can Street", "Rize", "TR", "53", "Turkey");
		Date date = Date.valueOf("2002-01-10");
		Date accepted = Date.valueOf("1999-10-17");
		Date historyDate = Date.valueOf("2022-10-10");
		History history = new History("flu", "medicine", "take medicine", historyDate);
		Patient patient = new Patient("Mr", "Zafer", "Bekir", "Yazıcı", name, date, Person.Gender.Female, address,
				phone, "2", 20, accepted, history);

		patient.addPrescription("Asprin");
		patient.addPrescription("Medicine");
		patient.removePrescription("Asprin");
		assertEquals(1, patient.numberOfPrescriptions());

	}

	@Test
	public void PatientRemovePrescription_Test2() {
		Phone phone = new Phone("+90", "789", "4567896");
		FullName name = new FullName("Mr", "Zafer", "Bekir", "Yazıcı");
		Address address = new Address("Can Street", "Rize", "TR", "53", "Turkey");
		Date date = Date.valueOf("2002-01-10");
		Date accepted = Date.valueOf("1999-10-17");
		Date historyDate = Date.valueOf("2022-10-10");
		History history = new History("flu", "medicine", "take medicine", historyDate);
		Patient patient = new Patient("Mr", "Zafer", "Bekir", "Yazıcı", name, date, Person.Gender.Female, address,
				phone, "2", 20, accepted, history);

		patient.addPrescription("STOMACH PILL");
		patient.addPrescription("Medicine");
		patient.removePrescription("STOMACH PILL");
		assertEquals(1, patient.numberOfPrescriptions());

	}

	@Test
	public void PatientRemovePrescription_Test3() {
		Phone phone = new Phone("+90", "789", "4567896");
		FullName name = new FullName("Mr", "Zafer", "Bekir", "Yazıcı");
		Address address = new Address("Can Street", "Rize", "TR", "53", "Turkey");
		Date date = Date.valueOf("2002-01-10");
		Date accepted = Date.valueOf("1999-10-17");
		Date historyDate = Date.valueOf("2022-10-10");
		History history = new History("flu", "medicine", "take medicine", historyDate);
		Patient patient = new Patient("Mr", "Zafer", "Bekir", "Yazıcı", name, date, Person.Gender.Female, address,
				phone, "2", 20, accepted, history);

		patient.addPrescription("Medicine");
		patient.addPrescription("Asprin");
		patient.removePrescription("Medicine");
		assertEquals(1, patient.numberOfPrescriptions());

	}

	@Test
	public void PatientAddAllergy_Test1() {
		Phone phone = new Phone("+90", "592", "8651512");
		FullName name = new FullName("Mr", "Salih", "Yusuf", "Goktas");
		Address address = new Address("Dicle Street", "Kayseri", "TR", "324", "Turkey");
		Date date = Date.valueOf("2002-01-10");
		Date accepted = Date.valueOf("2222-10-10");
		Date historyDate = Date.valueOf("2222-10-10");
		History history = new History("flu", "medicine", "take medicine", historyDate);
		Patient patient = new Patient("Mr", "Salih", "Yusuf", "Goktas", name, date, Person.Gender.Female, address,
				phone, "2", 20, accepted, history);
		patient.addAllergy("Peanuts");
		assertEquals("Peanuts", patient.getAllergy(0));

	}

	@Test
	public void PatientAddAllergy_Test2() {
		Phone phone = new Phone("+90", "592", "8651512");
		FullName name = new FullName("Mr", "Salih", "Yusuf", "Goktas");
		Address address = new Address("Dicle Street", "Kayseri", "TR", "324", "Turkey");
		Date date = Date.valueOf("2002-01-10");
		Date accepted = Date.valueOf("2222-10-10");
		Date historyDate = Date.valueOf("2222-10-10");
		History history = new History("flu", "medicine", "take medicine", historyDate);
		Patient patient = new Patient("Mr", "Salih", "Yusuf", "Goktas", name, date, Person.Gender.Female, address,
				phone, "2", 20, accepted, history);
		patient.addAllergy("Banana");
		assertEquals("Banana", patient.getAllergy(0));

	}

	@Test
	public void PatientAddAllergy_Test3() {
		Phone phone = new Phone("+90", "592", "8651512");
		FullName name = new FullName("Mr", "Salih", "Yusuf", "Goktas");
		Address address = new Address("Dicle Street", "Kayseri", "TR", "324", "Turkey");
		Date date = Date.valueOf("2002-01-10");
		Date accepted = Date.valueOf("2222-10-10");
		Date historyDate = Date.valueOf("2222-10-10");
		History history = new History("flu", "medicine", "take medicine", historyDate);
		Patient patient = new Patient("Mr", "Salih", "Yusuf", "Goktas", name, date, Person.Gender.Female, address,
				phone, "2", 20, accepted, history);
		patient.addAllergy("Apple");
		assertEquals("Apple", patient.getAllergy(0));

	}

	@Test
	public void PatientRemoveAllergy_Test1() {
		Phone phone = new Phone("+90", "592", "8651512");
		FullName name = new FullName("Mr", "Salih", "Yusuf", "Goktas");
		Address address = new Address("Dicle Street", "Kayseri", "TR", "324", "Turkey");
		Date date = Date.valueOf("2002-01-10");
		Date accepted = Date.valueOf("2222-10-10");
		Date historyDate = Date.valueOf("2222-10-10");
		History history = new History("flu", "medicine", "take medicine", historyDate);
		Patient patient = new Patient("Mr", "Salih", "Yusuf", "Goktas", name, date, Person.Gender.Female, address,
				phone, "2", 20, accepted, history);
		patient.addAllergy("Peanuts");
		patient.addAllergy("Apple");
		patient.removeAllergy("Apple");
		assertEquals(1, patient.numberOfAllergies());

	}

	@Test
	public void PatientRemoveAllergy_Test2() {
		Phone phone = new Phone("+90", "592", "8651512");
		FullName name = new FullName("Mr", "Salih", "Yusuf", "Goktas");
		Address address = new Address("Dicle Street", "Kayseri", "TR", "324", "Turkey");
		Date date = Date.valueOf("2002-01-10");
		Date accepted = Date.valueOf("2222-10-10");
		Date historyDate = Date.valueOf("2222-10-10");
		History history = new History("flu", "medicine", "take medicine", historyDate);
		Patient patient = new Patient("Mr", "Salih", "Yusuf", "Goktas", name, date, Person.Gender.Female, address,
				phone, "2", 20, accepted, history);
		patient.addAllergy("Peanuts");
		patient.addAllergy("Apple");
		patient.addAllergy("Banana");
		patient.removeAllergy("Apple");
		assertEquals(2, patient.numberOfAllergies());

	}

	@Test
	public void PatientRemoveAllergy_Test3() {
		Phone phone = new Phone("+90", "592", "8651512");
		FullName name = new FullName("Mr", "Salih", "Yusuf", "Goktas");
		Address address = new Address("Dicle Street", "Kayseri", "TR", "324", "Turkey");
		Date date = Date.valueOf("2002-01-10");
		Date accepted = Date.valueOf("2222-10-10");
		Date historyDate = Date.valueOf("2222-10-10");
		History history = new History("flu", "medicine", "take medicine", historyDate);
		Patient patient = new Patient("Mr", "Salih", "Yusuf", "Goktas", name, date, Person.Gender.Female, address,
				phone, "2", 20, accepted, history);
		patient.addAllergy("Peanuts");
		patient.addAllergy("Apple");
		patient.addAllergy("Banana");
		patient.addAllergy("Patato");
		patient.removeAllergy("Apple");
		assertEquals(3, patient.numberOfAllergies());

	}

	@Test
	public void PatientAddSpecialReq_Test1() {
		Phone phone = new Phone("+90", "222", "1112233");
		FullName name = new FullName("Mr", "Can", "Ali", "Goktas");
		Address address = new Address("Huzur Street", "Ankara", "TR", "324", "Turkey");
		Date date = Date.valueOf("2002-01-10");
		Date accepted = Date.valueOf("2222-10-10");
		Date historyDate = Date.valueOf("2222-10-10");
		History history = new History("headache", "painkiller", "take medicine", historyDate);
		Patient patient = new Patient("Mr", "Can", "Ali", "Goktas", name, date, Person.Gender.Female, address, phone,
				"2", 20, accepted, history);
		patient.addSpecialReq("no special requests");
		assertEquals("no special requests", patient.getSpecialReq(0));

	}

	@Test
	public void PatientAddSpecialReq_Test2() {
		Phone phone = new Phone("+90", "222", "1112233");
		FullName name = new FullName("Mr", "Can", "Ali", "Goktas");
		Address address = new Address("Huzur Street", "Ankara", "TR", "324", "Turkey");
		Date date = Date.valueOf("2002-01-10");
		Date accepted = Date.valueOf("2222-10-10");
		Date historyDate = Date.valueOf("2222-10-10");
		History history = new History("headache", "painkiller", "take medicine", historyDate);
		Patient patient = new Patient("Mr", "Can", "Ali", "Goktas", name, date, Person.Gender.Female, address, phone,
				"2", 20, accepted, history);
		patient.addSpecialReq("Regular Nutrition");
		assertEquals("Regular Nutrition", patient.getSpecialReq(0));

	}

	@Test
	public void PatientAddSpecialReq_Test3() {
		Phone phone = new Phone("+90", "222", "1112233");
		FullName name = new FullName("Mr", "Can", "Ali", "Goktas");
		Address address = new Address("Huzur Street", "Ankara", "TR", "324", "Turkey");
		Date date = Date.valueOf("2002-01-10");
		Date accepted = Date.valueOf("2222-10-10");
		Date historyDate = Date.valueOf("2222-10-10");
		History history = new History("headache", "painkiller", "take medicine", historyDate);
		Patient patient = new Patient("Mr", "Can", "Ali", "Goktas", name, date, Person.Gender.Female, address, phone,
				"2", 20, accepted, history);
		patient.addSpecialReq("should run regularly");
		assertEquals("should run regularly", patient.getSpecialReq(0));

	}

	@Test
	public void PatientRemoveSpecialReq_Test1() {
		Phone phone = new Phone("+90", "222", "1112233");
		FullName name = new FullName("Mr", "Can", "Ali", "Goktas");
		Address address = new Address("Huzur Street", "Ankara", "TR", "324", "Turkey");
		Date date = Date.valueOf("2002-01-10");
		Date accepted = Date.valueOf("2222-10-10");
		Date historyDate = Date.valueOf("2222-10-10");
		History history = new History("headache", "painkiller", "take medicine", historyDate);
		Patient patient = new Patient("Mr", "Can", "Ali", "Goktas", name, date, Person.Gender.Female, address, phone,
				"2", 20, accepted, history);
		patient.addSpecialReq("no special requests");
		patient.removeSpecialReq("no special requests");
		assertEquals(0, patient.numberOfSpecialReqs());

	}

	@Test
	public void PatientRemoveSpecialReq_Test2() {
		Phone phone = new Phone("+90", "222", "1112233");
		FullName name = new FullName("Mr", "Can", "Ali", "Goktas");
		Address address = new Address("Huzur Street", "Ankara", "TR", "324", "Turkey");
		Date date = Date.valueOf("2002-01-10");
		Date accepted = Date.valueOf("2222-10-10");
		Date historyDate = Date.valueOf("2222-10-10");
		History history = new History("headache", "painkiller", "take medicine", historyDate);
		Patient patient = new Patient("Mr", "Can", "Ali", "Goktas", name, date, Person.Gender.Female, address, phone,
				"2", 20, accepted, history);
		patient.addSpecialReq("should run regularly");
		patient.removeSpecialReq("should run regularly");
		assertEquals(0, patient.numberOfSpecialReqs());

	}

	@Test
	public void PatientRemoveSpecialReq_Test3() {
		Phone phone = new Phone("+90", "222", "1112233");
		FullName name = new FullName("Mr", "Can", "Ali", "Goktas");
		Address address = new Address("Huzur Street", "Ankara", "TR", "324", "Turkey");
		Date date = Date.valueOf("2002-01-10");
		Date accepted = Date.valueOf("2222-10-10");
		Date historyDate = Date.valueOf("2222-10-10");
		History history = new History("headache", "painkiller", "take medicine", historyDate);
		Patient patient = new Patient("Mr", "Can", "Ali", "Goktas", name, date, Person.Gender.Female, address, phone,
				"2", 20, accepted, history);
		patient.addSpecialReq("Regular Nutrition");
		patient.removeSpecialReq("Regular Nutrition");
		assertEquals(0, patient.numberOfSpecialReqs());

	}

}
