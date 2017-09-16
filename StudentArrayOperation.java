



public interface StudentArrayOperation {
	
	//CaStatusReply getStatusInquiry(String ca01BatchNo,String year,String month) throws Exception;

	void addFirst(Student student); 
	
	void addLast(Student student);
	void add(Student student, int index);
	void remove(int index);
	void remove(Student student);
	void removeFromIndex(int index);
	void removeFromElement(Student student);
	void removeToIndex(int index);
	void removeToElement(Student student);
	void bubbleSort();
	Student[] getByBirthDate(Date date);
	Student[] getBetweenBirthDates(Date firstDate, Date lastDate);
	Student[] getNearBirthDate(Date date, int days);
	int getCurrentAgeByDate(int indexOfStudent);
	Student[] getStudentsByAge(int age);
	Student[] getStudentsWithMaxAvgMark();
	Student getNextStudent(Student student);
	Student[] getStudents();
	void setStudent(Student student, int index);
	Student getStudent(int index);
	void setStudents(Student[] students);
}
