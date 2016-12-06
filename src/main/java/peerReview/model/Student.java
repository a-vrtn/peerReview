package peerReview.model;

public class Student {
	private int studentId;
    private int userId;

    public Student() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", userId=" + userId + '}';
    }
    
}
