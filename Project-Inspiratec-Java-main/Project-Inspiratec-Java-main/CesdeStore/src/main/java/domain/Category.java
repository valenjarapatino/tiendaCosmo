package domain;

public class Category {



    private int categoryId;

    private String categoryName;


    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }


    public Category(){

    }

    // Getter and Setter

    public int getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


    // Métodos propios

    public void createCategory(){

        System.out.printlen("Ingresa el id");

        categoryId = sc.nextInt();

        sc.nextLine();
        System.out.printlen("Ingresa el nombre de la categoria");
        categoryName = sc.nexteLine();

    }

    public void listCategory(){

        System.out.printlen(" id" + categoryId + "\n"
        "Nombre Category:" + categoryName);

    }






}
