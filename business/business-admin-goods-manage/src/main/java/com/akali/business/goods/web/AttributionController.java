package com.akali.business.goods.web;

import com.akali.business.goods.api.AttributionControllerApi;
import com.akali.common.model.response.DubboResponse;
import com.akali.common.model.response.ResponseResult;
import com.akali.config.exception.util.ExceptionCast;
import com.akali.provider.goods.api.AttributionService;
import com.akali.provider.goods.dto.AttrGroupDTO;
import com.akali.provider.goods.dto.AttrOptionDTO;
import com.akali.provider.goods.dto.AttributionDTO;
import com.akali.provider.goods.dto.CategoryAttrInfoDTO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName AttributionController
 * @Description: TODO
 * @Author Administrator
 * @Date 2019/11/11 0011
 * @Version V1.0
 **/
@RestController
@RequestMapping("attribute")
public class AttributionController implements AttributionControllerApi {
    @Reference(version = "1.0.0")
    private AttributionService attributionService;

    /**
     * 创建属性分组
     * @param attrGroupDTO
     * @return
     */
    @PostMapping("group")
    @Override
    public ResponseResult<Void> createAttributeGroup(AttrGroupDTO attrGroupDTO) {
        DubboResponse<Void> response = attributionService.createAttributeGroup(attrGroupDTO);
        if(!response.isSuccess()){
            ExceptionCast.cast(response.getResultCode());
        }
        return ResponseResult.SUCCESS();
    }

    /**
     * 创建商品属性
     * @param attributionDTO
     * @return
     */
    @PostMapping
    @Override
    public ResponseResult<Void> createAttribute(AttributionDTO attributionDTO) {
        DubboResponse<Void> response = attributionService.createAttribute(attributionDTO);
        if(!response.isSuccess()){
            ExceptionCast.cast(response.getResultCode());
        }
        return ResponseResult.SUCCESS();
    }

    /**
     * 添加固定属性的选项
     * @param attrOptionDTO
     * @return
     */
    @PostMapping("option")
    @Override
    public ResponseResult<Void> createAttributeOption(AttrOptionDTO attrOptionDTO) {
        DubboResponse<Void> response = attributionService.createAttributeOption(attrOptionDTO);
        if(!response.isSuccess()){
            ExceptionCast.cast(response.getResultCode());
        }
        return ResponseResult.SUCCESS();
    }

    /**
     * 根据三级分类id查找全部商品属性信息
     * @param cateId
     * @return
     */
    @GetMapping("/allinfo/{cateId}")
    @Override
    public ResponseResult<CategoryAttrInfoDTO> queryAllAttributeInfoByCid(@PathVariable Long cateId) {
        DubboResponse<CategoryAttrInfoDTO> response = attributionService.queryAllAttributeInfoByCid(cateId);
        if(!response.isSuccess()){
            ExceptionCast.cast(response.getResultCode());
        }
        return ResponseResult.SUCCESS(response.getData());
    }

}