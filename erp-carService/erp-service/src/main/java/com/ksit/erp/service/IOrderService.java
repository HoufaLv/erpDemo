package com.ksit.erp.service;

import com.ksit.erp.dto.ServerResponse;

/**
 * Created by houfalv on 2018/8/10.
 */
public interface IOrderService {

    ServerResponse listServiceType();

    ServerResponse listPartsType();

    ServerResponse listPartsByType(String id);
}
