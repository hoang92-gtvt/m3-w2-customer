package controller;

import Model.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletCustomer", value = "/ServletCustomer")
public class ServletCustomer extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();
        Customer  customer1 = new Customer("Mai Văn Hoàn", "1983-08-20","Hà Nội", "anh1.jpg");
        Customer  customer2 = new Customer("Nguyễn Văn Nam", "1983-08-21","Bắc Giang", "anh2.jpg");
        Customer  customer3 = new Customer("Nguyễn Thái Hòa", "1983-08-22","Nam Định", "anh3.jpg");

        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);



        request.setAttribute("customerList", customerList);

        RequestDispatcher requestDispatcher= request.getRequestDispatcher("/views/infor.jsp");
        requestDispatcher.forward(request,response);

    }
}
