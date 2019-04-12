import com.wenong.feign.application.Application;
import com.wenong.feign.application.service.ApiService;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author ZengZhiHang
 * @create 2019-04-08-16:28
 */
@SpringBootTest(classes = Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class text {
    @Resource
    private ApiService apiService;

    @org.junit.Test
    public void test() {
        System.out.println(apiService.index());
    }
    @org.junit.Test
    public void test1() {
        System.out.println(apiService.index());
    }
}
