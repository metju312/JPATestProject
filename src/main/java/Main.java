import entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("something");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        User user1 = new User();
        user1.setLogin("Jack");
        user1.setHaslo("1234");

        entityManager.persist(user1);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }

}