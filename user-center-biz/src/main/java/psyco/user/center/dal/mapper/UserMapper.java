package psyco.user.center.dal.mapper;

import psyco.user.center.dal.entity.User;

import java.util.List;

public interface UserMapper{

    public User findOne(Long id);

    public List<User> find(List<Long> ids);

    public Long insert(User user);

    public void update(User user);

    public void delete(Long id);

}