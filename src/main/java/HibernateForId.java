import jakarta.persistence.EntityManager;
import utils.JpaUtil;

import java.util.Scanner;
public class HibernateForId {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the id: ");
        Long id = s.nextLong();
        EntityManager em = JpaUtil.getEntityManager();
        Client client = em.find(Client.class, id);
        System.out.println(client);
        Client client2 = em.find(Client.class, id);
        System.out.println(client2);
        em.close();
    }
}
