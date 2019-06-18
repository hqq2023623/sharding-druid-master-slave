package zj.shardingdruid;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("zj")
@MapperScan("zj")
@ServletComponentScan
@SpringBootApplication
public class ShardingDruidApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ShardingDruidApplication.class, args);
        OrderMapper orderMapper = context.getBean(OrderMapper.class);
        orderMapper.selectAll();

    }

}
