public class Main {
    public static void main(String[] args) {
//        University, School, Car жана Person деген класс тузунуз
//
//        Алардын свойстваларын ойлоп табыныз
//
//        Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
//
//        Ар бир класска 3-4 тон объект тузуп жана аларга маанилерин бериниз
//
//        Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз
        University university=new University();
        School school=new School();
        Car car = new Car();
        Person person=new Person();

        university.setName("National unifersity of Kyrgyzstan");
        university.setAddress("Frunze/Turusbekov");
        university.setContract(36000);


        University university1=new University();
        university1.setName("Bishkek gumanitaty university");
        university1.setAddress("street Manas 489");
        university1.setContract(34000);


        University university3= new University();
        university3.setName("KGUSTA");
        university3.setAddress("Ahunbaeva/Maldybaeva");
        university3.setContract(33000);
        University [] masiv={university,university1,university3};
        for (University u:masiv) {
            System.out.println(u.getName()+" "+u.getAddress()+" "+u.getContract()+" ");

        }
        System.out.println("___________________________________________________________________________________");



        school.setSchoolName("Tuz orto mektebi ");
        school.setSchoolAddress("Naryn, Kochkor");
        school.setNumber("№ 77");


        School school1= new School();
        school1.setSchoolName("Oro-basy orto mektebi  ");
        school1.setSchoolAddress("Naryn, Kochkor");
        school1.setNumber("№ 97");


        School school2= new School();
        school2.setSchoolName("National internat  ");
        school2.setSchoolAddress("Naryn, Kochkor");
        school2.setNumber("№ 57");
        School [] mas={school,school1,school2};
        for (School s:mas) {
            System.out.println(s.getSchoolName()+" "+s.getSchoolAddress()+" "+s.getNumber()+" ");

        }




        System.out.println("________________________________________________________________________________");


        car.setModel("Mark ||");
        car.setCompany("Toyota");
        car.setSpeed(340);


        Car car1 = new Car();
        car1.setModel("Skyline");
        car1.setCompany("Nissan");
        car1.setSpeed(350);


        Car car2= new Car();
        car2.setModel("Supra");
        car2.setCompany("Toyota");
        car2.setSpeed(360);
        Car[] massive ={car,car1,car2};
        for (Car c:massive) {
            System.out.print(c.getCompany() + " " + c.getModel() + " " + c.getSpeed());
            System.out.println(" ");
        }
        System.out.println("____________________________________________________________________________________-");

        person.setPersonName("Joldubay");
        person.setPersonSurName("Kayupov");
        person.setPersonAge(20);


        Person person1=new Person();
        person1.setPersonName("Jumabay");
        person1.setPersonSurName("Kayupov");
        person1.setPersonAge(21);


        Person person2=new Person();
        person2.setPersonName("Jumabay");
        person2.setPersonSurName("Kayupov");
        person2.setPersonAge(140);
        Person[] masi={person,person1,person2};
        for (Person s:masi) {
            System.out.println(s.getPersonName()+" "+s.getPersonSurName()+" "+s.getPersonAge()+" ");

        }
        System.out.println("________________________________________________________________________________________");


    }

    }
