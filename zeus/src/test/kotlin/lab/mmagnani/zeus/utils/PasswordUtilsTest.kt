package lab.mmagnani.zeus.utils


import org.junit.Assert
import org.junit.Test
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class PasswordUtilsTest {

    private val password = "redhat"
    private val bCryptEncoder = BCryptPasswordEncoder()

    @Test
    fun testGenerateHashPassword(){
        var hash = PasswordUtils().generateBcrypt(password)
        Assert.assertTrue(bCryptEncoder.matches(password, hash))
    }
}