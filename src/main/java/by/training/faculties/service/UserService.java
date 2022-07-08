package by.training.faculties.service;

import by.training.faculties.bean.User;
import by.training.faculties.service.exception.ServiceException;

public interface UserService {
    void registration(User newUser) throws ServiceException;
    boolean authorization(String login, String password) throws ServiceException;
}
