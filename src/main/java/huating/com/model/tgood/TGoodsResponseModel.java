package huating.com.model.tgood;

import huating.com.entity.TGoodsEntity;

import java.util.ArrayList;
import java.util.List;

public class TGoodsResponseModel {
    private List<TGoodsEntity> data=new ArrayList<>();
    private Long total=0L;

    public List<TGoodsEntity> getData() {
        return data;
    }

    public void setData(List<TGoodsEntity> data) {
        this.data = data;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
