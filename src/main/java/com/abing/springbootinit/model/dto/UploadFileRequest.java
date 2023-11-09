package com.abing.springbootinit.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author CaptainBing
 * @Date 2023/11/8 22:43
 * @Description
 */
@Data
public class UploadFileRequest implements Serializable {

    /**
     * 业务
     */
    private String biz;

    private static final long serialVersionUID = 1L;
}
