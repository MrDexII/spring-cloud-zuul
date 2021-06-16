REPLACE INTO user (user_Id, email, password, enable)
VALUES(1, 'admin', '$2a$10$sOhvjMrxJHb89.vvU/ZsWOtd5U7ftDdczCrEQjmVG6sPuRB28klfu', true);

REPLACE INTO role (role_Id, role_Name)
VALUES(1, 'ADMIN'), (2,'USER');

REPLACE INTO user_role (user_Id, role_Id)
VALUES(1,1),(1,2);