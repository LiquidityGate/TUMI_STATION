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

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.PrimeFaces;
import org.primefaces.util.EscapeUtils;

import java.io.Serializable;

@Named
@ViewScoped
public class FreeBlocksDemoView implements Serializable {

    private final String block1 = "<div class=\"grid grid-nogutter surface-section text-800\">\n" +
            "    <div class=\"col-12 md:col-6 p-6 text-center md:text-left flex align-items-center \">\n" +
            "        <section>\n" +
            "            <span class=\"block text-6xl font-bold mb-1\">Create the screens</span>\n" +
            "            <div class=\"text-6xl text-primary font-bold mb-3\">your visitors deserve to see</div>\n" +
            "            <p class=\"mt-0 mb-4 text-700 line-height-3\">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\n" +
            "\n" +
            "            <p:commandButton value=\"Learn More\" type=\"button\" class=\"mr-3 ui-button-raised\"/>\n" +
            "            <p:commandButton value=\"Live Demo\" type=\"button\" class=\"ui-button-outlined\"/>\n" +
            "        </section>\n" +
            "    </div>\n" +
            "    <div class=\"col-12 md:col-6 overflow-hidden\">\n" +
            "        <p:graphicImage name=\"images/blocks/hero/hero-1.png\" library=\"demo\" alt=\"Image\"\n" +
            "                        styleClass=\"md:ml-auto block md:h-full\"\n" +
            "                        style=\"clip-path: polygon(8% 0, 100% 0%, 100% 100%, 0 100%)\"/>\n" +
            "    </div>\n" +
            "</div>";

    private final String block2 = "<div class=\"surface-section text-center\">\n" +
            "    <div class=\"mb-3 font-bold text-2xl\">\n" +
            "        <span class=\"text-900\">One Product, </span>\n" +
            "        <span class=\"text-blue-600\">Many Solutions</span>\n" +
            "    </div>\n" +
            "    <div class=\"text-700 text-sm mb-6\">Ac turpis egestas maecenas pharetra convallis posuere morbi leo urna.\n" +
            "    </div>\n" +
            "    <div class=\"grid\">\n" +
            "        <div class=\"col-12 md:col-4 mb-4 px-5\">\n" +
            "            <span class=\"p-3 shadow-2 mb-3 inline-block surface-card\" style=\"border-radius: 10px\">\n" +
            "                <i class=\"pi pi-desktop text-4xl text-blue-500\" />\n" +
            "            </span>\n" +
            "            <div class=\"text-900 mb-3 font-medium\">Built for Developers</div>\n" +
            "            <span class=\"text-700 text-sm line-height-3\">Duis aute irure dolor in reprehenderit in voluptate\n" +
            "                velit esse cillum dolore eu fugiat nulla pariatur.</span>\n" +
            "        </div>\n" +
            "        <div class=\"col-12 md:col-4 mb-4 px-5\">\n" +
            "            <span class=\"p-3 shadow-2 mb-3 inline-block surface-card\" style=\"border-radius: 10px\">\n" +
            "                <i class=\"pi pi-lock text-4xl text-blue-500\" />\n" +
            "            </span>\n" +
            "            <div class=\"text-900 mb-3 font-medium\">End-to-End Encryption</div>\n" +
            "            <span class=\"text-700 text-sm line-height-3\">Risus nec feugiat in fermentum posuere urna nec.\n" +
            "                Posuere sollicitudin aliquam ultrices sagittis.</span>\n" +
            "        </div>\n" +
            "        <div class=\"col-12 md:col-4 mb-4 px-5\">\n" +
            "            <span class=\"p-3 shadow-2 mb-3 inline-block surface-card\" style=\"border-radius: 10px\">\n" +
            "                <i class=\"pi pi-check-circle text-4xl text-blue-500\" />\n" +
            "            </span>\n" +
            "            <div class=\"text-900 mb-3 font-medium\">Easy to Use</div>\n" +
            "            <span class=\"text-700 text-sm line-height-3\">Ornare suspendisse sed nisi lacus sed viverra\n" +
            "                tellus. Neque volutpat ac tincidunt vitae semper.</span>\n" +
            "        </div>\n" +
            "        <div class=\"col-12 md:col-4 mb-4 px-5\">\n" +
            "            <span class=\"p-3 shadow-2 mb-3 inline-block surface-card\" style=\"border-radius: 10px\">\n" +
            "                <i class=\"pi pi-globe text-4xl text-blue-500\" />\n" +
            "            </span>\n" +
            "            <div class=\"text-900 mb-3 font-medium\">Fast &amp; Global Support</div>\n" +
            "            <span class=\"text-700 text-sm line-height-3\">Fermentum et sollicitudin ac orci phasellus egestas\n" +
            "                tellus rutrum tellus.</span>\n" +
            "        </div>\n" +
            "        <div class=\"col-12 md:col-4 mb-4 px-5\">\n" +
            "            <span class=\"p-3 shadow-2 mb-3 inline-block surface-card\" style=\"border-radius: 10px\">\n" +
            "                <i class=\"pi pi-github text-4xl text-blue-500\" />\n" +
            "            </span>\n" +
            "            <div class=\"text-900 mb-3 font-medium\">Open Source</div>\n" +
            "            <span class=\"text-700 text-sm line-height-3\">Nec tincidunt praesent semper feugiat. Sed\n" +
            "                adipiscing diam donec adipiscing tristique risus nec feugiat. </span>\n" +
            "        </div>\n" +
            "        <div class=\"col-12 md:col-4 md:mb-4 mb-0 px-3\">\n" +
            "            <span class=\"p-3 shadow-2 mb-3 inline-block surface-card\" style=\"border-radius: 10px\">\n" +
            "                <i class=\"pi pi-shield text-4xl text-blue-500\" />\n" +
            "            </span>\n" +
            "            <div class=\"text-900 mb-3 font-medium\">Trusted Securitty</div>\n" +
            "            <span class=\"text-700 text-sm line-height-3\">Mattis rhoncus urna neque viverra justo nec\n" +
            "                ultrices. Id cursus metus aliquam eleifend.</span>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</div>";

    private final String block3 = "<div>\n" +
            "    <div class=\"text-900 font-bold text-6xl mb-4 text-center\">Pricing Plans</div>\n" +
            "    <div class=\"text-700 text-xl mb-6 text-center line-height-3\">Lorem ipsum dolor sit, amet consectetur adipisicing elit. Velit numquam eligendi quos.</div>\n" +
            "\n" +
            "    <div class=\"grid\">\n" +
            "        <div class=\"col-12 lg:col-4\">\n" +
            "            <div class=\"p-3 h-full\">\n" +
            "                <div class=\"shadow-2 p-3 h-full flex flex-column surface-card\" style=\"border-radius: 6px\">\n" +
            "                    <div class=\"text-900 font-medium text-xl mb-2\">Basic</div>\n" +
            "                    <div class=\"text-600\">Plan description</div>\n" +
            "                    <hr class=\"my-3 mx-0 border-top-1 border-bottom-none surface-border\"/>\n" +
            "                    <div class=\"flex align-items-center\">\n" +
            "                        <span class=\"font-bold text-2xl text-900\">$9</span>\n" +
            "                        <span class=\"ml-2 font-medium text-600\">per month</span>\n" +
            "                    </div>\n" +
            "                    <hr class=\"my-3 mx-0 border-top-1 border-bottom-none surface-border\"/>\n" +
            "                    <ul class=\"list-none p-0 m-0 flex-grow-1\">\n" +
            "                        <li class=\"flex align-items-center mb-3\">\n" +
            "                            <i class=\"pi pi-check-circle text-green-500 mr-2\"/>\n" +
            "                            <span>Arcu vitae elementum</span>\n" +
            "                        </li>\n" +
            "                        <li class=\"flex align-items-center mb-3\">\n" +
            "                            <i class=\"pi pi-check-circle text-green-500 mr-2\"/>\n" +
            "                            <span>Dui faucibus in ornare</span>\n" +
            "                        </li>\n" +
            "                        <li class=\"flex align-items-center mb-3\">\n" +
            "                            <i class=\"pi pi-check-circle text-green-500 mr-2\"/>\n" +
            "                            <span>Morbi tincidunt augue</span>\n" +
            "                        </li>\n" +
            "                    </ul>\n" +
            "                    <hr class=\"mb-3 mx-0 border-top-1 border-bottom-none surface-border mt-auto\"/>\n" +
            "                    <p:commandButton type=\"button\" value=\"Buy Now\" styleClass=\"px-3 py-2 w-full mt-auto\"/>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "\n" +
            "        <div class=\"col-12 lg:col-4\">\n" +
            "            <div class=\"p-3 h-full\">\n" +
            "                <div class=\"shadow-2 p-3 h-full flex flex-column surface-card\" style=\"border-radius: 6px\">\n" +
            "                    <div class=\"text-900 font-medium text-xl mb-2\">Premium</div>\n" +
            "                    <div class=\"text-600\">Plan description</div>\n" +
            "                    <hr class=\"my-3 mx-0 border-top-1 border-bottom-none surface-border\"/>\n" +
            "                    <div class=\"flex align-items-center\">\n" +
            "                        <span class=\"font-bold text-2xl text-900\">$29</span>\n" +
            "                        <span class=\"ml-2 font-medium text-600\">per month</span>\n" +
            "                    </div>\n" +
            "                    <hr class=\"my-3 mx-0 border-top-1 border-bottom-none surface-border\"/>\n" +
            "                    <ul class=\"list-none p-0 m-0 flex-grow-1\">\n" +
            "                        <li class=\"flex align-items-center mb-3\">\n" +
            "                            <i class=\"pi pi-check-circle text-green-500 mr-2\"/>\n" +
            "                            <span>Arcu vitae elementum</span>\n" +
            "                        </li>\n" +
            "                        <li class=\"flex align-items-center mb-3\">\n" +
            "                            <i class=\"pi pi-check-circle text-green-500 mr-2\"/>\n" +
            "                            <span>Dui faucibus in ornare</span>\n" +
            "                        </li>\n" +
            "                        <li class=\"flex align-items-center mb-3\">\n" +
            "                            <i class=\"pi pi-check-circle text-green-500 mr-2\"/>\n" +
            "                            <span>Morbi tincidunt augue</span>\n" +
            "                        </li>\n" +
            "                        <li class=\"flex align-items-center mb-3\">\n" +
            "                            <i class=\"pi pi-check-circle text-green-500 mr-2\"/>\n" +
            "                            <span>Duis ultricies lacus sed</span>\n" +
            "                        </li>\n" +
            "                    </ul>\n" +
            "                    <hr class=\"mb-3 mx-0 border-top-1 border-bottom-none surface-border\"/>\n" +
            "                    <p:commandButton type=\"button\" value=\"Buy Now\" styleClass=\"px-3 py-2 w-full\"/>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "\n" +
            "        <div class=\"col-12 lg:col-4\">\n" +
            "            <div class=\"p-3 h-full\">\n" +
            "                <div class=\"shadow-2 p-3 flex flex-column surface-card\" style=\"border-radius: 6px\">\n" +
            "                    <div class=\"text-900 font-medium text-xl mb-2\">Enterprise</div>\n" +
            "                    <div class=\"text-600\">Plan description</div>\n" +
            "                    <hr class=\"my-3 mx-0 border-top-1 border-bottom-none surface-border\"/>\n" +
            "                    <div class=\"flex align-items-center\">\n" +
            "                        <span class=\"font-bold text-2xl text-900\">$49</span>\n" +
            "                        <span class=\"ml-2 font-medium text-600\">per month</span>\n" +
            "                    </div>\n" +
            "                    <hr class=\"my-3 mx-0 border-top-1 border-bottom-none surface-border\"/>\n" +
            "                    <ul class=\"list-none p-0 m-0 flex-grow-1\">\n" +
            "                        <li class=\"flex align-items-center mb-3\">\n" +
            "                            <i class=\"pi pi-check-circle text-green-500 mr-2\"/>\n" +
            "                            <span>Arcu vitae elementum</span>\n" +
            "                        </li>\n" +
            "                        <li class=\"flex align-items-center mb-3\">\n" +
            "                            <i class=\"pi pi-check-circle text-green-500 mr-2\"/>\n" +
            "                            <span>Dui faucibus in ornare</span>\n" +
            "                        </li>\n" +
            "                        <li class=\"flex align-items-center mb-3\">\n" +
            "                            <i class=\"pi pi-check-circle text-green-500 mr-2\"/>\n" +
            "                            <span>Morbi tincidunt augue</span>\n" +
            "                        </li>\n" +
            "                        <li class=\"flex align-items-center mb-3\">\n" +
            "                            <i class=\"pi pi-check-circle text-green-500 mr-2\"/>\n" +
            "                            <span>Duis ultricies lacus sed</span>\n" +
            "                        </li>\n" +
            "                        <li class=\"flex align-items-center mb-3\">\n" +
            "                            <i class=\"pi pi-check-circle text-green-500 mr-2\"/>\n" +
            "                            <span>Imperdiet proin</span>\n" +
            "                        </li>\n" +
            "                        <li class=\"flex align-items-center mb-3\">\n" +
            "                            <i class=\"pi pi-check-circle text-green-500 mr-2\"/>\n" +
            "                            <span>Nisi scelerisque</span>\n" +
            "                        </li>\n" +
            "                    </ul>\n" +
            "                    <hr class=\"mb-3 mx-0 border-top-1 border-bottom-none surface-border\"/>\n" +
            "                    <p:commandButton type=\"button\" value=\"Buy Now\"\n" +
            "                                     styleClass=\"px-3 py-2 w-full ui-button-outlined\"/>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</div>";

    private final String block4 = "<div class=\"surface-section text-700 text-center\">\n" +
            "    <div class=\"text-blue-600 font-bold mb-3\"><i class=\"pi pi-discord\"/>&#160;POWERED BY DISCORD</div>\n" +
            "    <div class=\"text-900 font-bold text-5xl mb-3\">Join Our Design Community</div>\n" +
            "    <div class=\"text-700 text-2xl mb-5\">Lorem ipsum dolor sit, amet consectetur adipisicing elit. Velit numquam eligendi quos.</div>\n" +
            "    <p:commandButton type=\"button\" value=\"Join Now\" icon=\"pi pi-discord ml-4\"\n" +
            "                     styleClass=\"font-bold px-4 py-2 ui-button-raised rounded-button white-space-nowrap\"/>\n" +
            "</div>";

    private final String block5 = "<div class=\"bg-bluegray-900 text-gray-100 p-3 flex justify-content-between lg:justify-content-center align-items-center flex-wrap\">\n" +
            "    <div class=\"font-bold mr-8\">\uD83D\uDD25 Hot Deals!</div>\n" +
            "    <div class=\"align-items-center hidden lg:flex\">\n" +
            "        <span class=\"line-height-3\">Libero voluptatum atque exercitationem praesentium provident odit.</span>\n" +
            "    </div>\n" +
            "    <div class=\"flex align-items-center ml-2 mr-8\">\n" +
            "        <a class=\"text-white\" href=\"#\"><span class=\"underline font-bold\">Learn More</span></a>\n" +
            "    </div>\n" +
            "    <a class=\"flex align-items-center no-underline justify-content-center border-circle text-white-100 hover:bg-bluegray-700 cursor-pointer transition-colors transition-duration-150\"\n" +
            "       style=\"width:2rem; height: 2rem\">\n" +
            "        <i class=\"pi pi-times\"></i>\n" +
            "    </a>\n" +
            "</div>";

    private final String block6 = "<div class=\"surface-section px-4 py-5 md:px-6 lg:px-8\">\n" +
            "    <ul class=\"list-none p-0 m-0 flex align-items-center font-medium mb-3\">\n" +
            "        <li>\n" +
            "            <a class=\"text-500 no-underline line-height-3 cursor-pointer\">Application</a>\n" +
            "        </li>\n" +
            "        <li class=\"px-2\">\n" +
            "            <i class=\"pi pi-angle-right text-500 line-height-3\"/>\n" +
            "        </li>\n" +
            "        <li>\n" +
            "            <span class=\"text-900 line-height-3\">Analytics</span>\n" +
            "        </li>\n" +
            "    </ul>\n" +
            "    <div class=\"flex align-items-start flex-column lg:justify-content-between lg:flex-row\">\n" +
            "        <div>\n" +
            "            <div class=\"font-medium text-3xl text-900\">Customers</div>\n" +
            "            <div class=\"flex align-items-center text-700 flex-wrap\">\n" +
            "                <div class=\"mr-5 flex align-items-center mt-3\">\n" +
            "                    <i class=\"pi pi-users mr-2\"/>\n" +
            "                    <span>332 Active Users</span>\n" +
            "                </div>\n" +
            "                <div class=\"mr-5 flex align-items-center mt-3\">\n" +
            "                    <i class=\"pi pi-globe mr-2\"/>\n" +
            "                    <span>9402 Sessions</span>\n" +
            "                </div>\n" +
            "                <div class=\"flex align-items-center mt-3\">\n" +
            "                    <i class=\"pi pi-clock mr-2\"/>\n" +
            "                    <span>2.32m Avg. Duration</span>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "        <div class=\"mt-3 lg:mt-0\">\n" +
            "            <p:commandButton type=\"button\" value=\"Add\" icon=\"pi pi-user-plus\"\n" +
            "                             styleClass=\"ui-button-outlined mr-2\"/>\n" +
            "            <p:commandButton type=\"button\" value=\"Save\" icon=\"pi pi-check\"/>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</div>" ;

    private final String block7 = "<div class=\"surface-ground\">\n" +
            "    <div class=\"text-900 font-bold text-2xl line-height-2 mb-3\">\uD83C\uDF55 Choice of all Ninja Turtles</div>\n" +
            "    <p class=\"text-600 line-height-3 text-lg m-0 mb-5\">Excepteur sint occaecat cupidatat\n" +
            "        non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>\n" +
            "\n" +
            "    <div class=\"grid\">\n" +
            "        <div class=\"col-12 md:col-6 lg:col-3\">\n" +
            "            <div class=\"px-5 py-3 surface-card shadow-2 border-round\">\n" +
            "                <div class=\"text-blue-600 font-medium line-height-3 mb-2\">Neapolitan</div>\n" +
            "                <div class=\"text-900 font-bold line-height-3 text-2xl mb-2\">995</div>\n" +
            "                <p class=\"text-700 line-height-3 m-0\">Nostrum laborum accusamus quia iste facere possimus minus itaque error unde.</p>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "        <div class=\"col-12 md:col-6 lg:col-3\">\n" +
            "            <div class=\"px-5 py-3 surface-card shadow-2 border-round\">\n" +
            "                <div class=\"text-blue-600 font-medium line-height-3 mb-2\">Pepperoni</div>\n" +
            "                <div class=\"text-900 font-bold line-height-3 text-2xl mb-2\">1504</div>\n" +
            "                <p class=\"text-700 line-height-3 m-0\">Nostrum laborum accusamus quia iste facere possimus minus itaque error unde.</p>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "        <div class=\"col-12 md:col-6 lg:col-3\">\n" +
            "            <div class=\"px-5 py-3 surface-card shadow-2 border-round\">\n" +
            "                <div class=\"text-blue-600 font-medium line-height-3 mb-2\">Margherita</div>\n" +
            "                <div class=\"text-900 font-bold line-height-3 text-2xl mb-2\">2038</div>\n" +
            "                <p class=\"text-700 line-height-3 m-0\">Nostrum laborum accusamus quia iste facere possimus minus itaque error unde.</p>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "        <div class=\"col-12 md:col-6 lg:col-3\">\n" +
            "            <div class=\"px-5 py-3 surface-card shadow-2 border-round\">\n" +
            "                <div class=\"text-blue-600 font-medium line-height-3 mb-2\">BBQ Chicken</div>\n" +
            "                <div class=\"text-900 font-bold line-height-3 text-2xl mb-2\">766</div>\n" +
            "                <p class=\"text-700 line-height-3 m-0\">Nostrum laborum accusamus quia iste facere possimus minus itaque error unde.</p>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</div>";
    
    private final String block8 = "<div class=\"flex align-items-center justify-content-center\">\n" +
            "    <div class=\"surface-card p-4 shadow-2 border-round w-full lg:w-6\">\n" +
            "        <div class=\"text-center mb-5\">\n" +
            "            <p:graphicImage name=\"images/blocks/logos/hyper.svg\" library=\"demo\" alt=\"Image\"\n" +
            "                            height=\"50\" styleClass=\"mb-3\"/>\n" +
            "            <div class=\"text-900 text-3xl font-medium mb-3\">Welcome Back</div>\n" +
            "            <span class=\"text-600 font-medium line-height-3\">Don't have an account?</span>\n" +
            "            <a class=\"font-medium no-underline ml-2 text-blue-500 cursor-pointer\">Create today!</a>\n" +
            "        </div>\n" +
            "\n" +
            "        <div>\n" +
            "            <label for=\"email1\" class=\"block text-900 font-medium mb-2\">Email</label>\n" +
            "            <p:inputText id=\"email1\" styleClass=\"w-full mb-3\"/>\n" +
            "\n" +
            "            <label for=\"password1\" class=\"block text-900 font-medium mb-2\">Password</label>\n" +
            "            <p:inputText id=\"password1\" type=\"password\" styleClass=\"w-full mb-3\"/>\n" +
            "\n" +
            "            <div class=\"flex align-items-center justify-content-between mb-6\">\n" +
            "                <div class=\"flex align-items-center\">\n" +
            "                    <p:selectBooleanCheckbox id=\"rememberme\" styleClass=\"mr-2\"/>\n" +
            "                    <label for=\"rememberme\">Remember me</label>\n" +
            "                </div>\n" +
            "                <a class=\"font-medium no-underline ml-2 text-blue-500 text-right cursor-pointer\">Forgot your password?</a>\n" +
            "            </div>\n" +
            "\n" +
            "            <p:commandButton type=\"button\" value=\"Sign In\" icon=\"pi pi-user\" styleClass=\"w-full\"/>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</div>" ;

    private final String block9 = "<div class=\"surface-section\">\n" +
            "    <div class=\"font-medium text-3xl text-900 mb-3\">Movie Information</div>\n" +
            "    <div class=\"text-500 mb-5\">Morbi tristique blandit turpis. In viverra ligula id nulla hendrerit rutrum.</div>\n" +
            "    <ul class=\"list-none p-0 m-0\">\n" +
            "        <li class=\"flex align-items-center py-3 px-2 border-top-1 surface-border flex-wrap\">\n" +
            "            <div class=\"text-500 w-6 md:w-2 font-medium\">Title</div>\n" +
            "            <div class=\"text-900 w-full md:w-8 md:flex-order-0 flex-order-1\">Heat</div>\n" +
            "            <div class=\"w-6 md:w-2 flex justify-content-end\">\n" +
            "                <p:commandButton type=\"button\" value=\"Edit\" icon=\"pi pi-pencil\"\n" +
            "                                 styleClass=\"ui-button-flat\"/>\n" +
            "            </div>\n" +
            "        </li>\n" +
            "        <li class=\"flex align-items-center py-3 px-2 border-top-1 surface-border flex-wrap\">\n" +
            "            <div class=\"text-500 w-6 md:w-2 font-medium\">Genre</div>\n" +
            "            <div class=\"text-900 w-full md:w-8 md:flex-order-0 flex-order-1\">\n" +
            "                <p:chip label=\"Crime\" styleClass=\"mr-2\"/>\n" +
            "                <p:chip label=\"Drama\" styleClass=\"mr-2\"/>\n" +
            "                <p:chip label=\"Thriller\"/>\n" +
            "            </div>\n" +
            "            <div class=\"w-6 md:w-2 flex justify-content-end\">\n" +
            "                <p:commandButton type=\"button\" value=\"Edit\" icon=\"pi pi-pencil\"\n" +
            "                                 styleClass=\"ui-button-flat\"/>\n" +
            "            </div>\n" +
            "        </li>\n" +
            "        <li class=\"flex align-items-center py-3 px-2 border-top-1 surface-border flex-wrap\">\n" +
            "            <div class=\"text-500 w-6 md:w-2 font-medium\">Director</div>\n" +
            "            <div class=\"text-900 w-full md:w-8 md:flex-order-0 flex-order-1\">Michael Mann</div>\n" +
            "            <div class=\"w-6 md:w-2 flex justify-content-end\">\n" +
            "                <p:commandButton type=\"button\" value=\"Edit\" icon=\"pi pi-pencil\"\n" +
            "                                 styleClass=\"ui-button-flat\"/>\n" +
            "            </div>\n" +
            "        </li>\n" +
            "        <li class=\"flex align-items-center py-3 px-2 border-top-1 surface-border flex-wrap\">\n" +
            "            <div class=\"text-500 w-6 md:w-2 font-medium\">Actors</div>\n" +
            "            <div class=\"text-900 w-full md:w-8 md:flex-order-0 flex-order-1\">Robert De Niro, Al Pacino</div>\n" +
            "            <div class=\"w-6 md:w-2 flex justify-content-end\">\n" +
            "                <p:commandButton type=\"button\" value=\"Edit\" icon=\"pi pi-pencil\"\n" +
            "                                 styleClass=\"ui-button-flat\"/>\n" +
            "            </div>\n" +
            "        </li>\n" +
            "        <li class=\"flex align-items-center py-3 px-2 border-top-1 border-bottom-1 surface-border flex-wrap\">\n" +
            "            <div class=\"text-500 w-6 md:w-2 font-medium\">Plot</div>\n" +
            "            <div class=\"text-900 w-full md:w-8 md:flex-order-0 flex-order-1 line-height-3\">\n" +
            "                A group of professional bank robbers start to feel the heat from police\n" +
            "                when they unknowingly leave a clue at their latest heist.\n" +
            "            </div>\n" +
            "            <div class=\"w-6 md:w-2 flex justify-content-end\">\n" +
            "                <p:commandButton type=\"button\" value=\"Edit\" icon=\"pi pi-pencil\"\n" +
            "                                 styleClass=\"ui-button-flat\"/>\n" +
            "            </div>\n" +
            "        </li>\n" +
            "    </ul>\n" +
            "</div>" ;

    private final String block10 = "<div class=\"surface-card p-4 shadow-2 border-round\">\n" +
            "    <div class=\"text-3xl font-medium text-900 mb-3\">Card Title</div>\n" +
            "    <div class=\"font-medium text-500 mb-3\">Vivamus id nisl interdum, blandit augue sit amet, eleifend mi.</div>\n" +
            "    <div style=\"height: 150px\" class=\"border-2 border-dashed surface-border\"></div>\n" +
            "</div>" ;
    
    public String getBlock1() {
        return block1;
    }

    public String getBlock2() {
        return block2;
    }

    public String getBlock3() {
        return block3;
    }

    public String getBlock4() {
        return block4;
    }

    public String getBlock5() {
        return block5;
    }

    public String getBlock6() {
        return block6;
    }

    public String getBlock7() {
        return block7;
    }

    public String getBlock8() {
        return block8;
    }

    public String getBlock9() {
        return block9;
    }

    public String getBlock10() {
        return block10;
    }

    public void copyCode(String code) {
        PrimeFaces.current().executeScript("navigator.clipboard.writeText('" + EscapeUtils.forJavaScript(code) + "')");
    }
}
