package zj.shardingdruid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lzj
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private OrderMapper orderMapper;

    @RequestMapping("/a")
    public String a() {
        orderMapper.selectAll();
        return "hello";
    }


}
