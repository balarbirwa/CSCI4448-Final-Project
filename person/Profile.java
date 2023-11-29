public class Profile {

    private int age;
    private int height;
    private String gender;
    private String sign;
    private String job;

    // Default constructor
    public Profile() {
        this.job = "";
        this.age = 0;
        this.height = 0;
        this.gender = "";
        this.sign = "";
    }

    // Parameterized constructor
    public Profile(int a, int h, String g, String ss, String j) {
        this.job = j;
        this.age = a;
        this.height = h;
        this.gender = g;
        this.sign = ss;
    }

    // Getters
    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public String getGender() {
        return gender;
    }

    public String getStarSign() {
        return sign;
    }

    public String getJob() {
        return job;
    }

    // Setters
    public void setJob(String j) {
        this.job = j;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public void setHeight(int h) {
        this.height = h;
    }

    public void setGender(String g) {
        this.gender = g;
    }

    public void setStarSign(String ss) {
        this.sign = ss;
    }
}
