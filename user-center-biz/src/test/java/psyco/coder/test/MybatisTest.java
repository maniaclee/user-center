package psyco.coder.test;

import com.google.common.base.CaseFormat;
import com.google.common.collect.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import psyco.user.center.AppUserCenter;
import psyco.user.center.config.DalConfig;
import psyco.user.center.dal.entity.User;
import psyco.user.center.dal.mapper.UserMapper;

import javax.annotation.Resource;

/**
 * Created by lipeng on 15/8/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Configuration
@SpringBootApplication
@SpringApplicationConfiguration(classes = {DalConfig.class,MybatisTest.class})
@EnableAutoConfiguration(exclude = {AppUserCenter.class})
public class MybatisTest {

    @Resource
    private UserMapper ageMapper;

    @Test
    public void test() {
        long id = 20;
        System.out.println(ageMapper.findOne(20l));
        User update=new User();
        update.setId(id);
        update.setLevel(100);
        ageMapper.update(update);
        update.setId(null);
        System.out.println("key:"+ageMapper.insert(update)+"\t" + update.getId());
        ageMapper.delete(update.getId());
        System.out.println(ageMapper.findOne(20l));
        System.out.println(ageMapper.find(Lists.newArrayList(20l,21l)));
    }

    @Test
    public void sdfsdf(){
        String columnName = "imageUrl";
        System.out.println(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_HYPHEN, columnName));
        System.out.println(ageMapper.findByPhoneOrEmail("5555","5555"));
    }

}
