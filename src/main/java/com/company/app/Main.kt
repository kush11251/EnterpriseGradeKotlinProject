
            // Main entry point of the application
            import com.company.app.config.AppConfig
            import com.company.app.controllers.UserController
            
            fun main() {
                val appConfig = AppConfig()
                val userController = UserController(appConfig)
                userController.run()
            }
            