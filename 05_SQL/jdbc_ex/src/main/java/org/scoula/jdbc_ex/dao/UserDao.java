package org.scoula.jdbc_ex.dao;

import org.scoula.jdbc_ex.domain.UserVO;

import java.util.*;
import java.sql.*;

public interface UserDao {

    List<UserVO> getUsers() throws SQLException;

    int updateUser(UserVO user) throws SQLException;


}

