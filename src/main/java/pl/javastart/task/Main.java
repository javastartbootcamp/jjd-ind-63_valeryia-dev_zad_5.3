package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        ProductUtils utils = new ProductUtils();
        Product prod1 = utils.create("Cejlon", "Herbata cejlońska", 4.55, "Herbata");
        Product prod2 = utils.create("Lava", "Czarna Kawa",  3.96,  "Kawa");
        Product prod3 = utils.create("Homar",  "Homar morski", 6.99, "Owoce morza");
        utils.getProductInfo(prod1);
        utils.getProductInfo(prod2);
        utils.getProductInfo(prod3);
    }
}
