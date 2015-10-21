package psyco.user.center.dal.convert;

import psyco.user.center.dal.entity.UserDetail;
import psyco.user.center.client.dto.UserDetailDTO;
/**
 * Created by psyco on 2015/40/21-09:10:40.
 */
public class UserDetailDTOBuilder{
    public static UserDetailDTO toUserDetailDTO(UserDetail userDetail){
        UserDetailDTO re = new UserDetailDTO();
        re.setId(userDetail.getId());
        re.setUserId(userDetail.getUserId());
        return re;
    }
    public static UserDetail toUserDetail(UserDetailDTO userDetailDTO){
        UserDetail re = new UserDetail();
        re.setId(userDetailDTO.getId());
        re.setUserId(userDetailDTO.getUserId());
        return re;
    }

}
