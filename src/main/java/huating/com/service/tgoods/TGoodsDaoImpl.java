package huating.com.service.tgoods;

import huating.com.dao.baseDao.BaseDao;
import huating.com.model.tgood.TGoodRequestModel;
import huating.com.model.tgood.TGoodsResponseModel;
import huating.com.utils.message.CommonConstant;
import huating.com.utils.page.Pageable;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TGoodsDaoImpl  {


    @Autowired
    private BaseDao baseDao;

    @Autowired
    private SessionFactory sessionFactory;


    public TGoodsResponseModel getList(Pageable pageable, TGoodRequestModel model){
        TGoodsResponseModel responseModel=new TGoodsResponseModel();
        Session session = baseDao.getSession();
        Query from_tGoodsEntity = session.createQuery("from TGoodsEntity tge where" +
                "  tge.valid =:valid order by tge.createdTime desc ");
        from_tGoodsEntity.setParameter("valid", CommonConstant.INTEGER_ONE);
        from_tGoodsEntity.setFirstResult(pageable.getPageNumber());
        from_tGoodsEntity.setMaxResults(pageable.getPageSize());
        List list = from_tGoodsEntity.list();
        Query query = session.createQuery("select count(*) from TGoodsEntity  tg where  tg.valid=:valid");
        query.setParameter("valid",CommonConstant.INTEGER_ONE);
        Long o = (Long) query.uniqueResult();
        responseModel.setData(list);
        responseModel.setTotal(o);
        return responseModel;
    }
}
