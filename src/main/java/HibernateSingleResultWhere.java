import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import utils.JpaUtil;

import java.util.Scanner;

public class HibernateSingleResultWhere {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select c from Client c where c.wayToPay=?1", Client.class);
        System.out.println("Enter the way to pay: ");
        String pago = s.next();
        query.setParameter(1, pago);
        query.setMaxResults(1);
        Client c = (Client) query.getSingleResult();
        System.out.println(c);
        em.close();
    }
}
