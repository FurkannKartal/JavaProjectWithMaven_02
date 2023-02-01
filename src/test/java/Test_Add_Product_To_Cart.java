import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class Test_Add_Product_To_Cart {

    HomePage homePage;
    CartPage cartPage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;

    @Test
    public void search_product() {
        System.out.println("Search Product");
        homePage.searchBox().search("kitap");
        Assertions.assertTrue(productsPage.isOnProductsPage(),"Not on products page");

    }

    @Test
    public void select_product() {
        System.out.println("Select Product");
        productPage.selectProduct(1);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),"Not on product detail page");
    }

    @Test
    public void add_product_to_cart() {
        System.out.println("Add Product To Cart");
        productDetailPage.addToCart();
        Assertions.assertTrue(homePage.isProductCountUp(),"Product count is not up");
    }

    @Test
    public void go_to_cart() {
        System.out.println("Go To Cart");
        homePage.goToCart();
        Assertions.assertTrue(CartPage.checkisProductInCart(),"Product is not in cart");
    }

}
