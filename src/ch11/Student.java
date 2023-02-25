package ch11;

public class Student {
    private String studentName;
    MyLogger myLogger = MyLogger.getLogger();

    public Student(String studentName) throws StudentNameFormatException {
        if (studentName == null){
            throw new StudentNameFormatException("name is not null");
        }
        else if(studentName.length() > 3){
            throw new StudentNameFormatException("name is long");
        }
        this.studentName = studentName;
    }

    public String getStudentName() {
        myLogger.fine("begin getStudentName");
        return studentName;
    }
}
