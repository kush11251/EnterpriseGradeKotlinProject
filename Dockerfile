
            # Dockerfile for building the application
            FROM maven:3.9-eclipse-temurin-17
            
            # Set working directory
            WORKDIR /app
            
            # Copy project files
            COPY . /app
            
            # Build and package the application
            RUN mvn clean package
            
            # Expose port
            EXPOSE 8080
            
            # Run command
            CMD ["mvn", "exec:java"]
            