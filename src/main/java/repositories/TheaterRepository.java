package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Theater;

public interface TheaterRepository extends JpaRepository<Theater, Integer> {
    Theater findByAddress(String address);
}
