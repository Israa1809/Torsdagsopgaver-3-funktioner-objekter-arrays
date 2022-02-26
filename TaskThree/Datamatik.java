// 3.a Create a new file and save it by the name "Datamatik".
//3.i Returning to the Datamatik class add a main() function and in this function, create a new object/instance of the type Teacher and give it the name, age and gender of your teacher. 
//3.j Also in the main() function of Datamatik, create two new objects/instances of the type Student. The first one, with your own name, age and gender. The second one with the name, age and gender of a student in your study group. 
//3.k in the main() function print the name of the teacher
//3.l in the main() function print the names of both students and which teams they are from. Do this witout writing any toString() methods




class Datamatik
{
	public static void main(String[] args) 
	{
		
		Teacher j = new Teacher("Jesper", 32, false);
		print("Navn: " + j.name);

		Student s1 = new Student("Israa", 27, true, "Team B");
		print("Navn: " + s1.name +  ", Team: " + s1.team);

		Student s2 = new Student("Felicia", 28, true, "Team B");
		print("Navn: " + s2.name +  ", Team: " + s2.team);

	}

	













	private static void print(String message)
	{
		System.out.println(message);
	}


}




