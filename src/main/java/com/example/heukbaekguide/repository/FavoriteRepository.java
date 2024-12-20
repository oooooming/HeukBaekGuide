package com.example.heukbaekguide.repository;

import com.example.heukbaekguide.domain.Favorite;
import com.example.heukbaekguide.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavoriteRepository extends JpaRepository<Favorite, Long> {
    List<Favorite> findByUser(User user);
}
