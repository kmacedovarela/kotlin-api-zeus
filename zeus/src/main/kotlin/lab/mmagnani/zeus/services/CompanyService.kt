package lab.mmagnani.zeus.services

import lab.mmagnani.zeus.documents.Company

interface CompanyService {

    fun findByCnpj(cnpj: String): Company?

    fun save(company: Company): Company
}