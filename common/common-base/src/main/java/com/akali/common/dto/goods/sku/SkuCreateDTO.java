package com.akali.common.dto.goods.sku;

import lombok.Data;

import java.util.Map;

/**
 * @ClassName SkuCreateDTO
 * @Description: TODO
 * @Author Administrator
 * @Date 2019/11/13 0013
 * @Version V1.0
 **/
@Data
public class SkuCreateDTO {
    private Long spuId;
    /**
     * sku特有属性，Map<Long,Long>
     * {
     *     attrId : attrValueId,
     * }
     */
    private Map<Long,Long> ownSpec;
}
