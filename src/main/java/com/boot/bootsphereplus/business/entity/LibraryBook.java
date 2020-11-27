package com.boot.bootsphereplus.business.entity;

import java.util.Date;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.Version;

import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jayce
 * @since 2020-11-26
 */
@Data
@TableName("library_book")
public class LibraryBook implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private Long bookId;
    private String bookName;
    private Integer type;
    private Integer status;
    private Date createTime;
    private Date updateTime;

    @TableField(exist = false)
    private String design;
}
