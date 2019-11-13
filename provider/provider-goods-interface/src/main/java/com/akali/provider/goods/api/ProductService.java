package com.akali.provider.goods.api;

import com.akali.common.model.response.DubboResponse;
import com.akali.common.model.response.QueryResult;
import com.akali.provider.goods.dto.*;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * @ClassName ProductService
 * @Description: TODO
 * @Author Administrator
 * @Date 2019/11/12 0012
 * @Version V1.0
 **/
public interface ProductService {
    /**
     *  创建商品所有属性值
     * @param spuAttrValueCollectDTO
     * @return
     */
    DubboResponse<Void> createProductAttrValue(SpuAttrValueCollectDTO spuAttrValueCollectDTO) throws JsonProcessingException;
    /**
     * 创建spu基本信息
     * @param spuDTO
     * @return
     */
    DubboResponse<Void> createProduct(SpuDTO spuDTO);

    /**
     * 根据spuId 获取商品所有属性值
     * @param spuId
     * @return
     */
    DubboResponse<QueryResult<AttrValueDTO>> queryProductAllAttrValue(Long spuId);

    /**
     * 根据spuid获取商品spu详细信息
     * @param spuId
     * @return
     */
    DubboResponse<SpuDetaiDTO> querySpuDetail(Long spuId);

    /**
     * 把销售选项和一个或多个sku属性进行绑定
     * @param spuSaleOptionDTO
     * @return
     */
    DubboResponse<Void> bindSaleOptionAndSkuAttr(SpuSaleOptionDTO spuSaleOptionDTO) throws JsonProcessingException;

    /**
     * 添加商品sku
     * @param skuDTO
     * @return
     */
    DubboResponse<Void> createProductSku(SkuCreateDTO skuDTO) throws Exception;

    /**
     * 判断sku是否存在
     * @param skuCreateDTO
     * @return
     */
    public Boolean checkExistsSku(SkuCreateDTO skuCreateDTO);

    /**
     * 修改商品详情信息
     * @param spuDetaiModifyDTO
     * @return
     */
    DubboResponse<Void> updateSpuDetail(SpuDetaiModifyDTO spuDetaiModifyDTO);
}