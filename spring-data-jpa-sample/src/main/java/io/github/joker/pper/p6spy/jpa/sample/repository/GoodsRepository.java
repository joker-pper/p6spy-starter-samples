package io.github.joker.pper.p6spy.jpa.sample.repository;

import io.github.joker.pper.p6spy.jpa.sample.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsRepository extends JpaRepository<Goods, String> {
}
