package psyco.user.center.client.dto.request;

import psyco.user.center.client.dto.UserDTO;

import java.io.Serializable;

/**
 * Created by peng on 15/10/17.
 */
public class FindUserRequestDTO implements Serializable {
    private static final long serialVersionUID = 7230678498397604097L;
    private String phone;
    private String email;
    private Long id;

    public static FindUserRequestDTO from(UserDTO userDTO) {
        FindUserRequestDTO re = new FindUserRequestDTO();
        re.setEmail(userDTO.getEmail());
        re.setPhone(userDTO.getPhone());
        re.setId(userDTO.getId());
        return re;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
