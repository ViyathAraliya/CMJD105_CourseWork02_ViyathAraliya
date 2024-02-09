
package hms;


import hms.repository.RepositoryFactory;


public class Hms {

    
    public static void main(String[] args) {
        RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.USER);
        RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.ROOM);
        RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.CATAGORY);
}}
