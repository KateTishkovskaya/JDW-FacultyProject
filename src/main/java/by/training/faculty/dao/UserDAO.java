package by.training.faculty.dao;

import by.training.faculty.bean.User;
import by.training.faculty.dao.exception.DAOException;

public interface UserDAO {
    void save(User user) throws DAOException;
    void registration(User newUser) throws DAOException;
    boolean authorization(String login, String password) throws DAOException;
    void seeAll() throws DAOException;
}
