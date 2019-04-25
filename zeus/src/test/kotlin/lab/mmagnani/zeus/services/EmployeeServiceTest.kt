package lab.mmagnani.zeus.services

import lab.mmagnani.zeus.documents.Employee
import lab.mmagnani.zeus.enums.ProfileEnum
import lab.mmagnani.zeus.repositories.EmployeeRepository
import lab.mmagnani.zeus.utils.PasswordUtils
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.BDDMockito
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner
import java.lang.Exception

@RunWith(SpringRunner::class)
@SpringBootTest
class EmployeeServiceTest {

    @MockBean
    private val employeeRepository: EmployeeRepository? = null

    @Autowired
    private  val employeeService: EmployeeService? = null

    private val email: String = "mauricio@mmagnani.lab"
    private val cpf: String = "02263486101"
    private val id: String = "1"

    @Before
    @Throws(Exception::class)
    fun setUp(){
        BDDMockito.given(employeeRepository?.save(Mockito.any(Employee::class.java))).willReturn(employee())
       // BDDMockito.given(employeeRepository?.findById(id)).willReturn()
        BDDMockito.given(employeeRepository?.findByEmail(email)).willReturn(employee())
        BDDMockito.given(employeeRepository?.findByCpf(cpf)).willReturn(employee())
    }

//    @Test
//    fun testPersistEmployee(){
//        val employee: Employee? = this.employeeService?.save(employee())
//        Assert.assertNotNull(employee)
//    }
//
    @Test
    fun testFindById(){
        val employee: Employee? = this.employeeService?.findById(id)
        Assert.assertNotNull(employee)
    }
//
//    @Test
//    fun testFindEmployeeByEmail(){
//        val employee: Employee? = this.employeeService?.findByEmail(email)
//        Assert.assertNotNull(employee)
//    }
//
//
//    @Test
//    fun testFindEmployeeByCpf(){
//        val employee: Employee? = this.employeeService?.findByCpf(cpf)
//        Assert.assertNotNull(employee)
//    }

    private fun employee(): Employee =
            Employee("Nome", email, PasswordUtils().generateBcrypt("redhat@2019"),
                    cpf, ProfileEnum.ROLE_USER, id)
}