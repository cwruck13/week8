package trip.repository;


import org.springframework.stereotype.Repository;

import trip.beans.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Long>{

	
}
