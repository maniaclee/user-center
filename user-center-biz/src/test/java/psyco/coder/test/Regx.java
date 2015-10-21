package psyco.coder.test;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.FileInputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by peng on 15/10/18.
 */
public class Regx {


    public static void sdfs(String s, String template) {
        String regTest = "test\\s*=\\s*\"\\s*([^<>\"]*)\\s*\"\\s*";
        String reg = String.format("<if\\s+%s>\\s*([^\"]*)\\s*</if>", regTest);
        Matcher m = Pattern.compile(reg).matcher(template);
        while (m.find()) {
            String test = m.group(1);
            String content = m.group(2);
            if (validate(s, test)) {
                System.out.println(content);
            }
        }
    }

    private static boolean validate(String value, String template) {
        Matcher m = Pattern.compile("a\\s*([!=><]+)\\s*(\\S+)").matcher(template);
        if (m.find()) {
            String operator = m.group(1);
            String v = m.group(2);
            switch (operator) {
                case "!=":
                    return !v.equals(value);
                case "==":
                    return v.equals(value);
            }
        }
        return false;
    }

    @Test
    public void sdfsd() throws Exception {
        String template = IOUtils.toString(new FileInputStream("/Users/peng/workspace/github/user-center/user-center-biz/src/test/tempX"));
        sdfs("2", template);
        System.out.println("---------------");
        sdfs("37", template);
    }

}
