public class Car {
    //        University, School, Car жана Person деген класс тузунуз
//
//        Алардын свойстваларын ойлоп табыныз
//
//        Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
//
//        Ар бир класска 3-4 тон объект тузуп жана аларга маанилерин бериниз
//
//        Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз
    private  String model;
    private  String company;
    private  int speed;
    private String [] cars;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String[] getCars() {
        return cars;
    }

    public void setCars(String[] cars) {
        this.cars = cars;
    }
}
