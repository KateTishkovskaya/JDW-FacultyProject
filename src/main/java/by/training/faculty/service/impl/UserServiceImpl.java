package by.training.faculty.service.impl;

import by.training.faculty.bean.User;
import by.training.faculty.dao.DAOProvider;
import by.training.faculty.dao.UserDAO;
import by.training.faculty.dao.exception.DAOException;
import by.training.faculty.service.UserService;
import by.training.faculty.service.exception.ServiceException;

public class UserServiceImpl implements UserService {

    DAOProvider provider = DAOProvider.getInstance();

    @Override
    public void registration(User newUser) throws ServiceException {
        //validator
        UserDAO userDAO = provider.getUserDAO();
        try{
            provider.getUserDAO().registration(newUser);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public boolean authorization(String login, String password) throws ServiceException {
        return false;
    }
}
