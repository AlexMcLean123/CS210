
import java.util.Scanner;
public class StudentGrades {
public static void main(String[]args){
Scanner scan = new Scanner(System.in);
int size = scan.nextInt();
Student [] array = new Student[size];
for(int i =0; i<size; i++){
	array[i]= new Student();
	array[i].setName(scan.nextLine());
	scan.nextLine();
	array[i].setGrade(scan.nextInt());
}

for(int i =0; i<size; i++){
	for(int j =0; j<size; j++){
		if(array[i].getGrade()>array[j].getGrade()){
			int temp=array[i].getGrade();
			array[i].setGrade(array[j].getGrade());
			array[j].setGrade(temp);
		}
	}
}


}



}




 class Student{
	private String name;
	private int grade;
	public Student(){

	}
	public void setName(String n){
		name=n;
	}
	public void setGrade(int g){
		grade=g;
	}
	public String getName(){
		return name;
	}
	public int getGrade(){
	return grade;
	}

}