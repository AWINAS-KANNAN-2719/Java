package com.awinas.learning.collections.sorting;

public class Employee implements Comparable<Employee> {
	private int id = -1;
	private String firstName = null;
	private String lastName = null;
	private int age = -1;

	public Employee(int id, String fName, String lName, int age) {
		this.id = id;
		this.firstName = fName;
		this.lastName = lName;
		this.age = age;
	}

	// Setters and Getters

	@Override
	public String toString() {
		return "Employee : " + id + " - " + firstName + " - " + lastName + " - " + age + "n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Employee o) {
		// return this.id > o.id ? 1 : -1;
		// return this.id - o.id;
		System.out.println(this.firstName + "- " + o.firstName);
		System.out.println(this.firstName.compareTo(o.firstName));
		return this.firstName.compareTo(o.firstName) == 0 ? this.lastName.compareTo(o.lastName)
				: this.firstName.compareTo(o.firstName);
	}

}