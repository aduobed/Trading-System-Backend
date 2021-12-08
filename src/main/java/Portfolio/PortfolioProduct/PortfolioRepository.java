package Portfolio.PortfolioProduct;

import User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
    Portfolio findByProduct(String product);
    List<Portfolio> findByUser(User user);
}
