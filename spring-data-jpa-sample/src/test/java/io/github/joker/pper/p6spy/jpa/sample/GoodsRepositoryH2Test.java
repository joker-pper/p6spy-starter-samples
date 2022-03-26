package io.github.joker.pper.p6spy.jpa.sample;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * H2测试
 */
@ActiveProfiles({"h2"})
@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsRepositoryH2Test extends GoodsRepositoryBaseTest {

}
