/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hms.dao;

import hms.dao.customRepository.implementation.UserRepositoryImplementation;

/**
 *
 * @author viyat
 */
public class RepositoryFactory {

    private static RepositoryFactory repositoryFactory;

    public static RepositoryFactory getInstance() {
        if (repositoryFactory == null) {
            repositoryFactory = new RepositoryFactory();
        }
        return repositoryFactory;
    }

    public SuperRepository getRepository(RepositoryType type) {
        switch (type) {
            case USER:
                return new UserRepositoryImplementation();
            default:
                return null;
        }
    }

    public enum RepositoryType {
        USER
    }

}
