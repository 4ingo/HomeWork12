public class University {
    //        University, School, Car жана Person деген класс тузунуз
//
//        Алардын свойстваларын ойлоп табыныз
//
//        Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
//
//        Ар бир класска 3-4 тон объект тузуп жана аларга маанилерин бериниз
//
//        Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз
    private  String name;
    private  String address;
    private  int  contract;

    private  String[] massive;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContract() {
        return contract;
    }

    public void setContract(int contract) {
        this.contract = contract;
    }

    public String[] getMassive() {
        return massive;
    }

    public void setMassive(String[] massive) {
        this.massive = massive;
    }
}
