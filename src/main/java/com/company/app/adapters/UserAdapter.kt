
            // User adapter class
            import com.company.app.models.User
            
            class UserAdapter {
                fun adapt(user: User): String {
                    return "Name: ${user.name}, Age: ${user.age}"
                }
            }
            