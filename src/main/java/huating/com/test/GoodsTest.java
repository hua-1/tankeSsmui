package huating.com.test;

import huating.com.service.tgoods.TGoodsDaoImpl;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:applicationContext.xml" })
public class GoodsTest {
    @Autowired
    private TGoodsDaoImpl tGoodsDao;


}
