package by.training.faculty.service;

import by.training.faculty.bean.User;
import by.training.faculty.service.exception.ServiceException;

public interface UserService {
    void registration(User newUser) throws ServiceException;
    boolean authorization(String login, String password) throws ServiceException;
}
