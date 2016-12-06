package peerReview.model;

public class Teacher {
	private int teacherId;
    private int userId;

    public Teacher() {
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Teacher{" + "teacherId=" + teacherId + ", userId=" + userId + '}';
    }
    
}
