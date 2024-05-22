import jakarta.persistence.EntityManager;
import utils.JpaUtil;

import javax.swing.*;

public class HibernateCreate {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();
        try {
            String name = JOptionPane.showInputDialog("Enter to name:");
            String lastname = JOptionPane.showInputDialog("Enter the lastname:");
            String pago = JOptionPane.showInputDialog("Enter the way to pay:");
            em.getTransaction().begin();
            Client c = new Client();
            c.setName(name);
            c.setLastName(lastname);
            c.setWayToPay(pago);
            em.persist(c);
            em.getTransaction().commit();
            System.out.println("el id del cliente registrado es " +
                    c.getId());
            c = em.find(Client.class, c.getId());
            System.out.println(c);
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}
