package rent_car;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class Main {
    static SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

    public static void insertCars() {
        try (Session session = sf.openSession()) {
            Transaction trx = session.beginTransaction();

            Car c1 = new Car();
            c1.setName("Volvo");
            c1.setModel("V40");
            c1.setType("hatchback");
            c1.setEngineType("Petrol");
            c1.setGearbox("Manual");
            c1.setPrice(80);
            session.merge(c1);

            Car c2 = new Car();
            c2.setName("Kia");
            c2.setModel("Sorento");
            c2.setType("Suv");
            c2.setEngineType("Petrol");
            c2.setGearbox("Automatic");
            c2.setPrice(100);
            session.merge(c2);

            Car c3 = new Car();

            c3.setName("Lamborghini");
            c3.setModel("Countache");
            c3.setType("super-car");
            c3.setEngineType("Petrol");
            c3.setGearbox("Automatic");
            c3.setPrice(500);

            session.merge(c3);


            session.getTransaction().commit();

        }
    }

    public static void inserClients() {
        System.out.println("Insert clients...");
        try (Session session = sf.openSession()) {
            session.beginTransaction();
            Client client1 = new Client();
            client1.setLicenseId(3283L);
            client1.setName("Maritca Dana");
            client1.setEmail("danamaritca@gmail.com");
            client1.setPhoneNumber(788469771L);


            Client client2 = new Client();
            client2.setLicenseId(8419L);
            client2.setName("Bogdan Sabie");
            client2.setEmail("bogdansabie@gmail.com");
            client2.setPhoneNumber(699710276L);


            Client client3 = new Client();
            client3.setLicenseId(3288L);
            client3.setName("Alexandru V. Ene");
            client3.setEmail("alexandruene@gmail.com");
            client3.setPhoneNumber(236955172L);


            session.merge(client1);
            session.merge(client2);
            session.merge(client3);

            session.getTransaction().commit();
        }
    }

    public static void insertRentDetail() {
        System.out.println("Inserting rent details...");


        try (Session ses = sf.openSession()) {
            ses.beginTransaction();

            RentDetail rd1 = new RentDetail();
            rd1.setPrice(80);
            rd1.setStartDate("12-11-2022");
            rd1.setEndDate("12-12-2022");

            ses.merge(rd1);

            ses.getTransaction().commit();

        }
    }

    public static void main(String[] args) {
        System.out.println("Sit back! Relax !  Enjoy the show!");
//
        //TODO     // insert item in table
        // TODO   Update / Delte / - git -//  @Enum ? ? //
        //  getBy// findBy //  findbyDate //  serchCleint //

        //TODO @Embeddable annotation to declare that a class will be embedded
        //   by other entities.
        // @Embedded is used to embed a type into another entity
        //      insertCars();
        //    inserClients();
        //  insertRentDetail();


    }
}