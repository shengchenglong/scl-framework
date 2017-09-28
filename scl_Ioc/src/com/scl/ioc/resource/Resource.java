package com.scl.ioc.resource;

import java.io.IOException;
import java.io.InputStream;

/**
 * 对Xml资源文件进行读取
 *
 * Created by shengchenglong on 2017/9/28.
 */
public interface Resource {

    /**
     *
     * @return 文件输入流
     * @throws IOException IO异常
     */
    InputStream getInputStream() throws IOException;

}
