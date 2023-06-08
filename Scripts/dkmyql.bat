::
:: Start/Stop Docker Mysql Container 3307
::
@echo OFF
set OPT=%1
if %OPT%. == start. (
	@echo Start Docker Mysql Server version 8.0 on port 3307
	docker run -d --name mysql --rm -p 3307:3306 -v D:\RUNTIMES\DOCKER\Volumes\mysql:/var/lib/mysql -e MYSQL_ROOT_PASSWORD="root&2021" mysql:8.0
) else if %OPT%. == stop. (
	@echo Stop Docker Mysql 
	docker stop mysql
) else (
	goto HELP 
)

exit /B 

:HELP 
@echo. %0% ^[start^|stop^]
@echo. Start OR Stop Docker Container Mysql 
@echo. 