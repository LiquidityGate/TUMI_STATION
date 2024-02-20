/*
   Copyright 2009-2022 PrimeTek.

   Licensed under PrimeFaces Commercial License, Version 1.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

   Licensed under PrimeFaces Commercial License, Version 1.0 (the "License");

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.primefaces.rain.view;

import org.primefaces.rain.domain.Order;
import org.primefaces.rain.service.OrderService;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class DashboardView implements Serializable {
    
    private List<Order> ordersThisWeek;

    private List<Order> ordersLastWeek;

    private List<Order> orders;

    private int orderWeek = 0;

    @Inject
    private OrderService service;

    @PostConstruct
    public void init() {
        this.ordersThisWeek = this.service.getOrders(25);
        this.ordersLastWeek = this.service.getOrders(25);
        this.orders = this.ordersThisWeek;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public List<Order> getOrdersThisWeek() {
        return ordersThisWeek;
    }

    public void setOrdersThisWeek(List<Order> ordersThisWeek) {
        this.ordersThisWeek = ordersThisWeek;
    }

    public List<Order> getOrdersLastWeek() {
        return ordersLastWeek;
    }

    public void setOrdersLastWeek(List<Order> ordersLastWeek) {
        this.ordersLastWeek = ordersLastWeek;
    }

    public void loadOrders() {
        this.orders = this.orderWeek == 1 ? this.ordersLastWeek : this.ordersThisWeek;
    }

    public int getOrderWeek() {
        return orderWeek;
    }

    public void setOrderWeek(int orderWeek) {
        this.orderWeek = orderWeek;
    }
}
