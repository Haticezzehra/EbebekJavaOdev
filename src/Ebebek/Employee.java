package Ebebek;

public class Employee {
	private String name;
	private double salary;
	private int workHours;
	private int hireYear;

	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public double tax() {
		double vergi = 0;
		if (salary > 1000) {
			vergi = (salary * 3) / 100;
		}

		return vergi;

	}

	public double bonus() {
		double bonus = 0;
		if (workHours > 40) {
			bonus = (workHours - 40) * 30;

		}

		return bonus;
	}

	public double raiseSalary() {
		double raiseSalary = 0;

		if (2021 - hireYear < 10) {
			raiseSalary = (salary * 5) / 100;
		} else if (9 < 2021 - hireYear && 2021 - hireYear < 20) {
			raiseSalary = (salary * 10) / 100;
		} else if (19 < 2021 - hireYear) {
			raiseSalary = (salary * 15) / 100;
		}
		return raiseSalary;

	}

	public String toString() {
		double tax = tax();
		double bonus = bonus();
		double raiseSalary = raiseSalary();
		String calisanBilgi = ("Adi:" + name + "\nMaasi:" + salary + "\nCalisma Saati:" + workHours + "\nBaslangic Yili:"
				+ hireYear + "\nVergi:" + tax + "\nBonus:" + bonus + "\nMaas Artisi:" + raiseSalary
				+ "\nVergi ve Bonuslar ile birlikte maas:" + (salary + bonus - tax) + "\nToplam Maas:"
				+ (salary + bonus + raiseSalary - tax));
		return calisanBilgi;
	}

}
