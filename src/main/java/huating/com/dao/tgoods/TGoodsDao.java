package huating.com.dao.tgoods;

import huating.com.entity.TGoodsEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TGoodsDao {
    List<TGoodsEntity> getList();
}
