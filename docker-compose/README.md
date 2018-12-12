This project contains something else than just docker, but docker compose. This needs the docker-compose application.

After you open a command line in this folder, you can build the infrastructure:

    docker-compose build

Beware: docker needs admin rights to run, so when the host is linux, you need to use sudo to run the command.

After it has been build, you can start the infrastructure with the command:

    docker-compose up

Beware: docker needs admin rights to run, so when the host is linux, you need to use sudo to run the command.

This will block the CLI while the infrastructure is running. If you add the "-d" parameter, then it will run in the
background.

To stop the infrastructure you can use the following command:

    docker-compose down

This will gracefully terminate the docker containers in the whole infrastructure.