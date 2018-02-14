package fr.aberwag.sample

import fr.aberwag.sample.domain.User
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import fr.aberwag.sample.repository.UserRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean

@SpringBootApplication
class SpringKotlinSampleApplication{
    @Bean
    fun init(repository: UserRepository) = CommandLineRunner {
        repository.save(User("Homer", "simpson"))
        repository.save(User("Marge", "simpson"))
        repository.save(User("Bart", "simpson"))
        repository.save(User("Lisa", "simpson"))
        repository.save(User("Maggie", "simpson"))
        repository.save(User("Ned", "Flanders"))
        repository.save(User("Apu", "Nahasapeemapetilon"))
        repository.save(User("Barney", "Gumble"))
        repository.save(User("Chef", "Wiggum"))
        repository.save(User("Edna", "Krapabelle"))
        repository.save(User("Seymour", "Skinner"))
        repository.save(User("Otto", "Bus"))
        repository.save(User("Carl", "Carlson"))
        repository.save(User("Lenny", "Leonard"))
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(SpringKotlinSampleApplication::class.java, *args)
}
