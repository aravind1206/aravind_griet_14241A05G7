import java.util.Date;
import java.util.Arrays.*;
import java.io.*;
import java.lang.*;
/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
        Exception IllegalArgumentException;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() 
{
		
		return students;
}

	@Override
public void setStudents(Student[] students)
 {
     try{
if(students.length==0)
		throw IllegalArgumentException;
else
			this.students=students;
}
 catch(Exception e)
{
}
 }
	@Override
	public Student getStudent(int index) 
{try{
	if(index<0 || index>=students.length)
		throw IllegalArgumentException;
else
		return students[index];
	}
catch(Exception e)
{
}
return students[index];}
	@Override

	public void setStudent(Student student, int index)
 {
try{		if(student==null)
		throw IllegalArgumentException;
else if(index<0 || index>=students.length)
throw IllegalArgumentException;
else
students[index]=student;
}
 catch(Exception e)
{
}}

	@Override
	public void addFirst(Student student)
 {try{
		if(student==null)
		throw IllegalArgumentException;
		else
{
		Student[] nstudents=null;
                            int k=0;
for(int i=0;i<students.length;i++)
{
    nstudents[k]=students[i];
    k++;
}
		int l=students.length;
		Student[] students=new Student[l+1];
		students[0]=student;
int j=1;
		for(int i=0;i<l;i++)
	{
		students[j]=nstudents[i];
j++;		
	}			
		// Add your implementation here
}}catch(Exception e)
{
}}

	@Override
	public void addLast(Student student)
 {
try{	if(student==null)
		throw IllegalArgumentException;
		else
{
		Student[] nstudents = null;
                int k=0;
for(int i=0;i<students.length;i++)
{
    nstudents[k]=students[i];
    k++;
}
		int l=students.length;
		Student[] students=new Student[l+1];
		
int j=0;
		for(int i=0;i<l;i++)
	{
		students[j]=nstudents[i];
j++;		
	}
students[j]=student;			
		// Add your implementation here
}
}
 catch(Exception e)
{
}}
	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here

                return null;
	}

}

