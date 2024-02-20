package org.primefaces.rain.view;
import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class GuestPreferences implements Serializable {

    private String menuMode = "layout-static layout-static-active";

    private String darkMode = "light";

    private String layoutPrimaryColor = "cyan";

    private String componentTheme = "cyan";
    
    private String topbarTheme = "colored";

    private String menuTheme = "dim";

    private String profileMode = "popup";

    private String inputStyle = "outlined";

    private boolean lightLogo = true;

    private List<ComponentTheme> componentThemes = new ArrayList<ComponentTheme>();

    private List<LayoutPrimaryColor> layoutPrimaryColors = new ArrayList<LayoutPrimaryColor>();

    @PostConstruct
    public void init() {  
        componentThemes.add(new ComponentTheme("Blue", "blue", "#2c84d8"));
        componentThemes.add(new ComponentTheme("Wisteria", "wisteria", "#A864AE"));
        componentThemes.add(new ComponentTheme("Cyan", "cyan", "#25A4D4"));
        componentThemes.add(new ComponentTheme("Amber", "amber", "#DB8519"));
        componentThemes.add(new ComponentTheme("Pink", "pink", "#F5487F"));
        componentThemes.add(new ComponentTheme("Orange", "orange", "#CB623A"));
        componentThemes.add(new ComponentTheme("Victoria", "victoria", "#594791"));
        componentThemes.add(new ComponentTheme("Chateau Green", "chateau-green", "#3C9462"));
        componentThemes.add(new ComponentTheme("Paradiso", "paradiso", "#3B9195"));
        componentThemes.add(new ComponentTheme("Chambray", "chambray", "#3161BA"));
        componentThemes.add(new ComponentTheme("Tapestry", "tapestry", "#A2527F"));

        layoutPrimaryColors.add(new LayoutPrimaryColor("Blue", "blue", "#2c84d8"));
        layoutPrimaryColors.add(new LayoutPrimaryColor("Wisteria", "wisteria", "#A053A7"));
        layoutPrimaryColors.add(new LayoutPrimaryColor("Cyan", "cyan", "#25A4D4"));
        layoutPrimaryColors.add(new LayoutPrimaryColor("Amber", "amber", "#DB8519"));
        layoutPrimaryColors.add(new LayoutPrimaryColor("Pink", "pink", "#F5487F"));
        layoutPrimaryColors.add(new LayoutPrimaryColor("Orange", "orange", "#CB623A"));
        layoutPrimaryColors.add(new LayoutPrimaryColor("Victoria", "victoria", "#705BB1"));
        layoutPrimaryColors.add(new LayoutPrimaryColor("Chateau Green", "chateau-green", "#3C9462"));
        layoutPrimaryColors.add(new LayoutPrimaryColor("Paradiso", "paradiso", "#3B9195"));
        layoutPrimaryColors.add(new LayoutPrimaryColor("Chambray", "chambray", "#3161BA"));
        layoutPrimaryColors.add(new LayoutPrimaryColor("Tapestry", "tapestry", "#924470"));
    }

    public String getDarkMode() {
        return darkMode;
    }

    public boolean isLightLogo() {
        return lightLogo;
    }

    public void setDarkMode(String darkMode) {
        this.darkMode = darkMode;
        this.menuTheme = darkMode;
        this.topbarTheme = darkMode;
        this.lightLogo = !this.topbarTheme.equals("light");
    }

    public String getLayout() {
        return "layout-" + this.layoutPrimaryColor + '-' + this.darkMode ;
    }
    
    public String getTheme() {
        return this.componentTheme + '-' + this.darkMode ;
    }

    public String getLayoutPrimaryColor() {
        return layoutPrimaryColor;
    }

    public void setLayoutPrimaryColor(String layoutPrimaryColor) {
        this.layoutPrimaryColor = layoutPrimaryColor;
        this.componentTheme = layoutPrimaryColor;
    }

    public String getComponentTheme() {
        return componentTheme;
    }

    public void setComponentTheme(String componentTheme) {
        this.componentTheme = componentTheme;
    }

    public String getMenuTheme() {
        return menuTheme;
    }
    
    public void setMenuTheme(String menuTheme) {
        this.menuTheme = menuTheme;
    }

    public String getTopbarTheme() {
        return topbarTheme;
    }
    
    public void setTopbarTheme(String topbarTheme) {
        this.topbarTheme = topbarTheme;
        this.lightLogo = !this.topbarTheme.equals("light");
    }

    public String getMenuMode() {
        return this.menuMode;
    }
    
    public void setMenuMode(String menuMode) {
        this.menuMode = menuMode;
    }

    public String getProfileMode() {
        return this.profileMode;
    }

    public void setProfileMode(String profileMode) {
        this.profileMode = profileMode;
    }

    public String getInputStyle() {
        return inputStyle;
    }

    public void setInputStyle(String inputStyle) {
        this.inputStyle = inputStyle;
    }

    public String getInputStyleClass() {
        return this.inputStyle.equals("filled") ? "ui-input-filled" : "";
    }


    public List<ComponentTheme> getComponentThemes() {
        return componentThemes;
    }  

    public class ComponentTheme {
        String name;
        String file;
        String color;

        public ComponentTheme(String name, String file, String color) {
            this.name = name;
            this.file = file;
            this.color = color;
        }

        public String getName() {
            return this.name;
        }

        public String getFile() {
            return this.file;
        }

        public String getColor() {
            return this.color;
        }
    }

    public List<LayoutPrimaryColor> getLayoutPrimaryColors() {
        return layoutPrimaryColors;
    }  

    public class LayoutPrimaryColor {
        String name;
        String file;
        String color;

        public LayoutPrimaryColor(String name, String file, String color) {
            this.name = name;
            this.file = file;
            this.color = color;
        }

        public String getName() {
            return this.name;
        }

        public String getFile() {
            return this.file;
        }

        public String getColor() {
            return this.color;
        }
    }

}
