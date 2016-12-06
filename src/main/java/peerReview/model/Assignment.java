package peerReview.model;

public class Assignment {
	private int assignmentId;
    private int teacherId;
    private String assignmentText;

    @Override
    public String toString() {
        return "Assignment{" + "assignmentId=" + assignmentId + ", teacherId=" + teacherId + ", assignmentText=" + assignmentText + '}';
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getAssignmentText() {
        return assignmentText;
    }

    public void setAssignmentText(String assignmentText) {
        this.assignmentText = assignmentText;
    }

    public Assignment() {
    }
}
