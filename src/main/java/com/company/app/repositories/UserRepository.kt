
            // User repository class
            import com.company.app.models.User
            
            class UserRepository {
                fun getUsers(): List<User> {
                    // Simulate database query
                    return listOf(User("John Doe", 30), User("Jane Doe", 25))
                }
            }
            