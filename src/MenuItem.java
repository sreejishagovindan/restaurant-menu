import java.util.ArrayList;

public class MenuItem {
    private String name;
    private Double price;
    private String description;
    private String category;
    private boolean isNew;
    public MenuItem(String name,String description,Double price){
        this.name=name;
        this.description=description;
        this.price=price;
        this.category="not categorized";
        this.isNew=false;
    }
    public MenuItem(String name,String description,Double price,String category,boolean isNew){
        this.name=name;
        this.description=description;
        this.price=price;
        this.category=category;
        this.isNew=isNew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public  String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public boolean getIsNew(){
        return isNew;
    }
    public void setIsNew(boolean isNew){
        this.isNew=isNew;
    }
}
