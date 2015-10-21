package psyco.user.center.service;

import org.springframework.stereotype.Service;
import psyco.user.center.client.dto.UserDTO;
import psyco.user.center.client.dto.request.FindUserRequestDTO;
import psyco.user.center.client.enums.UserErrorCode;
import psyco.user.center.client.exceptions.ErrorCodeException;
import psyco.user.center.client.service.UserService;
import psyco.user.center.dal.convert.UserDTOBuilder;
import psyco.user.center.dal.repo.UserRepository;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lipeng on 15/10/14.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository userRepository;

    public UserDTO findOne(Long id) {
        return UserDTOBuilder.toUserDTO(userRepository.findOne(id));
    }

    public List<UserDTO> find(final List<Long> ids) {
        return userRepository.find(ids).stream().map(e -> UserDTOBuilder.toUserDTO(e)).collect(Collectors.toList());
    }

    public void delete(Long id) {
        userRepository.delete(id);
    }

    public Long insert(UserDTO user) throws ErrorCodeException {
        if (userRepository.findByRequest(FindUserRequestDTO.from(user)) != null)
            throw new ErrorCodeException(UserErrorCode.USER_EXIST);
        Long re = userRepository.insert(UserDTOBuilder.toUser(user));
        if (re < 0)
            throw new ErrorCodeException(UserErrorCode.USER_INSERT_ERROR);
        return re;
    }

    public void update(UserDTO user) {
        userRepository.update(UserDTOBuilder.toUser(user));
    }

    public UserDTO findByRequest(FindUserRequestDTO findUserRequestDTO) {
        return UserDTOBuilder.toUserDTO(userRepository.findByRequest(findUserRequestDTO));
    }


}
