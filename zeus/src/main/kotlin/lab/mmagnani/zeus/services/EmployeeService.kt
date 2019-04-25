package lab.mmagnani.zeus.services

import lab.mmagnani.zeus.documents.Employee

interface EmployeeService {

    fun save(employee: Employee): Employee

    fun findByCpf(cpf: String): Employee
}