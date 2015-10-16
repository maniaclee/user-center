package psyco.user.center.service;

import psyco.user.center.dal.entity.User;

import java.util.List;

/**
 * Created by peng on 15/10/16.
 */
public interface UserServiceX {
    User findOne(Long id);

    List<User> find(List<Long> ids);

    void delete(Long id);

    Long insert(User user);

    void update(User user);

    User findByPhoneOrEmail(String phone, String email);
}
