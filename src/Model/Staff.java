package Model;

public  abstract class Staff {
    private int id;
    private String name;

    public  Staff(int id , String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
