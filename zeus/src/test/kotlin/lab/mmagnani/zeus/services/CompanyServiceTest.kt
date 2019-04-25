package lab.mmagnani.zeus.services

import lab.mmagnani.zeus.documents.Company
import lab.mmagnani.zeus.repositories.CompanyRepository
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.BDDMockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner
import java.lang.Exception

@RunWith(SpringRunner::class)
@SpringBootTest
class CompanyServiceTest{

    @Autowired
    val companyService: CompanyService? = null

    @MockBean
    private val companyRepository: CompanyRepository? = null

    private val CNPJ = "07069791000155"

    @Before
    @Throws(Exception::class)
    fun setUp(){
        BDDMockito.given(companyRepository?.findByCnpj(CNPJ)).willReturn(company())
        BDDMockito.given(companyRepository?.save(company())).willReturn(company())
    }

    @Test
    fun testFindCompanyByCnpj(){
        var company: Company? = companyService?.findByCnpj(CNPJ)
    }

    @Test
    fun testPersistCompany(){
        var company: Company? = companyService?.save(company())
    }

    private fun company(): Company = Company("Red Hat Brasil",CNPJ,"1")
}