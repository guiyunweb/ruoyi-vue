package plus.guiyun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author guiyun
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class AppApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(AppApplication.class, args);
        System.out.println("startup success!!!");
    }
}
