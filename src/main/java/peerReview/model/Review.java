package peerReview.model;

public class Review {
	private int reviewId;
	 private String comment;
	 private int grade;

	    public Review() {
	    }

	    public int getReviewId() {
	        return reviewId;
	    }

	    public void setReviewId(int reviewId) {
	        this.reviewId = reviewId;
	    }

	    public String getComment() {
	        return comment;
	    }

	    public void setComment(String comment) {
	        this.comment = comment;
	    }

	    public int getGrade() {
	        return grade;
	    }

	    public void setGrade(int grade) {
	        this.grade = grade;
	    }

	    @Override
	    public String toString() {
	        return "Review{" + "reviewId=" + reviewId + ", comment=" + comment + ", grade=" + grade + '}';
	    }
	 
}
