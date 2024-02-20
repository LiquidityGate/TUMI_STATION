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
package org.primefaces.rain.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import org.primefaces.rain.domain.Order;
import org.primefaces.rain.domain.OrderStatus;

@Named
@ApplicationScoped
public class OrderService {
    
    private final static String[] names;

    static {
        names = new String[]{"James","David","Jeanfrancois","Ivar","Tony","Adams","Claire","Costa","Juan","Maria","Jennifer","Stacey","Leja","Morrow",
                        "Arvin","Darci","Izzy","Lionel","Clifford","Emily","Kadeem","Mujtaba","Aika","Mayumi","Misaki","Silvio","Nicolas","Antonio",
                        "Deepesh","Aditya","Aruna","Jones","Julie","Smith","Johnson","Francesco","Salvatore","Kaitlin","Faith","Maisha","Jefferson",
                        "Leon","Rodrigues","Alejandro","Munro","Cody","Chavez","Sinclair","Isabel","Octavia","Murillo","Greenwood","Wickens","Ashley"};
    }

    public List<Order> getOrders(int number) {
        List<Order> orders = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            orders.add(new Order(i + 1000, getProductCode(), getDate(), getAmount(), getQuantity(), getCustomerName(), OrderStatus.random()));
        }
        return orders;
    }

    private String getCustomerName() {
        String firstName = this.getName();
        String lastName;
        while((lastName = this.getName()).equals(firstName)) {}

        return firstName + " " + lastName;
    }

    private String getName() {
        return names[(int) (Math.random() * names.length)];
    }

    private String getProductCode() {
        return UUID.randomUUID().toString().substring(6, 16);
    }

    private LocalDate getDate() {
        LocalDate now = LocalDate.now();
        long randomDay = ThreadLocalRandom.current().nextLong(now.minusDays(30).toEpochDay(), now.toEpochDay());
        return LocalDate.ofEpochDay(randomDay);
    }

    private double getAmount() {
        return ThreadLocalRandom.current().nextDouble(1, 200);
    }

    private int getQuantity() {
        return ThreadLocalRandom.current().nextInt(1, 10);
    }

}