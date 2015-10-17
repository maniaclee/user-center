package psyco.user.center.dal.mapper;

import psyco.user.center.client.dto.UserDTO;
import psyco.user.center.client.dto.request.FindUserRequestDTO;
import psyco.user.center.dal.entity.User;

import java.util.List;

public interface UserMapper{

    User findOne(Long id);

    List<User> find(List<Long> ids);

    Long insert(User user);

    void update(User user);

    void delete(Long id);

    UserDTO findByRequest(FindUserRequestDTO findUserRequestDTO);

}