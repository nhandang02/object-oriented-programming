public class Person {
    protected String name;
    protected int birthyear;

    public Person(String name, int birthyear) {
        setName(name);
        setBirthyear(birthyear);
    }

    public String getName() {
        return this.name;
    }

    public int getBirthyear() {
        return this.birthyear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear; 
    }

    public String toString() {
        return "Person[name: " + name + "," + " birth year: " + birthyear + "]";
    }
}