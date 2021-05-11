public class Account {
    private int ID;
    private String name;
    private int age;
    private String position;
    private int password;

    public Account(int ID, String name, int age, String position, int password) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.position = position;
        this.password = password;
    }

    public Account() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String to_String() {
        return ID+","+name+","+age+","+position+","+password+"\n";
    }

}
