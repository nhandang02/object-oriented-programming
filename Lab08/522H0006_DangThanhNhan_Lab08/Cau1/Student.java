public class Student extends Person {
    private String id;
    private double score;

    public Student(String name, int birthyear, String id, double score) {
        super(name, birthyear);
        setId(id);
        setScore(score);
    }

    public String getId() {
        return this.id;
    }

    public double getScore() {
        return this.score;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String toString() {
        return "Student[name: " + this.name + "," + "birth year: " + this.birthyear + "," + "id: " + id + "," + "score: " + score + "]";
    }
}