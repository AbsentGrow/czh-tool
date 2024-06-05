package com.czh.tool.czh.tool.annotation.type;

import com.czh.tool.czh.tool.enums.FileUploadStrategy;

import java.lang.annotation.*;

/**
 * 上传文件类型
 *
 * @author czh
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FileUploadType {

    FileUploadStrategy value();
}
