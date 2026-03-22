import Facade.ShopFacade;

public class App {
    public static void main(String[] args) throws Exception {
        ShopFacade.getInstance().buyProductByCashWithFreeShipping("khoaduong861@gmail.com");

        System.out.println("=====================================");
        
        ShopFacade.getInstance().buyProductByCardWithExpressShipping("khoaduong@gmail.com", "08676242");
    }
}
