package psyco.user.center.dal.mapper;

import java.util.List;
import psyco.user.center.dal.entity.User;

public interface UserMapper{

    public User findOne(Long id);

    public List<User> find(List<Long> ids);

    public Long insert(User user);

    public void update(User user);

    public void delete(Long id);

}