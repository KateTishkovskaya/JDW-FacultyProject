package by.training.faculties.dao;

import by.training.faculties.bean.User;
import by.training.faculties.dao.exception.DAOException;

public interface UserDAO {
    void save(User user) throws DAOException;
    void registration(User newUser) throws DAOException;
    boolean authorization(String login, String password) throws DAOException;
}
