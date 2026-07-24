package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Ticket;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {
}
