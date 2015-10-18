package psyco.user.center.dal.repo;

import psyco.user.center.client.dto.request.FindUserRequestDTO;
import psyco.user.center.dal.entity.User;
import psyco.user.center.dal.mapper.UserMapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by peng on 15/10/16.
 */
@Resource
public class UserRepository {

    @Resource
    private UserMapper userMapper;

    public User findOne(Long id) {
        return userMapper.findOne(id);
    }

    public List<User> find(List<Long> ids) {
        return userMapper.find(ids);
    }

    public void update(User user) {
        userMapper.update(user);
    }

    public void delete(Long id) {
        userMapper.delete(id);
    }

    public Long insert(User user) {
        return userMapper.insert(user);
    }

    public User findByRequest(FindUserRequestDTO dto) {
        return userMapper.findByRequest(dto);
    }
}
