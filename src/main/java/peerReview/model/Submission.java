package peerReview.model;

public class Submission {
	private int submissionId;
    private int studentId;
    private int assignmentId;

    public Submission() {
    }

    public int getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(int submissionId) {
        this.submissionId = submissionId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    @Override
    public String toString() {
        return "Submission{" + "submissionId=" + submissionId + ", studentId=" + studentId + ", assignmentId=" + assignmentId + '}';
    }
   
}
