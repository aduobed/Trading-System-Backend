package Portfolio.PortfolioMoney;

import User.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoneyRepository extends JpaRepository<Money, Long> {
    Money findByUser(User user);
}
