
            // User service class
            import com.company.app.repositories.UserRepository
            
            class UserService {
                fun getUsers(): List<User> {
                    val userRepository = UserRepository()
                    return userRepository.getUsers()
                }
            }
            