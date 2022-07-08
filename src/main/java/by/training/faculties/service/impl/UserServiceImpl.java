package by.training.faculties.service.impl;

import by.training.faculties.bean.User;
import by.training.faculties.dao.DAOProvider;
import by.training.faculties.dao.UserDAO;
import by.training.faculties.dao.exception.DAOException;
import by.training.faculties.service.UserService;
import by.training.faculties.service.exception.ServiceException;

public class UserServiceImpl implements UserService {

    DAOProvider provider = DAOProvider.getInstance();

    @Override
    public void registration(User newUser) throws ServiceException {
        //validator
        UserDAO userDAO = provider.getUserDAO();
        try{
            userDAO.registration(newUser);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public boolean authorization(String login, String password) throws ServiceException {
        return false;
    }
}
