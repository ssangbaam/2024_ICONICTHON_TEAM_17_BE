package Iconicthon.moadream.domain.user.repository;

import Iconicthon.moadream.domain.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
