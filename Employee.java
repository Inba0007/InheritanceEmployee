class Employee

{
	String employeedepartment ="cs";
}
class Officers extends  Employee
{
	int officerId=2118;

	public static void main(String[] args) {
		Officers a=new Officers();
		System.out.println("employee deprtment"+a.employeedepartment);
		System.out.println("officer Id"+a.officerId);
	

	}

}
