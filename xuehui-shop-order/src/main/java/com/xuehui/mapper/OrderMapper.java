package com.xuehui.mapper;

import com.xuehui.model.Order;
import com.xuehui.vo.OrderVo;

import java.util.List;

/**
 * Created by Administrator on 2018/6/23 0023.
 */
public interface OrderMapper {

    void insertOrder(Order order);

    List<Order> listOrder(OrderVo orderVo);

    void updateOrderWithUser(Order order);

    Order findOrderByid(int id);

    void deleteorderbyid(int id);
}
