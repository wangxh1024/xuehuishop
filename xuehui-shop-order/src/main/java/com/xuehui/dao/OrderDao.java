package com.xuehui.dao;

import com.xuehui.mapper.OrderMapper;
import com.xuehui.model.Order;
import com.xuehui.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2018/6/23 0023.
 */
@Component
public class OrderDao {

    @Autowired
    OrderMapper orderMapper;

    public void insertOrder(Order order){
        orderMapper.insertOrder(order);
    }
    public List<Order> listOrder(OrderVo orderVo){
        return orderMapper.listOrder(orderVo);
    }

    public void updateOrderWithUser(Order order){
        orderMapper.updateOrderWithUser(order);
    }

    public Order findOrderByid(int id){
        return orderMapper.findOrderByid(id);
    }

    public void deleteorderbyid(int id){
        orderMapper.deleteorderbyid(id);
    }
}
