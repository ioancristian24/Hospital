package com.sda.dao.implementation;

import com.sda.dao.Affiliated_withDAO;
import com.sda.entities.Affiliated_with;
import com.sda.entities.Affiliated_with_Id;
import com.sda.utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.io.Serializable;

public class Affiliated_withDaoImpl implements Affiliated_withDAO {

    @Override
    public void addAffiliated_with(Affiliated_with affiliated_with) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            Serializable id = session.save(affiliated_with);
            System.out.println("Affiliated_with is created with id: " + id);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Affiliated_with_Id displayAffiliated_withById(Affiliated_with_Id id) {
        Affiliated_with affiliated_with = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            affiliated_with = session.get(Affiliated_with.class, id);
            if (affiliated_with != null) {
                return id;
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
                affiliated_with.setId(new Affiliated_with_Id(1, 4));
                affiliated_with.setPrimaryAffiliation(false);
                session.beginTransaction();
                session.update(affiliated_with);
                session.getTransaction().commit();
                System.out.println("Affiliated_with was updated with provided affiliation");
            } else {
                System.out.println("Affiliated_with doesn't update with provided id");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }
}




