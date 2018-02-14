package fr.aberwag.sample.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class User(@Column(name = "FIRST_NAME") var firstName: String,
                @Column(name = "LAST_NAME") var lastName: String,
                @Column(name = "ID") @Id @GeneratedValue var id:Long = 0){
    constructor():this("","")
}