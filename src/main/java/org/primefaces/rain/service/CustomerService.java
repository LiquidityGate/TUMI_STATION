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
import java.util.concurrent.ThreadLocalRandom;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import org.primefaces.rain.domain.Country;
import org.primefaces.rain.domain.Customer;
import org.primefaces.rain.domain.CustomerStatus;
import org.primefaces.rain.domain.Representative;

@Named
@ApplicationScoped
public class CustomerService {
    
    private final static Country[] countries;

    private final static Representative[] representatives;

    private final static String[] names;

    List<Customer> customers = new ArrayList<>();

    static {
        countries = new Country[]{
                            new Country("Argentina", "ar"),new Country("Australia", "au"),new Country("Brazil", "br"),
                            new Country("Canada", "ca"),new Country("Germany", "de"),new Country("France", "fr"),
                            new Country("India", "in"), new Country("Italy", "it"),new Country("Japan", "jp"),
                            new Country("Russia", "ru"),
                            new Country("Spain", "es"),new Country("United Kingdom", "gb")};

        representatives = new Representative[]{new Representative("Amy Elsner", "amyelsner.png"),new Representative("Anna Fali", "annafali.png"),
                                    new Representative("Asiya Javayant", "asiyajavayant.png"),new Representative("Bernardo Dominic", "bernardodominic.png"),
                                    new Representative("Elwin Sharvill", "elwinsharvill.png"),new Representative("Ioni Bowcher", "ionibowcher.png"),
                                    new Representative("Ivan Magalhaes", "ivanmagalhaes.png"),new Representative("Onyama Limba", "onyamalimba.png"),
                                    new Representative("Stephen Shaw", "stephenshaw.png"),new Representative("Xuxue Feng", "xuxuefeng.png")};

        names = new String[]{"James","David","Jeanfrancois","Ivar","Tony","Adams","Claire","Costa","Juan","Maria","Jennifer","Stacey","Leja","Morrow",
                        "Arvin","Darci","Izzy","Lionel","Clifford","Emily","Kadeem","Mujtaba","Aika","Mayumi","Misaki","Silvio","Nicolas","Antonio",
                        "Deepesh","Aditya","Aruna","Jones","Julie","Smith","Johnson","Francesco","Salvatore","Kaitlin","Faith","Maisha","Jefferson",
                        "Leon","Rodrigues","Alejandro","Munro","Cody","Chavez","Sinclair","Isabel","Octavia","Murillo","Greenwood","Wickens","Ashley"};
    }

    
    public List<Customer> getCustomers(int number) {
        List<Customer> customers = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            customers.add(new Customer(i + 1000, getCustomerName(), getCountry(), getDate(), CustomerStatus.random(), getActivity(), getRepresentative()));
        }
        return customers;
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

    private Country getCountry() {
        return countries[(int) (Math.random() * countries.length)];
    }

    private LocalDate getDate() {
        LocalDate now = LocalDate.now();
        long randomDay = ThreadLocalRandom.current().nextLong(now.minusDays(30).toEpochDay(), now.toEpochDay());
        return LocalDate.ofEpochDay(randomDay);
    }

    private int getActivity() {
        return (int) (Math.random() * 100);
    }

    private Representative getRepresentative() {
        return representatives[(int) (Math.random() * representatives.length)];
    }
}