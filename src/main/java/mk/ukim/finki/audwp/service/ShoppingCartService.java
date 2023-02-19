package mk.ukim.finki.audwp.service;

import mk.ukim.finki.audwp.model.Product;
import mk.ukim.finki.audwp.model.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {

    List<Product> listAllProductsInShoppingCart(Long cartId);

    ShoppingCart getActiveShoppingCart(String username);

    ShoppingCart addProductToShoppingCart(String username, Long productId);

}
