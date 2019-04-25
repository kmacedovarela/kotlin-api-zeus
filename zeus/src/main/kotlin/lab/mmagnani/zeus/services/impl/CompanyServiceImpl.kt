package lab.mmagnani.zeus.services.impl

import lab.mmagnani.zeus.documents.Company
import lab.mmagnani.zeus.repositories.CompanyRepository
import lab.mmagnani.zeus.services.CompanyService
import org.springframework.stereotype.Service

@Service
class CompanyServiceImpl(val companyRepository: CompanyRepository) : CompanyService{

    override fun findByCnpj(cnpj: String): Company? = companyRepository.findByCnpj(cnpj)

    override fun save(company: Company): Company = companyRepository.save(company)
}