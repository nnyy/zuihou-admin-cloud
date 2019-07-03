package com.github.zuihou.authority.entity.core;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import com.baomidou.mybatisplus.annotation.TableField;
import com.github.zuihou.base.entity.Entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * <p>
 * 实体类
 * 角色分配
 * 账号角色绑定
 * </p>
 *
 * @author zuihou
 * @since 2019-07-03
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value = "CAuthUserRole", description = "角色分配 账号角色绑定")
public class CAuthUserRole extends Entity<Long> {

    private static final long serialVersionUID = 1L;

    /**
     * 角色id
     * #c_auth_role
     */
    @ApiModelProperty(value = "角色id")
    @NotNull(message = "角色id不能为空")
    @TableField("role_id")
    private Long roleId;

    /**
     * 用户id
     * #c_core_account
     */
    @ApiModelProperty(value = "用户id")
    @NotNull(message = "用户id不能为空")
    @TableField("user_id")
    private Long userId;


    @Builder
    public CAuthUserRole(Long id, Long createUser, LocalDateTime createTime,
                         Long roleId, Long userId) {
        this.id = id;
        this.createUser = createUser;
        this.createTime = createTime;
        this.roleId = roleId;
        this.userId = userId;
    }

}