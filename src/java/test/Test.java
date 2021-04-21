/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dto.UserDTO;
import java.util.List;
import model.orderDetail.OrderDetail;
import model.orderDetail.OrderDetailDAOImpl;
import model.role.Role;
import model.role.RoleDAOImpl;
import model.user.UserDAOImpl;

/**
 *
 * @author droperdev
 */
public class Test {

    public static void main(String[] args) {

        RoleDAOImpl roleDAO = new RoleDAOImpl();
        Role role = roleDAO.getRole(1);

        System.out.println("Role: " + role.toString());

        UserDAOImpl userDAO = new UserDAOImpl();
        UserDTO user = userDAO.validateCredentials("plumbre", "123456");

        System.out.println("User: " + user.toString());

        OrderDetailDAOImpl orderDetailDAO = new OrderDetailDAOImpl();
        List<OrderDetail> orderDetails = orderDetailDAO.get(1);

        for (OrderDetail orderDetail : orderDetails) {
            System.out.println("OrderDetail: " + orderDetail.toString());
        }

    }
}
