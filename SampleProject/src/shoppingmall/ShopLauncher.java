package shoppingmall;

public class ShopLauncher {

	public static void main(String[] args) {
		MyShop shop = new MyShop();
		shop.setTitle("MyShop");
		shop.genUser();
		shop.genProduct();
		shop.start();
	}

}
