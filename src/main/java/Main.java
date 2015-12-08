import entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MW");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        User user1 = new User();
        user1.setLogin("Jackiiii");
        user1.setHaslo("123456");

        entityManager.persist(user1);


        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }

}