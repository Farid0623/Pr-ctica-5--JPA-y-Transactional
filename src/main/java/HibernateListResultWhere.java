import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import utils.JpaUtil;

import java.util.List;
import java.util.Scanner;

public class HibernateListResultWhere {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select c from Client c where c.wayToPay=?1", Client.class);
        System.out.println("Enter the way to pay: ");
        String pago = s.next();
        query.setParameter(1, pago);
// query.setMaxResults(1);
        List clients = query.getResultList();
        System.out.println(clients);
        em.close();
    }
}
