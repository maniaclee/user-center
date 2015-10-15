package psyco.user.center.dal.convert;

import psyco.user.center.dal.entity.User;
import psyco.user.center.client.dto.UserDTO;
/**
 * Created by psyco on 2015/46/16-12:10:46.
 */
public class UserDTOBuilder{
    public static UserDTO toUserDTO(User user){
        UserDTO re = new UserDTO();
        re.setId(user.getId());
        re.setName(user.getName());
        re.setSex(user.getSex());
        re.setEmail(user.getEmail());
        re.setPhone(user.getPhone());
        re.setLevel(user.getLevel());
        re.setImageUrl(user.getImageUrl());
        re.setImageThumbUrl(user.getImageThumbUrl());
        re.setRole(user.getRole());
        re.setEnabled(user.getEnabled());
        re.setPassword(user.getPassword());
        return re;
    }
    public static User toUser(User userDTO){
        User re = new User();
        re.setId(userDTO.getId());
        re.setName(userDTO.getName());
        re.setSex(userDTO.getSex());
        re.setEmail(userDTO.getEmail());
        re.setPhone(userDTO.getPhone());
        re.setLevel(userDTO.getLevel());
        re.setImageUrl(userDTO.getImageUrl());
        re.setImageThumbUrl(userDTO.getImageThumbUrl());
        re.setRole(userDTO.getRole());
        re.setEnabled(userDTO.getEnabled());
        re.setPassword(userDTO.getPassword());
        return re;
    }
}
