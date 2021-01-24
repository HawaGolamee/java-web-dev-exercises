package exercises.chapter4.school;

public class Student {
    public static void main(String[] args) {

        Student myself = new Student("Hawa", 1, 30, 4.0);
        Student twin = new Student("Hawa", 1, 30, 4.0);
        //
       // String myGradeLevel = myself.getGradeLevel();
       // System.out.println(myGradeLevel);
        //myself.addGrade(3, 3.0);
        //System.out.println(myself.gpa);;
        // System.out.println(myself.toString());
       //System.out.println(myself.equals(twin));
        Course myFirstCourse = new Course("my First course", 2);
        Course mySecondCourse = new Course("my First course", 3);
        System.out.println(myFirstCourse.equals(mySecondCourse));
        System.out.println(myFirstCourse.toString());

    }

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    /* getters and setters omitted */
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + ":" + this.gpa;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof Student) == false) return false;
        Student myStudentObj = (Student) obj;
        if (myStudentObj.name.equals(this.name)) {
            return true;
        }else {
            return false;
        }
    }

    public int getStudentId() {
        return studentId;
    }

    private void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        double currentTotalQualityScore = this.gpa * this.numberOfCredits;

        double newQualityScore = grade * courseCredits;

        double newTotalQualityScore = currentTotalQualityScore + newQualityScore;

        int newTotalNumberOfCredits = this.numberOfCredits + courseCredits;

        this.numberOfCredits = newTotalNumberOfCredits;

        double newGpa = newTotalQualityScore / newTotalNumberOfCredits;
        this.gpa = newGpa;
    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits

        if (this.numberOfCredits >= 0 && this.numberOfCredits <= 29) {
            return "Freshman";
        } else if (this.numberOfCredits >= 39 && this.numberOfCredits <= 59) {
            return "Sophomore";
        } else if (this.numberOfCredits >= 68 && this.numberOfCredits <= 89) {
            return "Junior";
        } else if (this.numberOfCredits >= 90) {
            return "Senior";
        } else {

            return null;
        }

    }
}