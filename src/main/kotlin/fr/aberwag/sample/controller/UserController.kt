package fr.aberwag.sample.controller

import fr.aberwag.sample.repository.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(val userRepository:UserRepository) {

    @GetMapping("/")
    fun findAll() = userRepository.findAll();

    @GetMapping("/{name}")
    fun findByLastName(@PathVariable name: String) = userRepository.findByLastName(name)
}