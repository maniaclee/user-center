package psyco.user.center.service;

import org.apache.commons.lang3.StringUtils;
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
import java.util.Optional;
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

    public UserDTO update(UserDTO user) {
        try {
            userRepository.update(UserDTOBuilder.toUser(user));
        } catch (Exception e) {
            return null;
        }
        return UserDTOBuilder.toUserDTO(userRepository.findOne(user.getId()));
    }

    public UserDTO findByRequest(FindUserRequestDTO findUserRequestDTO) {
        return UserDTOBuilder.toUserDTO(userRepository.findByRequest(findUserRequestDTO));
    }

    @Override
    public boolean unbindPhone(Long userId) {
        return Optional.ofNullable(userId)
                .map(aLong -> aLong <= 0 ? null : aLong)
                .map(aLong1 -> userRepository.findOne(aLong1))
                .map(user -> StringUtils.isBlank(user.getPhone()) ||
                        update(UserDTOBuilder.builder()
                                .setId(user.getId())
                                .setPhone("")
                                .build()) != null)
                .orElse(false);
    }

    @Override
    public boolean unbindEmail(Long userId) {
        return Optional.ofNullable(userId)
                .map(aLong -> aLong <= 0 ? null : aLong)
                .map(aLong1 -> userRepository.findOne(aLong1))
                .map(user -> StringUtils.isBlank(user.getEmail()) ||
                        update(UserDTOBuilder.builder()
                                .setId(user.getId())
                                .setEmail("")
                                .build()) != null)
                .orElse(false);
    }


}
