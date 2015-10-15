package psyco.user.center.service;

import org.springframework.stereotype.Service;
import psyco.user.center.client.service.UserService;

/**
 * Created by lipeng on 15/10/14.
 */
@Service
public class UserServiceImpl implements UserService {

    public String echo(String s) {
        return "Userxxxxx+\t" + s;
    }
}
