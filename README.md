#API 1

http://localhost:8080/Test/getEmployeeViaJPA

#API 2
http://localhost:8080/Test/getEmployeeViaNative


Output:
{"ABC":2,"BCD":1}

SQL DATA
INSERT INTO sys.test_employee (`id`,`te_age`,`te_dept`,`te_name`) VALUES (1,10,'ABC','SS');
INSERT INTO sys.test_employee (`id`,`te_age`,`te_dept`,`te_name`) VALUES (2,20,'BCD','AS');
INSERT INTO sys.test_employee (`id`,`te_age`,`te_dept`,`te_name`) VALUES (4,20,'ABC','OO');