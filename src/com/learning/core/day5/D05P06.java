package com.learning.core.day5;

import java.util.TreeSet;

class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.setAge(age);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Id=" + id + ", name=" + name + ", age=" + getAge() + ", salary=" + salary;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return id == person.id;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.id, otherPerson.id);
    }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class D05P06 {
    public static void main(String[] args) {
        TreeSet<Person> personSet = new TreeSet<>();

        // Predefined information of 6 persons
        personSet.add(new Person(1, "Alice", 20, 1500.0));
        personSet.add(new Person(2, "Bob", 22, 2000.0));
        personSet.add(new Person(3, "Charlie", 19, 2500.0));
        personSet.add(new Person(4, "David", 18, 1800.0));
        personSet.add(new Person(5, "John", 32, 1999.0));
        personSet.add(new Person(6, "Tom", 42, 3999.0));

        // Print persons details whose age is greater than 25
        for (Person person : personSet) {
            if (person.getAge() > 25) {
                System.out.println(person);
            }
        }
    }
}