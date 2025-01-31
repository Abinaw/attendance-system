# Attendance System

## Technologies Used

- **Frontend:** HTML, CSS, JavaScript
- **Backend:** Java 21, Spring Boot 3.4.2

---

## Project Setup Instructions

### **Prerequisites**

Ensure you have the following installed:

- **Java 21** ([Download Link](https://download.oracle.com/java/21/latest/jdk-21_windows-x64_bin.exe))
- **Maven** ([Download Link](https://maven.apache.org/download.cgi))

### **Step 1: Install Java 21**

If Java 21 is not installed, download and install it using the link provided above.

### **Step 2: Install Maven**

Download and install Maven if it's not already installed.

### **Step 3: Set Up Environment Variables**

Configure the environment variables for Java and Maven:

1. Open **Advanced System Settings** > **Environment Variables**.
2. Under **System Variables**, locate the `Path` variable and edit it.
3. If the `Path` variable does not exist, create one.
4. Add the `bin` directories of both Java and Maven to the `Path` variable.

### **Step 4: Restart Your System**

Log out and log back in or restart your computer to apply the changes.

---

## Running the Application

### **Step 1: Clone the Repository**

Clone the project to your local machine:

```sh
 git clone https://github.com/Abinaw/attendance-system.git
```

### **Step 2: Start the Backend Server**

1. Navigate to the `server` folder inside the cloned repository.
2. Open a terminal or Git Bash in this directory.
3. Run the following command to start the server:
   ```sh
   mvn spring-boot:run
   ```
4. Wait for dependencies to be downloaded and the server to start.

### **Step 3: Launch the Frontend**

1. Once the server is running, open any browser.
2. Go to [http://localhost:8080/](http://localhost:8080/)

---

## Test User Credentials

Use the following test accounts to log in:

### **User 1**

- **Username:** [jhon@gmail.com](mailto\:jhon@gmail.com)
- **Password:** Jhon\@1234

### **User 2**

- **Username:** [david@gmail.com](mailto\:david@gmail.com)
- **Password:** David\@1234

### **User 3**

- **Username:** [alex@gmail.com](mailto\:alex@gmail.com)
- **Password:** Alex\@1234

---

## Thank You!

For any issues, feel free to open an issue in the repository or contact the project maintainers.

