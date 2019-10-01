package com.sda.dao.implementation;

import com.sda.dao.DepartmentDAO;
import com.sda.entities.Department;
import com.sda.utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class DepartmentDaoImpl implements DepartmentDAO {
    @Override
    public void addDepartment(Department department) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            Integer id = (Integer) session.save(department);
            System.out.println("Department is created with id: " + id);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Department displayDepartmentById(int departmentId) {
        Department department = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            department = session.get(Department.class, departmentId);
            if (department != null) {
                return department;
            } else {
                System.out.println("Department doesn't exist with provided id");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void updateDepartmentById(int departmentId, String name) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Department department = session.get(Department.class, departmentId);
            if (department != null) {
                department.setName(name);
                session.beginTransaction();
                session.update(department);
                session.getTransaction().commit();
            } else {
                System.out.println("Department doesn't exist with provided id");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteDepartmentById(Integer departmentId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Department department = session.get(Department.class, departmentId);
            if (department != null) {
                session.beginTransaction();
                session.delete(department);
                session.getTransaction().commit();
            } else {
                System.out.println("Department doesn't exist with provided id");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }
}
