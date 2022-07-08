package by.training.faculties.dao.impl;

import by.training.faculties.bean.User;
import by.training.faculties.dao.UserDAO;
import by.training.faculties.dao.exception.DAOException;

public class UserDAOImpl implements UserDAO {

    @Override
    public void save(User user) throws DAOException {

    }

    @Override
    public void registration(User newUser) throws DAOException {

    }

    @Override
    public boolean authorization(String login, String password) throws DAOException {
        return false;
    }
}
