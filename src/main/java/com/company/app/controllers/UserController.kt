
            // User controller class
            import com.company.app.services.UserService
            
            class UserController(private val appConfig: AppConfig) {
                fun run() {
                    val userService = UserService()
                    val users = userService.getUsers()
                    println(users)
                }
            }
            