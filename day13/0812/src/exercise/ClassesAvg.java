package exercise;

public class ClassesAvg {
    private String classes;
    private Integer avgScore;

     ClassesAvg(String classes, Integer avgScore) {
        this.classes = classes;
        this.avgScore = avgScore;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Integer getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(Integer avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return "ClassesAvg{" +
                "classes='" + classes + '\'' +
                ", avgScore=" + avgScore +
                '}';
    }
}
