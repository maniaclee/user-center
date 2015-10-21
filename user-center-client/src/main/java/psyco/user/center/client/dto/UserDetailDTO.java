package psyco.user.center.client.dto;

import java.io.Serializable;
/**
 * Created by psyco on 2015/40/21-09:10:40.
 */
public class UserDetailDTO implements Serializable{

    private Long id;
    private Long userId;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserDetailDTO{" +
                "id='" + id + '\'' +
                "userId='" + userId + '\'' +
                '}';
    }
}
