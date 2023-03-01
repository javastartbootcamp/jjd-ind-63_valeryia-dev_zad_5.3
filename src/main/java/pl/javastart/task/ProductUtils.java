package pl.javastart.task;

public class ProductUtils {
    public void getProductInfo(Product product) {
        System.out.printf("Product:" + product.getName() + "\nKategoria" + product.getCategory() + "\nCena netto:" +
                product.getNetPrice() + "\nCena brutto:" + countGrossPrice(product));
    }

    private double countGrossPrice(Product product) {
        double grossPrice = product.getNetPrice() * (1 + vatTax(product));
        return grossPrice;
    }

    private Double vatTax(Product product) {
        String  category = product.getCategory();
        double vatTax;
        switch (category) {
            case "Herbata" -> vatTax = 0.21;
            case "Kawa" -> vatTax = 0.23;
            case "Owoce" -> vatTax = 0.24;
            case"Warszywa" -> vatTax = 0.25;
            default -> vatTax = 0.2;
        }; return vatTax;
    }

    public Product create(String name, String description, double netPrice, String category) {
        return new Product(name, description, netPrice, category);
    }
}
