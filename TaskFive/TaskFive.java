/*
For this task you should reuse the Student class from Task 3. 
    Methods of reusing the class could be: 
    - copy the Students.java file and add it to a new folder called task5
    - copy the content of the Students class from Task 3 and create the class once more in this folder
    - Open the task 3 folder and continue working in this.
    Either method is fine - it is up to you.
*/


class Datamatik
{

    public static void main(String[] args) 
    {
// 5.a Create a new class Datamatik or reuse the one you created earlier. Add an array of Students with 10 elements in it. This should be a class variable (static). From the main method, add 10 student instances to the array. Each student must have a unique reference.
        Student s0 = new Student("Hugo", 27, false, "Team B");
        Student s1 = new Student("Hanne", 50, true, "Team B");
        Student s2 = new Student("Ole", 29, false, "Team B");
        Student s3 = new Student("Jens", 27, true, "Team B");
        Student s4 = new Student("Charlotte", 27, true, "Team B");
        Student s5 = new Student("Jeanne", 31, true, "Team B");
        Student s6 = new Student("Majbritt", 27, true, "Team B");
        Student s7 = new Student("Anne", 85, true, "Team B");
        Student s8 = new Student("Klaus", 18, false, "Team B");
        Student s9 = new Student("Peter", 27, false, "Team B");

        Student[] list = new Student[] { s9, s1, s2, s3, s4, s5, s6, s7, s8, s0 };


    }
// 5.b Create a function in Datamatik that takes in the array from 5.a as a parameter as well as an integer. The function should return the field "name" (the name of the student) and print it (the integer should be used as the index nuber of the student to be printed). Call this method with different parameters (only the integer - not the array) from the main() of Datamatik.

    private static String getName(Student[] list, int index)
    {
        return list[index].Name;
    }

// 5.c Create a similar function to that of 5.b, but instead of receiving the array and an integer, it receives the array and a string. Loop through all elements in the array until you find the element with the name received as a parameter. Then return the index of that student. Call this method with different names from the main method of Datamatik
    private static int getIndex(Student[] list, String studentsName)
    {
        for(int i = 0; i < list.length; i++)
        {
            Student name = list[i];

            if (name.Name == studentsName)
            {
                return i;
            }
        }
        return -1;
    }



    private static void print(String message) { System.out.println(message); }

}