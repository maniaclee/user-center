package psyco.user.center.client.service;

import psyco.user.center.client.dto.UserDTO;
import psyco.user.center.client.dto.request.FindUserRequestDTO;
import psyco.user.center.client.exceptions.ErrorCodeException;

import java.util.List;

/**
 * Created by lipeng on 15/10/13.
 */
public interface UserService {

    UserDTO findOne(Long id);

    List<UserDTO> find(List<Long> ids);

    void delete(Long id);

    Long insert(UserDTO user) throws ErrorCodeException;

    void update(UserDTO user);

    UserDTO findByRequest(FindUserRequestDTO findUserRequestDTO);



}
