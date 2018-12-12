There are multiple projects in the repository:

- spring-boot: Maven, Spring-boot, and Docker to form a small hello world "service"
- spring-boot-compiled: Docker and a compiled Java program to form a small hello world "service"
- nginx-static: Docker and a nginx webserver with a single static html page

===================
STOPPING CONTAINERS
===================

To stop the container you first need to get the name with the following command:

    docker container ls

Beware: docker needs admin rights to run, so when the host is linux, you need to use sudo to run the command.

After you have the name of the container, you can stop is using this command:

    docker container stop <container_name>

Beware: docker needs admin rights to run, so when the host is linux, you need to use sudo to run the command.
