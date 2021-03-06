This project contains the binary version of the spring-boot demo project. You can run it with only docker.

After you open a command line in this folder, you can build the container with the following command:

    docker build -t wetspringdemo -f Dockerfile .

Beware: docker needs admin rights to run, so when the host is linux, you need to use sudo to run the command.

Based on your host machine you need to determine the following information:

1) Which port is this docker container listening to?
2) Where will the log files be stored?

Once you know these two pieces of information, you can modify the following command with those pieces of information
to start the container:

    docker run -p <host_port>:8080 -v <host_log_location>:/logs wetspringdemo

Beware: docker needs admin rights to run, so when the host is linux, you need to use sudo to run the command.

When the container is running, you can open a browser to one of the following urls:
- http://localhost:<host_port>/hello
- http://localhost:<host_port>/hello/myname
