
-- Insert Organizations
INSERT INTO organizations (id, name) VALUES
(1, '6D Technologies'),
(2, '7D Technologies');

-- Insert SubOrganizations
INSERT INTO sub_organizations (id, name, organization_id) VALUES
(1, 'TechCorp India', 1),
(2, 'TechCorp USA', 1),
(3, 'TechCorp Europe', 2),
(4, 'TechCorp Brazil', 2),
(5, 'TechCorp UK', 2)
(6, 'TechCorp Qatar', 2)
(7, 'TechCorp Saudi', 2);

-- Insert Departments
INSERT INTO departments (id, name, sub_organization_id) VALUES
(1, 'Engineering', 1),
(2, 'Human Resources', 1),
(3, 'Marketing', 2),
(4, 'Finance', 3),
(5, 'IT', 4),
(6, 'Telecom', 4);

-- Insert Roles
INSERT INTO roles (id, name, department_id) VALUES
(1, 'Developer', 1),
(2, 'HR Executive', 2),
(3, 'Digital Marketing Lead', 3),
(4, 'Finance Analyst', 4),
(5, 'Sales Manager', 5);

-- Insert Employees
INSERT INTO employees (id, name, email, mobile, age, role_id, department_id) VALUES
(1, 'Aditi Sharma', 'aditi01@gmail.com', '9876543210', '24', 1, 1),
(2, 'Rohan Gupta', 'ravi@technova.com', '9999990002', '26', 1, 1),
(3, 'Priya Menon', 'sneha@technova.com', '9999990003', '28', 2, 2),
(4, 'Sanjana Rao', 'karan@greensoft.com', '9999990004', '25', 4, 4),
(5, 'Rohit Singh', 'neha@greensoft.com', '9999990005', '26', 5, 5);
