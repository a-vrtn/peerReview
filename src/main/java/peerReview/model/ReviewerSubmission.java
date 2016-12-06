package peerReview.model;

public class ReviewerSubmission {
	private int reviewerSubmissionId;
	private int submissionId;
	private int studentId;
	private int reviewId;

	public ReviewerSubmission() {
	}

	public int getReviewerSubmissionId() {
		return reviewerSubmissionId;
	}

	public void setReviewerSubmissionId(int reviewerSubmissionId) {
		this.reviewerSubmissionId = reviewerSubmissionId;
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

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	@Override
	public String toString() {
		return "ReviewerSubmission{" + "reviewerSubmissionId=" + reviewerSubmissionId + ", submissionId=" + submissionId
				+ ", studentId=" + studentId + ", reviewId=" + reviewId + '}';
	}

}
