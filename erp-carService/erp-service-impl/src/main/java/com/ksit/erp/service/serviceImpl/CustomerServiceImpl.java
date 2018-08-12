package com.ksit.erp.service.serviceImpl;

import com.ksit.erp.entity.ErpCustomer;
import com.ksit.erp.mapper.ErpCustomerMapper;
import com.ksit.erp.service.ICustomerService;
import com.ksit.erp.util.Const;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.ServerException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by houfalv on 2018/8/8.
 */
@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ErpCustomerMapper erpCustomerMapper;


    /**
     * 新增客户
     *
     * @param erpCustomer
     */
    @Override
    public void newCustomer(ErpCustomer erpCustomer) throws ServerException {
        int result = erpCustomerMapper.validateCustomer(new HashMap<String,Object>(){
            {
                put(Const.TABLE_ERP_CUSTOMER_EMAIL,erpCustomer.getCustomerEmail());
                put(Const.TABLE_ERP_CUSTOMER_TEL,erpCustomer.getCustomerTel());
                put(Const.TABLE_ERP_CUSTOMER_ID_CARD,erpCustomer.getCustomerIdCard());

            }
        });

        if (result>0) {
            throw new ServerException("用户已经存在，无法添加");
        }

        erpCustomer.setCustomerPassword(DigestUtils.md5Hex(erpCustomer.getCustomerPassword()));
        erpCustomer.setCustomerCreateTime(new Date());
        erpCustomer.setCustomerUpdateTime(new Date());

        erpCustomerMapper.insert(erpCustomer);
    }

    @Override
    public List<ErpCustomer> listCustomer() {
        return erpCustomerMapper.listCustomer();
    }
}
