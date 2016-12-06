package peerReview.model;

public class Rubric {
	private int rubricId;
    private int assignmentId;
    private String beginningLevel;
    private String developingLevel;
    private String accomplishedLevel;
    private String exemplaryLevel;

    public Rubric() {
    }

    public int getRubricId() {
        return rubricId;
    }

    public void setRubricId(int rubricId) {
        this.rubricId = rubricId;
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getBeginningLevel() {
        return beginningLevel;
    }

    public void setBeginningLevel(String beginningLevel) {
        this.beginningLevel = beginningLevel;
    }

    public String getDevelopingLevel() {
        return developingLevel;
    }

    public void setDevelopingLevel(String developingLevel) {
        this.developingLevel = developingLevel;
    }

    public String getAccomplishedLevel() {
        return accomplishedLevel;
    }

    public void setAccomplishedLevel(String accomplishedLevel) {
        this.accomplishedLevel = accomplishedLevel;
    }

    public String getExemplaryLevel() {
        return exemplaryLevel;
    }

    public void setExemplaryLevel(String exemplaryLevel) {
        this.exemplaryLevel = exemplaryLevel;
    }

    @Override
    public String toString() {
        return "Rubric{" + "rubricId=" + rubricId + ", assignmentId=" + assignmentId + ", beginningLevel=" + beginningLevel + ", developingLevel=" + developingLevel + ", accomplishedLevel=" + accomplishedLevel + ", exemplaryLevel=" + exemplaryLevel + '}';
    }
}
