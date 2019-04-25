package lab.mmagnani.zeus.documents

import lab.mmagnani.zeus.enums.ProfileEnum
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Employee (
        val name: String,
        val email: String,
        val password: String,
        val cpf: String,
        val profile: ProfileEnum,
        val companyId: String,
        val hourCost: Double? = 0.0,
        var totalHoursWorkedByDay: Float? = 0.0f,
        var totalHoursLunch: Float? = 0.0f,
        @Id val id: String? = null

)