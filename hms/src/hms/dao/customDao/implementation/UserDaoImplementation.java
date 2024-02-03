/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hms.dao.customDao.implementation;

import hms.dao.RepositoryFactory;
import hms.dao.customDao.UserDao;
import hms.dao.customRepository.UserRepository;
import hms.entity.UserEntity;


public class UserDaoImplementation implements UserDao {
    UserRepository userRepository=(UserRepository)RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.USER);
   
    public String save(UserEntity userEntity) throws Exception {
        UserRepository userRepository=(UserRepository)RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.USER);
        return userRepository.save(userEntity);
    }
    public UserEntity getByName(String name){
      
    return null;
    }

}
