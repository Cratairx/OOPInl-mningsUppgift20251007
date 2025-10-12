package OvningsUppgifter_Sprint1.OOPUppgift3;

public class Person {
    String name;
    String personalId;

    public Person(String name, String personalId) {
        this.name = name;
        this.personalId = personalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }
}
