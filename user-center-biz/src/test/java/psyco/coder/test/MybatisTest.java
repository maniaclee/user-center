package psyco.coder.test;

import com.google.common.base.CaseFormat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import psyco.user.center.ApplicationMain;
import psyco.user.center.config.DalConfig;
import psyco.user.center.dal.entity.User;
import psyco.user.center.dal.mapper.UserMapper;

import javax.annotation.Resource;

/**
 * Created by lipeng on 15/8/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {DalConfig.class, ApplicationMain.class})
public class MybatisTest {

    @Resource
    private UserMapper ageMapper;

    @Test
    public void test() {
        long id = 20;
        System.out.println(ageMapper.getById(20l));
        User update=new User();
        update.setId(id);
        update.setLevel(100);
        ageMapper.update(update);
        System.out.println(ageMapper.getById(20l));
    }

    @Test
    public void sdfsdf(){
        String columnName = "imageUrl";
        System.out.println(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_HYPHEN, columnName));
    }

}
