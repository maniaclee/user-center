package psyco.user.center.client.service;

import psyco.user.center.client.dto.UserDTO;

import java.util.List;

/**
 * Created by lipeng on 15/10/13.
 */
public interface UserService {

    UserDTO findOne(Long id);

    List<UserDTO> find(List<Long> ids);

    void delete(Long id);

    Long insert(UserDTO user);

    void update(UserDTO user);

    UserDTO findByPhoneOrEmail(String phone, String email);
}
