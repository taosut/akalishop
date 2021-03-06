package com.akali.common.dto.goods.spu;

import lombok.Data;

/**
 * @ClassName SpuDTO
 * @Description: TODO
 * @Author Administrator
 * @Date 2019/11/12 0012
 * @Version V1.0
 **/
@Data
public class SpuDTO {
    /**
     * 主标题
     */
    private String simpleName;
    /**
     * 分类id
     */
    private Long cid1;
    private Long cid2;
    private Long cid3;
    private Long brandId;
}
