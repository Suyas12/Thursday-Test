class Student{
	private String name;
	protected int id;
	double grade;
	public int age;

	public Boolean isPassed(double grade){
		return null;
	}

	public void setName(String name){
		this.name = name;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getName(){
		return this.name;
	}
	public int getId(){
		return this.id;
	}
}
class Undergrad extends Student{
	@Override
	public Boolean isPassed(double grade){
		if(grade>70.0){
			return true;
        }
        else{
		    return false;
        }
	}
}
class Grad extends Student{
	@Override
	public Boolean isPassed(double grade){
		if(grade>80.0){
			return true;
        }
        else{
		    return false;
        }
	}
}

public class Student_Marksheet{
	public static void main(String args[]){

		Undergrad Suyas = new Undergrad();
		Grad Shreya = new Grad();
		Suyas.setName("Suyas Awasthi");
		Suyas.setId(7003);
		Suyas.grade = 78;
		Suyas.age = 21;
		System.out.println("The student name "+Suyas.getName() +" of id "+ Suyas.getId() +" of age "+ Suyas.age +" scored "+ Suyas.grade);
		if(Suyas.isPassed(Suyas.grade)){
			System.out.println("Passed Sucessfully");
        }
		else{
			System.out.println("Failed Attempt");
        }

		Shreya.setName("Shreya Awasthi");
		Shreya.setId(5029);
		Shreya.age = 29;
		Shreya.grade=81;
		System.out.println("The student name "+Shreya.getName()+" of id "+Shreya.getId()+" of age "+Shreya.age+" scored "+Shreya.grade);
		if(Shreya.isPassed(Shreya.grade)){
			System.out.println("Passed Sucessfully");
        }
		else{
			System.out.println("Failed Attempt");
        }
	}
}




