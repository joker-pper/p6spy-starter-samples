package io.github.joker.pper.p6spy.jpa.sample;

import io.github.joker.pper.p6spy.jpa.sample.entity.Goods;
import io.github.joker.pper.p6spy.jpa.sample.repository.GoodsRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import javax.annotation.Resource;
import java.util.List;

/**
 * 测试基类
 */
@Ignore
public class GoodsRepositoryBaseTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Resource
    private GoodsRepository goodsRepository;

    private void insertOne() {
        Goods goods = new Goods();
        goods.setName("商品1");
        goods.setPrice(10000);
        goodsRepository.save(goods);
    }

    @Test
    public void insert() {
        insertOne();
    }

    @Test
    public void findAll() {
        insertOne();

        List<Goods> goodsList = goodsRepository.findAll();
        System.out.println(String.format("结果: %s", goodsList));
    }
}
