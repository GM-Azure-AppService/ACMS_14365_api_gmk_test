<div id="top">

<!-- HEADER STYLE: CLASSIC -->
<div align="center">

<img src="assets/logos/purple.svg" width="30%" style="position: relative; top: 0; right: 0;" alt="Project Logo"/>

# ACMS_14365_API

<em>Unlock Efficient User Management</em>

<!-- BADGES -->
<!-- local repository, no metadata badges. -->

<em>Built with the tools and technologies:</em>

<img src="https://img.shields.io/badge/Spring-000000.svg?style=default&logo=Spring&logoColor=white" alt="Spring">
<img src="https://img.shields.io/badge/Org-77AA99.svg?style=default&logo=Org&logoColor=white" alt="Org">
<img src="https://img.shields.io/badge/Gradle-02303A.svg?style=default&logo=Gradle&logoColor=white" alt="Gradle">
<img src="https://img.shields.io/badge/XML-005FAD.svg?style=default&logo=XML&logoColor=white" alt="XML">
<img src="https://img.shields.io/badge/PostgreSQL-4169E1.svg?style=default&logo=PostgreSQL&logoColor=white" alt="PostgreSQL">
<img src="https://img.shields.io/badge/bat-31369E.svg?style=default&logo=bat&logoColor=white" alt="bat">

</div>
<br>

---

## Table of Contents

- [Table of Contents](#table-of-contents)
- [Overview](#overview)
- [Features](#features)
- [Project Structure](#project-structure)
    - [Project Index](#project-index)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
    - [Usage](#usage)
    - [Testing](#testing)
- [Roadmap](#roadmap)
- [Contributing](#contributing)
- [License](#license)
- [Acknowledgments](#acknowledgments)

---

## Overview

ACMS_14365_api is a comprehensive developer tool designed to streamline the development process and simplify the management of user data. It provides a robust set of features to automate the build process, simplify Spring Boot configuration, and manage user data.

**Why ACMS_14365_api?**

This project aims to simplify the development process and provide a scalable solution for managing user data. The core features include:

- **🔧 Gradle Build Automation:** Automates the build process, reducing manual effort and increasing efficiency.
- **🚀 Spring Boot Configuration:** Simplifies the setup and configuration of Spring Boot applications.
- **👥 User Management API:** Offers a comprehensive API for managing user data, including CRUD operations and authentication.
- **📚 Swagger API Documentation:** Generates API documentation, making it easier for developers to understand and interact with the API.
- **🗂️ Separation of Concerns:** Ensures a clear separation of concerns within the codebase architecture, making it easier to maintain and extend.

---

## Features

|      | Component       | Details                              |
| :--- | :-------------- | :----------------------------------- |
| ⚙️  | **Architecture**  | <ul><li>Microservices</li><li>RESTful API</li><li>Spring Boot</li></ul> |
| 🔩 | **Code Quality**  | <ul><li>Gradle build tool</li><li>Java 8</li><li>MyBatis for database interactions</li></ul> |
| 📄 | **Documentation** | <ul><li>Springdoc for API documentation</li><li>Gradle documentation plugin</li></ul> |
| 🔌 | **Integrations**  | <ul><li>PostgreSQL database</li><li>Azure services</li></ul> |
| 🧩 | **Modularity**    | <ul><li>Gradle modules</li><li>Separate configuration files</li></ul> |
| 🧪 | **Testing**       | <ul><li>JUnit tests</li><li>Mockito for mocking dependencies</li></ul> |
| ⚡️  | **Performance**   | <ul><li>Spring Boot performance optimization</li><li>Database indexing</li></ul> |
| 🛡️ | **Security**      | <ul><li>Spring Security</li><li>HTTPS encryption</li></ul> |
| 📦 | **Dependencies**  | <ul><li>Spring Boot Starter</li><li>MyBatis</li><li>PostgreSQL driver</li></ul> |

---

## Project Structure

```sh
└── ACMS_14365_api/
    ├── .github
    │   └── workflows
    ├── README.md
    ├── assets
    │   └── logos
    ├── build.gradle
    ├── gradle
    │   └── wrapper
    ├── gradlew
    ├── gradlew.bat
    ├── settings.gradle
    └── src
        ├── main
        └── test
```

### Project Index

<details open>
	<summary><b><code>ACMS_14365_API.GIT/</code></b></summary>
	<!-- __root__ Submodule -->
	<details>
		<summary><b>__root__</b></summary>
		<blockquote>
			<div class='directory-path' style='padding: 8px 0; color: #666;'>
				<code><b>⦿ __root__</b></code>
			<table style='width: 100%; border-collapse: collapse;'>
			<thead>
				<tr style='background-color: #f8f9fa;'>
					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
					<th style='text-align: left; padding: 8px;'>Summary</th>
				</tr>
			</thead>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/GM-DBT/ACMS_14365_api.git/blob/master/gradlew.bat'>gradlew.bat</a></b></td>
					<td style='padding: 8px;'>- Builds and executes Gradle, a build automation tool, on Windows systems<br>- It sets environment variables, finds the Java executable, and configures JVM options to run Gradle<br>- The script ensures Gradle is properly executed, handling errors and exit codes<br>- It serves as the entry point for Gradle on Windows, enabling users to manage and automate their projects<br>- The script is a crucial part of the projects build process.</td>
				</tr>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/GM-DBT/ACMS_14365_api.git/blob/master/settings.gradle'>settings.gradle</a></b></td>
					<td style='padding: 8px;'>- Configures the root project name for the entire codebase, setting the foundation for the overall project architecture<br>- It establishes the projects identity, which is essential for organizing and managing the various components and modules within the codebase<br>- The specified name, apitest, serves as a unique identifier, enabling efficient navigation and reference throughout the projects structure.</td>
				</tr>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/GM-DBT/ACMS_14365_api.git/blob/master/build.gradle'>build.gradle</a></b></td>
					<td style='padding: 8px;'>- Configures the projects build process, defining the Java version, dependencies, and repositories required for the application<br>- It enables Spring Boot, JDBC, and web support, as well as MyBatis, Actuator, and OpenAPI integration<br>- The configuration also includes development tools, testing frameworks, and Azure identity extensions, providing a comprehensive setup for the projects architecture.</td>
				</tr>
			</table>
		</blockquote>
	</details>
	<!-- src Submodule -->
	<details>
		<summary><b>src</b></summary>
		<blockquote>
			<div class='directory-path' style='padding: 8px 0; color: #666;'>
				<code><b>⦿ src</b></code>
			<!-- main Submodule -->
			<details>
				<summary><b>main</b></summary>
				<blockquote>
					<div class='directory-path' style='padding: 8px 0; color: #666;'>
						<code><b>⦿ src.main</b></code>
					<!-- resources Submodule -->
					<details>
						<summary><b>resources</b></summary>
						<blockquote>
							<div class='directory-path' style='padding: 8px 0; color: #666;'>
								<code><b>⦿ src.main.resources</b></code>
							<table style='width: 100%; border-collapse: collapse;'>
							<thead>
								<tr style='background-color: #f8f9fa;'>
									<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
									<th style='text-align: left; padding: 8px;'>Summary</th>
								</tr>
							</thead>
								<tr style='border-bottom: 1px solid #eee;'>
									<td style='padding: 8px;'><b><a href='https://github.com/GM-DBT/ACMS_14365_api.git/blob/master/src/main/resources/schema.sql'>schema.sql</a></b></td>
									<td style='padding: 8px;'>- Establishes the database schema for user data, defining the structure and constraints for storing user information<br>- It creates a table to hold user records, including unique identifiers, authentication credentials, and contact details, ensuring data integrity and uniqueness<br>- This schema serves as the foundation for user data management within the application.</td>
								</tr>
							</table>
							<!-- mapper Submodule -->
							<details>
								<summary><b>mapper</b></summary>
								<blockquote>
									<div class='directory-path' style='padding: 8px 0; color: #666;'>
										<code><b>⦿ src.main.resources.mapper</b></code>
									<table style='width: 100%; border-collapse: collapse;'>
									<thead>
										<tr style='background-color: #f8f9fa;'>
											<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
											<th style='text-align: left; padding: 8px;'>Summary</th>
										</tr>
									</thead>
										<tr style='border-bottom: 1px solid #eee;'>
											<td style='padding: 8px;'><b><a href='https://github.com/GM-DBT/ACMS_14365_api.git/blob/master/src/main/resources/mapper/user-mapper.xml'>user-mapper.xml</a></b></td>
											<td style='padding: 8px;'>- Maps user data between the application and database, enabling CRUD operations for user management<br>- It defines queries for selecting all users, retrieving a user by ID, inserting a new user, updating an existing user, and deleting a user<br>- This mapping facilitates data exchange and manipulation, supporting the overall functionality of the user management system within the application.</td>
										</tr>
									</table>
								</blockquote>
							</details>
						</blockquote>
					</details>
					<!-- java Submodule -->
					<details>
						<summary><b>java</b></summary>
						<blockquote>
							<div class='directory-path' style='padding: 8px 0; color: #666;'>
								<code><b>⦿ src.main.java</b></code>
							<!-- com Submodule -->
							<details>
								<summary><b>com</b></summary>
								<blockquote>
									<div class='directory-path' style='padding: 8px 0; color: #666;'>
										<code><b>⦿ src.main.java.com</b></code>
									<!-- seowon Submodule -->
									<details>
										<summary><b>seowon</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ src.main.java.com.seowon</b></code>
											<!-- apitest Submodule -->
											<details>
												<summary><b>apitest</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ src.main.java.com.seowon.apitest</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/GM-DBT/ACMS_14365_api.git/blob/master/src/main/java/com/seowon/apitest/ApitestApplication.java'>ApitestApplication.java</a></b></td>
															<td style='padding: 8px;'>- ApitestApplication serves as the entry point for the entire application, bootstrapping the Spring Boot framework and launching the application<br>- It enables the execution of the application, allowing users to interact with the API<br>- By running the main method, the application is initialized, and its components are set up, making it ready for use<br>- The applications functionality is thus made accessible through this central entry point.</td>
														</tr>
													</table>
													<!-- config Submodule -->
													<details>
														<summary><b>config</b></summary>
														<blockquote>
															<div class='directory-path' style='padding: 8px 0; color: #666;'>
																<code><b>⦿ src.main.java.com.seowon.apitest.config</b></code>
															<table style='width: 100%; border-collapse: collapse;'>
															<thead>
																<tr style='background-color: #f8f9fa;'>
																	<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																	<th style='text-align: left; padding: 8px;'>Summary</th>
																</tr>
															</thead>
																<tr style='border-bottom: 1px solid #eee;'>
																	<td style='padding: 8px;'><b><a href='https://github.com/GM-DBT/ACMS_14365_api.git/blob/master/src/main/java/com/seowon/apitest/config/SwaggerConfig.java'>SwaggerConfig.java</a></b></td>
																	<td style='padding: 8px;'>- Configures the Swagger API documentation for the Shopping Mall User Management API, providing essential metadata such as title, description, and version<br>- This configuration enables the generation of API documentation, making it easier for developers to understand and interact with the API<br>- It plays a crucial role in the overall codebase architecture by facilitating API documentation and discovery.</td>
																</tr>
															</table>
														</blockquote>
													</details>
													<!-- service Submodule -->
													<details>
														<summary><b>service</b></summary>
														<blockquote>
															<div class='directory-path' style='padding: 8px 0; color: #666;'>
																<code><b>⦿ src.main.java.com.seowon.apitest.service</b></code>
															<table style='width: 100%; border-collapse: collapse;'>
															<thead>
																<tr style='background-color: #f8f9fa;'>
																	<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																	<th style='text-align: left; padding: 8px;'>Summary</th>
																</tr>
															</thead>
																<tr style='border-bottom: 1px solid #eee;'>
																	<td style='padding: 8px;'><b><a href='https://github.com/GM-DBT/ACMS_14365_api.git/blob/master/src/main/java/com/seowon/apitest/service/UserService.java'>UserService.java</a></b></td>
																	<td style='padding: 8px;'>- Manages user data by providing methods for retrieving, creating, updating, and deleting user information<br>- It also handles user authentication through login and logout functionality<br>- The UserService acts as an intermediary between the applications business logic and data storage, ensuring a clear separation of concerns within the overall codebase architecture<br>- It enables the application to interact with user data in a structured and organized manner.</td>
																</tr>
															</table>
														</blockquote>
													</details>
													<!-- mapper Submodule -->
													<details>
														<summary><b>mapper</b></summary>
														<blockquote>
															<div class='directory-path' style='padding: 8px 0; color: #666;'>
																<code><b>⦿ src.main.java.com.seowon.apitest.mapper</b></code>
															<table style='width: 100%; border-collapse: collapse;'>
															<thead>
																<tr style='background-color: #f8f9fa;'>
																	<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																	<th style='text-align: left; padding: 8px;'>Summary</th>
																</tr>
															</thead>
																<tr style='border-bottom: 1px solid #eee;'>
																	<td style='padding: 8px;'><b><a href='https://github.com/GM-DBT/ACMS_14365_api.git/blob/master/src/main/java/com/seowon/apitest/mapper/UserMapper.java'>UserMapper.java</a></b></td>
																	<td style='padding: 8px;'>- Manages user data interactions with the database, providing methods for inserting, updating, deleting, and retrieving user information<br>- It serves as a crucial interface between the applications business logic and the underlying data storage, enabling the application to perform CRUD operations on user data<br>- This interface is a key component of the applications data access layer.</td>
																</tr>
															</table>
														</blockquote>
													</details>
													<!-- model Submodule -->
													<details>
														<summary><b>model</b></summary>
														<blockquote>
															<div class='directory-path' style='padding: 8px 0; color: #666;'>
																<code><b>⦿ src.main.java.com.seowon.apitest.model</b></code>
															<table style='width: 100%; border-collapse: collapse;'>
															<thead>
																<tr style='background-color: #f8f9fa;'>
																	<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																	<th style='text-align: left; padding: 8px;'>Summary</th>
																</tr>
															</thead>
																<tr style='border-bottom: 1px solid #eee;'>
																	<td style='padding: 8px;'><b><a href='https://github.com/GM-DBT/ACMS_14365_api.git/blob/master/src/main/java/com/seowon/apitest/model/UserDto.java'>UserDto.java</a></b></td>
																	<td style='padding: 8px;'>- Represents a user data transfer object, encapsulating essential user information such as id, password, name, and email<br>- It serves as a standardized structure for exchanging user data between different components of the application, facilitating data consistency and reusability throughout the system<br>- The UserDto plays a crucial role in the overall architecture, enabling efficient data transfer and processing.</td>
																</tr>
															</table>
														</blockquote>
													</details>
													<!-- controller Submodule -->
													<details>
														<summary><b>controller</b></summary>
														<blockquote>
															<div class='directory-path' style='padding: 8px 0; color: #666;'>
																<code><b>⦿ src.main.java.com.seowon.apitest.controller</b></code>
															<table style='width: 100%; border-collapse: collapse;'>
															<thead>
																<tr style='background-color: #f8f9fa;'>
																	<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																	<th style='text-align: left; padding: 8px;'>Summary</th>
																</tr>
															</thead>
																<tr style='border-bottom: 1px solid #eee;'>
																	<td style='padding: 8px;'><b><a href='https://github.com/GM-DBT/ACMS_14365_api.git/blob/master/src/main/java/com/seowon/apitest/controller/UserController.java'>UserController.java</a></b></td>
																	<td style='padding: 8px;'>- Manages user data through RESTful APIs, providing CRUD operations for user information<br>- It handles user registration, modification, retrieval, and deletion, serving as a central controller for user-related functionality within the application<br>- The controller interacts with the UserService to perform these operations, enabling seamless user data management.</td>
																</tr>
															</table>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
			<!-- test Submodule -->
			<details>
				<summary><b>test</b></summary>
				<blockquote>
					<div class='directory-path' style='padding: 8px 0; color: #666;'>
						<code><b>⦿ src.test</b></code>
					<!-- java Submodule -->
					<details>
						<summary><b>java</b></summary>
						<blockquote>
							<div class='directory-path' style='padding: 8px 0; color: #666;'>
								<code><b>⦿ src.test.java</b></code>
							<!-- com Submodule -->
							<details>
								<summary><b>com</b></summary>
								<blockquote>
									<div class='directory-path' style='padding: 8px 0; color: #666;'>
										<code><b>⦿ src.test.java.com</b></code>
									<!-- seowon Submodule -->
									<details>
										<summary><b>seowon</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ src.test.java.com.seowon</b></code>
											<!-- apitest Submodule -->
											<details>
												<summary><b>apitest</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ src.test.java.com.seowon.apitest</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/GM-DBT/ACMS_14365_api.git/blob/master/src/test/java/com/seowon/apitest/ApitestApplicationTests.java'>ApitestApplicationTests.java</a></b></td>
															<td style='padding: 8px;'>- ApitestApplicationTests ensures the Spring Boot application context loads correctly<br>- It serves as a basic sanity check for the overall application, verifying that the configuration and dependencies are properly set up<br>- By running this test, developers can quickly identify and troubleshoot any issues with the applications context, ensuring a stable foundation for further development and testing.</td>
														</tr>
													</table>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
		</blockquote>
	</details>
</details>

---

## Getting Started

### Prerequisites

This project requires the following dependencies:

- **Programming Language:** Java
- **Package Manager:** Gradle

### Installation

Build ACMS_14365_api from the source and intsall dependencies:

1. **Clone the repository:**

    ```sh
    ❯ git clone https://github.com/GM-DBT/ACMS_14365_api.git
    ```

2. **Navigate to the project directory:**

    ```sh
    ❯ cd ACMS_14365_api
    ```

3. **Install the dependencies:**

```sh
 gradle build
```

### Usage

Run the project with:

**Using [gradle](https://gradle.org/):**
```sh
gradle run
```

### Testing

Acms_14365_api uses the {__test_framework__} test framework. Run the test suite with:

**Using [gradle](https://gradle.org/):**
```sh
gradle test
```

---

## Roadmap

- [X] **`Task 1`**: <strike>Implement feature one.</strike>
- [ ] **`Task 2`**: Implement feature two.
- [ ] **`Task 3`**: Implement feature three.

---

## Contributing

- **💬 [Join the Discussions](https://LOCAL/CAF_161574_caf-workflows/ACMS_14365_api/discussions)**: Share your insights, provide feedback, or ask questions.
- **🐛 [Report Issues](https://LOCAL/CAF_161574_caf-workflows/ACMS_14365_api/issues)**: Submit bugs found or log feature requests for the `ACMS_14365_api` project.
- **💡 [Submit Pull Requests](https://LOCAL/CAF_161574_caf-workflows/ACMS_14365_api/blob/main/CONTRIBUTING.md)**: Review open PRs, and submit your own PRs.

<details closed>
<summary>Contributing Guidelines</summary>

1. **Fork the Repository**: Start by forking the project repository to your LOCAL account.
2. **Clone Locally**: Clone the forked repository to your local machine using a git client.
   ```sh
   git clone https://github.com/GM-DBT/ACMS_14365_api.git
   ```
3. **Create a New Branch**: Always work on a new branch, giving it a descriptive name.
   ```sh
   git checkout -b new-feature-x
   ```
4. **Make Your Changes**: Develop and test your changes locally.
5. **Commit Your Changes**: Commit with a clear message describing your updates.
   ```sh
   git commit -m 'Implemented new feature x.'
   ```
6. **Push to LOCAL**: Push the changes to your forked repository.
   ```sh
   git push origin new-feature-x
   ```
7. **Submit a Pull Request**: Create a PR against the original project repository. Clearly describe the changes and their motivations.
8. **Review**: Once your PR is reviewed and approved, it will be merged into the main branch. Congratulations on your contribution!
</details>


---

## License

 Copyright 2025 GM Global Technology Operations LLC
 All Rights Reserved.
 This software is proprietary to GM Global Technology Operations LLC
 and is protected by intellectual property laws and international
 intellectual property treaties. Your access to this software is governed
 by the terms of your license agreement with GM Global Technology Operations LLC.
 Any other use of the software is strictly prohibited.

---

## Acknowledgments

- Credit `contributors`, `inspiration`, `references`, etc.

<div align="right">

[![][back-to-top]](#top)

</div>


[back-to-top]: https://img.shields.io/badge/-BACK_TO_TOP-151515?style=flat-square


---


<!-- This is an auto-generated file: Generated by readme AI tool (v0.1.0) -->