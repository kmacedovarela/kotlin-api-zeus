package lab.mmagnani.zeus.repositories

import lab.mmagnani.zeus.documents.DataEntry
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository

interface DataEntryRepository : MongoRepository <DataEntry, String> {

    fun findByEmployeeId(employeeId: String, pageable: Pageable): Page<DataEntry>
}