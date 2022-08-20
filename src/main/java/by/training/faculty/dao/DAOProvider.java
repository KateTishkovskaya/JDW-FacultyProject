package by.training.faculty.dao;

import by.training.faculty.dao.impl.UserDAOImpl;

public final class DAOProvider {
    private static final DAOProvider instance = new DAOProvider();

    UserDAO userDAO = new UserDAOImpl();

    private DAOProvider() {

    }

    public static DAOProvider getInstance() {
        return instance;
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
