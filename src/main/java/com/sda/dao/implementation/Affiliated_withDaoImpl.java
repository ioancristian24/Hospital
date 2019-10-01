package com.sda.dao.implementation;

import com.sda.dao.Affiliated_withDAO;
import com.sda.entities.Affiliated_with;
import com.sda.entities.Affiliated_with_Id;
import com.sda.entities.Department;
import com.sda.utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class Affiliated_withDaoImpl implements Affiliated_withDAO {
    @Override
    public Affiliated_with displayAffiliated_withById(Affiliated_with_Id id) {
        Affiliated_with affiliated_with = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            affiliated_with = session.get(Affiliated_with.class, id);
            if (affiliated_with != null) {
                return affiliated_with;
            } else {
                System.out.println("Affiliated_with doesn't exist with provided id");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void updateAffiliated_withById(Affiliated_with_Id id, boolean primaryAffiliation) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Affiliated_with affiliated_with = session.get(Affiliated_with.class, id);
            if (affiliated_with != null) {
                affiliated_with.setPrimaryAffiliation(primaryAffiliation);
                session.beginTransaction();
                session.update(affiliated_with);
                session.getTransaction().commit();
            } else {
                System.out.println("Affiliated_with doesn't exist with provided id");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }
}
