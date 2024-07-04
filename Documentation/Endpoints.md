### DepartmentRessource

- **GET /department/all**
    - **Description**: Retrieves a list of all departments.
    - **Produces**: `application/json`
    - **Response**: `List<Department>`


- **GET /department/id/{id}**
    - **Description**: Retrieves a department by its ID.
    - **Path Variable**: `id` - The ID of the department to retrieve.
    - **Produces**: `application/json`
    - **Response**: `Department`


- **POST /department/save**
    - **Description**: Saves a new department or updates an existing one.
    - **Consumes**: `application/json`
    - **Body**: `Department` object
    - **Response**: None


- **POST /department/delete/{id}**
    - **Description**: Deletes a department by its ID.
    - **Path Variable**: `id` - The ID of the department to delete.
    - **Response**: None


- **POST /department/update**
    - **Description**: Updates an existing department.
    - **Consumes**: `application/json`
    - **Body**: `Department` object
    - **Response**: None

------------------------------------------------------------

### EmployeeRessource

- **GET /employee/id/{id}**
    - **Description**: Retrieves an employee by their ID.
    - **Path Variable**: `id` - The ID of the employee to retrieve.
    - **Produces**: `application/json`
    - **Response**: `Employee`


- **GET /employee/all**
    - **Description**: Retrieves a list of all employees.
    - **Produces**: `application/json`
    - **Response**: `List<Employee>`


- **GET /employee/department/{department}**
    - **Description**: Retrieves employees by their department.
    - **Path Variable**: `department` - The name of the department.
    - **Produces**: `application/json`
    - **Response**: `List<Employee>`


- **GET /employee/firstName/{firstName}**
    - **Description**: Retrieves employees by their first name.
    - **Path Variable**: `firstName` - The first name of the employee.
    - **Produces**: `application/json`
    - **Response**: `List<Employee>`


- **GET /employee/lastName/{lastName}**
    - **Description**: Retrieves employees by their last name.
    - **Path Variable**: `lastName` - The last name of the employee.
    - **Produces**: `application/json`
    - **Response**: `List<Employee>`


- **POST /employee/save**
    - **Description**: Saves a new employee or updates an existing one.
    - **Consumes**: `application/json`
    - **Body**: `Employee` object
    - **Response**: None


- **POST /employee/update**
    - **Description**: Updates an existing employee.
    - **Consumes**: `application/json`
    - **Body**: `Employee` object
    - **Response**: None


- **POST /employee/delete/{id}**
    - **Description**: Deletes an employee by their ID.
    - **Path Variable**: `id` - The ID of the employee to delete.
    - **Response**: None

------------------------------------------------------------

- ### PositionRessource

- **GET /position/all**
    - **Description**: Retrieves a list of all positions.
    - **Produces**: `application/json`
    - **Response**: `List<Position>`

- **GET /position/id/{id}**
    - **Description**: Retrieves a position by its ID.
    - **Path Variable**: `id` - The ID of the position to retrieve.
    - **Produces**: `application/json`
    - **Response**: `Position`

- **POST /position/save**
    - **Description**: Saves a new position or updates an existing one.
    - **Consumes**: `application/json`
    - **Body**: `Position` object
    - **Response**: None

- **POST /position/delete/{id}**
    - **Description**: Deletes a position by its ID.
    - **Path Variable**: `id` - The ID of the position to delete.
    - **Response**: None

- **POST /position/update**
    - **Description**: Updates an existing position.
    - **Consumes**: `application/json`
    - **Body**: `Position` object
    - **Response**: None
