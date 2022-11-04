public class Person {
    //        University, School, Car жана Person деген класс тузунуз
//
//        Алардын свойстваларын ойлоп табыныз
//
//        Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
//
//        Ар бир класска 3-4 тон объект тузуп жана аларга маанилерин бериниз
//
//        Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз

    private  String personName;
    private  String personSurName;
    private  int personAge;
    private  String[] persons;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonSurName() {
        return personSurName;
    }

    public void setPersonSurName(String personSurName) {
        this.personSurName = personSurName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public String[] getPersons() {
        return persons;
    }

    public void setPersons(String[] persons) {
        this.persons = persons;
    }
}
