package com.akali.common.dto.goods.base.category;

import com.akali.common.dto.goods.base.attribute.AttrOptionVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName CateAttributeVO
 * @Description: TODO
 * @Author Administrator
 * @Date 2019/11/11 0011
 * @Version V1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CateAttributeVO implements Serializable {

    private static final long serialVersionUID = -9074817458079731412L;
    private Long id;
    /**
     * 三级分类id
     */
    private Long cateId;
    /**
     * 参数所属分组
     */
    private Long groupId;
    /**
     * 参数名
     */
    private String name;
    /**
     * 是否是数值类型 true是，false不是
     */
    private Boolean numeric;
    /**
     * 数组类型的单位
     */
    private String unit;
    /**
     * 数值类型 分段查找 如：2000mAh-3000mAh
     */
    private String segments;
    /**
     * 是否是通用属性，true是，false不是
     */
    private Boolean generic;
    /**
     * 是否是固定选项，true是，false不是
     */
    private Boolean hasOptions;
    /**
     * 是否可用户可选的搜索属性
     */
    private Boolean searching;
    /**
     * 固定属性选项
     */
    private List<AttrOptionVO> options;

    public CateAttributeVO(Object object) {
        BeanUtils.copyProperties(object,this);
    }
}
