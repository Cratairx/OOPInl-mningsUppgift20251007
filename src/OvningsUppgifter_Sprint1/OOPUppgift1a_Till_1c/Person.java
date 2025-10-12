package OvningsUppgifter_Sprint1.OOPUppgift1a_Till_1c;

public class Person {
    private String förNamn;
    private String efterNamn;
    private String adress;
    private int age;

    public Person(String förNamn, String efterNamn, String adress, int age) {
        this.förNamn = förNamn;
        this.efterNamn = efterNamn;
        this.adress = adress;
        this.age = age;
    }

    public String getAdress() {

        return adress;
    }

    public void setAdress(String adress) {

        this.adress = adress;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getNamn() {

        return this.förNamn;
    }

    public void setNamn(String förNamn) {

        this.förNamn = förNamn;
    }

    public String getEfterNamn() {

        return this.efterNamn;
    }

    public void setEfterNamn(String efterNamn) {

        this.efterNamn = efterNamn;
    }

    @Override
    public String toString() {
        return förNamn + " " + efterNamn + " " + adress + " that is " +  age + " years old";

    }
}
