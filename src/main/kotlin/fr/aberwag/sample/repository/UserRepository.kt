package fr.aberwag.sample.repository

import fr.aberwag.sample.domain.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : CrudRepository<User, Long> {
    fun findByLastName(name : String): List<User>
}