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

import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.rain.domain.Customer;
import org.primefaces.rain.domain.Product;
import org.primefaces.rain.service.CustomerService;
import org.primefaces.rain.service.OrderService;
import org.primefaces.rain.service.ProductService;
import org.primefaces.event.ToggleEvent;
import org.primefaces.model.Visibility;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;

@Named
@ViewScoped
public class DataTableDemoView implements Serializable {

    private List<Customer> customers1;

    private List<Customer> customers2;

    private List<Product> products1;

    private Customer selectedCustomer;

    private List<Customer> selectedCustomers;

    @Inject
    private CustomerService service;

    @Inject
    private ProductService productService;

    @Inject
    private OrderService orderService;

    @PostConstruct
    public void init() {
        customers1 = service.getCustomers(50);
        customers2 = service.getCustomers(50);
        products1 = productService.getProducts();
    }

    public long getTotalCount(String name) {
        return customers1.stream().filter(customers -> name.equals(customers.getRepresentative().getName())).count();
    }

    public void onRowToggle(ToggleEvent event) {
        if (event.getVisibility() == Visibility.VISIBLE) {
            Product product = (Product) event.getData();
            if (product.getOrders() == null) {
                product.setOrders(orderService.getOrders((int) (Math.random() * 10)));
            }
        }
    }

    public List<Customer> getCustomers1() {
        return customers1;
    }

    public List<Customer> getCustomers2() {
        return customers2;
    }

    public List<Product> getProducts1() {
        return products1;
    }

    public List<Customer> getSelectedCustomers() {
        return selectedCustomers;
    }

    public void setSelectedCustomers(List<Customer> selectedCustomers) {
        this.selectedCustomers = selectedCustomers;
    }

    public Customer getSelectedCustomer() {
        return selectedCustomer;
    }

    public void setSelectedCustomer(Customer selectedCustomer) {
        this.selectedCustomer = selectedCustomer;
    }

}