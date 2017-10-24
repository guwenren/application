package com.siyuanren.application.dao;

import com.siyuanren.application.model.User;

public interface UserDAO {
    /**
     *
     * @param id
     * @return
     */
    User getById(Integer id);

    /**
     *
     * @param user
     * @return
     */
    int insert(User user);
}
