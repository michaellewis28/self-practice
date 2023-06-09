package day26_practices;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public int salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public Employee(String name, char gender, String jobTitle) {
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
    }

    public Employee(String name, char gender, String jobTitle, int salary) {
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public Employee(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public Employee(String jobTitle, int salary) {
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}

/*
Class Name: Employee
	Instance variables:
			name, gender, jobTitle, salary

		1st constructor: initializes the name only

		2nd constructor: initializes name and gender

		3rd constructor: initializes name, gender and jobTitle

		4th constructor initializes name, gender, jobTitle, Salary

		5th constructor: initializes name, jobTitle

		6th constructor: initializes name jobTitle, salary

	Instance methods:
		toString
 */