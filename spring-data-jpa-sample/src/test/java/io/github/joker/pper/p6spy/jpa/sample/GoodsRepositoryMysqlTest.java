package io.github.joker.pper.p6spy.jpa.sample;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * mysql测试
 */
@ActiveProfiles({"mysql"})
@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsRepositoryMysqlTest extends GoodsRepositoryBaseTest {

}
