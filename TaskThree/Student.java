	
	//3.c in the Student class, declare the class "Student" and add 4 fields: "name", "age", "isFemale", "datamatikerTeam" using appropriate data types for each.
	//3.d in the Student class, add a constructor that takes in 4 parameters with the names "tmpName", "tmpAge", "tmpIsFemale", "tmpDatamatikerTeam" with the same data types used in 3.c
	//3.e populate the fields created in 3.c with the parameters of the constructor added in 3.d (you may use shaddowing with the keyword this)

public class Student
{
	String name;
	int age;
	boolean isFemale;
	String team;

	public Student (String name, int age, boolean isFemale, String team)
	{
		this.name = name;
		this.age = age;
		this.isFemale = isFemale;
		this.team = team;
	}

}