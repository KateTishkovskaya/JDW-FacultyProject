package by.training.faculty.dao.impl;

import by.training.faculty.bean.User;
import by.training.faculty.dao.UserDAO;
import by.training.faculty.dao.connection.ConnectionPool;
import by.training.faculty.dao.connection.ConnectionPoolException;
import by.training.faculty.dao.exception.DAOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAOImpl implements UserDAO {

    private static final ConnectionPool connectionPool = ConnectionPool.getInstance();

    public static final String REGISTRATION_SQL = """
            INSERT INTO users(login, password)
            values(?,?);
            INSERT INTO user_details(name, surName, LastName, user_id)
            values(?,?,?, (SELECT id FROM users WHERE LOWER(id) LIKE LOWER(?)) );
            """;

    @Override
    public void save(User user) throws DAOException {

    }

    @Override
    public void registration(User newUser) throws DAOException {
        try {
            Connection connection = connectionPool.takeConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(REGISTRATION_SQL);


        } catch (SQLException | ConnectionPoolException e) {
            throw new DAOException(e);
        }
    }

    @Override
    public boolean authorization(String login, String password) throws DAOException {
        return false;
    }

    @Override
    public void seeAll() {

    }
}
