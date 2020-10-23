package vip.epss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.epss.dao.CustomerMapper;
import vip.epss.domain.Customer;
import vip.epss.domain.CustomerExample;
import vip.epss.service.CustomerService;
import vip.epss.utils.MD5Util;
import java.util.List;

@Service(value = "customerService")
public class CustomerServiceImpl  implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public long countByExample(CustomerExample example) {
        return customerMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CustomerExample example) {
        return customerMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer uid) {
        return customerMapper.deleteByPrimaryKey(uid);
    }

    @Override
    public int insert(Customer record) {
        //对传递过来的明文密码加密为密文然后比对
        record.setCpass(MD5Util.getMD5(record.getCpass()));
        return customerMapper.insert(record);
    }

    @Override
    public int insertSelective(Customer record) {
        //对传递过来的明文密码加密为密文然后比对
        record.setCpass(MD5Util.getMD5(record.getCpass()));
        return customerMapper.insertSelective(record);
    }

    @Override
    public List<Customer> selectByExample(CustomerExample example) {
        return customerMapper.selectByExample(example);
    }

    @Override
    public Customer selectByPrimaryKey(Integer cid) {
        return customerMapper.selectByPrimaryKey(cid);
    }

    @Override
    public int updateByExampleSelective(Customer record, CustomerExample example) {
        //对传递过来的明文密码加密为密文然后比对
        record.setCpass(MD5Util.getMD5(record.getCpass()));
        return customerMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Customer record, CustomerExample example) {
        //对传递过来的明文密码加密为密文然后比对
        record.setCpass(MD5Util.getMD5(record.getCpass()));
        return customerMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Customer record) {
        //对传递过来的明文密码加密为密文然后比对
        record.setCpass(MD5Util.getMD5(record.getCpass()));
        return customerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Customer record) {
        //对传递过来的明文密码加密为密文然后比对
        record.setCpass(MD5Util.getMD5(record.getCpass()));
        return customerMapper.updateByPrimaryKey(record);
    }
}
