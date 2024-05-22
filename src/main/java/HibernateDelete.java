import jakarta.persistence.EntityManager;
import utils.JpaUtil;

import java.util.Scanner;

public class HibernateDelete {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the ID of the client to delete:");
        Long id = s.nextLong();
        EntityManager em = JpaUtil.getEntityManager();
        try {
            Client client = em.find(Client.class, id);
            em.getTransaction().begin();
            em.remove(client);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}
