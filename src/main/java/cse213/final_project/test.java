package cse213.final_project;

public class test {
    String name,ID;

    public test(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "test{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
