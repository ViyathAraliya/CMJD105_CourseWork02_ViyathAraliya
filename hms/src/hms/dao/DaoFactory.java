/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hms.dao;

import hms.dao.customDao.implementation.UserDaoImplementation;

public class DaoFactory<Entity> {

    private static DaoFactory daoFactory;

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public SuperDao getDao(DaoType type) {
        switch (type) {
            case USER:
                return new UserDaoImplementation();
            default:
                return null;
        }
    }

    public enum DaoType {
        USER;
    }
}
