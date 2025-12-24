package org.example.demo_ssr_v1_1.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {

    // 쿼리 메서드 네이밍 (자동 쿼리 생성)
    Optional<User> findByUsername(String username);

    //    Optional<User> findByUsernameAndPassword(String username, String password);

    /**
     * 로그인 시 역할 (ROLE) 정보까지 함게 조회되는 메서드
     * - 세션에 저장된 User 객체에서 isAdmin(), getRoleDisplay() 등을 바로 사용할 수 있다.
     *
     */

//    // left join 은 user 테이블은 다가져와야하고 roles만 붙이는거
//    @Query("SELECT distinct u from User u left join fetch u.roles r " +
//            "where u.username = :username AND u.password = :password")
//    Optional<User> findByUsernameAndPasswordWithRoles(@Param("username")String username,
//                                                      @Param("password")String password);

    // left join 은 user 테이블은 다가져와야하고 roles만 붙이는거
    @Query("SELECT distinct u from User u left join fetch u.roles r " +
            "where u.username = :username")
    Optional<User> findByUsernameWithRoles(@Param("username")String username);

}
