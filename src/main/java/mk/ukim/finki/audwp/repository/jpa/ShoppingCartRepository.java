package mk.ukim.finki.audwp.repository.jpa;

import mk.ukim.finki.audwp.model.ShoppingCart;
import mk.ukim.finki.audwp.model.User;
import mk.ukim.finki.audwp.model.enumeration.ShoppingCartStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
    Optional<ShoppingCart> findByUserAndStatus(User user, ShoppingCartStatus status);
}
