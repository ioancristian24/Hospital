package com.sda.dao.implementation;

import com.sda.dao.PhysicianDAO;
import com.sda.entities.Physician;
import com.sda.utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class PhysicianDaoImpl implements PhysicianDAO {
    @Override
    public void addPhysician(Physician physician) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            Integer id = (Integer) session.save(physician);
            System.out.println("Physician is created with id: " + id);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Physician displayPhysicianById(int employeeId) {
        Physician physician = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            physician = session.get(Physician.class, employeeId);
            if (physician != null) {
                return physician;
            } else {
                System.out.println("Physician doesn't exist with provided id");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void updatePhysicianById(int employeeId, String position) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Physician physician = session.get(Physician.class, employeeId);
            if (physician != null) {
                physician.setPosition(position);
                session.beginTransaction();
                session.update(physician);
                session.getTransaction().commit();
            } else {
                System.out.println("Physician doesn't exist with provided id");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletePhysicianById(Integer employeeId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Physician physician = session.get(Physician.class, employeeId);
            if (physician != null) {
                session.beginTransaction();
                session.delete(physician);
                session.getTransaction().commit();
            } else {
                System.out.println("Physician doesn't exist with provided id");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }
}
