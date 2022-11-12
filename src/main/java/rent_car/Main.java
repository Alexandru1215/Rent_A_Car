package rent_car;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class Main {

    static SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();


    public static void insertTableCar(Car... cars) {
        System.out.println("Loading...");
        try (Session session = sessionFactory.openSession()) {
            Transaction trx = session.beginTransaction();

            Arrays.stream(cars).forEach(session::persist);

            trx.commit();
        }
    }
    public static void insertTableClient(Client... clients) {
        System.out.println("Loading...");
        try (Session session = sessionFactory.openSession()) {
            Transaction trx = session.beginTransaction();

            Arrays.stream(clients).forEach(session::persist);

            trx.commit();
        }
    }
    public static void insertTableRent(RentDetail... rentDEtails) {
        System.out.println("Loading...");
        try (Session session = sessionFactory.openSession()) {
            Transaction trx = session.beginTransaction();

            Arrays.stream(rentDEtails).forEach(session::persist);

            trx.commit();
        }
    }




    public static void main(String[] args) {
        System.out.println("Sit back! Relax !  Enjoy the show!");
       // insertTableCar();
       //  insertTableRent();
        //insertTable();
        //TODO     // insert item in table
        // TODO   Update / Delte / - git -//  @Enum //  getBy// findBy //  findbyDate //  serchCleint///

    }
}