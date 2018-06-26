package huating.com.controller.tgoods;

import huating.com.dto.tgoods.TGoodsRequestDto;
import huating.com.dto.tgoods.TGoodsResponseDto;
import huating.com.model.tgood.TGoodRequestModel;
import huating.com.model.tgood.TGoodsResponseModel;
import huating.com.service.tgoods.TGoodsDaoImpl;
import huating.com.utils.modelmapper.MapperUtils;
import huating.com.utils.page.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/tgoods")
public class TGoodsApiController {

    @Autowired
    private TGoodsDaoImpl  tGoodsDao;

    /**
     * 查询列表分页
     * @param requestDto
     * @param request
     * @return
     */
    @RequestMapping(value = "/getTGoodsInfoList")
    public TGoodsResponseDto getTGoodsInfoList(TGoodsRequestDto requestDto, HttpServletRequest request){
        TGoodsResponseDto responseDto=new TGoodsResponseDto();
        Pageable pageable=new Pageable(requestDto.getPage()-1,requestDto.getRows());
        TGoodsResponseModel list = tGoodsDao.getList(pageable, MapperUtils.mapper(requestDto, TGoodRequestModel.class));
        responseDto.setData(list.getData());
        responseDto.setTotal(list.getTotal());
        return  responseDto;
    }

}
