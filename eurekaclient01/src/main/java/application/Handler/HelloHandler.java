package application.Handler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WenONG
 * @create 2019-04-06-11:10
 */
@RestController
public class HelloHandler {
    @Value("${server.port}")
    private int port;

    @RequestMapping("index")
    public String index(){

        return "Hello World,端口号是："+port;
    }


}
