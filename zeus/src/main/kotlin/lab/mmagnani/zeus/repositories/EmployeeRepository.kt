package lab.mmagnani.zeus.repositories

import lab.mmagnani.zeus.documents.Employee
import org.springframework.data.mongodb.repository.MongoRepository

interface EmployeeRepository : MongoRepository <Employee, String> {

    fun findByEmail(email: String): Employee

    fun findByCpf(cpf: String): Employee
}