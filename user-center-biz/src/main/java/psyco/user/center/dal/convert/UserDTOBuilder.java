package psyco.user.center.dal.convert;

import psyco.user.center.dal.entity.User;
import psyco.user.center.client.dto.UserDTO;

import java.util.Date;

/**
 * Created by psyco on 2015/40/21-09:10:39.
 */
public class UserDTOBuilder {
    public static UserDTO toUserDTO(User user) {
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
        re.setGmtCreate(user.getGmtCreate());
        re.setGmtLastModified(user.getGmtLastModified());
        return re;
    }

    public static User toUser(UserDTO userDTO) {
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
        re.setGmtCreate(userDTO.getGmtCreate());
        re.setGmtLastModified(userDTO.getGmtLastModified());
        return re;
    }

    public static _UserDTOBuilder builder() {
        return new _UserDTOBuilder();
    }

    public  static class _UserDTOBuilder {
        UserDTO re = new UserDTO();
        public UserDTO build(){
            return re;
        }

        public _UserDTOBuilder setId(Long id) {
            re.setId(id);
            return this;
        }

        public _UserDTOBuilder setName(String name) {
            re.setName(name);
            return this;
        }

        public _UserDTOBuilder setSex(Short sex) {
            re.setSex(sex);
            return this;
        }

        public _UserDTOBuilder setEmail(String email) {
            re.setEmail(email);
            return this;
        }

        public _UserDTOBuilder setPhone(String phone) {
            re.setPhone(phone);
            return this;
        }

        public _UserDTOBuilder setLevel(Integer level) {
            re.setLevel(level);
            return this;
        }

        public _UserDTOBuilder setImageUrl(String imageUrl) {
            re.setImageUrl(imageUrl);
            return this;
        }

        public _UserDTOBuilder setImageThumbUrl(String imageThumbUrl) {
            re.setImageThumbUrl(imageThumbUrl);
            return this;
        }

        public _UserDTOBuilder setRole(String role) {
            re.setRole(role);
            return this;
        }

        public _UserDTOBuilder setEnabled(Short enabled) {
            re.setEnabled(enabled);
            return this;
        }

        public _UserDTOBuilder setPassword(String password) {
            re.setPassword(password);
            return this;
        }

        public _UserDTOBuilder setGmtCreate(Date gmtCreate) {
            re.setGmtCreate(gmtCreate);
            return this;
        }

        public _UserDTOBuilder setGmtLastModified(Date gmtLastModified) {
            re.setGmtLastModified(gmtLastModified);
            return this;
        }
    }
}
