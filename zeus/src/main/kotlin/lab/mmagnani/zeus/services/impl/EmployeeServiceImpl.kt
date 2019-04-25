package lab.mmagnani.zeus.services.impl

import lab.mmagnani.zeus.documents.Employee
import lab.mmagnani.zeus.repositories.EmployeeRepository
import lab.mmagnani.zeus.services.EmployeeService
import org.springframework.stereotype.Service

@Service
class EmployeeServiceImpl (val employeeRepository: EmployeeRepository) : EmployeeService {

    override fun save(employee: Employee): Employee  = employeeRepository.save(employee)

    override fun findByCpf(cpf: String): Employee?  = employeeRepository.findByCpf(cpf)

    override fun findByEmail(email: String): Employee? = employeeRepository.findByEmail(email)

    override fun findById(id: String): Employee? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}