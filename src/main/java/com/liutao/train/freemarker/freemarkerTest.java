package com.liutao.train.freemarker;

import com.alibaba.fastjson.JSONObject;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by liutao on 17-4-5.
 */
public class freemarkerTest {

    public static void main(String[] args) throws IOException, TemplateException {
        Template t = new Template(null, new StringReader("用户名：${user};URL：    ${url};姓名： <#assign text=\"${users}\" /> <#assign data=text?eval />　${data}, ${method.getName(\"2\")}"), null);
        //创建插值的Map
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("user", "lavasoft");
        map.put("url", "http://www.baidu.com/");
        map.put("name", "百度");
        JSONObject json = new JSONObject();
        JSONObject user = new JSONObject();
        user.put("name", "zhangsan");
        user.put("age",18);
        json.put("users", user.toJSONString());
        map.put("method", new freemarkerTest());
        //执行插值，并输出到指定的输出流中
        t.process(map, new OutputStreamWriter(System.out));
    }


    public String getName(String id) {
        if (id.equals("1")) {
            return "liutao";
        }
        return id;
    }
}
