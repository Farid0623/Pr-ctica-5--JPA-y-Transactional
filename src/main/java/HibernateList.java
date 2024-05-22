import jakarta.persistence.EntityManager;
import utils.JpaUtil;

import java.util.List;

public class HibernateList {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();
        List<Client> clients = em.createQuery("select c from Client c",
                Client.class).getResultList();
        clients.forEach(System.out::println);
        em.close();
    }
}
