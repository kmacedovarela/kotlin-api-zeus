package lab.mmagnani.zeus.repositories

import lab.mmagnani.zeus.documents.Company
import org.springframework.data.mongodb.repository.MongoRepository

interface CompanyRepository : MongoRepository<Company, String> {

    fun findByCnpj(cnpj: String): Company
}