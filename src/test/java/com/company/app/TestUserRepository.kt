
            // Test class for User repository
            import com.company.app.repositories.UserRepository
            import org.junit.Test
            import kotlin.test.assertEquals
            
            class TestUserRepository {
                @Test
                fun testGetUsers() {
                    val userRepository = UserRepository()
                    val users = userRepository.getUsers()
                    assertEquals(2, users.size)
                }
            }
            