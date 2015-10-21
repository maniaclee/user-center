package psyco.user.center.dal.mapper;

import java.util.List;
import psyco.user.center.dal.entity.UserDetail;

public interface UserDetailMapper{

    UserDetail findOne(Long id);

    List<UserDetail> find(List<Long> ids);

    Long insert(UserDetail userDetail);

    void update(UserDetail userDetail);

    void delete(Long id);

}