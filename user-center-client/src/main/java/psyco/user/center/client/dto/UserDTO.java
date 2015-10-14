package psyco.user.center.client.dto;

import java.io.Serializable;

/**
 * Created by lipeng on 15/10/14.
 */
public class UserDTO implements Serializable{
    private Long id;
    private String name;
    private Short sex;
    private String email;
    private String phone;
    private Integer level;
    private String imageUrl;
    private String imageThumbUrl;
    private String role;
    private Short enabled;
    private String password;

}
