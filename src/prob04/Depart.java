package prob04;

public class Depart extends Employee {
	String department;
	public Depart(String name, int salary, String team) {
		// TODO Auto-generated constructor stub
		super(name, salary);
		this.department = team;
	}
	
	@Override
	public void getInformation() {
		System.out.println( "이름:" + getName() + "연봉:" + getSalary() + "부서:" + department );
	}

}
