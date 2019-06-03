package com.xuehui.service;

import com.xuehui.dao.OrderDao;
import com.xuehui.model.Order;
import com.xuehui.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2018/6/23 0023.
 */
@Service
public class OrderService {
    @Autowired
    private OrderDao orderDao;

    public void insertOrder(Order order){
        Date nowdate = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddhhmmss");
        String datestring = dateFormat.format(nowdate);
        String tradenumber = UUID.randomUUID()+datestring;
        order.setCreatetime(nowdate);
        order.setTradenumber(tradenumber);
        order.setOrderstatus(0);
        order.setPaystatus(1);
        orderDao.insertOrder(order);
    }

    public List<Order> listOrder(OrderVo orderVo){
        return orderDao.listOrder(orderVo);
    }
    public void updateOrderWithUser(int id,String consigneeadress,String consigneephone,String consigneename){
        Order order = new Order();
        order.setId(id);
        order.setConsigneeaddress(consigneeadress);
        order.setConsigneephone(consigneephone);
        order.setConsigneename(consigneename);
        orderDao.updateOrderWithUser(order);
    }

    public Order findOrderByid(int id){
        return orderDao.findOrderByid(id);
    }

    public void deleteorderbyid(int id){
        orderDao.deleteorderbyid(id);
    }
}
