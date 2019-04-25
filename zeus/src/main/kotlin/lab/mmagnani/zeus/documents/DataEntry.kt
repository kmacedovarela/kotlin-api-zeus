package lab.mmagnani.zeus.documents

import lab.mmagnani.zeus.enums.TypeEnum
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class DataEntry (
        val dateEntry: Date,
        var typeEntry: TypeEnum,
        val employeeId: String,
        val description: String? = "",
        val localization: String? = "",
        @Id val id: String? = null
)