/*
 *  广州丰石科技有限公司拥有本软件版权2018并保留所有权利。
 *  Copyright 2018, Guangzhou Rich Stone Data Technologies Company Limited,
 *  All rights reserved.
 */

package com.anan.service;

import com.anan.entity.Book;

/**
 * <b><code>service</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2018/12/26 0:52.
 *
 * @author wuguozhu
 * @since book 0.1.0
 */

public interface BookService {

    public Book getBookById(int id);
}
